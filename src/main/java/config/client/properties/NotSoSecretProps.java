package config.client.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import java.util.List;

@RefreshScope
@ConfigurationProperties("not-so-secret-props")
public class NotSoSecretProps {
    String prop1;
    String prop2;
    List<String> listProps;

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    public String getProp2() {
        return prop2;
    }

    public void setProp2(String prop2) {
        this.prop2 = prop2;
    }

    public List<String> getListProps() {
        return listProps;
    }

    public void setListProps(List<String> listProps) {
        this.listProps = listProps;
    }

    public NotSoSecretProps() {
    }

    public NotSoSecretProps(String prop1, String prop2, List<String> listProps) {
        this.prop1 = prop1;
        this.prop2 = prop2;
        this.listProps = listProps;
    }
}
