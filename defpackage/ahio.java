package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ahio implements ahim {
    private ahim a;
    public boolean l;

    @Override // defpackage.ahim
    public void qE(boolean z) {
        this.l = z;
    }

    @Override // defpackage.ahim
    public final void u(ahim ahimVar) {
        this.a = ahimVar;
    }

    @Override // defpackage.ahim
    public boolean v() {
        ahim ahimVar;
        return this.l || ((ahimVar = this.a) != null && ahimVar.v());
    }
}
