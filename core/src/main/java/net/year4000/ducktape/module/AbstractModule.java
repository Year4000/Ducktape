package net.year4000.ducktape.module;

import lombok.Data;

import java.io.File;

import static com.google.common.base.Preconditions.checkNotNull;

@Data
public abstract class AbstractModule {
    /** Is the module enabled */
    public boolean enabled;

    /** Run when the Module is loaded */
    public void load() {}

    /** Run when the Module is enabled */
    public void enable() {}

    /** Run when the Module is disabled */
    public void disable() {}

    /** The ModuleInfo that this class is for */
    public ModuleInfo getModuleInfo() {
        return checkNotNull(getClass().getAnnotation(ModuleInfo.class));
    }

    /** Get the folder that will hold this Module's data */
    public abstract File getDataFolder();

    /** Register a command class */
    public abstract void registerCommand(Class<?> clazz);
}