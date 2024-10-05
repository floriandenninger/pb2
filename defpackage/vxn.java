package defpackage;

import com.google.android.libraries.video.media.VideoMetaData;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class vxn implements vxo {
    private final /* synthetic */ int c;

    public vxn(int i) {
        this.c = i;
    }

    @Override // defpackage.vxo
    public final vxp a(int[] iArr, VideoMetaData videoMetaData) {
        if (this.c == 0) {
            return new vxr(iArr, videoMetaData);
        }
        Arrays.sort(iArr);
        return new vsa(iArr);
    }
}
