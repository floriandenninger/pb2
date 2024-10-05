package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class oih implements ajnf {
    aign a;
    final /* synthetic */ oii b;

    public oih(oii oiiVar) {
        this.b = oiiVar;
    }

    @Override // defpackage.yoq
    public final void d(int i, int i2) {
        f();
    }

    @Override // defpackage.yoq
    public final void e(int i, int i2) {
        f();
    }

    public final void f() {
        aign aignVar = this.a;
        if (aignVar == null || !aignVar.c(aign.VIDEO_REQUESTED)) {
            return;
        }
        oii oiiVar = this.b;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= this.b.a.size()) {
                break;
            }
            if (this.b.a.get(i) instanceof frp) {
                z = true;
                break;
            }
            i++;
        }
        oiiVar.d(!z);
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
