package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dqv extends dqq {
    public final dha b;

    public dqv(dqt dqtVar) {
        super(dqtVar);
        dha dhaVar = dqtVar.b;
        if (dhaVar != null) {
            this.b = dhaVar;
            return;
        }
        throw new IllegalStateException("Component must be provided.");
    }

    public static dqt p() {
        return new dqt();
    }

    public static dte q() {
        dqt p = p();
        p.b = new dqu();
        return p.g();
    }

    @Override // defpackage.dqq, defpackage.dte
    public final dha b() {
        return this.b;
    }

    @Override // defpackage.dqq, defpackage.dte
    public final boolean j() {
        return true;
    }

    @Override // defpackage.dqq, defpackage.dte
    public final void l() {
    }

    @Override // defpackage.dqq, defpackage.dte
    public final void m() {
    }

    @Override // defpackage.dqq, defpackage.dte
    public final void n() {
    }

    @Override // defpackage.dte
    public final String r() {
        return this.b.o();
    }
}
