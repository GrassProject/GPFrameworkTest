package io.github.grassproject.framework.test

import io.github.grassproject.framework.core.GPPlugin
import io.github.grassproject.framework.test.listener.JoinListener

class GPFrameworkTestPlugin : GPPlugin() {
    override fun load() {}

    override fun enable() {
        server.pluginManager.registerEvents(JoinListener(), this)
    }

    override fun disable() {}

}