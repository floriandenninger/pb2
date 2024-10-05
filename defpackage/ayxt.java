package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayxt extends ayph implements aysy {
    final aypn a;
    final ayrv b;

    public ayxt(aypn aypnVar, ayrv ayrvVar) {
        this.a = aypnVar;
        this.b = ayrvVar;
    }

    @Override // defpackage.ayph
    protected final void V(aypi aypiVar) {
        this.a.aa(new ayxs(aypiVar, this.b));
    }

    @Override // defpackage.aysy
    public final aypn a() {
        ayxq ayxqVar = new ayxq(this.a, this.b);
        ayrv ayrvVar = aynu.j;
        return ayxqVar;
    }
}
