package com.example.examplemod;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;

public class RobertPickaxe extends PickaxeItem {
    public RobertPickaxe() {
        super(ItemTier.NETHERITE, 10, 20.0F, new Properties().group(ItemGroup.COMBAT));
        this.setRegistryName("robert_pickaxe");
    }
}
