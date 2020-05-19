package sample.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

//@Component("customProcessor")
public class CustomProcessor implements Processor{

	public void process(Exchange exchange) throws Exception {

		throw new Exception("Hello custom Exception");
		
	}
	
	

}
