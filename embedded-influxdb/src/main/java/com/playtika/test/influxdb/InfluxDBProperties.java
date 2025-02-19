package com.playtika.test.influxdb;

import com.playtika.test.common.properties.CommonContainerProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@EqualsAndHashCode(callSuper = true)
@ConfigurationProperties("embedded.influxdb")
public class InfluxDBProperties extends CommonContainerProperties {

    static final String EMBEDDED_INFLUX_DB = "embeddedInfluxDB";

    String adminUser = "admin";
    String adminPassword = "password";
    boolean enableHttpAuth = true;
    String user = "any";
    String password = "any";
    String host = "localhost";
    String database = "db";
    int port = 8086;

    // https://hub.docker.com/_/influxdb
    @Override
    public String getDefaultDockerImage() {
        return "influxdb:2.0-alpine";
    }
}
