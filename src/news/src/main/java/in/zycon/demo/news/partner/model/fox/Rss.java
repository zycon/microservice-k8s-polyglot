package in.zycon.demo.news.partner.model.fox;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


public class Rss {
    @XmlElement
    Channel channel;
}
