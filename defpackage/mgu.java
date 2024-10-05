package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.ImageView;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mgu extends gfp {
    public String d;
    private final HashSet e = new HashSet();
    private final flx f;
    private final Handler g;

    public mgu(Handler handler, flx flxVar) {
        this.f = flxVar;
        this.g = handler;
    }

    public final void a(String str) {
        this.e.add(str);
        if (TextUtils.equals(str, this.d)) {
            h();
        }
    }

    public final void b(String str, Bitmap bitmap) {
        c(str, bitmap, ImageView.ScaleType.CENTER_CROP);
    }

    public final void c(String str, Bitmap bitmap, ImageView.ScaleType scaleType) {
        if (this.f.a(str) == null) {
            flv b = this.f.b(str);
            this.f.c(str, b == null ? 0L : b.a, bitmap, scaleType);
        }
        if (TextUtils.equals(str, this.d)) {
            h();
        }
    }

    @Override // defpackage.gfp
    public final boolean i(gfq gfqVar, int i) {
        final gof gofVar = gfqVar.b;
        if (!gofVar.j()) {
            return true;
        }
        if (i != 1) {
            return i != 2 || this.e.contains(this.d) || this.f.a(this.d) != null || this.f.d;
        }
        String f = gofVar.f();
        this.d = f;
        this.e.remove(f);
        this.g.postDelayed(new Runnable() { // from class: mgt
            @Override // java.lang.Runnable
            public final void run() {
                mgu mguVar = mgu.this;
                if (!TextUtils.equals(gofVar.f(), mguVar.d) || mguVar.c == null) {
                    return;
                }
                mguVar.h();
            }
        }, 5000L);
        return true;
    }
}
