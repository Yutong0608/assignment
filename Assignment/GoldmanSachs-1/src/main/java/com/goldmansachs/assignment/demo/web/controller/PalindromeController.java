package com.goldmansachs.assignment.demo.web.controller;

import com.goldmansachs.assignment.demo.service.PalindromeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/")
public class PalindromeController {
    private final PalindromeService palindromeService;

    public PalindromeController(PalindromeService palindromeService) {
        this.palindromeService = palindromeService;
    }

    @GetMapping("{input}")
    public ResponseEntity<String> getPalindrome(@PathVariable("input") String input) {
        return new ResponseEntity<String>(palindromeService.getResult(input), HttpStatus.OK);
    }

    @PostMapping
    public void postPalindrome(@RequestBody String input) {
        palindromeService.saveNewInput(input);
    }
}
