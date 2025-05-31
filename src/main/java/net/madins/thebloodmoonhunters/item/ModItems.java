package net.madins.thebloodmoonhunters.item;

import net.madins.thebloodmoonhunters.thebloodmoonhunters;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, thebloodmoonhunters.MODID);

    public static final RegistryObject<Item> BLOODSTONE = ITEMS.register("bloodstone",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
