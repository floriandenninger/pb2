package defpackage;

import android.graphics.Bitmap;
import android.util.LruCache;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class flx {
    public final ypa a;
    public final Map b;
    public final LruCache c;
    public final boolean d;

    public flx(ypa ypaVar, ynx ynxVar) {
        HashMap hashMap = new HashMap();
        LruCache lruCache = new LruCache(5);
        ypaVar.getClass();
        this.a = ypaVar;
        this.b = hashMap;
        this.c = lruCache;
        this.d = ynxVar.c().j;
    }

    public final Bitmap a(String str) {
        if (this.d) {
            return null;
        }
        return (Bitmap) this.c.get(str);
    }

    public final flv b(String str) {
        return (flv) this.b.get(str);
    }

    public final void c(String str, long j, Bitmap bitmap, ImageView.ScaleType scaleType) {
        flv flvVar = new flv(j, scaleType);
        this.b.put(str, flvVar);
        if (!this.d) {
            if (bitmap != null) {
                this.c.put(str, bitmap);
            } else {
                this.c.remove(str);
            }
        }
        this.a.f(new flw(str, flvVar));
    }

    public final void d(String str, long j) {
        c(str, j, null, ImageView.ScaleType.FIT_CENTER);
    }
}
