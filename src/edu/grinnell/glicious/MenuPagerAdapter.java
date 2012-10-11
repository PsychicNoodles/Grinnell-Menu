package edu.grinnell.glicious;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;
import edu.grinnell.glicious.menucontent.MenuContent;

public class MenuPagerAdapter extends FragmentPagerAdapter {

	
	
	public MenuPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int req) {
		try {
			return DishListFragment.getInstance(MenuContent.mMenuOrder.get(req));
		} catch (IndexOutOfBoundsException ioobe) {
			Log.e("MenuPagerAdapter", ioobe.getMessage());
		}
		return null;
	}

	@Override
	public int getCount() {
		return MenuContent.mMenuOrder.size();
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return MenuContent.mMenuOrder.get(position);
	}

}