package io.rgross;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by ryan on 3/17/17.
 */
@RunWith(MockitoJUnitRunner.class)
public class MockitoExampleTest {

    private TestController testController;

    @Before
    public void setUp() {
        testController = mock(TestController.class);
    }

    @Test
    public void helloWorldTest() {
        when(testController.helloWorld()).thenReturn("HelloWorld!");
    }


}
