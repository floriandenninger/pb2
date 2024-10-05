package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mxx implements ajoq {
    private final Context a;
    private final mxy b;

    public mxx(Context context, mxy mxyVar) {
        context.getClass();
        this.a = context;
        this.b = mxyVar;
    }

    @Override // defpackage.ajoq
    public final /* bridge */ /* synthetic */ ajom b(ViewGroup viewGroup) {
        return new mxz(this.a, this.b);
    }
}
