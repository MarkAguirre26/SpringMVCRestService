/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirre.springmvcrestservice.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *
 * @author AGUIRREMR
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.aguirre.springmvcrestservice")
public class ProjectConfiguration {

}
