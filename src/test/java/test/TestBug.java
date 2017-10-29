package test;

import com.google.common.util.concurrent.SettableFuture;
import org.testng.annotations.Test;

import java.util.concurrent.Callable;

public class TestBug
{
    @Test
    public void testBug()
    {
        SettableFuture<?> future = SettableFuture.create();
        Callable<?> test = future::get;
    }
}
