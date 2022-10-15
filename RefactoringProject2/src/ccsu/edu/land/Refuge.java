package ccsu.edu.land;

import ccsu.edu.xml.*;

public class Refuge extends Land implements XMLAble{

	XMLUtil util;
	
	public Refuge() {
		util = new XMLUtil();
	}

	@Override
	public String toXML() {
		return util.createXML(this);
	}
}
