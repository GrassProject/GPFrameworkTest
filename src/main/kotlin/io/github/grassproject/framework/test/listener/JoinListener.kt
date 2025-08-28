package io.github.grassproject.framework.test.listener

import io.github.grassproject.framework.item.ItemBuilder
import io.github.grassproject.framework.util.component.toMiniMessage
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class JoinListener : Listener {

    @EventHandler
    fun PlayerJoinEvent.onJoin() {
        val item = ItemBuilder("nexo:arm_chair")
            .displayName("aaaa".toMiniMessage())
            .build()

        player.give(item)
    }
}