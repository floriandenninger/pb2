package defpackage;

import android.net.Uri;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajjp implements ajjz {
    public static final yzw a = new yzw();
    private static final ykl c = new jvq(4);
    public final boolean b;
    private final ajjs d;
    private final ajkc e;
    private final ajjv f;
    private final aadw g;

    public ajjp(ajjs ajjsVar, apdb apdbVar, ajjv ajjvVar, aadw aadwVar) {
        ajjsVar.getClass();
        this.d = ajjsVar;
        this.e = new ajkc();
        this.f = ajjvVar;
        this.b = apdbVar.e;
        this.g = aadwVar;
    }

    static final ajkj p(ImageView imageView) {
        return (ajkj) imageView.getTag(R.id.image_view_controller_tag);
    }

    private final ajjo q(ajkj ajkjVar, ajjv ajjvVar, avgg avggVar, ajkc ajkcVar) {
        if (ajjvVar.h == null && ajjvVar.e <= 0 && ajkcVar.c()) {
            return null;
        }
        return new ajjo(this, ajjvVar, ajkcVar, avggVar, ajkjVar);
    }

    private static final zab r(ajkj ajkjVar, ImageView imageView, ajjv ajjvVar) {
        boolean z = ajjvVar.d;
        if (ajkjVar == null || ajkjVar.c.c() != z) {
            return z ? new zad(imageView.getContext()) : a;
        }
        return ajkjVar.c;
    }

    @Override // defpackage.ajjz, defpackage.zaf
    public final void a(Uri uri, ykl yklVar) {
        this.d.a(uri, yklVar);
    }

    @Override // defpackage.ajjz
    public final ajjs b() {
        return this.d;
    }

    @Override // defpackage.ajjz
    public final ajjv c() {
        return this.f;
    }

    @Override // defpackage.ajjz
    public final void d(ajjy ajjyVar) {
        this.e.a(ajjyVar);
    }

    @Override // defpackage.ajjz
    public final void e(ImageView imageView) {
        ajkj p;
        if (imageView == null || (p = p(imageView)) == null) {
            return;
        }
        p.a();
    }

    @Override // defpackage.ajjz
    public final void f() {
    }

    @Override // defpackage.ajjz
    public final void g(ImageView imageView, Uri uri) {
        i(imageView, uri, null);
    }

    @Override // defpackage.ajjz
    public final void h(ImageView imageView, avgg avggVar) {
        k(imageView, avggVar, null);
    }

    @Override // defpackage.ajjz
    public final void i(ImageView imageView, Uri uri, ajjv ajjvVar) {
        k(imageView, ahbw.K(uri), ajjvVar);
    }

    @Override // defpackage.ajjz
    @Deprecated
    public final void j(ImageView imageView, aami aamiVar, ajjv ajjvVar) {
        k(imageView, aamiVar.e(), ajjvVar);
    }

    @Override // defpackage.ajjz
    public final void k(ImageView imageView, avgg avggVar, ajjv ajjvVar) {
        boolean z;
        if (imageView == null) {
            return;
        }
        if (ajjvVar == null) {
            ajjvVar = this.f;
        }
        ajkj p = p(imageView);
        if (p == null) {
            p = new ajkj(this.d, r(null, imageView, ajjvVar), null, imageView, ajjvVar.c, this.g);
            imageView.setTag(R.id.image_view_controller_tag, p);
        } else {
            p.b.c(ajjvVar.c);
            p.f(r(p, imageView, ajjvVar));
            p.h(null);
        }
        if (avggVar == null || !ahbw.L(avggVar)) {
            int i = ajjvVar.e;
            if (i > 0) {
                p.g(i);
                return;
            } else {
                p.a();
                return;
            }
        }
        int i2 = ajjvVar.j;
        if (i2 == 2 || i2 == 3) {
            Iterator it = avggVar.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                Uri parse = Uri.parse(((avgf) it.next()).c);
                if (this.d.h(parse)) {
                    p.m(ahbw.K(parse), ajjvVar.f, ajjvVar.g, q(p, ajjvVar, avggVar, this.e));
                    z = true;
                    break;
                }
            }
            if (ajjvVar.j == 2 || z) {
                return;
            }
        }
        p.m(avggVar, ajjvVar.f, ajjvVar.g, q(p, ajjvVar, avggVar, this.e));
    }

    @Override // defpackage.ajjz
    public final void l(Uri uri, ykl yklVar) {
        this.d.a(uri, yklVar);
    }

    @Override // defpackage.ajjz
    public final void m(Uri uri, ykl yklVar) {
        this.d.g(uri, yklVar);
    }

    @Override // defpackage.ajjz
    public final void o(ajjy ajjyVar) {
        this.e.b(ajjyVar);
    }

    @Override // defpackage.ajjz
    public final void n(avgg avggVar, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            zga.b(String.format(Locale.ENGLISH, "ImageManager: cannot preload image. Invalid dimensions given: %d x %d", Integer.valueOf(i), Integer.valueOf(i2)));
            return;
        }
        Uri C = ahbw.C(avggVar, i, i2);
        if (C == null) {
            zga.b("ImageManager: cannot preload image with null uri.");
        } else {
            this.d.a(C, c);
        }
    }
}
