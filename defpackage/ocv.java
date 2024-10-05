package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ocv extends odc {
    public ocv(obp obpVar, obp obpVar2) {
        super(obpVar, obpVar2);
        b();
    }

    @Override // defpackage.ocy, defpackage.obp
    public final ammv I() {
        return ammv.j(-16777216);
    }

    @Override // defpackage.odc
    public final void b() {
        this.d.getClass();
        obp obpVar = this.e;
        obpVar.getClass();
        this.g.set(obpVar.v());
        this.f.set(this.e.t());
        this.h.set(this.d.r());
        this.i.set(this.d.u());
        this.j.set(this.d.s());
        this.h.offset(0, this.f.bottom - this.h.top);
        this.j.offset(0, this.f.bottom - this.j.top);
        this.i.offset(0, this.f.bottom - this.i.top);
        if (this.d.q() > 0.0f) {
            this.h.set(this.d.r());
            this.h.offset(this.d.u().width(), 0);
        }
    }

    @Override // defpackage.ocy, defpackage.obp
    public final float l() {
        obp obpVar = this.d;
        if (obpVar != null) {
            return obpVar.l();
        }
        return 0.0f;
    }

    @Override // defpackage.ocy, defpackage.obp
    public final float p() {
        return 1.0f;
    }

    @Override // defpackage.ocy, defpackage.obp
    public final float q() {
        obp obpVar = this.d;
        if (obpVar != null) {
            return obpVar.q();
        }
        return 0.0f;
    }
}
