package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest(properties = { "levelNumber=2" })
class LevelControllerTestTwo {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void should_return_advanced_when_level_number_is_two() throws Exception {
        mockMvc.perform(get("/level"))
                .andExpect(jsonPath("$", is("advanced")));
    }
}