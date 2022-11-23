package com.smoke.cn;

import java.util.Random;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Contacts;
import android.provider.SyncStateContract.Constants;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class fruitActivity extends Activity implements OnClickListener{
	private int number=1;
	private int sudu=1;
	MediaPlayer player;
	private int num=0;
	private int addtime=100;
	private int delay=20;
	private Button start_y;
	private Button boss;
	private Button s_77;
	private Button xx;
	private Button xg;
	private Button ld;
	private Button mg;
	private Button cz;
	private Button pg;
	private Button pt;
	private TextView input_boss;
	private TextView input_77;
	private TextView input_xx;
	private TextView input_xg;
	private TextView input_ld;
	private TextView input_mg;
	private TextView input_cz;
	private TextView input_pg;
	private TextView input_pt;
	private TextView change01;
	private TextView change02;
	private TextView change03;
	private TextView change04;
	private TextView change05;
	private TextView change06;
	private TextView change07;
	private TextView change08;
	private TextView change09;
	private TextView change10;
	private TextView change11;
	private TextView change12;
	private TextView change13;
	private TextView change14;
	private TextView change15;
	private TextView change16;
	private TextView change17;
	private TextView change18;
	private TextView change19;
	private TextView change20;
	private TextView change21;
	private TextView change22;
	private TextView change23;
	private TextView change24;
	private TextView mygold;
	private TextView wingold;
	Intent intent;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fruit);
        commit();
    }
    public void commit(){
    	start_y=(Button) findViewById(R.id.start_y);
    	boss=(Button) findViewById(R.id.boss);
    	s_77=(Button) findViewById(R.id.s_77);
    	xx=(Button) findViewById(R.id.xx);
    	xg=(Button) findViewById(R.id.xg);
    	ld=(Button) findViewById(R.id.ld);
    	mg=(Button) findViewById(R.id.mg);
    	cz=(Button) findViewById(R.id.cz);
    	pg=(Button) findViewById(R.id.pg);
    	pt=(Button) findViewById(R.id.pt);
    	input_boss=(TextView) findViewById(R.id.input_boss);
    	input_77=(TextView) findViewById(R.id.input_77);
    	input_xx=(TextView) findViewById(R.id.input_xx);
    	input_ld=(TextView) findViewById(R.id.input_ld);
    	input_mg=(TextView) findViewById(R.id.input_mg);
    	input_cz=(TextView) findViewById(R.id.input_cz);
    	input_pg=(TextView) findViewById(R.id.input_pg);
    	input_pt=(TextView) findViewById(R.id.input_pt);
    	input_xg=(TextView) findViewById(R.id.input_xg);
    	change01=(TextView) findViewById(R.id.change01);
    	change02=(TextView) findViewById(R.id.change02);
    	change03=(TextView) findViewById(R.id.change03);
    	change04=(TextView) findViewById(R.id.change04);
    	change05=(TextView) findViewById(R.id.change05);
    	change06=(TextView) findViewById(R.id.change06);
    	change07=(TextView) findViewById(R.id.change07);
    	change08=(TextView) findViewById(R.id.change08);
    	change09=(TextView) findViewById(R.id.change09);
    	change10=(TextView) findViewById(R.id.change10);
    	change11=(TextView) findViewById(R.id.change11);
    	change12=(TextView) findViewById(R.id.change12);
    	change13=(TextView) findViewById(R.id.change13);
    	change14=(TextView) findViewById(R.id.change14);
    	change15=(TextView) findViewById(R.id.change15);
    	change16=(TextView) findViewById(R.id.change16);
    	change17=(TextView) findViewById(R.id.change17);
    	change18=(TextView) findViewById(R.id.change18);
    	change19=(TextView) findViewById(R.id.change19);
    	change20=(TextView) findViewById(R.id.change20);
    	change21=(TextView) findViewById(R.id.change21);
    	change22=(TextView) findViewById(R.id.change22);
    	change23=(TextView) findViewById(R.id.change23);
    	change24=(TextView) findViewById(R.id.change24);
    	mygold=(TextView) findViewById(R.id.mygold);
    	wingold=(TextView) findViewById(R.id.wingold);
    	start_y.setOnClickListener(this);
    	boss.setOnClickListener(this);
    	s_77.setOnClickListener(this);
    	xx.setOnClickListener(this);
    	xg.setOnClickListener(this);
    	ld.setOnClickListener(this);
    	mg.setOnClickListener(this);
    	cz.setOnClickListener(this);
    	pg.setOnClickListener(this);
    	pt.setOnClickListener(this);
    }
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.start_y:
			start_y.setBackgroundDrawable(getResources().getDrawable(R.drawable.start_no));
			wingold.setText(String.valueOf(0));
			num=random.nextInt(24);
			System.out.println(num);
			handler.post(r);
			break;
		case R.id.boss:
			if(Integer.parseInt(input_boss.getText().toString())<99){
				mygold.setText(String.valueOf(Integer.parseInt(mygold.getText().toString())-1));
				input_boss.setText(String.valueOf(Integer.parseInt(input_boss.getText().toString())+1));
			}else{
				Toast.makeText(this, "不能超过99！", Toast.LENGTH_LONG).show();
			}
			break;
		case R.id.s_77:
			if(Integer.parseInt(input_boss.getText().toString())<99){
				mygold.setText(String.valueOf(Integer.parseInt(mygold.getText().toString())-1));
				input_77.setText(String.valueOf(Integer.parseInt(input_77.getText().toString())+1));
			}else{
				Toast.makeText(this, "不能超过99！", Toast.LENGTH_LONG).show();
			}
			break;
		case R.id.xx:
			if(Integer.parseInt(input_boss.getText().toString())<99){
				mygold.setText(String.valueOf(Integer.parseInt(mygold.getText().toString())-1));
				input_xx.setText(String.valueOf(Integer.parseInt(input_xx.getText().toString())+1));
			}else{
				Toast.makeText(this, "不能超过99！", Toast.LENGTH_LONG).show();
			}
			break;
		case R.id.xg:
			if(Integer.parseInt(input_boss.getText().toString())<99){
				mygold.setText(String.valueOf(Integer.parseInt(mygold.getText().toString())-1));
				input_xg.setText(String.valueOf(Integer.parseInt(input_xg.getText().toString())+1));
			}else{
				Toast.makeText(this, "不能超过99！", Toast.LENGTH_LONG).show();
			}
			break;
		case R.id.ld:
			if(Integer.parseInt(input_boss.getText().toString())<99){
				mygold.setText(String.valueOf(Integer.parseInt(mygold.getText().toString())-1));
				input_ld.setText(String.valueOf(Integer.parseInt(input_ld.getText().toString())+1));
			}else{
				Toast.makeText(this, "不能超过99！", Toast.LENGTH_LONG).show();
			}
			break;
		case R.id.mg:
			if(Integer.parseInt(input_boss.getText().toString())<99){
				mygold.setText(String.valueOf(Integer.parseInt(mygold.getText().toString())-1));
				input_mg.setText(String.valueOf(Integer.parseInt(input_mg.getText().toString())+1));
			}else{
				Toast.makeText(this, "不能超过99！", Toast.LENGTH_LONG).show();
			}
			break;
		case R.id.cz:
			if(Integer.parseInt(input_boss.getText().toString())<99){
				mygold.setText(String.valueOf(Integer.parseInt(mygold.getText().toString())-1));
				input_cz.setText(String.valueOf(Integer.parseInt(input_cz.getText().toString())+1));
			}else{
				Toast.makeText(this, "不能超过99！", Toast.LENGTH_LONG).show();
			}
			break;
		case R.id.pg:
			if(Integer.parseInt(input_boss.getText().toString())<99){
				mygold.setText(String.valueOf(Integer.parseInt(mygold.getText().toString())-1));
				input_pg.setText(String.valueOf(Integer.parseInt(input_pg.getText().toString())+1));
			}else{
				Toast.makeText(this, "不能超过99！", Toast.LENGTH_LONG).show();
			}
			break;
		case R.id.pt:
			if(Integer.parseInt(input_boss.getText().toString())<99){
				mygold.setText(String.valueOf(Integer.parseInt(mygold.getText().toString())-1));
				input_pt.setText(String.valueOf(Integer.parseInt(input_pt.getText().toString())+1));
			}else{
				Toast.makeText(this, "不能超过99！", Toast.LENGTH_LONG).show();
			}
			break;
		default:
			
			break;
		}
	}
	public void change(int number){
		switch (number) {
		case 1:
			change24.setBackgroundDrawable(getResources().getDrawable(R.drawable.cz_01));
			change01.setBackgroundDrawable(getResources().getDrawable(R.drawable.ld_02_y));
			break;
		case 2:
			change01.setBackgroundDrawable(getResources().getDrawable(R.drawable.ld_02));
			change02.setBackgroundDrawable(getResources().getDrawable(R.drawable.ld_01_y));
			break;
		case 3:
			change02.setBackgroundDrawable(getResources().getDrawable(R.drawable.ld_01));
			change03.setBackgroundDrawable(getResources().getDrawable(R.drawable.boss_02_y));
			break;
		case 4:
			change03.setBackgroundDrawable(getResources().getDrawable(R.drawable.boss_02));
			change04.setBackgroundDrawable(getResources().getDrawable(R.drawable.boss_01_y));
			break;
		case 5:
			change04.setBackgroundDrawable(getResources().getDrawable(R.drawable.boss_01));
			change05.setBackgroundDrawable(getResources().getDrawable(R.drawable.boss_03_y));
			break;
		case 6:
			change05.setBackgroundDrawable(getResources().getDrawable(R.drawable.boss_03));
			change06.setBackgroundDrawable(getResources().getDrawable(R.drawable.pt_y));
			break;
		case 7:
			change06.setBackgroundDrawable(getResources().getDrawable(R.drawable.pt));
			change07.setBackgroundDrawable(getResources().getDrawable(R.drawable.mg_01_y));
			break;
		case 8:
			change07.setBackgroundDrawable(getResources().getDrawable(R.drawable.mg_01));
			change08.setBackgroundDrawable(getResources().getDrawable(R.drawable.xg_01_y));
			break;
		case 9:
			change08.setBackgroundDrawable(getResources().getDrawable(R.drawable.xg_01));
			change09.setBackgroundDrawable(getResources().getDrawable(R.drawable.xg_02_y));
			break;
		case 10:
			change09.setBackgroundDrawable(getResources().getDrawable(R.drawable.xg_02));
			change10.setBackgroundDrawable(getResources().getDrawable(R.drawable.suiji_y));
			break;
		case 11:
			change10.setBackgroundDrawable(getResources().getDrawable(R.drawable.suiji));
			change11.setBackgroundDrawable(getResources().getDrawable(R.drawable.pg_y));
			break;
		case 12:
			change11.setBackgroundDrawable(getResources().getDrawable(R.drawable.pg));
			change12.setBackgroundDrawable(getResources().getDrawable(R.drawable.cz_01_y));
			break;
		case 13:
			change12.setBackgroundDrawable(getResources().getDrawable(R.drawable.cz_01));
			change13.setBackgroundDrawable(getResources().getDrawable(R.drawable.cz_02_y));
			break;
		case 14:
			change13.setBackgroundDrawable(getResources().getDrawable(R.drawable.cz_02));
			change14.setBackgroundDrawable(getResources().getDrawable(R.drawable.ld_01_y));
			break;
		case 15:
			change14.setBackgroundDrawable(getResources().getDrawable(R.drawable.ld_01));
			change15.setBackgroundDrawable(getResources().getDrawable(R.drawable.pt_y));
			break;
		case 16:
			change15.setBackgroundDrawable(getResources().getDrawable(R.drawable.pt));
			change16.setBackgroundDrawable(getResources().getDrawable(R.drawable.s_77_01_y));
			break;
		case 17:
			change16.setBackgroundDrawable(getResources().getDrawable(R.drawable.s_77_01));
			change17.setBackgroundDrawable(getResources().getDrawable(R.drawable.s_77_02_y));
			break;
		case 18:
			change17.setBackgroundDrawable(getResources().getDrawable(R.drawable.s_77_02));
			change18.setBackgroundDrawable(getResources().getDrawable(R.drawable.mg_02_y));
			break;
		case 19:
			change18.setBackgroundDrawable(getResources().getDrawable(R.drawable.mg_02));
			change19.setBackgroundDrawable(getResources().getDrawable(R.drawable.mg_01_y));
			break;
		case 20:
			change19.setBackgroundDrawable(getResources().getDrawable(R.drawable.mg_01));
			change20.setBackgroundDrawable(getResources().getDrawable(R.drawable.xx_01_y));
			break;
		case 21:
			change20.setBackgroundDrawable(getResources().getDrawable(R.drawable.xx_01));
			change21.setBackgroundDrawable(getResources().getDrawable(R.drawable.xx_02_y));
			break;
		case 22:
			change21.setBackgroundDrawable(getResources().getDrawable(R.drawable.xx_02));
			change22.setBackgroundDrawable(getResources().getDrawable(R.drawable.suiji_y));
			break;
		case 23:
			change22.setBackgroundDrawable(getResources().getDrawable(R.drawable.suiji));
			change23.setBackgroundDrawable(getResources().getDrawable(R.drawable.pg_y));
			break;
		case 24:
			change23.setBackgroundDrawable(getResources().getDrawable(R.drawable.pg));
			change24.setBackgroundDrawable(getResources().getDrawable(R.drawable.cz_01_y));
			break;
		default:
			break;
		}
	}
	Handler handler=new Handler();
	private Random random=new Random();
	Runnable r2=new Runnable() {
		public void run() {
			player=MediaPlayer.create(fruitActivity.this, R.raw.mu);
			player.start();
		}
	};
	Runnable r=new Runnable() {
		public void run() {
			if(number>=25)
				number=1;
			new Thread(r2).start();
			change(number++);
			if(sudu>=(100+num)){
				delay=delay+100;
			}
			if(sudu>(110+num)){
				if(number!=11&&number!=23){
					handler.removeCallbacks(r);
					start_y.setBackgroundDrawable(getResources().getDrawable(R.drawable.start));
					text(number-1);
					input_boss.setText(String.valueOf(0));
					input_xx.setText(String.valueOf(0));
					input_77.setText(String.valueOf(0));
					input_ld.setText(String.valueOf(0));
					input_xg.setText(String.valueOf(0));
					input_mg.setText(String.valueOf(0));
					input_cz.setText(String.valueOf(0));
					input_pt.setText(String.valueOf(0));
					input_pg.setText(String.valueOf(0));
					delay=20;
					sudu=1;
				}else{
					delay=20;
					sudu=1;
					handler.postDelayed(r, delay);
				}
			}else{
				sudu++;
				handler.postDelayed(r, delay);
			}
		}
	};
	public void text(int number){
		int all=0;
		switch (number) {
		case 1:
			all=Integer.parseInt(input_ld.getText().toString())*3;
			break;
		case 2:
			all=Integer.parseInt(input_ld.getText().toString())*20;
			break;
		case 3:
			all=Integer.parseInt(input_boss.getText().toString())*50;
			break;
		case 4:
			all=Integer.parseInt(input_boss.getText().toString())*100;
			break;
		case 5:
			all=Integer.parseInt(input_boss.getText().toString())*25;
			break;
		case 6:
			all=Integer.parseInt(input_pt.getText().toString())*2;
			break;
		case 7:
			all=Integer.parseInt(input_mg.getText().toString())*10;
			break;
		case 8:
			all=Integer.parseInt(input_xg.getText().toString())*20;
			break;
		case 9:
			all=Integer.parseInt(input_xg.getText().toString())*3;
			break;
		case 11:
			all=Integer.parseInt(input_pg.getText().toString())*5;
			break;
		case 12:
			all=Integer.parseInt(input_cz.getText().toString())*10;
			break;
		case 13:
			all=Integer.parseInt(input_cz.getText().toString())*3;
			break;
		case 14:
			all=Integer.parseInt(input_ld.getText().toString())*10;
			break;
		case 15:
			all=Integer.parseInt(input_pt.getText().toString())*2;
			break;
		case 16:
			all=Integer.parseInt(input_77.getText().toString())*20;
			break;
		case 17:
			all=Integer.parseInt(input_77.getText().toString())*3;
			break;
		case 18:
			all=Integer.parseInt(input_mg.getText().toString())*3;
			break;
		case 19:
			all=Integer.parseInt(input_mg.getText().toString())*10;
			break;
		case 20:
			all=Integer.parseInt(input_xx.getText().toString())*20;
			break;
		case 21:
			all=Integer.parseInt(input_xx.getText().toString())*3;
			break;
		case 23:
			all=Integer.parseInt(input_pg.getText().toString())*5;
			break;
		case 24:
			all=Integer.parseInt(input_cz.getText().toString())*10;
			break;
		default:
			break;
		}
		wingold.setText(String.valueOf(all));
		mygold.setText(String.valueOf(Integer.parseInt(mygold.getText().toString())+all));
	}
}