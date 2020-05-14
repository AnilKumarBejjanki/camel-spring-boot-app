package com.demo.cxf;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.common.message.CxfConstants;

public class CxfProducerRetry extends RouteBuilder{
	@Override
	public void configure() throws Exception {
		onException(Exception.class)
		.useOriginalMessage()
		.to("amq:queue:retryQueue")		
		.end();
		from("amq:queue:retryQueue").routeId("ProducerRetry")
		.delay(5000)
		.log("received message ${body}")
		//.convertBodyTo(Document.class)
		.setHeader(CxfConstants.OPERATION_NAMESPACE, constant("http://esb.training.com/esb_adapter"))
		.setHeader(CxfConstants.OPERATION_NAME, constant("getAddress"))		
		.to("cxf:bean:address")
		.log("received response from service ::  ${body}")
		.end();
	}	

}
