package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajjq implements ykl {
    private final ykl a;

    public ajjq(ykl yklVar) {
        this.a = yklVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        this.a.a((Uri) obj, exc);
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        int i;
        int i2;
        Uri uri = (Uri) obj;
        Bitmap bitmap = (Bitmap) obj2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        double d = width;
        double d2 = height;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        if (d3 < 0.5625d) {
            Double.isNaN(d);
            i2 = (int) (d / 0.5625d);
            i = width;
        } else {
            if (d3 > 0.5625d) {
                Double.isNaN(d2);
                i = (int) (d2 * 0.5625d);
            } else {
                i = width;
            }
            i2 = height;
        }
        int i3 = (width - i) / 2;
        int i4 = (height - i2) / 2;
        if (i != width || i2 != height) {
            bitmap = Bitmap.createBitmap(bitmap, i3, i4, i, i2);
        }
        this.a.b(uri, bitmap);
    }
}
