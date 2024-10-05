package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afek implements afel {
    final int a;

    public afek(int i) {
        this.a = i <= 0 ? 1 : i;
    }

    @Override // defpackage.afel
    public final int a(int i, bib bibVar) {
        return (i < 0 || bibVar == null) ? this.a : Math.max(Math.min(this.a, bibVar.a - i), 1);
    }
}
