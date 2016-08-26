package com.ssa.ironyard.web.trie;
//package com.ssa.ironyard.web;
//
//import static org.junit.Assert.*;
//
//import java.net.URISyntaxException;
//import java.util.Arrays;
//import java.util.List;
//
//import org.junit.Test;
//import org.springframework.mock.web.MockHttpServletRequest;
//
//public class TrieControllerTest {
//    TrieController triecontroller = new TrieController();
//
//    @Test(expected = NullPointerException.class)
//    public void empty() throws URISyntaxException {
//        MockHttpServletRequest request = new MockHttpServletRequest("GET", "/trie");
//        request.setParameter("suggest", "abcd");
//        List<String> suggestions = this.triecontroller.suggestions(request);
//        System.out.println(suggestions);
//    }
//
//    @Test
//    public void success() {
//        this.triecontroller.setTrie(new Mock9Trie());
//        MockHttpServletRequest request = new MockHttpServletRequest("GET", "/trie");
//        request.setParameter("suggest", "234");
//        assertEquals("", 2, this.triecontroller.suggestions(request).size());
//    }
//
//    public class Mock9Trie implements Text9Trie {
//        @Override
//        public List<String> suggest(String digits) {
//            return Arrays.asList("catapult", "pomeranian");
//        }
//
//        @Override
//        public boolean remove(String word) {
//            return false;
//        }
//
//        @Override
//        public boolean contains(String word) {
//            return false;
//        }
//
//        @Override
//        public void clear() {
//        }
//
//        @Override
//        public void addWord(String word) {
//
//        }
//    };
//}
