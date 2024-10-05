package com.youtube.android.libraries.elements.templates;

import com.google.android.libraries.elements.interfaces.DebuggerClient;
import defpackage.sgf;
import io.grpc.Status;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class UnifiedTemplateResolver {
    public static final byte[] a;
    private static final AtomicBoolean d;
    public final boolean b;
    public final int c;

    static {
        sgf.D();
        a = new byte[0];
        d = new AtomicBoolean(false);
    }

    public UnifiedTemplateResolver() {
        this(false, null, null, false, 0);
    }

    private native void jni_init(boolean z, DebuggerClient debuggerClient, String str);

    public native Status jni_preloadTemplateConfigs();

    public native Status jni_resolveFlat(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3, String str, boolean z, int i3, byte[][] bArr4, long[] jArr);

    public native void jni_setTemplateConfig(String str, byte[] bArr);

    public UnifiedTemplateResolver(boolean z, String str, DebuggerClient debuggerClient, boolean z2, int i) {
        this.b = z2;
        this.c = i;
        if (d.compareAndSet(false, true)) {
            jni_init(z, debuggerClient, str == null ? "localhost:5001" : str);
        }
    }
}
