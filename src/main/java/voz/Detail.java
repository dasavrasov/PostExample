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
@XmlRootElement(name="Detail")
@NoArgsConstructor
@AllArgsConstructor
public class Detail {
	@XmlElement(name="Code")
	String code;
	@XmlElement(name="Description")
	String description;
}
