package com.syntax.class01;

public class VariableValues {

	public static void main (String [] args) {
	//. i want you to re-assign values for the variables( example: int i = 10; ==> i=30; ) i want you to print out each variable
	//on a separated line. 
		
				
				byte byt01 = -128; // single line declaration, test value re-assignment cannot re-assign duplicate local variable
				byte byt02; // two line declaration
				byt02 = 127;
				byte a,b,c; // multi 2 line declaration
				a = -128; b = 1; c = 127;

				char chr01 ='@'; //value re-assignment cannot re-assign duplicate local variable
				char chr02;
				chr02 ='#';
				char s,d,e,t;
				s = 'S'; d = 'D'; e = 'E'; t = 'T';
				
				short srt01 = -32768; //value re-assignment cannot re-assign duplicate local variable
				short srt02;
				srt02 = 32767;
				short s1,s2,s3;
				s1 = -32768; s2 = 10; s3 = 32767;
				
				int int01 = 1999999999; //value re-assignment cannot re-assign duplicate local variable
				int int02;
				int02 = -1999999999;
				int int03, int04, int05;
				int03 = -1999999999; int04 = 1234567890;  int05 = 1999999999;
				
				long lng01 = 8999999999999999999L; //value re-assignment cannot re-assign duplicate local variable
				long lng02;
				lng02 = -8999999999999999999L;
				long lng03, lng04, lng05;
				lng03 = 1234567890123456789L; lng04 = 1010101010101010101L; lng05 = -1234567890123456789L;
				
				float flt01 = 299999999999999999999999999999999999999.999999F;
				//value re-assignment cannot re-assign duplicate local variable
				float flt02;
				flt02 = -299999999999999999999999999999999999999.999999F;
				float flt03, flt04, flt05;
				flt03 = 9999999.999999F; flt04 = -9999999.999999F; flt05 = 111.45612F;
				
				double dbl01 = 99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.99999999999999999999999999;
				//value re-assignment cannot re-assign duplicate local variable
				double dbl02;
				dbl02 = -99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.99999999999999999999999999;
				double dbl03, dbl04, dbl05;
				dbl03 = -56.123456789010202; dbl04 = 78.98765431334; dbl05 = 90.123456789012345;
				
				boolean bln01 = true; // value re-assignment cannot re-assign duplicate local variable
				boolean bln02;
				bln02 = false;
				boolean bln03, bln04;
				bln03 = true;bln04 = false;
				
				System.out.println(byt01);
				System.out.println(byt02);
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(chr01);
				System.out.println(chr02);
				System.out.print(s);
				System.out.print(d);
				System.out.print(e);
				System.out.println(t);
				System.out.println(srt01);
				System.out.println(srt02);
				System.out.println(s1);
				System.out.println(s2);
				System.out.println(s3);
				System.out.println(int01);
				System.out.println(int02);
				System.out.println(int03);
				System.out.println(int04);
				System.out.println(int05);
				System.out.println(lng01);
				System.out.println(lng02);
				System.out.println(lng03);
				System.out.println(lng04);
				System.out.println(lng05);
				System.out.println(flt01);
				System.out.println(flt02);
				System.out.println(flt03);
				System.out.println(flt04);
				System.out.println(flt05);
				System.out.println(dbl01);
				System.out.println(dbl02);
				System.out.println(dbl03);
				System.out.println(dbl04);
				System.out.println(dbl05);
				System.out.println(bln01);
				System.out.println(bln02);
				System.out.println(bln03);
				System.out.println(bln04);
				
				
		}
	}