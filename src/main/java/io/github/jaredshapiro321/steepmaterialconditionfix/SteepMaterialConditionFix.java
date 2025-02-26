package io.github.jaredshapiro321.steepmaterialconditionfix;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(SteepMaterialConditionFix.MODID)
public class SteepMaterialConditionFix
{
    public static final String MODID = "steepmaterialconditionfix";

    public SteepMaterialConditionFix()
    {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
