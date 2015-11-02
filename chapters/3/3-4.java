//³ÌÐò3-4
1	class SwitchTest{
2		public static void main(String [] args) {
3			char ch = args[0].charAt(0);
4			switch (ch) {
5				case '0' : case '1' : case '2' : case '3':
6				case '4' : case '5' : case '6' : case '7':
7				case '8' : case '9' : 
8					System.out.println(
9						"The character is digit " + ch);
10					break;
11
12				case 'a' : case 'b' : case 'c' : case 'd':
13				case 'e' : case 'f' : case 'g' : case 'h':
14				case 'i' : case 'j' : case 'k' : case 'l':
15				case 'm' : case 'n' : case 'o' : case 'p':
16				case 'q' : case 'r' : case 's' : case 't':
17				case 'u' : case 'v' : case 'w' : case 'x':
18				case 'y' : case 'z' : 
19					System.out.println(
20						"The char is lowercase letter " + ch);
21					break;
22
23				case 'A' : case 'B' : case 'C' : case 'D':
24				case 'E' : case 'F' : case 'G' : case 'H':
25				case 'I' : case 'J' : case 'K' : case 'L':
26				case 'M' : case 'N' : case 'O' : case 'P':
27				case 'Q' : case 'R' : case 'S' : case 'T':
28				case 'U' : case 'V' : case 'W' : case 'X':
29				case 'Y' : case 'Z' : 
30					System.out.println(
31						"The char is uppercase letter " + ch);
32					break;
33				default: System.out.println("The character" + ch
34					+ " is neither a digit nor a letter.");
35			}
36 		}
37	}
