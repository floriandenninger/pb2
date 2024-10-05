package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anxh implements anxl {
    final rpv a;

    public anxh(rpv rpvVar) {
        this.a = rpvVar;
    }

    @Override // defpackage.anxl
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // defpackage.anxl
    public final boolean b(anxr anxrVar) {
        if (!anxrVar.e() && !anxrVar.d() && !anxrVar.b()) {
            return false;
        }
        this.a.d(anxrVar.a);
        return true;
    }
}
