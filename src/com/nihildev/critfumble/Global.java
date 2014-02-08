package com.nihildev.critfumble;

import android.app.Application;

public class Global extends Application {
	
	SQLFumble usdbh;
	
	@Override
	public void onCreate() {
		usdbh = new SQLFumble(getApplicationContext(), "CritFumblesHackmasterV1f", null, 1);
	}

}
