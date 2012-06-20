PopoverView
===========

A Popover Controller for Android Tablets. It's an easy solution to simulate an iOS UIPopoverController
Base example 9patch image comes from http://android9patch.blogspot.com.es/ :)

Showing a popover controller is as easy as this

	//get root layout
	RelativeLayout rootView = (RelativeLayout)findViewById(R.id.rootLayout);
		
	PopoverView popoverView = new PopoverView(this, R.layout.popover_showed_view);
	popoverView.setContentSizeForViewInPopover(new Point(320, 340));
	popoverView.setDelegate(this);
	popoverView.showPopoverFromRectInViewGroup(rootView, PopoverView.getFrameForView(v), PopoverView.PopoverArrowDirectionAny, true);
	
You can set more things as well, such as the drawable arrows or the drawable background of the popover view, as well as the fade time
It also has an interface to notice when the popover appears or dismiss.
	
![Screenshot 1](https://github.com/lupidan/PopoverView/raw/master/Screenshot1.png "Screenshot 1")
![Screenshot 2](https://github.com/lupidan/PopoverView/raw/master/Screenshot2.png "Screenshot 2")
![Screenshot 3](https://github.com/lupidan/PopoverView/raw/master/Screenshot3.png "Screenshot 3")