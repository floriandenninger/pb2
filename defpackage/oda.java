package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oda extends odc {
    public oda(obp obpVar) {
        super(null, obpVar);
        b();
    }

    @Override // defpackage.odc
    public final void b() {
        obp obpVar = this.e;
        obpVar.getClass();
        this.g.set(obpVar.v());
        this.f.set(this.e.t());
        this.h.set(this.e.r());
        this.i.set(this.e.u());
        this.j.set(this.e.s());
        int height = this.h.height() + this.f.height();
        this.f.offset(0, height);
        this.g.offset(0, height);
        this.h.offset(0, height);
        this.i.offset(0, height);
        this.j.offset(0, height);
    }
}
