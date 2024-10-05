package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class pld implements poa {
    public final pot a = new pot();

    private final int o() {
        int n = n();
        if (n == 1) {
            return 0;
        }
        return n;
    }

    public final void T() {
        z(true);
    }

    public final boolean U() {
        return a() != -1;
    }

    public final boolean V() {
        pou s = s();
        if (s.z()) {
            return false;
        }
        int k = k();
        int o = o();
        I();
        return s.j(k, o) != -1;
    }

    public final boolean W() {
        pou s = s();
        return !s.z() && s.y(k(), this.a).d();
    }

    public final boolean X() {
        pou s = s();
        return !s.z() && s.y(k(), this.a).h;
    }

    @Override // defpackage.poa
    public final int a() {
        pou s = s();
        if (s.z()) {
            return -1;
        }
        int k = k();
        int o = o();
        I();
        return s.f(k, o, false);
    }

    @Override // defpackage.poa
    public final void c(long j) {
        x(k(), j);
    }

    @Override // defpackage.poa
    public final boolean h() {
        return l() == 3 && E() && m() == 0;
    }
}
