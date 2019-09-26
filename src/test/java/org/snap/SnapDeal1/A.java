package org.snap.SnapDeal1;

import java.util.Set;

public class A extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		launchBrowser();
		winMax();
		loadUrl("https://www.snapdeal.com/");
		SearchPojoPage sp = new SearchPojoPage();
		fill(sp.getInput(),"Mobile");
		btnclick(sp.getSearch());
		btnclick(sp.getMicro());
		goback();
	    btnclick(sp.getBuynow());
	    fill(sp.getUname(),"8870576627");
	    btnclick(sp.getContin());
	    btnclick(sp.getPay());

	}
}

