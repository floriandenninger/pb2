package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ahus implements ahuu, ahuy {
    private final Context a;
    private ahuz b;

    public ahus(Context context) {
        context.getClass();
        this.a = context;
    }

    public final synchronized ahuz W() {
        if (this.b == null) {
            ahux kU = kU(this.a);
            this.b = new ahuz(kU.i, kU.j, kU.h, kU.b, kU.a, kU.d, kU.c, kU.e, kU.f, kU.g);
        }
        return this.b;
    }

    public final void X() {
        ahuz W = W();
        if (W.i()) {
            W.b();
            return;
        }
        W.g(4);
        W.a(24);
        W.d();
    }

    public final void Y() {
        W().e(0);
    }

    public final void Z(int i) {
        W().e(i);
    }

    public final void aa() {
        ahuz W = W();
        if (W.k()) {
            W.b();
            return;
        }
        W.g(12);
        W.a(16);
        W.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean ab(int i) {
        return W().l(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ahux kU(Context context) {
        ahux ahuxVar = new ahux(context, this);
        ahuxVar.h = new ahur(this);
        return ahuxVar;
    }

    public void kV() {
        ahuz W = W();
        if (W.i()) {
            W.b();
            return;
        }
        W.g(20);
        W.a(8);
        W.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void kW(int i) {
    }

    public void kX() {
        ahuz W = W();
        if (W.k()) {
            W.b();
        } else {
            W.g(28);
            W.d();
        }
    }

    @Override // defpackage.aivf
    public View ld() {
        ahuz W = W();
        if (!W.j()) {
            String valueOf = String.valueOf(W.b);
            String valueOf2 = String.valueOf(W);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35 + String.valueOf(valueOf2).length());
            sb.append("Forcefully created overlay:");
            sb.append(valueOf);
            sb.append(" helper:");
            sb.append(valueOf2);
            zga.l(sb.toString());
            W.c();
        }
        return W.e;
    }

    @Override // defpackage.ahuu
    public final void mZ(ahut ahutVar) {
        ahuz W = W();
        amkq.N(W.g == null);
        W.g = ahutVar;
    }

    @Override // defpackage.ahuu
    public boolean np() {
        return W().j();
    }
}
