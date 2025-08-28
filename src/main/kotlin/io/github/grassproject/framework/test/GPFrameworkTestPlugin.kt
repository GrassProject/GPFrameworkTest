package io.github.grassproject.framework.test

import io.github.grassproject.framework.config.GPFile
import io.github.grassproject.framework.config.init
import io.github.grassproject.framework.core.GPPlugin
import io.github.grassproject.framework.database.DatabaseManager
import io.github.grassproject.framework.test.listener.JoinListener

class GPFrameworkTestPlugin : GPPlugin() {
    override fun load() {}

    override fun enable() {
        server.pluginManager.registerEvents(JoinListener(), this)
        val config = GPFile(dataFolder, "config.yml")
        init(config)
        DatabaseManager.initConfig(config)
        DatabaseManager.connect()
    }

    override fun disable() {}

}