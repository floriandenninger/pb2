package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bam implements bak {
    private final int a;
    private MediaCodecInfo[] b;

    public bam(boolean z, boolean z2) {
        int i = 1;
        if (!z && !z2) {
            i = 0;
        }
        this.a = i;
    }

    private final void f() {
        if (this.b == null) {
            this.b = new MediaCodecList(this.a).getCodecInfos();
        }
    }

    @Override // defpackage.bak
    public final int a() {
        f();
        return this.b.length;
    }

    @Override // defpackage.bak
    public final MediaCodecInfo b(int i) {
        f();
        return this.b[i];
    }

    @Override // defpackage.bak
    public final boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // defpackage.bak
    public final boolean d() {
        return true;
    }

    @Override // defpackage.bak
    public final boolean e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }
}
