package voz;

import javax.management.RuntimeErrorException;
import javax.xml.transform.stream.StreamResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class PostController {
	
	@SuppressWarnings("rawtypes")
	@PostMapping(value="/message")
	public ResponseEntity<String> putMessage(@RequestBody String message, @RequestParam String err){
						
		try {
			log.info(message);
			if (err.equals("1")) {
				throw new RuntimeErrorException(null, "POST Error from Server");
			}
		} catch (Exception e) {
			GWFault gw=GWFault.builder().msgId("1111").faultstring(e.getMessage()).msgTm("01-01-2019").detail(Detail.builder().code("001").description("Descr of error"+e.getMessage()).build()).build();
			
			String textMsg=gw.toString();
			
			return new ResponseEntity<String>(textMsg, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity(null, HttpStatus.OK);		
	}
	
}
