package androidx.media3.decoder.opus;

import defpackage.pmo;
import defpackage.psp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OpusLibrary {
    private static final psp a;
    private static int b;

    static {
        pmo.b("goog.exo.opus");
        a = new psp("opusV2JNI");
        b = 1;
    }

    private OpusLibrary() {
    }

    public static boolean a() {
        return a.a();
    }

    public static boolean b(int i) {
        return i == 0 || (i != 1 && i == b);
    }

    public static native String opusGetVersion();

    public static native boolean opusIsSecureDecodeSupported();
}
