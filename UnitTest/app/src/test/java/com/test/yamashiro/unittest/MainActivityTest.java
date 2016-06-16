package com.test.yamashiro.unittest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

// assertThat() + Matchers を使用できるようにする

/**
 * Created by yamashiro on 2016/06/15.
 */

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class MainActivityTest {

    @Test
    public void 年齢テスト() throws Exception {
        Person p = mock(Person.class);
        when( p.getAge()).thenReturn(21);
        assertThat(p.getAge()).isEqualTo(new Person("Yamashiro", 21).getAge());
    }

    @Test
    public void 名前テスト() throws Exception {
        Person p = new Person();
        p.setName("Yamashiro");
        p.setAge(21);
        assertThat(p.getName()).isEqualTo(new Person("Yamashiro", 21).getName());
    }
}