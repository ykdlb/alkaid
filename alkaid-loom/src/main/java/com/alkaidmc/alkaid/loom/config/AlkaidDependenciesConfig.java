package com.alkaidmc.alkaid.loom.config;

import org.gradle.api.provider.Property;

import java.util.List;

public abstract class AlkaidDependenciesConfig {
    public abstract Property<List<String>> getDependencies();
}