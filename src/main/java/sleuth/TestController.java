package sleuth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class TestController {

    @GetMapping("/hello")
    public ResponseEntity<Mono<String>> hello(TestOptions options) {
//    public ResponseEntity<Mono<String>> hello(boolean foo, boolean bar) {
        return ResponseEntity
                .ok()
                .body(Mono.just("ok"));
    }
}
