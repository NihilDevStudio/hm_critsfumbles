package com.hackmaster.critfumble;

import java.util.Random;

import com.flurry.android.FlurryAgent;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;

public class Crit2 extends Activity  implements OnClickListener{
	
	int sum=0;
	int rand=0;
	int dif=0;
	String dam;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_crit2);
		setTheme(R.style.AppBaseTheme);
		
		Button roll = (Button)findViewById(R.id.roll);
		roll.setOnClickListener(this);
		
		Button fumble = (Button)findViewById(R.id.crit);
		fumble.setOnClickListener(this);
		
		Bundle extras = getIntent().getExtras();
		String def = extras.getString("def");
		String atk = extras.getString("atk");
		dam = extras.getString("dam");
		dif = extras.getInt("dif");
		
		FlurryAgent.logEvent("Crit Step 2");
		
		getSumRand(atk,def);
	}

	@Override
	public void onClick(View v) {
		if (v == findViewById(R.id.roll)){
			Random ran = new Random();
			int x = ran.nextInt(rand)+sum;
			EditText d1000 = (EditText)findViewById(R.id.d1000);
			d1000.setText(""+x);
			FlurryAgent.logEvent("Autoroll Crit");
		}
		
		if (v == findViewById(R.id.crit)){
			
			
			EditText d1000 = (EditText)findViewById(R.id.d1000);
			String d1000s = d1000.getText().toString();
			
			if(d1000s.compareTo("")!=0){
				
				int d1000i = Integer.parseInt(d1000s);
				Log.d("DB","d1000i: "+d1000i);
				
				
				Intent i = new Intent(Crit2.this, ShowCrit.class);
				i.putExtra("Number", d1000i);
				i.putExtra("dam", dam);
				i.putExtra("dif", dif);
				startActivity(i);
			}else{
				Toast.makeText(getApplicationContext(),"I need all the information to make you crit!!!", Toast.LENGTH_SHORT).show();
			}
			
		}
		
	}
	
	public void getSumRand(String atk, String def){
		if(atk.compareTo("Tiny")==0){
			if(def.compareTo("Tiny")==0){
				
				sum = 0;
				rand = 9999;
				
			}
			if(def.compareTo("Small")==0){
							
				sum = 0;
				rand = 8999;
			}
			if(def.compareTo("Medium")==0){
				sum = 0;
				rand = 7999;
			}
			if(def.compareTo("Large")==0){
				sum = 0;
				rand = 6999;
			}
			if(def.compareTo("Huge")==0){
				sum = 0;
				rand = 5999;
			}
			if(def.compareTo("Giant")==0){
				sum = 0;
				rand = 4999;
			}
		}
		
		if(atk.compareTo("Small")==0){
			if(def.compareTo("Tiny")==0){
				sum = 1000;
				rand = 8999;
			}
			if(def.compareTo("Small")==0){
				sum = 0;
				rand = 9999;		
			}
			if(def.compareTo("Medium")==0){
				sum = 0;
				rand = 8999;
			}
			if(def.compareTo("Large")==0){
				sum = 0;
				rand = 7999;
			}
			if(def.compareTo("Huge")==0){
				sum = 0;
				rand = 6999;
			}
			if(def.compareTo("Giant")==0){
				sum = 0;
				rand = 5999;
			}
		}
		
		if(atk.compareTo("Medium")==0){
			if(def.compareTo("Tiny")==0){
				sum = 2000;
				rand = 7999;
			}
			if(def.compareTo("Small")==0){
				sum = 1000;
				rand = 8999;			
						}
			if(def.compareTo("Medium")==0){
				sum = 0;
				rand = 9999;
			}
			if(def.compareTo("Large")==0){
				sum = 0;
				rand = 8999;
			}
			if(def.compareTo("Huge")==0){
				sum = 0;
				rand = 7999;
			}
			if(def.compareTo("Giant")==0){
				sum = 0;
				rand = 6999;
			}
		}
		
		if(atk.compareTo("Large")==0){
			if(def.compareTo("Tiny")==0){
				sum = 3000;
				rand = 6999;
			}
			if(def.compareTo("Small")==0){
				sum = 2000;
				rand = 7999;			
						}
			if(def.compareTo("Medium")==0){
				sum = 1000;
				rand = 8999;
			}
			if(def.compareTo("Large")==0){
				sum = 0;
				rand = 9999;
			}
			if(def.compareTo("Huge")==0){
				sum = 0;
				rand = 8999;
			}
			if(def.compareTo("Giant")==0){
				sum = 0;
				rand = 7999;
			}
		}
		
		if(atk.compareTo("Huge")==0){
			if(def.compareTo("Tiny")==0){
				sum = 4000;
				rand = 5999;
			}
			if(def.compareTo("Small")==0){
				sum = 3000;
				rand = 6999;			
						}
			if(def.compareTo("Medium")==0){
				sum = 2000;
				rand = 7999;
			}
			if(def.compareTo("Large")==0){
				sum = 1000;
				rand = 8999;
			}
			if(def.compareTo("Huge")==0){
				sum = 0;
				rand = 9999;
			}
			if(def.compareTo("Giant")==0){
				sum = 0;
				rand = 8999;
			}
		}
		
		if(atk.compareTo("Giant")==0){
			if(def.compareTo("Tiny")==0){
				sum = 5000;
				rand = 4999;
			}
			if(def.compareTo("Small")==0){
				sum = 4000;
				rand = 5999;			
						}
			if(def.compareTo("Medium")==0){
				sum = 3000;
				rand = 6999;
			}
			if(def.compareTo("Large")==0){
				sum = 2000;
				rand = 7999;
			}
			if(def.compareTo("Huge")==0){
				sum = 1000;
				rand = 8999;
			}
			if(def.compareTo("Giant")==0){
				sum = 0;
				rand = 9999;
			}
		}
		TextView d1000_txt = (TextView)findViewById(R.id.d1000_txt);
		d1000_txt.setText("D"+(rand+1));
		if(sum > 0) d1000_txt.append("+"+sum);
		d1000_txt.append(":");
	}

	@Override
	protected void onStart()
	{
		super.onStart();
		FlurryAgent.onStartSession(this, "NB8MFQ2685QPG8HZHG4F");
	}
	 
	@Override
	protected void onStop()
	{
		super.onStop();		
		FlurryAgent.onEndSession(this);
	}

}
