package com.epita.tpalimentation.configurations.swagger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SwaggerController {
    private static final Logger LOG = LoggerFactory.getLogger(SwaggerController.class);

    /**
     * Default constructor
     */
    public SwaggerController() {
        super();
    }

    @RequestMapping(value = "/")
    public String index() {
        LOG.info("swagger-ui.html");
        return "redirect:swagger-ui.html";
    }
}
