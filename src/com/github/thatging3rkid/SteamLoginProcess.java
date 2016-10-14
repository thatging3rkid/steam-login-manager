package com.github.thatging3rkid;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class SteamLoginProcess {

	public SteamLoginProcess() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("config.ini")); 
			String line = reader.readLine();
					
			if (line == null) {
				//config file is empty, needs to generate system specs
				this.genSpecs();
			} else {
				String[] versioning = line.split("=");
				versioning[1] = versioning[1].trim();
				if (versioning[1].equals(Main.version)) {
					// versions are equal, nothing needs to be done
				} else if (versioning[1].equals("old")) {
					
					
				}
			}
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
			System.err.println("Config file (config.ini) not found, exiting");
			System.exit(1);
		} catch (IOException e) {
			System.err.println(e.getMessage());
			System.exit(1);
		}
	}
	
	private void genSpecs() {
		String os = System.getProperty("os.name").toLowerCase();
		if (os.contains("win")) {
			os = "win";
		} else if (os.contains("mac")) {
			os = "mac";
		} else if (os.contains("nix") || os.contains("nux")) {
			os = "linux";
		} else {
			System.err.println("You seem to have an odd OS (not Windows, Mac or Linux) or an error has occured. Please raise an issue and include the following line: ");
			System.err.println(System.getProperty("os.name"));
		}
		
		System.out.println(os);
	}
}
