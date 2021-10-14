package com.bilgeadam.melih.globalization;

import java.io.*;

public class CreateLanguageDependendTexts {
	public static void main(String[] args) {
		File configFile = new File("D:\\BA Dersler\\File Test\\configuration.config");
		Texts texts;
		try {
			FileReader fR = new FileReader(configFile);
			BufferedReader bR = new BufferedReader(fR);
			String language = bR.readLine();
			System.out.println(language);
			String country = bR.readLine();
			System.out.println(country);
			int vat = Integer.parseInt(bR.readLine());
			System.out.println(vat);
			texts = new Texts(language,country);
			bR.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//texts.readRawStrings();


	}

}
