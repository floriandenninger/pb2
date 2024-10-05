package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lvp implements ajnf {
    final /* synthetic */ lwj a;

    public lvp(lwj lwjVar) {
        this.a = lwjVar;
    }

    private final void f() {
        if (!this.a.h.isEmpty()) {
            lwj lwjVar = this.a;
            lwjVar.f.q(lwjVar.g);
            return;
        }
        lwj lwjVar2 = this.a;
        if (lwjVar2.f.i(lwjVar2.g) == -1) {
            lwj lwjVar3 = this.a;
            lwjVar3.f.n(1, lwjVar3.g);
        }
    }

    @Override // defpackage.yoq
    public final void d(int i, int i2) {
        f();
    }

    @Override // defpackage.yoq
    public final void e(int i, int i2) {
        f();
    }

    @Override // defpackage.ajnf
    public final void pc() {
        f();
    }

    @Override // defpackage.yoq
    public final void pd(int i, int i2) {
        f();
    }

    @Override // defpackage.yoq
    public final void pe(int i, int i2) {
        f();
    }
}
