package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aido {
    public final aypn b;
    public final aypn c;
    public final aypn d;
    public final aypn e;
    public final aypn f;
    public final aypn g;
    public final aypn h;
    public final ayqj i;
    public final aypn j;
    public final aypn k;
    public final aypn l;
    public final aypn m;
    public final azrw n;
    public final aypn o;
    public final aiqn p;
    public final ajbv r;
    public final ajbq s;
    public aiqm t;
    public String u;
    public final String v;
    public final HashMap q = new HashMap();
    public final ayqw a = new ayqw();

    public aido(ajbl ajblVar, azrw azrwVar, aifv aifvVar) {
        this.u = ajblVar.Z();
        this.v = ajblVar.Z();
        this.p = ajblVar.j();
        this.s = ajblVar.p();
        this.g = ajblVar.J();
        this.b = ajblVar.W();
        this.c = ajblVar.V();
        this.d = ajblVar.I();
        this.e = ajblVar.u();
        this.f = ajblVar.P();
        this.h = ajblVar.F();
        this.i = ajblVar.X();
        this.k = ajblVar.C();
        this.o = ajblVar.R();
        this.j = aifvVar.d;
        this.l = aifvVar.a;
        this.m = aifvVar.b;
        this.n = azrwVar;
        this.r = ajblVar.q();
    }

    public final void a() {
        this.u = this.v;
        aiqm aiqmVar = this.t;
        if (aiqmVar != null) {
            aiqmVar.r();
            this.t = null;
        }
    }

    public final boolean b(String str) {
        return str.equals(this.v);
    }
}
