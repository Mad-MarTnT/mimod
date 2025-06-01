package net.madins.thebloodmoonhunters.client;

import net.madins.thebloodmoonhunters.item.custom.HunterArmorItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class HunterArmorRenderer extends GeoArmorRenderer<HunterArmorItem> {
    public HunterArmorRenderer() {
        super(new HunterArmorModel());
    }
}
