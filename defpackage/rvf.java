package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class rvf extends ruo {
    public rvf(Context context) {
        super(context);
    }

    @Override // defpackage.ruo
    protected final /* bridge */ /* synthetic */ rxk f() {
        Context context = getContext();
        boolean z = ((ruo) this).c;
        rxp rxpVar = new rxp(context);
        rxpVar.d.d = 45.0f;
        rxpVar.j();
        if (!z) {
            rzm.c(rxpVar);
        } else {
            rzm.b(rxpVar);
        }
        return rxpVar;
    }

    @Override // defpackage.ruv
    public final sax k() {
        return sax.d;
    }
}
