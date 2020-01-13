package guru.springframework.controllers;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;


public class IndexControllerTest {

    private MockMvc mockMvc;
    private IndexController indexController;

    @Before
    public void setUp() throws Exception {
        indexController = new IndexController();
        mockMvc = MockMvcBuilders.standaloneSetup(indexController).build();

    }


    @Test
    public void testIndexView () throws Exception {
        mockMvc.perform(get("/")).andExpect(status().isOk()).
                andExpect(view().name("index"));

    }

    @Test
    public void testIndexViewIndex() throws Exception {
        mockMvc.perform(get("/new")).andExpect(status().isOk()).
                andExpect(view().name("Home"));
    }
}

