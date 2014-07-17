package net.year4000.ducktape.bukkit.module;

import net.year4000.ducktape.bukkit.DuckTape;
import net.year4000.ducktape.bukkit.Settings;
import net.year4000.ducktape.core.module.AbstractModule;

import java.io.File;

public class BukkitModule extends AbstractModule {
    @Override
    public File getDataFolder() {
        return new File(Settings.get().getModulesFolder(), getModuleInfo().name());
    }

    @Override
    public void registerCommand(Class<?> clazz) {
        DuckTape.get().registerCommand(clazz);
    }
}