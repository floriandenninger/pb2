package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zpb {
    public static final AtomicBoolean a = new AtomicBoolean();

    public static synchronized void a() {
        synchronized (zpb.class) {
            AtomicBoolean atomicBoolean = a;
            if (atomicBoolean.get()) {
                return;
            }
            try {
                System.loadLibrary("drishti_jni_native");
                atomicBoolean.set(true);
            } catch (UnsatisfiedLinkError e) {
                zga.d("Load library: drishti_jni_native - Failed to load", e);
            }
        }
    }
}
