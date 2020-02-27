package com.paypal.test.impl;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import javax.ws.rs.core.Response;
import com.paypal.test.api.SampleResource;
import org.springframework.beans.factory.annotation.Value;

@Component
@Scope("request")
public class SampleResourceImpl implements SampleResource {
@Value("Default Value")
    private String log;
    @Override
    public Response sayHello(){
        String responseText = "Hello World";
        return Response.status(Response.Status.OK)
                .entity(responseText)
                .build();
    }

}
