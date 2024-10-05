package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class whi implements ajoq {
    private final Context a;
    private final int b;
    private final acra c;

    public whi(Context context, int i, acra acraVar) {
        context.getClass();
        this.a = context;
        this.b = i;
        acraVar.getClass();
        this.c = acraVar;
    }

    @Override // defpackage.ajoq
    public final /* bridge */ /* synthetic */ ajom b(ViewGroup viewGroup) {
        return new whj(this.a, this.b, this.c);
    }
}
