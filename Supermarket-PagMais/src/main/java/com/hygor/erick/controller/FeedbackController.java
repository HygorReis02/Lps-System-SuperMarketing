package com.hygor.erick.controller;



import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/feedbacks")
public class FeedbackController {

    @PostMapping
    public ResponseEntity<String> enviarFeedback(@RequestParam String mensagem) {
        return ResponseEntity.ok("Feedback recebido: " + mensagem);
    }
}
