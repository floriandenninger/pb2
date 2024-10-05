package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class xxd implements View.OnClickListener {
    public final /* synthetic */ xxp a;
    private final /* synthetic */ int b;

    public /* synthetic */ xxd(xxp xxpVar, int i) {
        this.b = i;
        this.a = xxpVar;
    }

    public xxd(xxp xxpVar, int i, byte[] bArr) {
        this.b = i;
        this.a = xxpVar;
    }

    public xxd(xxp xxpVar, int i, char[] cArr) {
        this.b = i;
        this.a = xxpVar;
    }

    public xxd(xxp xxpVar, int i, int[] iArr) {
        this.b = i;
        this.a = xxpVar;
    }

    public xxd(xxp xxpVar, int i, short[] sArr) {
        this.b = i;
        this.a = xxpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                xxp xxpVar = this.a;
                whu.I(xxpVar.aI, false);
                xxpVar.aK();
                xxpVar.aA = null;
                xxpVar.aB = null;
                xxpVar.aF.clear();
                xxpVar.aM();
                return;
            case 1:
                this.a.aJ();
                return;
            case 2:
                this.a.aL();
                return;
            case 3:
                xxp xxpVar2 = this.a;
                xxpVar2.aJ = null;
                whu.I(xxpVar2.aH, false);
                xxpVar2.aK();
                xxpVar2.aM();
                xxpVar2.aR(xxpVar2.aH());
                return;
            case 4:
                this.a.aD.requestFocus();
                whu.J(this.a.aD);
                xzt xztVar = this.a.aP;
                if (xztVar != null) {
                    xztVar.c();
                    return;
                }
                return;
            case 5:
                this.a.aM = true;
                this.a.aQ(amru.q());
                return;
            case 6:
                xzp xzpVar = this.a.aC;
                xzpVar.c.d();
                xzpVar.a.setImageDrawable(null);
                xzpVar.h = 0;
                xzpVar.b(1);
                xzpVar.e = null;
                xzpVar.f = null;
                xzpVar.j = 0;
                xxp xxpVar3 = this.a;
                xxpVar3.aA = null;
                xxpVar3.aM();
                return;
            default:
                xun xunVar = this.a.ag;
                aeea aeeaVar = xunVar.b;
                xunVar.b = null;
                if (aeeaVar != null) {
                    xunVar.c(aeeaVar.a, aeeaVar.b, aeeaVar.c);
                    return;
                }
                return;
        }
    }
}
