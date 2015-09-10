/*
** ja, pronounced as "YAH", as I prefer if you don't mind, is a tiny, handy and intuitive arithmetic command line calculator. 
** You're more than welcome to fork it as your own project and make it something better. Happy calculating! 
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

/* 
** Recommendation for best utilisation of this little piece of java code:

** Firstly, javac it into ja.class file in your machine.
** Secondly, put it in the classpath of your system.
** Thirdly, now you can use it in your whatever terminal by typing e.g. 
** "java ja 45 p 3", which would give back "The result of 45 p 3 is 91125.0.".
** Lastly, this is optional, but I suggest you do it, because it will definitely
** save you a lot of typing if you use it a lot. You just set an alias "ja"
** for "java ja" in your .bashrc or .zshrc, profile.ps1 for powershell or some
** .bat file for the initialisation of cmd in Windows. After this step, you 
** can now just type e.g. "ja 889 / 7" to get the answer of 889 over 7, All 
** in one line.

** Finally, don't forget "ja" should be pronounced as /ja:/, and it's the name
** of a duck who happens to be irksome for some reason I can't figure out yet.
*/

// Source code:


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
