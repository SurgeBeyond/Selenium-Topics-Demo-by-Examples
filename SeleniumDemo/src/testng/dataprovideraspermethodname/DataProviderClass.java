package testng.dataprovideraspermethodname;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider(name = "DataProviderMethod")
	public static Object[][] getData(Method methodName) {
		if(methodName.getName().equalsIgnoreCase("searchCat")) {
			return new Object[][] { { "cat ", "hello " }, { "cat ", "21st " }, { "cat ", "Surge " } };
		}
		else {
			return new Object[][] { { "dog ", "hello "}, { "dog ", "21st "}, { "dog ", "Surge "} };
			}
	}

}
