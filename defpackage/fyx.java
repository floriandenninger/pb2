package defpackage;

import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fyx implements fgp {
    public static final String a = zga.a("MA.UMC");
    private final Handler b;
    private final Executor c;
    private final shf d;
    private final fgq e;
    private final fxj f;
    private final azrw g;
    private ammv h = amlr.a;

    public fyx(fgq fgqVar, Handler handler, Executor executor, shf shfVar, fxj fxjVar, azrw azrwVar) {
        this.e = fgqVar;
        this.b = handler;
        this.c = executor;
        this.d = shfVar;
        this.f = fxjVar;
        this.g = azrwVar;
    }

    private final void e() {
        if (this.h.h()) {
            ((fys) this.h.c()).c();
            this.h = amlr.a;
            this.e.j(this);
        }
    }

    public final fys a(String str) {
        if (this.h.h()) {
            if (((fys) this.h.c()).b.equals(str)) {
                return (fys) this.h.c();
            }
            ((fys) this.h.c()).c();
        }
        this.h = ammv.j(new fys(this.b, this.d, this.f, this.g, str, this.c));
        this.e.i(this);
        return (fys) this.h.c();
    }

    public final void b(String str, fyw fywVar) {
        fys a2 = a(str);
        String valueOf = String.valueOf(a2.b);
        if (valueOf.length() != 0) {
            "adding callback for ".concat(valueOf);
        }
        WeakReference weakReference = new WeakReference(fywVar);
        a2.c.add(weakReference);
        List list = a2.h;
        if (list != null) {
            fys.d(list, amru.r(weakReference), amru.q(), amru.q(), amru.q(), a2.b);
        }
    }

    public final void c(String str, fyv fyvVar) {
        fys a2 = a(str);
        WeakReference weakReference = new WeakReference(fyvVar);
        a2.d.add(weakReference);
        List list = a2.h;
        if (list != null) {
            fys.d(list, amru.q(), amru.r(weakReference), amru.q(), amru.q(), a2.b);
        }
    }

    public final void d(String str) {
        if (this.h.h() && ((fys) this.h.c()).b.equals(str)) {
            e();
        }
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        if (fhgVar == fhg.NONE && this.h.h()) {
            e();
        }
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }
}
