package demo;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class ReadingDataFromDataProvider {
@DataProvider(name="KeyValueData1")
 Object[][]getData(){
	return new Object[][]{
		{"Browser","chrome","1"},
		{"username","password","2"},
		{"Admin","admin123","3"}

		
		
		
	
	};
	
}
	@DataProvider(name="KeyValueData2")
	 Object[][]getinfo(){
		return new Object[][] {
			{"Browser","firefox","1"},
			{"username","password","2"},
			{"Admin","admin123","3"}

			
			
			
		
		};
}
	@Test(dataProvider="KeyValueData1")//pass whatever we give in the dataprovider and check which dataprovider we give
	public void readingdata(String key,String value,String n) {
		System.out.println("My key is:"+key+"======>>>My value is"+value+"---->>>>"+n);
	}

}
