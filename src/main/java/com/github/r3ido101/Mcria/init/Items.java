package com.github.r3ido101.Mcria.init;

import com.github.r3ido101.Mcria.refs;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Oliver on 07/04/2016.
 */
public class Items  {

    public static Item pizza_base;

    public static void init(){
        pizza_base = new Item().setUnlocalizedName("pizza_base");
    }

    public static void register(){
        GameRegistry.registerItem(pizza_base, pizza_base.getUnlocalizedName().substring(5));
    }

    public static void registerRenders(){
        registerRender(pizza_base);
    }

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(refs.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
