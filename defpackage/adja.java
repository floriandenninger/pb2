package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adja extends aimb {
    private final adiu b;
    private final azrw c;
    private final aifs d;

    public adja(aiwj aiwjVar, adiu adiuVar, azrw azrwVar, aifs aifsVar) {
        super(aiwjVar);
        this.b = adiuVar;
        this.c = azrwVar;
        this.d = aifsVar;
    }

    private final boolean e() {
        return ((adlt) this.c.get()).g() != null;
    }

    @Override // defpackage.aimb
    public final aiwj a() {
        return e() ? this.b : this.a;
    }

    public final void b() {
        aifs aifsVar = this.d;
        boolean e = e();
        if (e != aifsVar.m) {
            aifsVar.m = e;
            aifsVar.i();
        }
    }

    @Override // defpackage.aimb
    public final boolean c() {
        return !e();
    }

    @Override // defpackage.aimb
    public final boolean d() {
        return !e();
    }
}
