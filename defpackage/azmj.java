package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azmj extends ayqj {
    final ayql a;

    public azmj(ayql ayqlVar) {
        this.a = ayqlVar;
    }

    @Override // defpackage.ayqj
    protected final void aa(ayqk ayqkVar) {
        azmi azmiVar = new azmi(ayqkVar);
        ayqkVar.se(azmiVar);
        try {
            this.a.a(azmiVar);
        } catch (Throwable th) {
            aynu.c(th);
            azmiVar.a(th);
        }
    }
}
