package org.chiwooplatform.cloud.sample.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class CustomerController
{
    private static Logger logger = LoggerFactory.getLogger( CustomerController.class );

    @Value("${greeting:Hi~~}")
    private String greeting;

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String greeting()
    {
        logger.info( "greeting" );
        return greeting;
    }
}