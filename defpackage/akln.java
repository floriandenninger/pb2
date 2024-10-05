package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akln implements ajoq {
    private final Context a;
    private final ajjz b;
    private final aahd c;
    private final ajut d;
    private final aklo e;

    public akln(Context context, ajjz ajjzVar, aahd aahdVar, ajut ajutVar, aklo akloVar) {
        this.a = context;
        this.b = ajjzVar;
        this.c = aahdVar;
        this.d = ajutVar;
        this.e = akloVar;
    }

    @Override // defpackage.ajoq
    public final /* bridge */ /* synthetic */ ajom b(ViewGroup viewGroup) {
        return new aklp(this.a, this.b, this.c, this.d, this.e);
    }
}
