package com.nishank.elasticsearch.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = {"com.nishank.elasticsearch.repo"})
@ComponentScan(basePackages = {"com.nishank.elasticsearch"})
public class AppConfiguration {

//Based on properties, Spring creates elastic search template on its own, so no need to create transport client or template as part of configuration.
// If created manually then many times things doesn't work as expected and lot of things need to be overriden.

}
