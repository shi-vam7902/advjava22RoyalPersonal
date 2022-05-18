package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.UserBean;
import com.util.DbConnection;

public class UserDao {

	public boolean insertUser(UserBean user) {
		Connection con = DbConnection.getConnection();
		try {

			PreparedStatement pstmt = con
					.prepareStatement("insert into users (firstname , email ,password ) values (?,?,?)");
			pstmt.setString(1, user.getFirstname());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3, user.getPassword());

			int i = pstmt.executeUpdate();
			if (i == 0) {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public ArrayList<UserBean> getAllUsers() {
		ArrayList<UserBean> users = new ArrayList<UserBean>();
		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("Select * from users");
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				UserBean userBean = new UserBean();
				userBean.setUserid(rs.getInt("userId"));
				userBean.setFirstname(rs.getString("firstname"));
				userBean.setEmail(rs.getString("email"));
				userBean.setPassword(rs.getString("password"));

				users.add(userBean);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("This is data");
		return users;
	}

	public boolean deleteUser(int userid) {
		Connection con = null;
		boolean flag = false;
		PreparedStatement pstmt = null;
		try {
			con = DbConnection.getConnection();
			pstmt = con.prepareStatement("delete from users where userId = ?");
			pstmt.setInt(1, userid);

			int record = pstmt.executeUpdate();
			if (record != 0) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException s) {
				s.printStackTrace();
			}
		}

		return flag;
	}

	public UserBean getUserById(int UserId) {

		try (Connection con = DbConnection.getConnection();
				PreparedStatement pstmt = con.prepareStatement("select * from users where userId = ? ");) {
			pstmt.setInt(1, UserId);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			
			UserBean user = new UserBean();
			user.setUserid(rs.getInt("UserId"));
			user.setFirstname(rs.getString("firstname"));
			user.setEmail(rs.getString("email"));
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("this is not done");
		return null;
	}
	
	public boolean  UpdateUser(UserBean user)
	{
		try (Connection con = DbConnection.getConnection();
				PreparedStatement pstmt = con.prepareStatement("update users set email = ? , firstname = ? where userid = ? ");)
		{
			pstmt.setString(1, user.getEmail());
			pstmt.setString(2, user.getFirstname());
			pstmt.setInt(3, user.getUserid());
			int i = pstmt.executeUpdate();
			 
			if(i==0)
			{
				return false;
			}
			
			
			return true;
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return false;
	}

}
