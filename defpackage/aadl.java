package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aadl implements aadf {
    private final shf a;

    public aadl(shf shfVar) {
        this.a = shfVar;
    }

    @Override // defpackage.aadf
    public final aade a(cnc cncVar) {
        aadj aadjVar = aadj.AVAILABLE;
        if (cncVar.e < this.a.c()) {
            aadjVar = aadj.EXPIRED;
        } else if (cncVar.f < this.a.c()) {
            aadjVar = aadj.STALE;
        }
        return new aadk(aadjVar);
    }
}
