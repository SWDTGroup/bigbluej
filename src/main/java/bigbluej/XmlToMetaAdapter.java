package bigbluej;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;



public class XmlToMetaAdapter extends XmlAdapter<MetaHolder, Meta> {

    public Meta unmarshal(MetaHolder v) throws Exception {
        if (v == null) {
            return null;
        }
        Meta meta = new Meta();
        List<Element> entries = v.getEntries();
        if (entries != null && !entries.isEmpty()) {
        	for (Iterator iterator = entries.iterator(); iterator.hasNext();) {
				Element ele = (Element) iterator.next();
				 String key = ele.getLocalName();
                 String value = ele.getTextContent();
                 meta.put(key, value);
			}

        }
        return meta;
    }

    public MetaHolder marshal(Meta v) throws Exception {
        if (v == null) {
            return null;
        }
        MetaHolder holder = new MetaHolder();
        if (v.size()!=0) {
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            List<Element> entries = new ArrayList<>();
            for (Iterator<JAXBElement<String>> iterator = v.getElements().iterator(); iterator.hasNext();) {
            	JAXBElement<String> element = iterator.next();
            	  Element ele = doc.createElement(element.getName().getLocalPart());
                  ele.setTextContent(element.getValue());
                  entries.add(ele);
			}
              
            holder.setEntries(entries);
        }
        return holder;
    }
    
}