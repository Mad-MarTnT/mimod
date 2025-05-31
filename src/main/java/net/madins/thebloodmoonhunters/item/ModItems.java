package net.madins.thebloodmoonhunters.item;

import net.madins.thebloodmoonhunters.TheBloodMoonHunters;
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
    public static final RegistryObject<Item> SAW_CLEAVER = ITEMS.register("saw_cleaver",
            () -> new TrickWeaponItem(
                    new Item.Properties().durability(500),
                    WeaponCapabilities.SAW_CLEAVER_CLOSED,
                    WeaponCapabilities.SAW_CLEAVER_OPENED

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
