package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zmc implements oxj {
    final /* synthetic */ zme a;

    public zmc(zme zmeVar) {
        this.a = zmeVar;
    }

    @Override // defpackage.oxj
    public final void rB() {
    }

    @Override // defpackage.oxj
    public final void rC(oxh oxhVar) {
        zga.d("ExoPlayer error", oxhVar);
    }

    @Override // defpackage.oxj
    public final void rD(boolean z, int i) {
        if (i != 5) {
            return;
        }
        this.a.b.h();
        this.a.b = null;
    }
}
