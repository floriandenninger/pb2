package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aesc extends aeqt {
    private boolean a;

    public aesc(aeru aeruVar) {
        super(aeruVar);
    }

    @Override // defpackage.aeqt, defpackage.aesn
    public final void d() {
        this.a = false;
        super.d();
    }

    @Override // defpackage.aeqt, defpackage.aesn
    public final void f() {
        if (this.a) {
            String valueOf = String.valueOf(afhm.a(new Throwable()));
            g(new afih("player.exception", 0L, valueOf.length() != 0 ? "c.extraneousEndedEvent;".concat(valueOf) : new String("c.extraneousEndedEvent;")));
        } else {
            this.a = true;
            super.f();
        }
    }

    @Override // defpackage.aeqt, defpackage.aesn
    public final void m() {
        this.a = false;
        super.m();
    }

    @Override // defpackage.aeqt, defpackage.aesn
    public final void n() {
        this.a = false;
        super.n();
    }

    @Override // defpackage.aeqt, defpackage.aesn
    public final void o(long j) {
        this.a = false;
        super.o(j);
    }

    @Override // defpackage.aeqt, defpackage.aesn
    public final void q() {
        this.a = false;
        super.q();
    }

    @Override // defpackage.aeqt, defpackage.aesn
    public final void t(long j) {
        this.a = false;
        super.t(j);
    }

    @Override // defpackage.aeqt, defpackage.aesn
    public final void u(long j) {
        this.a = false;
        super.u(j);
    }

    @Override // defpackage.aeqt, defpackage.aesn
    public final void v() {
        this.a = false;
        super.v();
    }

    @Override // defpackage.aeqt, defpackage.aesn
    public final void y(long j) {
        this.a = true;
        super.y(j);
    }
}
