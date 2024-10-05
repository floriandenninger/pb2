package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aklz implements ajoq {
    private final Context a;
    private final akma b;
    private final ajjz c;

    public aklz(Context context, akma akmaVar, ajjz ajjzVar) {
        this.a = context;
        this.b = akmaVar;
        this.c = ajjzVar;
    }

    @Override // defpackage.ajoq
    public final /* bridge */ /* synthetic */ ajom b(ViewGroup viewGroup) {
        return new akmb(this.a, this.b, this.c);
    }
}
