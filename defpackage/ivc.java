package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ivc implements gaa {
    final /* synthetic */ ivj a;
    private final /* synthetic */ int b;

    public ivc(ivj ivjVar, int i) {
        this.b = i;
        this.a = ivjVar;
    }

    @Override // defpackage.gaa
    public final void b(int i, boolean z) {
        if (this.b != 0) {
            return;
        }
        aveh g = this.a.e.g();
        if (!z) {
            this.a.bU.b();
        }
        ivj ivjVar = this.a;
        if (ivjVar.aj == 0) {
            ivjVar.bt();
        }
        this.a.aU.c(g);
        this.a.aY.a();
    }

    @Override // defpackage.gaa
    public final void e(float f) {
        if (this.b != 0 || f == 0.0f || f == 1.0f) {
            return;
        }
        this.a.aG(true);
    }

    @Override // defpackage.gaa
    public final void ov(int i) {
        if (this.b != 0) {
            return;
        }
        if (i == 1) {
            this.a.aU.b(false);
        } else if (i == 2) {
            this.a.aU.b(false);
        } else if (i == 0) {
            this.a.bt();
            this.a.aU.b(true);
        }
        this.a.aj = i;
    }

    @Override // defpackage.gaa
    public final boolean oW(int i) {
        if (this.b != 0) {
            this.a.bv();
            return false;
        }
        this.a.aG(false);
        return true;
    }
}
