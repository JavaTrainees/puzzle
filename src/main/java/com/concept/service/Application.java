package com.concept.service;

import java.io.FileInputStream;
import java.io.IOException;

public class Application {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		int itr = 0, i = 0;
		char c = 0;
		char[] charArray = new char[1000000];
		byte[] bs = new byte[4];
		try {
			Application app = new Application();
			fis = new FileInputStream("F:/Downloads/First Attachement");
			while ((i = fis.read(bs)) != -1) {
				for (byte b : bs) {
					c = (char) b;
					if (c == '\r' || c == '\n') {
						continue;
					}
					charArray[itr] = c;
					itr++;
				}
			}
			String newString = new String(charArray);
			String[] strs = newString.split(" ");
			for (int k1 = 0; k1 <= strs.length - 1; k1++)
				System.out.print(app.decode(strs[k1]));

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {

			if (fis != null)
				fis.close();
		}
	}

	public String decode(String i) {
		String ch;

		switch (i) {
		/*
		 * case "1": ch = "[Mouse Lift]"; break; case "2": ch = "[Mouse Right]";
		 * break;
		 */
		case "3":
			ch = "\n";
			break;
		case "4":
			ch = "[4]";
			break;
		case "8":
			ch = "[<B]";
			break;
		case "9":
			ch = "[TAB]";
			break;
		case "16":
			ch = "[Shift]";
			break;
		case "17":
			ch = "[Crtl]";
			break;
		case "18":
			ch = "[Alt]";
			break;
		case "19":
			ch = "[19]";
			break;
		case "20":
			ch = "[Cap Lock]";
			break;
		case "27":
			ch = "[Escape]";
			break;
		case "32":
			ch = " ";
			break;
		case "33":
			ch = "[PgUp]";
			break;
		case "34":
			ch = "[PgDown]";
			break;
		case "35":
			ch = "#";
			break;
		case "36":
			ch = "$";
			break;
		/*
		 * case "37": ch = "[Left]"; break; case "38": ch = "[Up]"; break; case
		 * "39": ch = "[Right]"; break; case "40": ch = "[Down]"; break;
		 */
		case "41":
			ch = ")";
			break;
		case "42":
			ch = "*";
			break;
		case "43":
			ch = "+";
			break;
		case "44":
			ch = ",";
			break;
		case "45":
			ch = "[Ins]";
			break;
		case "46":
			ch = "[Del]";
			break;
		case "47":
			ch = "/";
			break;
		case "48":
			ch = "0";
			break;
		case "49":
			ch = "1";
			break;
		case "50":
			ch = "2";
			break;
		case "51":
			ch = "3";
			break;
		case "52":
			ch = "4";
			break;
		case "53":
			ch = "5";
			break;
		case "54":
			ch = "6";
			break;
		case "55":
			ch = "7";
			break;
		case "56":
			ch = "8";
			break;
		case "57":
			ch = "9";
			break;
		case "58":
			ch = " ' ";
			break;
		case "59":
			ch = ";";
			break;
		case "60":
			ch = "<";
			break;
		case "61":
			ch = "=";
			break;
		case "62":
			ch = ">";
			break;
		case "63":
			ch = "?";
			break;
		case "64":
			ch = "@";
			break;
		case "65":
			ch = "a";
			break;
		case "66":
			ch = "b";
			break;
		case "67":
			ch = "c";
			break;
		case "68":
			ch = "d";
			break;
		case "69":
			ch = "e";
			break;
		case "70":
			ch = "f";
			break;
		case "71":
			ch = "g";
			break;
		case "72":
			ch = "h";
			break;
		case "73":
			ch = "i";
			break;
		case "74":
			ch = "j";
			break;
		case "75":
			ch = "k";
			break;
		case "76":
			ch = "l";
			break;
		case "77":
			ch = "m";
			break;
		case "78":
			ch = "n";
			break;
		case "79":
			ch = "o";
			break;
		case "80":
			ch = "p";
			break;
		case "81":
			ch = "q";
			break;
		case "82":
			ch = "r";
			break;
		case "83":
			ch = "s";
			break;
		case "84":
			ch = "t";
			break;
		case "85":
			ch = "u";
			break;
		case "86":
			ch = "v";
			break;
		case "87":
			ch = "w";
			break;
		case "88":
			ch = "x";
			break;
		case "89":
			ch = "y";
			break;
		case "90":
			ch = "z";
			break;
		case "91":
			ch = "[Start]";
			break;
		case "92":
			ch = "\\";
			break;
		case "93":
			ch = "[Menu]";
			break;
		case "94":
			ch = "^";
			break;
		case "95":
			ch = "_";
			break;
		case "96":
			ch = "`";
			break;
		case "97":
			ch = "A";
			break;
		case "98":
			ch = "B";
			break;
		case "99":
			ch = "C";
			break;
		case "101":
			ch = "e";
			break;
		case "102":
			ch = "F";
			break;
		case "103":
			ch = "G";
			break;
		case "104":
			ch = "H";
			break;
		case "105":
			ch = "I";
			break;
		case "106":
			ch = "H";
			break;
		case "107":
			ch = "K";
			break;
		case "108":
			ch = "L";
			break;
		case "109":
			ch = "M";
			break;
		case "110":
			ch = "N";
			break;
		case "111":
			ch = "O";
			break;
		case "112":
			ch = "[F1]";
			break;
		case "113":
			ch = "[F2]";
			break;
		case "114":
			ch = "[F3]";
			break;
		case "115":
			ch = "[F4]";
			break;
		case "116":
			ch = "[F5]";
			break;
		case "117":
			ch = "[F6]";
			break;
		case "118":
			ch = "[F7]";
			break;
		case "119":
			ch = "[F8]";
			break;
		case "120":
			ch = "[F9]";
			break;
		case "121":
			ch = "[F10]";
			break;
		case "122":
			ch = "[F11]";
			break;
		case "123":
			ch = "[F12]";
			break;
		case "124":
			ch = "|";
			break;
		case "125":
			ch = "}";
			break;
		case "126":
			ch = "~";
			break;
		case "150":
			ch = "-";
			break;
		case "186":
			ch = ";";
			break;
		case "187":
			ch = "=";
			break;
		case "188":
			ch = ",";
			break;
		case "189":
			ch = "-";
			break;
		case "190":
			ch = ".";
			break;
		case "191":
			ch = "/";
			break;
		case "192":
			ch = "`";
			break;
		case "219":
			ch = "[";
			break;
		case "220":
			ch = "\\";
			break;
		case "221":
			ch = "]";
			break;
		case "222":
			ch = " ";
			break;

		default:
			ch = "";
		}
		return ch;
	}

}
