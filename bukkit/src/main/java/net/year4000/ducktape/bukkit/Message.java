/*
 * Copyright 2015 Year4000.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package net.year4000.ducktape.bukkit;

import net.year4000.utilities.bukkit.BukkitLocale;
import net.year4000.utilities.locale.LocaleUtil;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Message extends BukkitLocale implements LocaleUtil {
    public Message(Player player) {
        super(player);
        localeManager = MessageManager.get();
    }

    public Message(CommandSender sender) {
        this(sender instanceof Player ? (Player) sender : null);
    }
}
