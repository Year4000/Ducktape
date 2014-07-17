package net.year4000.ducktape.bungee;

import net.cubespace.Yamler.Config.InvalidConfigurationException;
import net.year4000.ducktape.core.GlobalSettings;

import java.io.File;

public class Settings extends GlobalSettings {
    private static Settings inst = null;

    private Settings() {
        try {
            init(new File(DuckTape.get().getDataFolder(), "config.yml"));
        } catch (InvalidConfigurationException e) {
            DuckTape.debug(e, false);
        }
    }

    public static Settings get() {
        if (inst == null) {
            inst = new Settings();
        }

        return inst;
    }

    /** Get the folder for the modules */
    @SuppressWarnings("ResultOfMethodCallIgnored")
    public File getModulesFolder() {
        File file = new File(DuckTape.get().getDataFolder(), getModulesPath());

        if (!file.exists()) {
            file.mkdir();
        }

        return file;
    }
}