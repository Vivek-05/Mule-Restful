package com.ait;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class ReadingUrl {

	public static void main(String[] args) throws IOException {

		URL oracle = new URL("http://www.asimut.com/");
		BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));

		String inputLine;
		while ((inputLine = in.readLine()) != null)

			System.out.println(inputLine);
		
		in.close();
	}
}