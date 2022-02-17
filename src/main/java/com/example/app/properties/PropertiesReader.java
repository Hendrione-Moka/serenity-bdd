package com.example.app.properties;

import java.io.InputStream;
import org.yaml.snakeyaml.Yaml;

public class PropertiesReader {

  public AppiumProperties readProperties(){
    Yaml yaml = new Yaml();
    InputStream inputStream = this
        .getClass()
        .getClassLoader()
        .getResourceAsStream("configuration.yaml");
    return yaml.load(inputStream);
  }

}
