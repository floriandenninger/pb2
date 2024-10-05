package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azgc extends aypy {
    final ayqa a;

    public azgc(ayqa ayqaVar) {
        this.a = ayqaVar;
    }

    @Override // defpackage.aypy
    protected final void f(ayqd ayqdVar) {
        azga azgaVar = new azga(ayqdVar);
        ayqdVar.se(azgaVar);
        try {
            this.a.a(azgaVar);
        } catch (Throwable th) {
            aynu.c(th);
            azgaVar.c(th);
        }
    }
}
