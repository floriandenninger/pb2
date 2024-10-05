package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adjs {
    private final acqz a;

    public adjs(acqz acqzVar) {
        acqzVar.getClass();
        this.a = acqzVar;
    }

    private final acra c() {
        return this.a.mM();
    }

    public final void a(acrb acrbVar) {
        if (acrbVar != null) {
            c().I(3, new acqx(acrbVar), null);
        }
    }

    public final void b(acrb acrbVar) {
        if (c() == null || acrbVar == null) {
            return;
        }
        c().n(new acqx(acrbVar));
    }
}
