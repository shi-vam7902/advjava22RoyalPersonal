package com.dao;

import java.util.ArrayList;

import com.bean.TktUserBean;

public class TtkUserStorage {

	  static ArrayList<TktUserBean> users = new ArrayList<TktUserBean>();

	
	
	public ArrayList<TktUserBean> viewAllUsers()
	{
		
		return users;
	}
	
	
	
	
	
	public void addUsers(TktUserBean user) {

		if (users.isEmpty()) {

			users.add(user);

		} else {
			boolean isrecord = false;

			for (int i = 0; i < users.size(); i++) {
				TktUserBean x = users.get(i);
				if ( (users.get(i).getName().equals(user.getName())) && (users.get(i).getNumber()==user.getNumber()) && (users.get(i).getCategory().equals(user.getCategory())) ) {
					
					users.get(i).setQty(users.get(i).getQty()+user.getQty());
					isrecord = true;
					System.out.println("entered");
					break;
				}// end of if
				System.out.println(users.get(i).getName().equals(user.getName()));
				System.out.println(users.get(i).getNumber()==user.getNumber());
				System.out.println(users.get(i).getCategory().equals(user.getCategory()));
				
			}// end of for
			
			if(isrecord == false)
			{
				users.add(user);
			}
		}
	}

}
