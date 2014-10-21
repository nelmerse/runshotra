package runshotra;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class RunnerController {

    private static final String template = "Welcome, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/runner")
    public Runner runner(@RequestParam(value="name", required=false, defaultValue="Runner") String name) {
        return new Runner(counter.incrementAndGet(),
                String.format(template, name));
    }
}