package defpackage;

import android.app.Activity;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gpe {
    public final aypn a;
    public final aypn b;
    public final aypn c;
    public final aypn d;
    public final aypy e;
    public boolean f;

    public gpe(Activity activity, aypy aypyVar, nyk nykVar) {
        aypy Y = aypyVar.Y(new ipp(activity, 1));
        this.e = Y;
        aypn sk = aypn.e(Y.i(aypg.BUFFER), nykVar.a.A(gpd.a).n(), epc.e).J().ah().sk();
        this.d = sk;
        this.b = Y.Y(fiv.t).Y(gpd.b).i(aypg.BUFFER);
        this.c = sk.A(gpd.c);
        this.a = sk.A(gpd.d);
        Y.Y(fiv.u).i(aypg.BUFFER);
    }

    public static armx a(Context context) {
        int O = yjk.O(context);
        if (O == 1 || O == 2) {
            return armx.SMALL_FORM_FACTOR;
        }
        if (O == 3 || O == 4) {
            return armx.LARGE_FORM_FACTOR;
        }
        return armx.UNKNOWN_FORM_FACTOR;
    }
}
