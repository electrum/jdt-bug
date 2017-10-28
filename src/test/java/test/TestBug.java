package test;

import com.google.common.util.concurrent.SettableFuture;
import org.testng.annotations.Test;

public class TestBug
{
    @Test
    public void testBug()
    {
        SettableFuture<?> future = SettableFuture.create();
        invoke(future::get);
    }

    private static void invoke(ThrowingRunnable runnable) {}

    private interface ThrowingRunnable
    {
        void run()
                throws Throwable;
    }
}
