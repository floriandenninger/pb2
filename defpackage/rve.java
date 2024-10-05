package defpackage;

import android.content.Context;
import android.content.res.TypedArray;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rve extends ruo {
    public rve(Context context) {
        super(context);
    }

    @Override // defpackage.ruo
    protected final /* bridge */ /* synthetic */ rxk f() {
        Context context = getContext();
        boolean z = ((ruo) this).c;
        rxn rxnVar = new rxn(context);
        rxo rxoVar = new rxo();
        rxoVar.a = false;
        rxnVar.m();
        rxnVar.b = rxoVar;
        rxnVar.j();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, rum.a, 0, 0);
        rxoVar.a(Integer.valueOf(obtainStyledAttributes.getInt(6, 0)));
        rxnVar.i(obtainStyledAttributes.getDimensionPixelSize(5, (int) rwq.b(context, 10.0f)));
        obtainStyledAttributes.recycle();
        if (!z) {
            rzm.c(rxnVar);
        } else {
            rzm.b(rxnVar);
        }
        return rxnVar;
    }

    @Override // defpackage.ruv
    public final sax k() {
        return sax.c;
    }
}
