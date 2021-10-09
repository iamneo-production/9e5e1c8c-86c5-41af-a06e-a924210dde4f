package com.examly.springapp;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
class SpringappApplicationTests {

	@Autowired
    private MockMvc mockMvc;
	
	@Test
	@Transactional
    public void BE_Add_Compliant() throws Exception {
        String newCompliant = "{\"complaintId\":\"01\",\"complaintName\":\"Testing Compliant\",\"createdOn\":\"13-09-2021\",\"createdBy\":\"Testing User\",\"resolvedBy\":\"Testing User\",\"status\":\"Active\"}";
        mockMvc.perform(MockMvcRequestBuilders.post("/addComplaint")
		.contentType(MediaType.APPLICATION_JSON)
		.content(newCompliant)
		.accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andReturn();
    }
	
	@Test
	@Transactional
    public void BE_Get_Compliant() throws Exception {
	 	mockMvc.perform(MockMvcRequestBuilders.get("/admin")
		.contentType(MediaType.APPLICATION_JSON)
		.accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andExpect(MockMvcResultMatchers.jsonPath("$").isNotEmpty())
		.andReturn();
    }
	

	@Test
	@Transactional
    public void BE_Update_Compliant() throws Exception {
        String newCompliant = "{\"complaintId\":\"01\",\"complaintName\":\"Demo Compliant\",\"createdOn\":\"13-09-2021\",\"createdBy\":\"Testing User\",\"resolvedBy\":\"Testing User\",\"status\":\"Active\"}";
        mockMvc.perform(MockMvcRequestBuilders.put("/compliant")
		.param("complaintId","01")
		.contentType(MediaType.APPLICATION_JSON)
		.content(newCompliant)
		.accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andReturn();
    }
	
	@Test
	@Transactional
    public void BE_GET_OpenStatus() throws Exception {
		
	 	mockMvc.perform(MockMvcRequestBuilders.get("/admin/openStatus")
		.contentType(MediaType.APPLICATION_JSON)
		.accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andReturn();
    }
}
