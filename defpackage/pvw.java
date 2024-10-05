package defpackage;

import android.content.Context;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pvw {
    public final pvn a;
    public final pvm b;
    public qbb c;

    public pvw(pvn pvnVar, pvm pvmVar) {
        this.a = pvnVar;
        this.b = pvmVar;
    }

    public static void a(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        pvy.c();
        qbg.i(context, pvy.b().a, bundle);
    }

    public static final qas b(Context context, pzu pzuVar) {
        return (qas) new pvr(context, pzuVar).d(context);
    }
}
