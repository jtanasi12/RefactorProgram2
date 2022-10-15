package ccsu.edu.xml;
import ccsu.edu.foods.*;

public class XMLUtil {

	public XMLUtil() {}
	
	public String simpleAttributeToXML(XMLAble passed){
		
		String returned = passed.toString();
 		return returned;
	}
	
	public String complexAttributesToXML(XMLAble passed) {
		String returned = " is ready to be delivered.";
		
		return returned;
	}
	public String classToXML(XMLAble passed, String returnXMl) {
		String returned = "\nThank you for your patience!";
		
		
		return returned;
	}
	 public String createXML(XMLAble passed) {
		 
		
		String returnXML = simpleAttributeToXML(passed);
		
		returnXML += complexAttributesToXML(passed);
		returnXML += classToXML(passed, returnXML);
		
		return returnXML;
		
	}
}
