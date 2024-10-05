package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akfr extends ayap {
    final /* synthetic */ akfs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akfr(akfs akfsVar, axzr axzrVar) {
        super(axzrVar);
        this.a = akfsVar;
    }

    @Override // defpackage.ayaq, defpackage.axzr
    public final void k(ayaw ayawVar, aycd aycdVar) {
        aycd aycdVar2 = this.a.b;
        if (aycdVar2 != null) {
            aycdVar.e(aycdVar2);
        }
        if (!ammx.e(this.a.c)) {
            ayca aycaVar = akfs.a;
            String valueOf = String.valueOf(this.a.c);
            aycdVar.f(aycaVar, valueOf.length() != 0 ? "Bearer ".concat(valueOf) : new String("Bearer "));
        }
        super.k(ayawVar, aycdVar);
    }
}
