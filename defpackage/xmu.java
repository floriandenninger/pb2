package defpackage;

import android.content.res.Resources;
import android.os.Handler;
import com.google.android.youtube.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xmu extends ahhi implements ahkd, ahig {
    private static final float c = ahkt.a(120.0f);
    private static final float e = ahkt.a(40.0f);
    private static final String f = ajm.a().b(" · ");
    public final xmv a;
    public xmw b;
    private final ahki g;
    private final ahjo h;
    private final Resources i;

    public xmu(Resources resources, final Handler handler, ahkv ahkvVar, ahkm ahkmVar, ahki ahkiVar) {
        this.i = resources;
        this.g = ahkiVar;
        xmv xmvVar = new xmv(resources, ahkiVar.b, ahkvVar.clone(), ahkmVar.a.a());
        this.a = xmvVar;
        ((ahga) xmvVar).c = new ahgb() { // from class: xms
            @Override // defpackage.ahgb
            public final void a() {
                final xmu xmuVar = xmu.this;
                Handler handler2 = handler;
                if (xmuVar.b != null) {
                    handler2.post(new Runnable() { // from class: xmt
                        @Override // java.lang.Runnable
                        public final void run() {
                            xmu.this.b.a.a.d();
                        }
                    });
                }
            }
        };
        ahjo a = ahkiVar.b.a(ahkvVar.clone(), c, e);
        this.h = a;
        a.A(2.0f);
        a.z(-1);
        a.h(17);
        xmvVar.l(0.0f, ahkt.a(-180.0f), 0.0f);
        a.l(0.0f, ahkt.a(-40.0f), 0.0f);
        n(a);
        n(xmvVar);
        ahkiVar.e.add(this);
        c(ahkiVar.w());
    }

    public final void a() {
        this.a.c(true);
    }

    public final void b(int i) {
        this.h.y(this.i.getString(R.string.ad_minimized, f, zhq.i(i / 1000)));
    }

    @Override // defpackage.ahkd
    public final void c(boolean z) {
        this.h.qE(z);
    }

    public final void d(int i) {
        this.a.d(i);
    }

    public final void e(boolean z) {
        this.l = !z;
        this.g.k();
    }

    @Override // defpackage.ahig
    public final boolean f(ahjq ahjqVar) {
        Iterator it = iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                ahim ahimVar = (ahim) it.next();
                if (ahimVar instanceof ahig) {
                    if (z || ((ahig) ahimVar).f(ahjqVar)) {
                        z = true;
                    }
                }
            }
            return z;
        }
    }

    @Override // defpackage.ahig
    public final boolean g(ahjq ahjqVar) {
        return false;
    }

    @Override // defpackage.ahig
    public final boolean h(ahjq ahjqVar) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ahim ahimVar = (ahim) it.next();
            if ((ahimVar instanceof ahig) && !((ahig) ahimVar).h(ahjqVar)) {
                return false;
            }
        }
        return true;
    }
}
