package defpackage;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mrq implements ajoq {
    private final Activity a;
    private final ajjz b;
    private final aahd c;

    public mrq(Activity activity, ajjz ajjzVar, aahd aahdVar) {
        this.a = activity;
        this.b = ajjzVar;
        this.c = aahdVar;
    }

    @Override // defpackage.ajoq
    public final /* bridge */ /* synthetic */ ajom b(ViewGroup viewGroup) {
        return new mrr(this.a, this.b, this.c, viewGroup);
    }
}
