package net.madins.thebloodmoonhunters.datagen;

import net.madins.thebloodmoonhunters.TheBloodMoonHunters;
import net.madins.thebloodmoonhunters.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TheBloodMoonHunters.MODID, existingFileHelper);

    }
    @Override
    protected void registerModels(){
        simpleItem(ModItems.HUNTER_BOOTS);
        simpleItem(ModItems.HUNTER_LEGGINGS);
        simpleItem(ModItems.HUNTER_CHESTPLATE);
        simpleItem(ModItems.HUNTER_HELMET);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(TheBloodMoonHunters.MODID, "item/" + item.getId().getPath()));
    }
}