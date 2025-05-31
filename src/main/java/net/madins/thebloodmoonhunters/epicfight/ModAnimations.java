package net.madins.thebloodmoonhunters.epicfight;

import yesman.epicfight.api.animation.types.StaticAnimation;
import yesman.epicfight.api.animation.AnimationManager;
import net.minecraft.resources.ResourceLocation;

public class ModAnimations {
    // 1. DECLARACIÓN DE ANIMACIONES
    public static StaticAnimation TRICK_WEAPON_TRANSFORM;
    public static StaticAnimation TRICK_WEAPON_COMBO;
    public static StaticAnimation TRICK_WEAPON_SPECIAL;

    // 2. MÉTODO DE REGISTRO PRINCIPAL
    public static void register() {
        // 3. CREACIÓN DE ANIMACIONES
        TRICK_WEAPON_TRANSFORM = createAnimation("biped/trick_weapon/transform", true);
        TRICK_WEAPON_COMBO = createAnimation("biped/trick_weapon/combo", true);
        TRICK_WEAPON_SPECIAL = createAnimation("biped/trick_weapon/special", true);
    }

    // 4. MÉTODO AUXILIAR PARA CREAR ANIMACIONES
    private static StaticAnimation createAnimation(String path, boolean isRepeat) {
        // 5. INSTANCIACIÓN DE LA ANIMACIÓN
        StaticAnimation animation = new StaticAnimation(isRepeat, path);

        // 6. REGISTRO EN EL GESTOR DE ANIMACIONES
        AnimationManager.getInstance().registerAnimation(
                new ResourceLocation("thebloodmoonhunters", path.replace('/', '_')),
                animation
        );
        return animation;
    }
}