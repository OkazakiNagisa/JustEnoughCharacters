package me.towdium.jecharacters.core;

import me.towdium.jecharacters.transform.Transformer;
import me.towdium.jecharacters.transform.TransformerRegistry;
import net.minecraft.launchwrapper.IClassTransformer;

/**
 * Author: Towdium
 * Date:   2016/9/4.
 */
public class JechClassTransformer implements IClassTransformer {

    @SuppressWarnings("SameParameterValue")
    @Override
    public byte[] transform(String s, String s1, byte[] bytes) {
        if (JechCore.INITIALIZED) {
            for (Transformer t : TransformerRegistry.getTransformer(s))
                bytes = t.transform(bytes);
            return bytes;
        } else {
            return bytes;
        }
    }
}
