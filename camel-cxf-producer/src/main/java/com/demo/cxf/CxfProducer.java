package com.demo.cxf;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.w3c.dom.Document;

public class CxfProducer extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
		onException(Exception.class)
		.useOriginalMessage()
		.to("amq:queue:retryQueue")		
		.end();
		
		from("amq:queue:inputQueue").routeId("Producer")
		.log("received message ${body}")
		//.convertBodyTo(Document.class)
		.setHeader(CxfConstants.OPERATION_NAMESPACE, constant("http://esb.training.com/esb_adapter"))
		.setHeader(CxfConstants.OPERATION_NAME, constant("getAddress"))
		
		.to("cxf:bean:address")
		.log("received response from service ::  ${body}")
		.end();
	}	

}
