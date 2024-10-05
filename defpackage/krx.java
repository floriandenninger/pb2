package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class krx implements ajoq {
    private final Context a;
    private final axpg b;
    private final ajdw c;
    private final acra d;
    private final /* synthetic */ int e;

    public krx(Context context, axpg axpgVar, ajdw ajdwVar, acra acraVar, int i) {
        this.e = i;
        this.a = context;
        this.b = axpgVar;
        this.c = ajdwVar;
        this.d = acraVar;
    }

    @Override // defpackage.ajoq
    public final /* synthetic */ ajom b(ViewGroup viewGroup) {
        return this.e != 0 ? new kqu(this.a, this.b, this.c, this.d, viewGroup) : new kry(this.a, this.b, this.c, this.d, viewGroup);
    }
}
