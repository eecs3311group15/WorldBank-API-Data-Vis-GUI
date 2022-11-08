package datafetcher;

import com.google.gson.JsonArray;

public class DataFetcherHelper {
	
	static DataFetcher dataFetcher = new DataFetcher();
	
	public static double getValue(JsonArray jsonObj, int index) {
				
		double result;
		try {
			result = jsonObj.get(1).getAsJsonArray().get(index).getAsJsonObject().get("value").getAsDouble();
		}catch(Exception e) {
			result = -1;
		}
		return result;
	}
	
	public static int getYear(JsonArray jsonObj, int index) {
		
		int result;
		try {
			result = jsonObj.get(1).getAsJsonArray().get(index).getAsJsonObject().get("date").getAsInt();
		}catch(Exception e) {
			result = -1;
		}
		return result;
	}
}
