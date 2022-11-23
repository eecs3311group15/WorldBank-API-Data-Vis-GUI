
package datafetcher;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

public class DataFetcher {
	
		/**
		 * This method obtains requested indicators through out the years
		 * @param code indicator.
		 * @param country country.
		 * @param from starting year.
		 * @param to ending year.
		 * @return Json formatted data.
		 */
		public static JsonArray getJsonObject(String code, String country, int from, int to ) {
			String urlString = String.format(
					"http://api.worldbank.org/v2/country/%s/indicator/%s?date=%d:%d&format=json", country, code, from, to);
			System.out.println(urlString);
			try {
				URL url = new URL(urlString);
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("GET");
				conn.connect();
				int responsecode = conn.getResponseCode();
				if (responsecode == 200) {
					String inline = "";
					Scanner sc = new Scanner(url.openStream());
					while (sc.hasNext()) {
						inline += sc.nextLine();
					}
					sc.close();
					JsonArray jsonArray = new JsonParser().parse(inline).getAsJsonArray();
					return jsonArray;
				}
	
			} catch (IOException e) {
				// TODO Auto-generated catch block e.printStackTrace();
			}
			return null;
		}
		
		public static double getValue(JsonArray jsonObj, int index) {
			
			double result;
			try {
				result = jsonObj.get(1).getAsJsonArray().get(index).getAsJsonObject().get("value").getAsDouble();
				if (result == 0 || result == -0) {
					result = -999;
				}
				
			}catch(Exception e) {
				result = -999;
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
		
		public static String getDescription(JsonArray jsonObj) {
			
			String result;
			try {
				result = jsonObj.get(1).getAsJsonArray().get(0).getAsJsonObject().get("indicator").getAsJsonObject().get("value").getAsString();
			}catch(Exception e) {
				result = "null";
			}
			return result;
		}

}


