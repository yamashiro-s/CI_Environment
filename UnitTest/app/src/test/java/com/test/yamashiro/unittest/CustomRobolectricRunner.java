package com.test.yamashiro.unittest;

import org.junit.runners.model.InitializationError;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.internal.bytecode.InstrumentationConfiguration;
import org.robolectric.internal.bytecode.ShadowMap;

/**
 * Created by yamashiro on 2016/06/16.
 */
public class CustomRobolectricRunner extends RobolectricGradleTestRunner {
    public CustomRobolectricRunner(Class<?> klass) throws InitializationError {
        super(klass);
    }

    @Override
    protected ShadowMap createShadowMap() {
        return super.createShadowMap().newBuilder()
                .addShadowClass(ShadowPerson.class)

                .build();
    }

    public InstrumentationConfiguration createClassLoaderConfig() {
        return InstrumentationConfiguration.newBuilder()
                .addInstrumentedClass(Person.class.getName())

                .build();
    }
}
