package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wbn implements ajoq {
    private final Context a;
    private final aahd b;
    private final wic c;

    public wbn(Context context, aahd aahdVar, wic wicVar) {
        context.getClass();
        this.a = context;
        this.b = aahdVar;
        this.c = wicVar;
    }

    @Override // defpackage.ajoq
    public final /* bridge */ /* synthetic */ ajom b(ViewGroup viewGroup) {
        return new wbo(this.a, this.b, this.c);
    }
}
