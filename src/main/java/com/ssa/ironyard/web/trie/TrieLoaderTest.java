package com.ssa.ironyard.web.trie;
//package com.ssa.ironyard.web;
//
//import java.io.File;
//import java.net.URISyntaxException;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class TrieLoaderTest {
//
//    Logger LOGGER = LogManager.getLogger(TrieLoaderTest.class);
//
//    @Test(expected=NullPointerException.class)
//    public void test() throws URISyntaxException
//    {
//        
//       FileFactory ff = new FileFactory() 
//       {
//           @Override
//           public File getInstance()
//           {
//               return new File("C:/Users/admin/workspace/SSA12Week/src/main/java/resources/corncob_lowercase.txt");
//           }
//       };
//    new TrieLoadingService(ff, null);
//        
//    
//    }
//    
//    @Test
//    public void webapp() throws Exception
//    {
//        
//        new TrieLoadingService(new WebFileFactory("corncob_lowercase.txt"), null );
//    }
//
//}
