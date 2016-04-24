package de.fehrmann.sonarqube.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Hello world!
 *
 */
public class Class1 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        test2(Integer.parseInt(args[1]));
        test3(args[0]);
    }
    
	private static void test3(String string) {
		File f = new File(string);
		BufferedReader bf;
		try {
			bf = new BufferedReader(new FileReader(f));
			System.out.println(bf.readLine());
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void test1() {
    	for(int i= 0; i < 15; i++) {
    		int b = i;
    		while( b == i) {
    			b += 1;
    			b %=17;
    			b += 1;
    			b *= 2;
    			if(b == 17) {
    				b = 3;
    			}
    			else {
    				b ++;
    			}
    		}
    	}
    }
    
    private static void test2(int no) {
    	boolean var = false;
    	if(var) {
    		test1();
    	}
    	
    	ExampleClass c = getInstance(no);
    	c.getX();
    }
    
    private static ExampleClass getInstance(int a) {
    	if(a < 10) {
    		return new ExampleClass(1, a);
    	}
    	
    	return null;
    }
}
