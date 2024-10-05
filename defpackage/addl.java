package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class addl implements ayqd {
    final /* synthetic */ addn a;

    public addl(addn addnVar) {
        this.a = addnVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        zga.f(addn.a, "Received error observing isCastingEnabled.", th);
        this.a.i.qc();
    }

    @Override // defpackage.ayqd
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        this.a.h = ((Boolean) obj).booleanValue();
        this.a.c();
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        this.a.i = ayqxVar;
    }

    @Override // defpackage.ayqd
    public final void sh() {
        this.a.i.qc();
    }
}
