package com.github.r3ido101.Mcria;

import com.github.r3ido101.Mcria.init.Items;
import com.github.r3ido101.Mcria.proxy.ClientProxy;
import com.github.r3ido101.Mcria.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = refs.MOD_ID, name = refs.MOD_NAME, version = refs.VERSION)
public class Main {

    @SidedProxy(clientSide = refs.CLIENT_PROXY_CLASS, serverSide = refs.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event){
        Items.init();
        Items.register();
    }
    @Mod.EventHandler
    public static void Init(FMLInitializationEvent event){
        proxy.registerRenders();
    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event){

    }

}
