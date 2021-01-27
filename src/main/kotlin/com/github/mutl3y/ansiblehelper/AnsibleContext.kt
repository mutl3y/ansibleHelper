// Copyright 2000-2020 JetBrains s.r.o. and other contributors.
// Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.github.mutl3y.ansiblehelper

import com.intellij.codeInsight.template.TemplateContextType
import com.intellij.codeInsight.template.TemplateActionContext

class AnsibleContext private constructor() : TemplateContextType("ANSIBLE", "Ansible") {
    override fun isInContext(templateActionContext: TemplateActionContext): Boolean {
        return templateActionContext.file.name.endsWith(".yml")
    }
}
