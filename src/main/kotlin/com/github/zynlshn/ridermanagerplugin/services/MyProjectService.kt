package com.github.zynlshn.ridermanagerplugin.services

import com.intellij.openapi.project.Project
import com.github.zynlshn.ridermanagerplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
