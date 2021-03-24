package com.goldmansachs.assignment.demo.service;

import com.goldmansachs.assignment.demo.domain.StringObj;
import com.goldmansachs.assignment.demo.repository.StringRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PalindromeServiceImpl implements PalindromeService{
    private final StringRepository stringRepository;

    @Override
    public String getResult(String inputString) {
        return stringRepository.findById(inputString).get().getResult();
    }

    @Override
    public void saveNewInput(String input) {
        String result = longestPalindrome(input);
        StringObj output = new StringObj();
        output.setInput(input);
        output.setResult(result);
        stringRepository.save(output);
    }

    public String longestPalindrome(String s) {
        int n = s.length();
        String res = null;
        boolean[][] dp = new boolean[n][n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);

                if (dp[i][j] && (res == null || j - i + 1 > res.length())) {
                    res = s.substring(i, j + 1);
                }
            }
        }
        return res;
    }
}
