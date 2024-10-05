package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.OperationCanceledException;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hxq {
    private static final Point c = new Point(512, 384);
    public final Context a;
    public final MediaMetadataRetriever b = new MediaMetadataRetriever();

    public hxq(Context context) {
        this.a = context;
    }

    public final ammv a(Uri uri) {
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                Point point = c;
                int max = Math.max(point.x, point.y);
                return ammv.j(this.a.getContentResolver().loadThumbnail(uri, new Size(max, max), null));
            } catch (Exception e) {
                if (!(e instanceof OperationCanceledException)) {
                    afsi.c(1, 24, "Failed loading thumbnail", e);
                }
            }
        }
        return amlr.a;
    }
}
