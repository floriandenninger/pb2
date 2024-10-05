package org.tensorflow.lite;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class TensorFlowLite {
    private static final Throwable a;
    private static volatile boolean b = false;

    static {
        try {
            System.loadLibrary("tensorflowlite_jni");
            e = null;
        } catch (UnsatisfiedLinkError e) {
            e = e;
        }
        a = e;
    }

    private TensorFlowLite() {
    }

    public static void a() {
        if (b) {
            return;
        }
        try {
            nativeRuntimeVersion();
            b = true;
        } catch (UnsatisfiedLinkError e) {
            e = e;
            Object obj = a;
            if (obj != null) {
                e = obj;
            }
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 193);
            sb.append("Failed to load native TensorFlow Lite methods. Check that the correct native libraries are present, and, if using a custom native library, have been properly loaded via System.loadLibrary():\n  ");
            sb.append(valueOf);
            throw new UnsatisfiedLinkError(sb.toString());
        }
    }

    private static native String nativeRuntimeVersion();

    private static native String nativeSchemaVersion();
}
