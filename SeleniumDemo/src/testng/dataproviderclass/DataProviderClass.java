package testng.dataproviderclass;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider(name = "DataProviderMethod")
	public static Object[][] getData() {
		return new Object[][] { { "hello ", "World" }, { "21st ", "Century" }, { "Surge ", "Beyond" } };
	}

}
