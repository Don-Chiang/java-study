package com.thealgorithms.strings;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;


public class PangramTest {
    @Test
    public void isPangram() {
        String fullAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String notFullAlphabet = "abcdefghiklmnopqrstuvwxyz";
        String fullMixedCaseAlphabet = "a BCDE fghIjkLMnop qrSTuv WXYz";
        String sentence1 = "The quick brown fox jumps over the lazy dog";
        String sentence2 = "The quick brown fox jumps over the lazy gentleman";  // missing letter d

        assertTrue(Pangram.isPangram(fullAlphabet));
        assertFalse(Pangram.isPangram(notFullAlphabet));
        assertTrue(Pangram.isPangram(fullMixedCaseAlphabet));
        assertTrue(Pangram.isPangram(sentence1));
        assertFalse(Pangram.isPangram(sentence2));

    }

    @Test
    public void test(){
        // 括号之间的对应规则
        String s ="{()}[]";
        HashMap<Character, Character> mappings = new HashMap<Character, Character>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (mappings.containsKey(chars[i])) {
                char topElement = stack.empty() ? '#' : stack.pop();
                if (topElement != mappings.get(chars[i])) {
                    System.out.println(false);
                }
            } else {
                stack.push(chars[i]);
            }
        }
        boolean empty = stack.isEmpty();
        System.out.println(empty);
    }

    @Test
    public void reverseStr(){
        String str = "abcd";
        StringBuilder stringBuilder = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            stack.push(chars[i]);
        }
        for (int i = 0; i < chars.length; i++) {
            Character pop = stack.pop();
            stringBuilder.append(pop);
        }
        System.out.println(stringBuilder.toString());
    }

    @Test
    public void array2d(){
        int[][] array1 = new int[5][6];
        int[][] array2 = {{1,2,4},{3,4},{5,6}};
        int[][] array3 = new int[][]{{1,2,3},{3,4},{5,6}};
        int[] ints = array3[0];
        for (int anInt : ints) {
            System.out.println(anInt);
        }
        System.out.println(array3[0]);
    }
}
