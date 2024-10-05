package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ekz implements wub, eke, won {
    private final azrw a;
    private View b;
    private ajok c;
    private ekf d;
    private final aoae e;

    public ekz(azrw azrwVar, aoae aoaeVar, aoae aoaeVar2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.a = azrwVar;
        this.e = aoaeVar2;
        aoaeVar.M(this);
        aoaeVar2.r(this);
    }

    @Override // defpackage.wub
    public final wsx a(wsw wswVar, xgh xghVar, xev xevVar) {
        if (!whl.e(eks.class, xghVar, xevVar)) {
            return ((wtu) this.a.get()).a(wswVar, xghVar, xevVar);
        }
        ekf ekfVar = this.d;
        if (ekfVar != null) {
            eks eksVar = new eks(this.e, ekfVar.a(), wswVar, xghVar, xevVar, (aqrf) xevVar.e(xdl.class), null, null, null, null);
            eksVar.g(this.b, this.c);
            return eksVar;
        }
        throw new wua("No elementsRenderingApiFactory available for BelowPlayer");
    }

    @Override // defpackage.eke
    public final void b(ekf ekfVar) {
        this.d = ekfVar;
    }

    @Override // defpackage.eke
    public final void c() {
        this.d = null;
    }

    @Override // defpackage.won
    public final void f() {
        this.b = null;
        this.c = null;
    }

    @Override // defpackage.won
    public final void g(View view, ajok ajokVar) {
        this.b = view;
        this.c = ajokVar;
    }
}
