package net.madins.thebloodmoonhunters.client;

import com.mojang.blaze3d.platform.InputConstants;
import net.madins.thebloodmoonhunters.TheBloodMoonHunters;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.client.settings.KeyModifier;
import org.lwjgl.glfw.GLFW;

import java.awt.im.InputContext;

public final class KeyBindings {
    public static final KeyBindings INSTANCE = new KeyBindings();
    private KeyBindings() {}
    private static final String CATEGORY = "key.categories." +TheBloodMoonHunters.MODID;
    public static final KeyMapping TRANSFORMWEAPON = new KeyMapping(
            "key." + TheBloodMoonHunters.MODID + ".transformweapon",
            KeyConflictContext.IN_GAME,
            InputConstants.getKey(InputConstants.KEY_P,  -1),
            CATEGORY
    );
}