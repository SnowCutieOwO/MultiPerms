package com.dev7ex.multiperms.api.bungeecord.user;

import com.dev7ex.multiperms.api.user.PermissionUser;
import net.md_5.bungee.api.connection.ProxiedPlayer;

/**
 * @author Dev7ex
 * @since 09.11.2024
 */
public interface BungeePermissionUser extends PermissionUser {

    ProxiedPlayer getEntity();

}