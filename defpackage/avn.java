package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avn {
    public static int[] a() {
        amrp f = amru.f();
        int[] iArr = avo.b;
        int length = iArr.length;
        for (int i = 0; i < 7; i++) {
            int i2 = iArr[i];
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i2).setSampleRate(48000).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build())) {
                f.h(Integer.valueOf(i2));
            }
        }
        f.h(2);
        return anaf.aj(f.g());
    }

    public static int b(Exception exc, int i) {
        int i2 = pts.a;
        if (!ayt.b(exc)) {
            if (pts.a >= 23 && ayu.a(exc)) {
                return 6006;
            }
            if (ays.b(exc)) {
                return 6002;
            }
            if (ays.a(exc)) {
                return 6007;
            }
            if (exc instanceof azj) {
                return 6001;
            }
            if (exc instanceof axx) {
                return 6003;
            }
            if (exc instanceof azg) {
                return 6008;
            }
            if (i == 1) {
                return 6006;
            }
            return i == 2 ? 6004 : 6002;
        }
        return ayt.a(exc);
    }
}
