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
        // Person クラスをモックしたインスタンス p を生成する。
        Person p = mock(Person.class);

        // getAge() が呼ばれた場合、 21 を返すように設定する。
        when( p.getAge()).thenReturn(21);

        // mock が正常であれば、 new も setSge() も読んでいない p が
        // getAge() で 21 を返す。
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