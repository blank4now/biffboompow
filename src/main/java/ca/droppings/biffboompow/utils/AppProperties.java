package ca.droppings.biffboompow.utils;
/*
 *  note this has 'builtin bug' where if only one valid line it is not added so
 *  presently the default file must start with comment
 *  
 *  another builtin bug is the try catch doenst use the exception in add to properties
 *  
 *  basically this would satify a really lousy user story in a minimal-compliance sort of way
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class AppProperties {
 
	private String defaultProperties = "/resources/config/default.properties";
	
	
	public AppProperties() {
		try {
			InputStream is = getClass().getResourceAsStream(defaultProperties);
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			addFromBufferedReader(br);
			br.close();
			isr.close();
			is.close();
		} catch (Exception e) {
			
		}
		
    }
	public AppProperties(String relativePathFile) {
		addToProperties(relativePathFile);
	}
	private void addToProperties(String pathFile) {
		try {
			File f = new File(pathFile);
			FileReader fr = new FileReader(f);
			BufferedReader reader = new BufferedReader(fr);
			addFromBufferedReader(reader);
			reader.close();
		} catch (Exception e) {
			//e.printStackTrace();
		}
	}
	private void addFromBufferedReader(BufferedReader br)  {
		String line;
		try {
			while ((line = br.readLine()) != null) {
				if (line.length() == 0) {
					continue;
				} 
				else if (line.startsWith("#")) {
					continue;
				}
				else if (!line.contains("=")) {
					continue;
				}
				else {
					String[] parts = line.split("=");
					System.setProperty(parts[0], parts[1]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
