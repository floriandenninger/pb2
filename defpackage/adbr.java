package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adbr implements addp {
    private final bph a;

    public adbr(bph bphVar) {
        this.a = bphVar;
    }

    @Override // defpackage.addp
    public final boolean ra(bpv bpvVar) {
        if (bpvVar.i() || bpvVar.m == 3) {
            return false;
        }
        bpw.c();
        return bpw.a().r != bpvVar && bpvVar.g && bpvVar.n(this.a);
    }
}
