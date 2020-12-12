package com.example.examplemod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;

public class CustomSword extends SwordItem {
    public CustomSword() {
        super(ItemTier.DIAMOND, 10, 20.0F, new Item.Properties().group(ItemGroup.COMBAT));
        this.setRegistryName("my_sword");
    }
}
