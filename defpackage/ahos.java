package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.vr.ndk.base.DaydreamApi;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahos implements ahhl, ahkw, aioa, ypd {
    public final ahhc a;
    public final ahox b;
    public final Handler c;
    public DaydreamApi d;
    public ahoq e;
    public ahop f;
    public ci g;
    public boolean h;
    public ykz i;
    public kcy j;
    private final afht k;
    private final azrw l;
    private final azrw m;
    private final Set n = new HashSet();

    public ahos(ahhc ahhcVar, afht afhtVar, azrw azrwVar, azrw azrwVar2, ahox ahoxVar) {
        ahhcVar.getClass();
        this.a = ahhcVar;
        afhtVar.getClass();
        this.k = afhtVar;
        azrwVar.getClass();
        this.l = azrwVar;
        azrwVar2.getClass();
        this.m = azrwVar2;
        this.b = ahoxVar;
        this.c = new Handler(Looper.getMainLooper());
        final ahon ahonVar = new ahon(this);
        ahhcVar.q = new Runnable() { // from class: ahgw
            @Override // java.lang.Runnable
            public final void run() {
                ci ciVar = ahon.this.a.g;
                if (ciVar != null) {
                    ciVar.onBackPressed();
                }
            }
        };
        ahgs ahgsVar = ahhcVar.j;
        if (ahgsVar != null) {
            ahgsVar.h(ahhcVar.q);
        }
        ahhcVar.t = this;
    }

    @Override // defpackage.ahhl
    public final void a(boolean z) {
        this.c.post(new ahoo(this, z));
    }

    public final void b(ahor ahorVar) {
        this.n.add(ahorVar);
    }

    public final void c() {
        this.a.q(null, false);
        i(false);
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((ahor) it.next()).n(false);
        }
        this.k.aB(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(ahcx ahcxVar) {
        if (ahcxVar.c() == aigf.FULLSCREEN || !this.a.v) {
            return;
        }
        c();
    }

    public final void g() {
        if (!j()) {
            zga.b("Attempted to enter VR mode when it wasn't available. Doing nothing.");
            return;
        }
        if (this.b.b()) {
            return;
        }
        ahop ahopVar = this.f;
        if (ahopVar != null) {
            nna nnaVar = (nna) ahopVar;
            if (nnaVar.d && ((awwl) nnaVar.b.c()).d) {
                ((ainy) nnaVar.c.get()).a();
                nnaVar.e = true;
                Context context = nnaVar.a;
                context.startActivity(ahow.a(context));
                return;
            }
        }
        ainy ainyVar = (ainy) this.l.get();
        if (!ainyVar.S()) {
            ainyVar.b();
        }
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((ahor) it.next()).n(true);
        }
        this.a.q(new ahhm(this), true);
        this.k.aB(true);
        i(true);
    }

    public final void h(ahor ahorVar) {
        this.n.remove(ahorVar);
    }

    public final void i(boolean z) {
        ci C;
        kcy kcyVar = this.j;
        if (kcyVar == null || (C = kcyVar.a.C()) == null) {
            return;
        }
        if (z) {
            C.getWindow().addFlags(128);
        } else {
            C.getWindow().clearFlags(128);
        }
    }

    public final boolean j() {
        aiwk aiwkVar = ((ainy) this.l.get()).p.a;
        return (aiwkVar == null || (aiwkVar.ao().c & 1) == 0 || !((Boolean) this.m.get()).booleanValue() || this.h) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(final int i) {
        if (!ahow.f(this.g, i)) {
            zga.b("Attempted to launch the YouTube VR app on a non-supported device. Doing nothing.");
            return;
        }
        if (this.b.b()) {
            return;
        }
        if (ahow.e(this.g, i)) {
            ahow.d(this.g, i, this.d, (ainy) this.l.get());
        } else {
            if (this.g == null || this.i == null) {
                return;
            }
            ykj ykjVar = new ykj() { // from class: ahok
                @Override // defpackage.ykj
                public final void kD(int i2, int i3, Intent intent) {
                    final ahos ahosVar = ahos.this;
                    final int i4 = i;
                    if (i2 == 500) {
                        ahosVar.c.post(new Runnable() { // from class: ahom
                            @Override // java.lang.Runnable
                            public final void run() {
                                ahos.this.k(i4);
                            }
                        });
                    }
                }
            };
            this.i.a(ahow.c(this.g, i), 500, ykjVar);
        }
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return new ayqx[]{aiocVar.t().b.h(ahbw.g(aiocVar.aC(), 256L)).h(ahbw.e(0)).Y(new ayrs() { // from class: ahol
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                ahos.this.d((ahcx) obj);
            }
        }, ahfo.g)};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahcx.class};
        }
        if (i == 0) {
            d((ahcx) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
