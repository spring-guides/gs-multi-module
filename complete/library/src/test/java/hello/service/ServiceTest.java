package hello.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest("service.message=Hello")
public class ServiceTest {

    @Autowired
    private Service service;

    @Test
    public void contextLoads() {
        assertThat(service.message()).isNotNull();
    }

    @SpringBootApplication
    @Import(ServiceConfiguration.class)
    static class TestConfiguration {
    }

}
