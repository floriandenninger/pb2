package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nio implements ajoq {
    private final Context a;
    private final aahd b;
    private final ajjz c;

    public nio(Context context, ajjz ajjzVar, aahd aahdVar) {
        this.a = context;
        this.c = ajjzVar;
        this.b = aahdVar;
    }

    @Override // defpackage.ajoq
    public final /* bridge */ /* synthetic */ ajom b(ViewGroup viewGroup) {
        return new nip(this.a, this.c, this.b, viewGroup);
    }
}
