package defpackage;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyz implements cqp {
    public static final cqm a = cqm.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new cyu(1, null));
    public static final cqm b = cqm.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new cyu(0));
    private final cyx c;
    private final ctm d;

    public cyz(ctm ctmVar, cyx cyxVar) {
        this.d = ctmVar;
        this.c = cyxVar;
    }

    @Override // defpackage.cqp
    public final ctd a(Object obj, int i, int i2, cqn cqnVar) {
        long longValue = ((Long) cqnVar.b(a)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) cqnVar.b(b);
            if (num == null) {
                num = 2;
            }
            cxu cxuVar = (cxu) cqnVar.b(cxu.f);
            if (cxuVar == null) {
                cxuVar = cxu.e;
            }
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                this.c.a(mediaMetadataRetriever, obj);
                int intValue = num.intValue();
                Bitmap bitmap = null;
                if (Build.VERSION.SDK_INT >= 27 && i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && cxuVar != cxu.d) {
                    try {
                        int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                        int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                        int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                        if (parseInt3 == 90 || parseInt3 == 270) {
                            parseInt2 = parseInt;
                            parseInt = parseInt2;
                        }
                        float a2 = cxuVar.a(parseInt, parseInt2, i, i2);
                        bitmap = mediaMetadataRetriever.getScaledFrameAtTime(longValue, intValue, Math.round(parseInt * a2), Math.round(a2 * parseInt2));
                    } catch (Throwable unused) {
                    }
                }
                if (bitmap == null) {
                    bitmap = mediaMetadataRetriever.getFrameAtTime(longValue, intValue);
                }
                if (bitmap == null) {
                    throw new cyy();
                }
                return cxg.f(bitmap, this.d);
            } finally {
                if (Build.VERSION.SDK_INT >= 29) {
                    mediaMetadataRetriever.close();
                } else {
                    mediaMetadataRetriever.release();
                }
            }
        }
        StringBuilder sb = new StringBuilder(83);
        sb.append("Requested frame must be non-negative, or DEFAULT_FRAME, given: ");
        sb.append(longValue);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.cqp
    public final boolean b(Object obj, cqn cqnVar) {
        return true;
    }
}
