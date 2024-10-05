package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nzm implements adlr, ofd, oex {
    static final nyv a = new nyv(4, 2.4f, 2.4f);
    private final adlt b;
    private final nzc c;

    public nzm(adlt adltVar, nzc nzcVar) {
        this.b = adltVar;
        this.c = nzcVar;
    }

    private final void b() {
        if (!c()) {
            if (this.c.f(4) != null) {
                this.c.g(0, false);
                return;
            }
            return;
        }
        this.c.h(a);
    }

    private final boolean c() {
        return this.b.g() != null;
    }

    @Override // defpackage.ofd
    public final void e(int i, int i2) {
        boolean h = ofe.h(i2);
        if (ofe.h(i) != h) {
            if (h) {
                this.b.i(this);
                b();
            } else {
                this.b.k(this);
            }
        }
    }

    @Override // defpackage.adlr
    public final void j(adlm adlmVar) {
        b();
    }

    @Override // defpackage.adlr
    public final void k(adlm adlmVar) {
        b();
    }

    @Override // defpackage.adlr
    public final void l(adlm adlmVar) {
    }

    @Override // defpackage.oex
    public final void oY(ofa ofaVar, ofa ofaVar2) {
        if (c()) {
            this.c.h(a);
        }
    }
}
