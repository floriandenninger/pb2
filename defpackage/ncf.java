package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ncf {
    public boolean a;

    public ncf() {
        this.a = false;
    }

    public ncf(Context context) {
    }

    public ncf(byte[] bArr) {
    }

    public final synchronized void a(actg actgVar) {
        if (this.a) {
            return;
        }
        acte b = actgVar.b(acxu.class, new fbn(4));
        b.c(acxt.class);
        b.b(acxv.class);
        acte b2 = actgVar.b(acxo.class, new fbn(3));
        b2.c(acxw.class);
        b2.b(acxv.class);
        acte b3 = actgVar.b(acxp.class, new fbn(3));
        b3.c(acxw.class);
        b3.b(acxv.class);
        acte b4 = actgVar.b(acxq.class, new fbn(3));
        b4.c(acxw.class);
        b4.b(acxv.class);
        actgVar.h(acxu.class, "mdx_cs");
        actgVar.h(acxt.class, "mdx_cr");
        actgVar.h(acxv.class, "mdx_off");
        actgVar.h(acxw.class, "mdx_sc");
        actgVar.h(acxo.class, "mdx_ccs");
        actgVar.h(acxp.class, "mdx_ccp");
        actgVar.h(acxq.class, "mdx_ccst");
        this.a = true;
    }
}
