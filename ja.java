/*
** JA, pronounced as "YAH", as I prefer if you don't mind, is a tiny, handy and intuitive arithmetic command line calculator. You're more than welcome to fork it as your own project and make it something. Happy calculating! 
*/

// Copyright (C) 2015 by Leo Liu

// Author: Leo Liu <leoonechina@gmail.com>
// URL: https://showyouzen.com/misc/java-applets/ja_is_a_handy_calculator_written_in_java.html
// Version: v0.01
   
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.

// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.

// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.

// Code:


public class ja {
	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("Usage: java ja \"N1\" \"Op\" \"N2\"");           
			System.exit(-1);
		}

		double d1 = Double.parseDouble(args[0]);
		double d2 = Double.parseDouble(args[2]);
		double d = 0;

		if(args[1].equals("+")) {
			d = d1 + d2;
		}else if(args[1].equals("-")) {
			d = d1 - d2;
		}else if(args[1].equals("m")) {
			d = d1 * d2;
		}else if(args[1].equals("/")) {
			d = d1 / d2;
		}else if(args[1].equals("p")) {
			d = Math.pow(d1, d2);
		}else if(args[1].equals("%")) {
			d = d1 % d2;
		}else {
			System.out.println("Unrecognizable operator, programming exiting...");
			System.exit(-1);
		}

		System.out.println("The result of " + args[0] + " " + args[1] + " " + args[2] + " is " + d + ".");
	}
}
