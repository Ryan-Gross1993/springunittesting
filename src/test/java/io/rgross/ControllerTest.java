package io.rgross;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.client.RequestMatcher;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static java.lang.System.out;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by ryan on 3/16/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@Configuration("servlet-context.xml")


public class ControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    TestController testController;


    private MockMvc mockMvc;


    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
        this.testController = new TestController();
    }


    @Test
    public void helloWorldTest() throws Exception {
        String x = "HelloWorld!";
        MockHttpServletRequestBuilder query = get("/hello").contentType(MediaType.APPLICATION_JSON);
       // mockMvc.perform(query).andDo(MockMvcResultHandlers.print());
        mockMvc.perform(query).andExpect(status().is4xxClientError());
      //  mockMvc.perform(get("/hello").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
        System.out.println(testController.helloWorld());
    }
}
