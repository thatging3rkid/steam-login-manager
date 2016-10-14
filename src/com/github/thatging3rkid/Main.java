package com.github.thatging3rkid;

import com.github.thatging3rkid.ui.Graphical;
import com.github.thatging3rkid.ui.CommandLine;

public class Main {

	public final static String version = "v0.1";
	
	public static void main(String[] args) {
		
		if (args.length <= 0) {
			@SuppressWarnings("unused") //automatically starts
			Graphical gui =  new Graphical();
		} else if (args[0].equals("-c")) {
			@SuppressWarnings("unused")
			CommandLine cli = new CommandLine(args);
		}
		
		
	}

}
