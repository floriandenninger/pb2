package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aifr extends afkn {
    final /* synthetic */ aifs a;

    public aifr(aifs aifsVar) {
        this.a = aifsVar;
    }

    @Override // defpackage.amnv
    public final /* bridge */ /* synthetic */ Object get() {
        aifs aifsVar = this.a;
        afkl afklVar = aifsVar.f;
        afkm b = aifsVar.b();
        afkm afkmVar = new afkm(b.c, b.d, this.a.s());
        return (afkmVar.c == -1 || afkmVar.d == -1) ? (afklVar == null || !afklVar.E()) ? afkm.a : new afkm(afklVar.rG(), afklVar.rF(), this.a.s()) : afkmVar;
    }
}
