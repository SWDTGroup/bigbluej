package bigbluej;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;


public class Meta {
	// @XmlElementRef(name = "xmlMap")
	 private List<JAXBElement<String>> elements = new ArrayList<>();

	 
	 public Meta() {
		super();
	}
	 
	 public int size()
	 {
		 return getElements().size();
	 }
	 public String get(String name)
	 {
		 for (Iterator iterator = getElements().iterator(); iterator.hasNext();) {
			JAXBElement<String> jaxbElement = (JAXBElement<String>) iterator.next();
			if(jaxbElement.getName().getLocalPart().equals(name))
				return jaxbElement.getValue();
		}
		 return null;
	 }
	 
	 public void put(String name, String value)
	 {
		 for (Iterator iterator = getElements().iterator(); iterator.hasNext();) {
			JAXBElement<String> jaxbElement = (JAXBElement<String>) iterator.next();
			if(jaxbElement.getName().getLocalPart().equals(name))
				jaxbElement.setValue(value);
		}
		 getElements().add(new JAXBElement(new QName(name), String.class, value));
	 }

	public List<JAXBElement<String>> getElements() {
		return elements;
	}


	 
	 
}
