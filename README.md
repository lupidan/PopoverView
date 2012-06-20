PopoverView
===========

A Popover Controller for Android Tablets. It's an easy solution to simulate an iOS UIPopoverController

Showing a popover controller is as easy as this

	//get root layout
	RelativeLayout rootView = (RelativeLayout)findViewById(R.id.rootLayout);
		
	PopoverView popoverView = new PopoverView(this, R.layout.popover_showed_view);
	popoverView.setContentSizeForViewInPopover(new Point(320, 340));
	popoverView.setDelegate(this);
	popoverView.showPopoverFromRectInViewGroup(rootView, PopoverView.getFrameForView(v), PopoverView.PopoverArrowDirectionAny, true);
	
![Screenshot 1](https://raw.github.com/lupidan/PopoverController/master/Screenshot1.png "Screenshot 1")
![Screenshot 2](https://raw.github.com/lupidan/PopoverController/master/Screenshot2.png "Screenshot 2")
![Screenshot 3](https://raw.github.com/lupidan/PopoverController/master/Screenshot3.png "Screenshot 3")