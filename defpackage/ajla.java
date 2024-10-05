package defpackage;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import java.util.Locale;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajla implements ajjz {
    public final azrw c;
    private final Context d;
    private final azrw e;
    private final amnv g;
    private final amnv h;
    final amnv a = amkq.x(ajkw.b);
    final amnv b = amkq.x(ajkw.a);
    private final ajkc f = new ajkc();
    private final ajkx i = new ajkx(this);

    public ajla(Context context, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        this.d = context;
        this.e = azrwVar;
        this.c = azrwVar2;
        this.g = amkq.x(new ajkv(azrwVar2, azrwVar4, azrwVar3, 0));
        this.h = amkq.x(new uqa(azrwVar2, 8));
    }

    private final void p(ImageView imageView, avgg avggVar, ajjv ajjvVar) {
        if (imageView == null) {
            return;
        }
        if (ajjvVar == null) {
            ajjvVar = ajjv.a;
        }
        if (!ahbw.L(avggVar)) {
            e(imageView);
            int i = ajjvVar.e;
            if (i > 0) {
                imageView.setImageResource(i);
                return;
            }
            return;
        }
        ajld ajldVar = new ajld(new dcg(imageView), ajjvVar, avggVar, this.f, ajjvVar.h);
        Context context = imageView.getContext();
        if (ajjvVar == null) {
            ajjvVar = ajjv.a;
        }
        cor a = this.i.a(context);
        if (a == null) {
            return;
        }
        con c = a.c();
        dbx dbxVar = new dbx();
        int i2 = ajjvVar.e;
        if (i2 > 0) {
            dbxVar.F(i2);
        }
        con d = c.l(dbxVar).k((cos) (ajjvVar.d ? this.b : this.a).get()).d((dbw) this.g.get());
        if (avggVar.c.size() == 1) {
            d.f(wbs.aj(((avgf) avggVar.c.get(0)).c));
        } else {
            d.h(avggVar);
        }
        ahbw.y(((Integer) this.h.get()).intValue(), d);
        d.q(ajldVar);
    }

    @Override // defpackage.ajjz, defpackage.zaf
    public final void a(Uri uri, ykl yklVar) {
        b().a(uri, yklVar);
    }

    @Override // defpackage.ajjz
    public final ajjs b() {
        return (ajjs) this.e.get();
    }

    @Override // defpackage.ajjz
    public final ajjv c() {
        return ajjv.a;
    }

    @Override // defpackage.ajjz
    public final void d(ajjy ajjyVar) {
        this.f.a(ajjyVar);
    }

    @Override // defpackage.ajjz
    public final void e(ImageView imageView) {
        cor a;
        if (imageView == null || (a = this.i.a(imageView.getContext())) == null) {
            return;
        }
        a.i(imageView);
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
        p(imageView, avggVar, null);
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
        if (ahbw.L(avggVar)) {
            p(imageView, avggVar, ajjvVar);
        } else {
            p(imageView, null, ajjvVar);
        }
    }

    @Override // defpackage.ajjz
    public final void l(Uri uri, ykl yklVar) {
        b().a(uri, yklVar);
    }

    @Override // defpackage.ajjz
    public final void m(Uri uri, ykl yklVar) {
        b().g(uri, yklVar);
    }

    @Override // defpackage.ajjz
    public final void o(ajjy ajjyVar) {
        this.f.b(ajjyVar);
    }

    @Override // defpackage.ajjz
    public final void n(avgg avggVar, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            zga.b(String.format(Locale.ENGLISH, "ImageManager: cannot preload image. Invalid dimensions given: %d x %d", Integer.valueOf(i), Integer.valueOf(i2)));
            return;
        }
        if (!ahbw.L(avggVar)) {
            zga.b("ImageManager: cannot preload image with no model.");
            return;
        }
        cor a = this.i.a(this.d);
        if (a != null) {
            if (avggVar.c.size() == 1) {
                con f = a.b().f(wbs.aj(((avgf) avggVar.c.get(0)).c));
                ahbw.y(((Integer) this.h.get()).intValue(), f);
                f.p(CellularSignalStrengthError.ERROR_NOT_SUPPORTED, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
            } else {
                con f2 = a.f(avggVar);
                ahbw.y(((Integer) this.h.get()).intValue(), f2);
                f2.p(i, i2);
            }
        }
    }
}
