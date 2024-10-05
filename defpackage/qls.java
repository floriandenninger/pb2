package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qls extends qob {
    public qls(Context context) {
        super(context, qlm.a, qnu.f, new ante(1));
    }

    public static qls b(Context context) {
        return new qls(context);
    }

    public final qoi a(qli qliVar) {
        qlr qlrVar = new qlr(this, qliVar, this.D);
        super.x(2, qlrVar);
        return qlrVar;
    }
}
