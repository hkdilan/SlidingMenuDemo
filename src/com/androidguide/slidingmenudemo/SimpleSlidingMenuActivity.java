package com.androidguide.slidingmenudemo;

import android.os.Bundle;
import android.widget.TextView;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingActivity;

public class SimpleSlidingMenuActivity extends SlidingActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//set layout to activity
		setContentView(R.layout.slidingmenuactivity);
		final TextView tv = (TextView) findViewById(R.id.textView1);
		tv.setText("Sliding Menu");
		
		//place the view in the behind portion of the Sliding Menu
		setBehindContentView(R.layout.slidingmenu);
		
		//get sliding menu
		final SlidingMenu sm = getSlidingMenu();
		
		/*
		 * set sliding menu appear from left, right side, left right
		 * left right - should set secondary menu too.
		 */
		sm.setMode(SlidingMenu.LEFT);//LEFT, RIGHT, LEFT_RIGHT
		
		//set secondary menu for LEFT_RIGHT
		//sm.setSecondaryMenu(R.layout.slidingmenu);
		
		/*
		 * a dimension representing the number of pixels that you want the above view to show 
		 * when the behind view is showing. 
		 * Default is 0
		 * if has secondary menu it also get this offset
		 */
		sm.setBehindOffset(60);
		
		/*
		 * what part of the screen is touchable when the above view is showing. 
		 * Margin means only the left margin.
		 * Fullscreen means the entire screen. 
		 * None means cannot slide
		 * Default is margin
		 */
		sm.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
	}
}
