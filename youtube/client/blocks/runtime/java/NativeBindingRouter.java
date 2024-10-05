package youtube.client.blocks.runtime.java;

import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class NativeBindingRouter {
    public static final NativeBindingRouter a = new NativeBindingRouter();

    private NativeBindingRouter() {
    }

    public native void nativeCallAsyncBinding(byte[] bArr, SettableFuture settableFuture);

    public native byte[] nativeCallSyncBinding(byte[] bArr);
}
