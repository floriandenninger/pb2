package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fha extends afkn {
    private static final afkm b = new afkm(640, 360, false);
    public afkm a = afkm.a;

    public final void a(int i, int i2, boolean z) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        afkm afkmVar = this.a;
        if (afkmVar.c == i && afkmVar.d == i2 && afkmVar.b == z) {
            return;
        }
        this.a = new afkm(i, i2, z);
        notifyObservers();
    }

    @Override // defpackage.amnv
    public final /* bridge */ /* synthetic */ Object get() {
        afkm afkmVar = this.a;
        if (afkmVar.c > 0 && afkmVar.d > 0) {
            return afkmVar;
        }
        zga.l("Suppressed bad viewport dimensions. Video quality may suffer!");
        return b;
    }
}
