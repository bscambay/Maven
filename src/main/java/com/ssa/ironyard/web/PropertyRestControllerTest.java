//package com.ssa.ironyard.web;
//
//import static org.junit.Assert.assertEquals;
//
//import org.junit.Test;
//import org.springframework.mock.web.MockHttpServletRequest;
//
//import com.ssa.ironyard.model.Property;
//
//public class PropertyRestControllerTest {
//    PropertyRestController props;
//    @Test
//    public void success() {
// 
//        MockHttpServletRequest request = new MockHttpServletRequest("GET", "/realestate/{city}/{street}");
//        request.setParameter("city", "Columbia");
//        MockHttpServletRequest request2 = new MockHttpServletRequest("GET", "/realestate/{city}/{street}");
//        request2.setParameter("street", "Dobbin Rd");
//        assertEquals("", 2, this.props.search(request, request2));
//    }
//}
