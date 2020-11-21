package com.thoughtworks.capability.gtb.demospringconfig.utils;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.support.TestPropertySourceUtils;

public class LevelNumberZeroOverrideContextInitializer
        implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        TestPropertySourceUtils.addInlinedPropertiesToEnvironment(
                applicationContext, "levelNumber=" + 0);
    }
}
