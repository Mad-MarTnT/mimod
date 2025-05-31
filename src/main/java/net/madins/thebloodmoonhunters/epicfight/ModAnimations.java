package net.madins.thebloodmoonhunters.epicfight;

import net.minecraft.resources.ResourceLocation;
import yesman.epicfight.api.animation.AnimationManager;
import yesman.epicfight.api.animation.types.StaticAnimation;
public class ModAnimations {
    // Animaciones básicas para trick weapons
    public static StaticAnimation TRICK_WEAPON_TRANSFORM;
    public static StaticAnimation TRICK_WEAPON_COMBO;
    public static StaticAnimation TRICK_WEAPON_SPECIAL;

    // Animaciones para habilidades especiales
    public static StaticAnimation ELECTRIC_HIT;
    public static StaticAnimation WHIRLIGIG_SLASH;

    public static void register() {
        // Animaciones de transformación y combate
        TRICK_WEAPON_TRANSFORM = createAnimation("biped/trick_weapon/transform", false);
        TRICK_WEAPON_COMBO = createAnimation("biped/trick_weapon/combo", false);
        TRICK_WEAPON_SPECIAL = createAnimation("biped/trick_weapon/special", false);

        // Animaciones para habilidades
        ELECTRIC_HIT = createAnimation("biped/skill/electric_hit", false);
        WHIRLIGIG_SLASH = createAnimation("biped/skill/whiriligig_slash", false);
    }

    private static StaticAnimation createAnimation(String path, boolean isRepeat) {
        // Convertir ruta a ID válido (reemplazar / por _)
        String animationId = path.replace('/', '_');
        ResourceLocation registryName = new ResourceLocation("thebloodmoonhunters", animationId);

        // Crear y registrar animación
        StaticAnimation animation = new StaticAnimation();
        AnimationManager.AnimationRegistryEvent()
    }
}