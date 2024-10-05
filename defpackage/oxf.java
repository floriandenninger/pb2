package defpackage;

import android.media.MediaCodecInfo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oxf {
    public final String a;
    public final MediaCodecInfo.CodecCapabilities b;
    public final boolean c;

    public oxf(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        this.a = str;
        this.b = codecCapabilities;
        boolean z = false;
        if (codecCapabilities != null && pgz.a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            z = true;
        }
        this.c = z;
    }
}
