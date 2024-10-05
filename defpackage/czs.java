package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czs {
    public final cpc a;
    public final List b;
    final cor c;
    public boolean d;
    public czp e;
    public boolean f;
    public czp g;
    public Bitmap h;
    public czp i;
    public int j;
    public int k;
    public int l;
    private final Handler m;
    private final ctm n;
    private boolean o;
    private con p;

    public czs(cnv cnvVar, cpc cpcVar, int i, int i2, cqr cqrVar, Bitmap bitmap) {
        ctm ctmVar = cnvVar.a;
        cor c = cnv.c(cnvVar.a());
        con l = cnv.c(cnvVar.a()).b().l(((dbx) ((dbx) dbx.b(csk.a).R()).T()).E(i, i2));
        this.b = new ArrayList();
        this.c = c;
        Handler handler = new Handler(Looper.getMainLooper(), new czr(this));
        this.n = ctmVar;
        this.m = handler;
        this.p = l;
        this.a = cpcVar;
        e(cqrVar, bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return ((cpg) this.a).f.c;
    }

    public final void b() {
        int i;
        if (!this.d || this.o) {
            return;
        }
        czp czpVar = this.i;
        if (czpVar != null) {
            this.i = null;
            c(czpVar);
            return;
        }
        this.o = true;
        cpg cpgVar = (cpg) this.a;
        cpe cpeVar = cpgVar.f;
        int i2 = cpeVar.c;
        int i3 = 0;
        if (i2 > 0 && (i = cpgVar.e) >= 0) {
            i3 = i < i2 ? ((cpd) cpeVar.e.get(i)).i : -1;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        this.a.b();
        this.g = new czp(this.m, ((cpg) this.a).e, uptimeMillis + i3);
        this.p.l(dbx.c(new dcz(Double.valueOf(Math.random())))).h(this.a).q(this.g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(czp czpVar) {
        this.o = false;
        if (this.f) {
            this.m.obtainMessage(2, czpVar).sendToTarget();
            return;
        }
        if (!this.d) {
            this.i = czpVar;
            return;
        }
        if (czpVar.b != null) {
            d();
            czp czpVar2 = this.e;
            this.e = czpVar;
            int size = this.b.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((czq) this.b.get(size)).c();
                }
            }
            if (czpVar2 != null) {
                this.m.obtainMessage(2, czpVar2).sendToTarget();
            }
        }
        b();
    }

    public final void d() {
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            this.n.d(bitmap);
            this.h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(cqr cqrVar, Bitmap bitmap) {
        did.ap(cqrVar);
        did.ap(bitmap);
        this.h = bitmap;
        this.p = this.p.l(new dbx().K(cqrVar));
        this.j = ddn.a(bitmap);
        this.k = bitmap.getWidth();
        this.l = bitmap.getHeight();
    }

    public final void f() {
        this.d = false;
    }
}
