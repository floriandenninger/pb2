package defpackage;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ana {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
        mediaMetadataRetriever.setDataSource(mediaDataSource);
    }

    public static float b(float[] fArr, float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int min = Math.min((int) (200.0f * f), 199);
        float f2 = fArr[min];
        return f2 + (((f - (min * 0.005f)) / 0.005f) * (fArr[min + 1] - f2));
    }
}
