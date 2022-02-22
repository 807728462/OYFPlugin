package com.aispeech.oyf

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Author: feng.ouyang
 * Date: 2022/2/22 16:26
 * Description:
 */
class OYFPlugin : Plugin<Project> {
    override fun apply(p0: Project) {
        println("我是插件")
    }
}