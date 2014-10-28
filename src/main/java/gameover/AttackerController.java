package gameover;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class AttackerController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/user")
    public Attacker attacker(@RequestParam(value="name", required=false, defaultValue="Attacker") String name) {
        return new Attacker(counter.incrementAndGet(),
                String.format(template, name));
    }
}