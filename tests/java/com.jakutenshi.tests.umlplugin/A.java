package com.jakutenshi.tests.umlplugin;

import java.util.Map;

/**
 * Created by JAkutenshi on 31.05.2016.
 */
public abstract class A <T extends Map<?, String>> {
    public abstract T foo();
}
