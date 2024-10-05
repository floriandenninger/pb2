package defpackage;

import android.media.MediaCodec;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class vuk implements vum {
    @Override // defpackage.vum
    public final vur a(String str, boolean z) {
        MediaCodec createDecoderByType;
        vcp.d(true);
        try {
            if (z) {
                createDecoderByType = MediaCodec.createEncoderByType(str);
            } else {
                createDecoderByType = MediaCodec.createDecoderByType(str);
            }
            return new vur(createDecoderByType);
        } catch (IOException e) {
            String valueOf = String.valueOf(str);
            vtv.c(valueOf.length() != 0 ? "Failed to create media decoder for mime type: ".concat(valueOf) : new String("Failed to create media decoder for mime type: "), e);
            return null;
        }
    }
}
