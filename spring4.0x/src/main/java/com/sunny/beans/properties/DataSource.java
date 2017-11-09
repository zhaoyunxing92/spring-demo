package com.sunny.beans.properties;

import java.util.Properties;

/**
 * @author sunny
 * @className com.sunny.beans.properties.DataSource
 * @date 2017-11-09 13:43
 * @description:
 */
public class DataSource {
    private Properties properties;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "properties=" + properties +
                '}';
    }
}
