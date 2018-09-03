package com.example.aws.demoawsrds;

import javax.ws.rs.core.MediaType;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.aws.demoawsrds.api.CatoloniController;
import com.example.aws.demoawsrds.model.Brazoloni;
import com.example.aws.demoawsrds.services.BrazoloniService;


@RunWith(SpringRunner.class)
@WebMvcTest(value = CatoloniController.class, secure = false)
public class DemoAwsRdsApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private BrazoloniService brazoloniService;
	
	Brazoloni mockBrazoloni = new Brazoloni(100L, "brazoloni000");
	
	@Test
    public void testHelloRequest() throws Exception {

		Mockito.when(
				brazoloniService.getById(Mockito.anyLong())).thenReturn(mockBrazoloni);
         
		final RequestBuilder requestBuilder = MockMvcRequestBuilders
				.get("/brazoloni/22")
				.accept(MediaType.APPLICATION_JSON);
    	
    	final MvcResult result = mockMvc.perform(requestBuilder).andReturn();
 
    	Assert.assertEquals(200, result.getResponse().getStatus());
    	
    	String stringExpected = "{\"id\":100,\"name\":\"brazoloni000\"}";
    	
    	JSONAssert.assertEquals(stringExpected, result.getResponse()
				.getContentAsString(), false);
    	
    }

}
