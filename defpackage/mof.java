package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mof implements ajoq {
    private final Context a;
    private final ajjz b;
    private final ajut c;
    private final aahd d;
    private final akbu e;
    private final akbd f;

    public mof(Context context, ajjz ajjzVar, ajut ajutVar, aahd aahdVar, akbu akbuVar, akbd akbdVar) {
        context.getClass();
        this.a = context;
        ajjzVar.getClass();
        this.b = ajjzVar;
        ajutVar.getClass();
        this.c = ajutVar;
        aahdVar.getClass();
        this.d = aahdVar;
        akbuVar.getClass();
        this.e = akbuVar;
        this.f = akbdVar;
    }

    @Override // defpackage.ajoq
    public final /* bridge */ /* synthetic */ ajom b(ViewGroup viewGroup) {
        return new mog(this.a, viewGroup, this.b, this.c, this.d, this.e, this.f);
    }
}
