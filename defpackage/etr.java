package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class etr implements ajoq {
    private final Context a;
    private final fvf b;

    public etr(Context context, fvf fvfVar) {
        this.a = context;
        this.b = fvfVar;
    }

    @Override // defpackage.ajoq
    public final /* bridge */ /* synthetic */ ajom b(ViewGroup viewGroup) {
        return new ets(this.a, this.b, viewGroup);
    }
}
