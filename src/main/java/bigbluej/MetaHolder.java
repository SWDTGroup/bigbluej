package bigbluej;

import java.util.List;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;

import org.w3c.dom.Element;

@XmlAccessorType(XmlAccessType.FIELD)
public class MetaHolder {
    @XmlAnyElement
    private List<Element> entries;

    public List<Element> getEntries() {
        return entries;
    }

    public void setEntries(List<Element> entries) {
        this.entries = entries;
    }
    
}