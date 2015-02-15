package org.springside.examples.quickstart.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ronghaizheng on 15/2/13.
 */
@RestController
@RequestMapping(value = "/api/order")
public class OrderRestController {
    private static Logger logger = LoggerFactory.getLogger(OrderRestController.class);
}
