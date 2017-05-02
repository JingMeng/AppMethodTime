package com.zjw.plugin

import com.android.build.gradle.AppExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

public class MyPlugin implements Plugin<Project> {

    void apply(Project project) {
        println "我是自定义插件MyPlugin"
        def android = project.extensions.findByType(AppExtension)
        android.registerTransform(new MyTransform(project))
    }
}