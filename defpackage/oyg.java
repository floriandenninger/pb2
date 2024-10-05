package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class oyg implements oye {
    private final int a;
    private MediaCodecInfo[] b;

    public oyg(boolean z) {
        this.a = z ? 1 : 0;
    }

    private final void e() {
        if (this.b == null) {
            this.b = new MediaCodecList(this.a).getCodecInfos();
        }
    }

    @Override // defpackage.oye
    public final int a() {
        e();
        return this.b.length;
    }

    @Override // defpackage.oye
    public final MediaCodecInfo b(int i) {
        e();
        return this.b[i];
    }

    @Override // defpackage.oye
    public final boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    @Override // defpackage.oye
    public final boolean d() {
        return true;
    }
}
