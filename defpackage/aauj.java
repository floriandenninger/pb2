package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aauj implements aauk {
    public final appo a;
    private List b;

    public aauj(appo appoVar) {
        appoVar.getClass();
        this.a = appoVar;
    }

    @Override // defpackage.aauk
    public final CharSequence a() {
        aqyg aqygVar;
        appo appoVar = this.a;
        if ((appoVar.b & 32) != 0) {
            aqygVar = appoVar.f;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        return ajcq.b(aqygVar);
    }

    @Override // defpackage.aauk
    public final CharSequence b() {
        aqyg aqygVar;
        appo appoVar = this.a;
        if ((appoVar.b & 2) != 0) {
            aqygVar = appoVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        return ajcq.b(aqygVar);
    }

    @Override // defpackage.aauk
    public final String c() {
        return this.a.g;
    }

    @Override // defpackage.aauk
    public final String d() {
        return this.a.d;
    }

    @Override // defpackage.aauk
    public final List e(aahd aahdVar) {
        if (this.b == null) {
            this.b = new ArrayList();
            Iterator it = this.a.o.iterator();
            while (it.hasNext()) {
                this.b.add(aahk.a((aqyg) it.next(), aahdVar, false));
            }
        }
        return this.b;
    }

    @Override // defpackage.aauk
    public final boolean f() {
        return this.a.h;
    }

    @Override // defpackage.aauk
    public final boolean g() {
        return this.a.e;
    }

    @Override // defpackage.aauk
    public final CharSequence h(int i) {
        int i2 = i - 1;
        aqyg aqygVar = null;
        if (i2 == 0) {
            appo appoVar = this.a;
            if ((appoVar.b & 32768) != 0 && (aqygVar = appoVar.p) == null) {
                aqygVar = aqyg.a;
            }
            return ajcq.b(aqygVar);
        }
        if (i2 != 1) {
            appo appoVar2 = this.a;
            if ((appoVar2.b & 131072) != 0 && (aqygVar = appoVar2.r) == null) {
                aqygVar = aqyg.a;
            }
            return ajcq.b(aqygVar);
        }
        appo appoVar3 = this.a;
        if ((appoVar3.b & 65536) != 0 && (aqygVar = appoVar3.q) == null) {
            aqygVar = aqyg.a;
        }
        return ajcq.b(aqygVar);
    }

    public final aqph i() {
        aqpi aqpiVar = this.a.n;
        if (aqpiVar == null) {
            aqpiVar = aqpi.a;
        }
        aqph aqphVar = aqpiVar.c;
        return aqphVar == null ? aqph.a : aqphVar;
    }

    public final CharSequence j() {
        aqyg aqygVar;
        appo appoVar = this.a;
        if ((appoVar.b & 1024) != 0) {
            aqygVar = appoVar.j;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        return ajcq.b(aqygVar);
    }

    public final boolean k() {
        return this.a.k != 0;
    }

    public final boolean l() {
        appq appqVar = this.a.i;
        if (appqVar == null) {
            appqVar = appq.a;
        }
        int aF = anaf.aF(appqVar.b);
        return aF != 0 && aF == 3;
    }
}
