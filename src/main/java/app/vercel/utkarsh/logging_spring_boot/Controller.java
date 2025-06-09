package app.vercel.utkarsh.logging_spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class Controller {
    // private & static are used together intentionally
    // static would make sure only one instance is created
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @GetMapping("/test")
    public void test(){
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message"); // default level
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
    }
}
