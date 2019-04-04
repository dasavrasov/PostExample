package voz;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Builder
@Data
@FieldDefaults(level=AccessLevel.PRIVATE)
@XmlRootElement(name="GWFault")
@NoArgsConstructor
@AllArgsConstructor
public class GWFault {
	@XmlElement(name="MsgId")
	String msgId;
	@XmlElement(name="MsgTm")
	String msgTm;
	@XmlElement(name="faultstring")
	String faultstring;
	@XmlElement(name="detail")
	Detail detail;
}
