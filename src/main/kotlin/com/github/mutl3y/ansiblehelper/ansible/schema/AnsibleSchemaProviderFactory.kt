package com.github.mutl3y.ansiblehelper.ansible.schema

import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VfsUtil
import com.intellij.openapi.vfs.VirtualFile
import com.jetbrains.jsonSchema.extension.JsonSchemaFileProvider
import com.jetbrains.jsonSchema.extension.JsonSchemaProviderFactory
import com.jetbrains.jsonSchema.extension.SchemaType

class AnsibleSchemaProviderFactory : JsonSchemaProviderFactory {
    override fun getProviders(project: Project): List<JsonSchemaFileProvider> = listOf(
        AnsibleSchemaFileProvider(
            "ansible-playbook.json",
            "Ansible Playbook",
            "https://json.schemastore.org/ansible-playbook"
        ),
        AnsibleSchemaFileProvider(
            "ansible-collection-galaxy.json",
            "Ansible Collection Galaxy",
            "https://json.schemastore.org/ansible-collection-galaxy"
        ),
        AnsibleSchemaFileProvider(
            "ansible-role-2.9.json",
            "Ansible Role 2.9",
            "https://json.schemastore.org/ansible-role-2.9"
        ),
    )
}

class AnsibleSchemaFileProvider(
    private val fileName: String,
    private val schemaName: String,
    private val remoteSource: String
) : JsonSchemaFileProvider {

    override fun getName(): String = schemaName

    override fun isAvailable(file: VirtualFile): Boolean = file.exists()

    override fun getSchemaFile(): VirtualFile? {
        val url = AnsibleSchemaFileProvider::class.java.getResource("/jsonSchema/$fileName") ?: return null
        return VfsUtil.findFileByURL(url)
    }

    override fun getSchemaType(): SchemaType = SchemaType.embeddedSchema

    override fun getRemoteSource(): String = remoteSource

    override fun isUserVisible(): Boolean = true
}
