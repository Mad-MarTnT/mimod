package net.madins.thebloodmoonhunters.client;

import net.madins.thebloodmoonhunters.TheBloodMoonHunters;
import net.madins.thebloodmoonhunters.item.custom.HunterArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class HunterArmorModel extends GeoModel<HunterArmorItem> {
    @Override
    public ResourceLocation getModelResource(HunterArmorItem animatable) {
        return new ResourceLocation(TheBloodMoonHunters.MODID,"geo/hunter_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(HunterArmorItem animatabe) {
        return new ResourceLocation(TheBloodMoonHunters.MODID,"textures/armor/hunter_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(HunterArmorItem animatable) {
        return new ResourceLocation(TheBloodMoonHunters.MODID,"animations/hunter_armor.geo.json");
    }
}
