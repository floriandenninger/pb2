package androidx.media3.decoder.vp9;

import defpackage.pmo;
import defpackage.psp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class VpxLibrary {
    private static final psp a;
    private static int b;

    static {
        pmo.b("goog.exo.vpx");
        a = new psp("vpx", "vpxV2JNI");
        b = 1;
    }

    private VpxLibrary() {
    }

    public static boolean a() {
        return a.a();
    }

    public static boolean b(int i) {
        return i == 0 || (i != 1 && i == b);
    }

    private static native String vpxGetBuildConfig();

    public static native String vpxGetVersion();

    public static native boolean vpxIsSecureDecodeSupported();
}
