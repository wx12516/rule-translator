package com.asiainfo.rule;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.asiainfo.rule.translator.core.render.RenderJSONTranslator;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RenderJSONTranslatorTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(RenderJSONTranslatorTest.class);

    @Test
    public void TestARule() {
        testRule("a-rule.groovy");
    }

    @Test
    public void TestBRule() {
        testRule("b-rule.groovy");
    }

    @Test
    public void TestCRule() {
        testRule("c-rule.groovy");
    }

    private JSONObject testRule(String name) {
        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            URL url = classLoader.getResource(name);
            File file = new File(url.toURI());
            String ruleScript = new String(Files.readAllBytes(Paths.get(file.getPath())));
            RenderJSONTranslator translator = new RenderJSONTranslator();
            JSONObject res = translator.doTranslator(ruleScript);
//            System.out.printf("The translation %s result is :\n%s\n", name, JSON.toJSONString(res, true));
            System.out.printf("The translation %s result is :\n%s\n", name, JSON.toJSONString(res));
            return res;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
