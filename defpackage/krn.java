package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class krn implements View.OnClickListener {
    public final /* synthetic */ krq a;
    private final /* synthetic */ int b;

    public /* synthetic */ krn(krq krqVar, int i) {
        this.b = i;
        this.a = krqVar;
    }

    public krn(krq krqVar, int i, byte[] bArr) {
        this.b = i;
        this.a = krqVar;
    }

    public krn(krq krqVar, int i, char[] cArr) {
        this.b = i;
        this.a = krqVar;
    }

    public krn(krq krqVar, int i, short[] sArr) {
        this.b = i;
        this.a = krqVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            xih xihVar = this.a.F;
            if (xihVar != null) {
                xik xikVar = xihVar.a;
                xikVar.d(xikVar.g);
                return;
            }
            return;
        }
        if (i == 1) {
            xih xihVar2 = this.a.F;
            if (xihVar2 != null) {
                xik xikVar2 = xihVar2.a;
                xikVar2.d(xikVar2.f);
                return;
            }
            return;
        }
        if (i == 2) {
            xih xihVar3 = this.a.F;
            if (xihVar3 != null) {
                xik xikVar3 = xihVar3.a;
                xikVar3.d(xikVar3.h);
                return;
            }
            return;
        }
        if (i == 3) {
            krq krqVar = this.a;
            xih xihVar4 = krqVar.F;
            if (xihVar4 != null) {
                int i2 = krqVar.o;
                int i3 = krqVar.p;
                xik xikVar4 = xihVar4.a;
                xikVar4.c.j(i2, i3);
                xikVar4.b(xce.USER_SKIPPED);
                return;
            }
            return;
        }
        if (i != 4) {
            xih xihVar5 = this.a.F;
            if (xihVar5 != null) {
                xihVar5.a();
                return;
            }
            return;
        }
        xih xihVar6 = this.a.F;
        if (xihVar6 != null) {
            xihVar6.a();
        }
    }
}
