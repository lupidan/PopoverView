/**
 * Popover View
 *
 * Copyright 2012 Daniel Lupia–ez Casares <lupidan@gmail.com>
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either 
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public 
 * License along with this library.  If not, see <http://www.gnu.org/licenses/>.
 * 
 **/

package com.daniel.lupianez.casares;
import com.daniel.lupianez.casares.PopoverView.PopoverViewDelegate;
import com.daniel.lupianez.casares.R;
import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

public class PopoverViewActivity extends Activity implements OnClickListener, PopoverViewDelegate{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);
        findViewById(R.id.button5).setOnClickListener(this);
        findViewById(R.id.button6).setOnClickListener(this);
        findViewById(R.id.button7).setOnClickListener(this);
        findViewById(R.id.button8).setOnClickListener(this);
        findViewById(R.id.button9).setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		//get root layout
		RelativeLayout rootView = (RelativeLayout)findViewById(R.id.rootLayout);
		
		PopoverView popoverView = new PopoverView(this, R.layout.popover_showed_view);
		popoverView.setContentSizeForViewInPopover(new Point(320, 340));
		popoverView.setDelegate(this);
		popoverView.showPopoverFromRectInViewGroup(rootView, PopoverView.getFrameForView(v), PopoverView.PopoverArrowDirectionAny, true);
		
	}

	
	
	@Override
	public void popoverViewWillShow(PopoverView view) {
		Log.i("POPOVER", "Will show");
	}

	@Override
	public void popoverViewDidShow(PopoverView view) {
		Log.i("POPOVER", "Did show");
	}

	@Override
	public void popoverViewWillDismiss(PopoverView view) {
		Log.i("POPOVER", "Will dismiss");
	}

	@Override
	public void popoverViewDidDismiss(PopoverView view) {
		Log.i("POPOVER", "Did dismiss");
	}
}