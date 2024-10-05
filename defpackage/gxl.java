package defpackage;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import com.google.android.youtube.R;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gxl {
    public final Paint a;
    public final Rect b;
    public final float c;
    public final gxk d;

    public gxl(Resources resources) {
        this.b = new Rect(0, 0, yjk.K(resources.getDisplayMetrics(), 4), yjk.K(resources.getDisplayMetrics(), 2));
        this.c = yjk.I(resources.getDisplayMetrics(), 1.0f);
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(resources.getColor(R.color.yt_white1));
        this.d = new gxk();
    }

    public static boolean c(Map map) {
        if (map == null) {
            return false;
        }
        return map.containsKey(ahyo.CLIP_VIEWING) ? ((TimelineMarker[]) map.get(ahyo.CLIP_VIEWING)).length == 1 : map.containsKey(ahyo.CLIP_CREATION) && ((TimelineMarker[]) map.get(ahyo.CLIP_CREATION)).length == 1;
    }

    public final float a(long j, long j2, Rect rect) {
        return Math.max(0, (rect.left + ((int) ((rect.width() * Math.min(j, Math.max(0L, j2))) / j))) - (this.b.width() / 2));
    }

    public final float b(long j, long j2, Rect rect) {
        return Math.max(0, (rect.left + ((int) ((rect.width() * Math.min(j, Math.max(0L, j2))) / j))) - (this.b.width() / 2));
    }
}
