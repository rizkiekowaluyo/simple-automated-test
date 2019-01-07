package net.wicara.rizki.simpleautomatedtest;

import android.content.Context;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MainActivityTest {

    private static final String FAKE_STRING = "Login was successful";

    Context mMockContext;

    @Test
    public void readStringFromContext_LocalizedString() {
        MainActivity objectUnderTest = new MainActivity(mMockContext);
        String result = objectUnderTest.validate("rizki","rizki");
        assertThat(result,is(FAKE_STRING));
    }
}