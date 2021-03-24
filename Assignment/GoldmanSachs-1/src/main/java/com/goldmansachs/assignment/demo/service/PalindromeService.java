package com.goldmansachs.assignment.demo.service;

import com.goldmansachs.assignment.demo.web.model.StringDto;

public interface PalindromeService {
    String getResult(String input);
    void saveNewInput(String input);
}
