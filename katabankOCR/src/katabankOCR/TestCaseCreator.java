package katabankOCR;

import java.io.File;

public class TestCaseCreator {
	
	File fileBCD=new File("C:/Users/Rober/Desktop/Nueva carpeta/BCDTest1.txt");
	File fileParsed=new File("C:/Users/Rober/Desktop/Nueva carpeta.BCDTest1Result.txt");
	
	String[][] bcdArray={BCDDigits.ZERO,
			BCDDigits.ONE,
			BCDDigits.TWO,
			BCDDigits.THREE,
			BCDDigits.FOUR,
			BCDDigits.FIVE,
			BCDDigits.SIX,
			BCDDigits.SEVEN,
			BCDDigits.EIGHT,
			BCDDigits.NINE
			
	};
	
	String[] convertNumbertoBCD(int[] account){
	
		String[] bcd = new String[4];
		for(int j=0;j<3;j++){
			bcd[j]="";
			for(int i=0;i<account.length;i++){
				bcd[j]+=bcdArray[account[i]][j];
			}
			bcd[j]+="\n";
		}
		
		bcd[3]="";
		for(int i=0;i<account.length;i++){
			bcd[3]+="   ";
		}
		bcd[3]+="\n";
		
		return bcd;
	}
	
	void printBCDFile(String[] bcdAccount){

		  for(int k=0;k<bcdAccount.length;k++){
			  System.out.print(bcdAccount[k]);
		  }
		
	}
	
	public static void main(String[] args){
		
		int numTestCases=3;
		int accountLength=9;
		
		TestCaseCreator testCaseCreator = new TestCaseCreator();
		  
		for (int i=0;i<numTestCases;i++){
		  int[] account=new int[9];
		  for(int j=0;j<accountLength;j++)
		  {
			  Double digit=Math.random()*10;	  
			  account[j]=digit.intValue();
		  }
				
		  String[] bcdCode = testCaseCreator.convertNumbertoBCD(account);
		
		}
		
		
	}

}
