package me.towdium.jecharacters.core;

import me.towdium.jecharacters.transform.TransformerRegistry;
import me.towdium.jecharacters.util.StringMatcher;
import net.minecraftforge.fml.relauncher.IFMLCallHook;

import java.util.Map;

public class JechCallHook implements IFMLCallHook {
    @Override
    public void injectData(Map<String, Object> data) {
    }

    @Override
    public Void call() {
        StringMatcher.checkStr("Test 这是一条测试文本", "Test zheshiytcswb");
        TransformerRegistry.getTransformer("some.class");
        JechCore.INITIALIZED = true;
        return null;
    }
}
