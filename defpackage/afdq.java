package defpackage;

import android.media.MediaCodec;
import android.view.Surface;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class afdq {
    private final shf a;
    private final afhs b;

    public afdq(afhs afhsVar, shf shfVar) {
        this.b = afhsVar;
        this.a = shfVar;
    }

    public static afih b(IllegalStateException illegalStateException, long j, Surface surface) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return new afih(afif.DEFAULT, "fmt.decode", j, "src.decfail;d." + c((MediaCodec.CodecException) illegalStateException) + ";sur." + d(surface), illegalStateException, null);
        }
        String d = d(surface);
        return new afih(afif.DEFAULT, "fmt.decode", j, d.length() != 0 ? "src.decfail;sur.".concat(d) : new String("src.decfail;sur."), illegalStateException, null);
    }

    public static String c(MediaCodec.CodecException codecException) {
        return codecException.getDiagnosticInfo().replace("android.media.MediaCodec", "MC");
    }

    public static String d(Surface surface) {
        return surface == null ? "null" : surface.isValid() ? "valid" : "invalid";
    }

    public static boolean e(Throwable th) {
        if (!(th instanceof IllegalStateException)) {
            return false;
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        return (th instanceof MediaCodec.CodecException) || (stackTrace.length > 0 && stackTrace[0].getClassName().contains("MediaCodec"));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.afih a(java.io.IOException r16, long r17, defpackage.ysy r19, defpackage.afif r20, com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r21) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afdq.a(java.io.IOException, long, ysy, afif, com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData):afih");
    }
}
