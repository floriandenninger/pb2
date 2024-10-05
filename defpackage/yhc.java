package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yhc implements ajoq {
    private final Context a;
    private final aahd b;
    private final ajyg c;

    public yhc(Context context, aahd aahdVar, ajyg ajygVar) {
        this.a = context;
        aahdVar.getClass();
        this.b = aahdVar;
        this.c = ajygVar;
    }

    @Override // defpackage.ajoq
    public final /* bridge */ /* synthetic */ ajom b(ViewGroup viewGroup) {
        return new yhd(this.a, viewGroup, this.b, this.c);
    }
}
