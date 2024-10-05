package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amso extends amrk {
    public amvc a;
    boolean b;

    public amso() {
        this(4);
    }

    public final amsr a() {
        amvc amvcVar = this.a;
        amvcVar.getClass();
        if (amvcVar.c == 0) {
            return amvr.a;
        }
        this.b = true;
        return new amvr(amvcVar);
    }

    public final void b(Object obj, int i) {
        amvc amvcVar = this.a;
        amvcVar.getClass();
        if (i == 0) {
            return;
        }
        if (this.b) {
            this.a = new amvc(amvcVar);
        }
        this.b = false;
        obj.getClass();
        amvc amvcVar2 = this.a;
        amvcVar2.l(obj, i + amvcVar2.b(obj));
    }

    @Override // defpackage.amrk
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        throw null;
    }

    public amso(int i) {
        this.b = false;
        this.a = new amvc(i);
    }
}
