package Yhxt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Dwj {
	public String Dwj(String s) throws IOException {
	File wj=new File(s);
	FileReader wj2=new FileReader(wj);
	BufferedReader wj3=new BufferedReader(wj2);
	String x=wj3.readLine();
	return x;
	//wj2.close();
	}
}
