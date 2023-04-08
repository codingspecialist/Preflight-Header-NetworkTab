package shop.mtcoding.prefapp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OptionController {

    @GetMapping("/pre")
    public ResponseEntity<?> pre(){
        return ResponseEntity.ok().build();
    }
}
