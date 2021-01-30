package com.github.mutl3y.ansiblehelper.ansible.schema


import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.jetbrains.jsonSchema.extension.JsonSchemaEnabler

class AnsibleSchemaEnabler : JsonSchemaEnabler {
    override fun isEnabledForFile(file: VirtualFile, project: Project?) =
        "yml" == file.extension

    override fun shouldShowSwitcherWidget(file: VirtualFile): Boolean {
        return true
    }
    override fun canBeSchemaFile(file: VirtualFile?): Boolean {
        return true
    }

}
