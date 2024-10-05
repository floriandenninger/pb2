package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agfx implements agjd {
    public final azrw a;
    public final azrw b;
    private final azrw c;

    public agfx(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        this.c = azrwVar;
        this.a = azrwVar2;
        this.b = azrwVar3;
    }

    @Override // defpackage.agjd
    public final agnn a(String str, long j) {
        if (!((agft) ((axqs) this.b).a).z()) {
            return null;
        }
        zhq.m(str);
        return c(str, new aghh((ailv) this.c.get(), j));
    }

    @Override // defpackage.agjd
    public final void b(Set set, String str) {
        ((agil) this.a.get()).B(set, str);
    }

    @Override // defpackage.agjd
    public final agnn c(String str, aghh aghhVar) {
        zhq.m(str);
        if (((agft) ((axqs) this.b).a).z()) {
            return ((agil) this.a.get()).J(str, aghhVar);
        }
        return null;
    }

    @Override // defpackage.agjd
    public final void d(String str, int i) {
        if (((agft) ((axqs) this.b).a).z()) {
            zhq.m(str);
            ((agil) this.a.get()).af(str, i);
        }
    }

    @Override // defpackage.agjd
    public final void e(agnm agnmVar) {
        if (((agft) ((axqs) this.b).a).z()) {
            ((agil) this.a.get()).ag(agnmVar);
        }
    }

    @Override // defpackage.agjd
    public final void f() {
    }

    @Override // defpackage.agjd
    public final void g(String str, int i, long j) {
        if (((agft) ((axqs) this.b).a).z()) {
            zhq.m(str);
            ((agil) this.a.get()).ah(str, i, j);
        }
    }

    @Override // defpackage.agjd
    public final void h(String str, int i, String str2) {
        if (((agft) ((axqs) this.b).a).z()) {
            ((agil) this.a.get()).Y(str, i, str2);
        }
    }
}
