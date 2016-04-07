package com.github.r3ido101.Mcria.proxy;

import com.github.r3ido101.Mcria.init.Items;

/**
 * Created by Oliver on 07/04/2016.
 */
public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenders(){
        Items.registerRenders();
    }
}
