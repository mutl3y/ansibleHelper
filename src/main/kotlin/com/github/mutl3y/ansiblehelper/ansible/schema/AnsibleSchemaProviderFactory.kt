package com.github.mutl3y.ansiblehelper.ansible.schema

import com.intellij.lang.javascript.EmbeddedJsonSchemaFileProvider
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.jetbrains.jsonSchema.extension.JsonSchemaFileProvider
import com.jetbrains.jsonSchema.extension.JsonSchemaProviderFactory

class AnsibleSchemaProviderFactory : JsonSchemaProviderFactory {
    override fun getProviders(project: Project): List<JsonSchemaFileProvider> {
        val provider1: EmbeddedJsonSchemaFileProvider = object : EmbeddedJsonSchemaFileProvider(
            "ansible-role-2.9.json", "Ansible Role 2.9",
            "https://json.schemastore.org/ansible-role-2.9",
            AnsibleSchemaProviderFactory::class.java, "/jsonSchema/"
        ) {
            override fun isAvailable(file: VirtualFile): Boolean {
                return file.exists()
            }
        }

        val provider2: EmbeddedJsonSchemaFileProvider = object : EmbeddedJsonSchemaFileProvider(
            "ansible-collection-galaxy.json", "Ansible Collection Galaxy",
            "https://json.schemastore.org/ansible-collection-galaxy",
            AnsibleSchemaProviderFactory::class.java, "/jsonSchema/"
        ) {
            override fun isAvailable(file: VirtualFile): Boolean {
                return file.exists()
            }
        }

        val provider3: EmbeddedJsonSchemaFileProvider = object : EmbeddedJsonSchemaFileProvider(
            "ansible-playbook.json", "Ansible Playbook",
            "https://json.schemastore.org/ansible-playbook",
            AnsibleSchemaProviderFactory::class.java, "/jsonSchema/"
        ) {
            override fun isAvailable(file: VirtualFile): Boolean {
                return file.exists()
            }
        }

        return listOf(provider3,  provider2, provider1)
    }
}