package com.github.thatging3rkid;

import java.io.Serializable;

public class SteamAccount implements Serializable {

	private String username;
	private String showname;
	private String password;
	
	public SteamAccount(String _username, String _showname, String _password) {
		this.username = _username;
		this.showname = _showname;
		this.password = _password;
	}
	
	public String[] getLoginCombo() {
		String[] output = new String[2];
		output[0] = this.username;
		output[1] = this.password;
		return output;
	}
	
	public String getShowname() {
		return this.showname;
	}
}
