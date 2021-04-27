package controller;

import com.example.mentormenteewebsite.controller.ProfileManagement;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(ProfileManagement.class)
public class ProfileManagementTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private ProfileManagement profileManagement;

    @Test
    void postMentor() {
    }
}
