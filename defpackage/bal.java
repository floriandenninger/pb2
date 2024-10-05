package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bal implements bak {
    @Override // defpackage.bak
    public final int a() {
        return MediaCodecList.getCodecCount();
    }

    @Override // defpackage.bak
    public final MediaCodecInfo b(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // defpackage.bak
    public final boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // defpackage.bak
    public final boolean d() {
        return false;
    }

    @Override // defpackage.bak
    public final boolean e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }
}
