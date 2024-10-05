package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fws implements ajoq {
    private final Context a;
    private final gma b;
    private final ajjz c;
    private final aahd d;
    private final ajyg e;

    public fws(Context context, gma gmaVar, ajjz ajjzVar, aahd aahdVar, ajyg ajygVar) {
        this.a = context;
        this.b = gmaVar;
        this.c = ajjzVar;
        this.d = aahdVar;
        this.e = ajygVar;
    }

    @Override // defpackage.ajoq
    public final /* bridge */ /* synthetic */ ajom b(ViewGroup viewGroup) {
        return new fwt(this.a, viewGroup, this.b, this.c, this.d, this.e);
    }
}
