package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class oyf implements oye {
    @Override // defpackage.oye
    public final int a() {
        return MediaCodecList.getCodecCount();
    }

    @Override // defpackage.oye
    public final MediaCodecInfo b(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // defpackage.oye
    public final boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }

    @Override // defpackage.oye
    public final boolean d() {
        return false;
    }
}
