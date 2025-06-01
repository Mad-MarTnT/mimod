package net.madins.thebloodmoonhunters.item;

import net.madins.thebloodmoonhunters.TheBloodMoonHunters;
import net.madins.thebloodmoonhunters.item.custom.HunterArmorItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TheBloodMoonHunters.MODID);

    public static final RegistryObject<Item> BLOODSTONE = ITEMS.register("bloodstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HUNTER_HELMET = ITEMS.register("hunter_helmet",
            ()-> new HunterArmorItem(ModArmorMaterials.HUNTER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> HUNTER_CHESTPLATE = ITEMS.register("hunter_chestplate",
            ()-> new HunterArmorItem(ModArmorMaterials.HUNTER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> HUNTER_LEGGINGS = ITEMS.register("hunter_leggings",
            ()-> new HunterArmorItem(ModArmorMaterials.HUNTER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> HUNTER_BOOTS = ITEMS.register("hunter_boots",
            ()-> new HunterArmorItem(ModArmorMaterials.HUNTER, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
