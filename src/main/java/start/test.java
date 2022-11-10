package start;

import com.csvreader.CsvReader;

public class test {
	
	
	public static void load() throws Exception{
    	
        CsvReader reader = new CsvReader("all_countries.csv"); 
        reader.readHeaders();

        while(reader.readRecord()){

            System.out.println(reader.get("name"));
        }       
    }
	
	public static void main(String[] args) {
		
		try {
			load();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
