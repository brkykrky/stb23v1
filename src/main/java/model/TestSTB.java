package model;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
public class TestSTB {
	public String loadFileXML() {
		Resource resource = new DefaultResourceLoader().getResource("classpath:xml/test0.xml");
		try {
			File file = resource.getFile();
			InputStream in = new FileInputStream(file);
			Scanner s = new Scanner(in).useDelimiter("\\A");
			String result = s.hasNext() ? s.next() : "";
			return result;
		}
		catch(Exception e) {
			return "Errerur : " + e.getMessage();
		}
	}
}
