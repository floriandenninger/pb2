package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apx extends aow implements aqd {
    public final int e = 54321;
    public final aqe f;
    public apy g;
    private aok h;

    public apx(aqe aqeVar) {
        this.f = aqeVar;
        if (aqeVar.e == null) {
            aqeVar.e = this;
            aqeVar.d = 54321;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override // defpackage.aot
    protected final void h() {
        if (apw.b(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("  Starting: ");
            sb.append(this);
        }
        aqe aqeVar = this.f;
        aqeVar.g = true;
        aqeVar.i = false;
        aqeVar.h = false;
        aqc aqcVar = (aqc) aqeVar;
        List list = aqcVar.c;
        if (list != null) {
            aqcVar.b(list);
            return;
        }
        aqeVar.d();
        aqcVar.a = new aqb(aqcVar);
        aqcVar.a();
    }

    @Override // defpackage.aot
    protected final void i() {
        if (apw.b(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("  Stopping: ");
            sb.append(this);
        }
        aqe aqeVar = this.f;
        aqeVar.g = false;
        aqeVar.d();
    }

    @Override // defpackage.aot
    public final void k(aox aoxVar) {
        super.k(aoxVar);
        this.h = null;
        this.g = null;
    }

    public final void n() {
        aok aokVar = this.h;
        apy apyVar = this.g;
        if (aokVar == null || apyVar == null) {
            return;
        }
        super.k(apyVar);
        f(aokVar, apyVar);
    }

    public final void o() {
        if (apw.b(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("  Destroying: ");
            sb.append(this);
        }
        this.f.d();
        this.f.h = true;
        apy apyVar = this.g;
        if (apyVar != null) {
            k(apyVar);
            if (apyVar.c) {
                if (apw.b(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("  Resetting: ");
                    sb2.append(apyVar.a);
                }
                vac vacVar = (vac) apyVar.b;
                vacVar.a.clear();
                vacVar.a.notifyDataSetChanged();
            }
        }
        aqe aqeVar = this.f;
        aqd aqdVar = aqeVar.e;
        if (aqdVar == null) {
            throw new IllegalStateException("No listener register");
        }
        if (aqdVar == this) {
            aqeVar.e = null;
            aqeVar.i = true;
            aqeVar.g = false;
            aqeVar.h = false;
            aqeVar.j = false;
            return;
        }
        throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }

    public final void p(aok aokVar, apv apvVar) {
        apy apyVar = new apy(this.f, apvVar);
        f(aokVar, apyVar);
        aox aoxVar = this.g;
        if (aoxVar != null) {
            k(aoxVar);
        }
        this.h = aokVar;
        this.g = apyVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.e);
        sb.append(" : ");
        sb.append(this.f.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this.f)));
        sb.append("}}");
        return sb.toString();
    }
}
