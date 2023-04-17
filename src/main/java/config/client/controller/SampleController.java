package config.client.controller;

import config.client.properties.NotSoSecretProps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SampleController {

    private final NotSoSecretProps notSoSecretProps;

    public SampleController(NotSoSecretProps notSoSecretProps) {
        this.notSoSecretProps = notSoSecretProps;
    }

    @GetMapping("/props")
    public List<String> getListProps() {
        return notSoSecretProps.getListProps();
    }

}
