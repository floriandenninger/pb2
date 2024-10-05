package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jep implements ajoq {
    private final Context a;
    private final ajjz b;
    private final /* synthetic */ int c;

    public jep(Context context, ajjz ajjzVar, int i) {
        this.c = i;
        this.a = context;
        this.b = ajjzVar;
    }

    public jep(Context context, ajjz ajjzVar, int i, byte[] bArr) {
        this.c = i;
        context.getClass();
        this.a = context;
        ajjzVar.getClass();
        this.b = ajjzVar;
    }

    @Override // defpackage.ajoq
    public final /* synthetic */ ajom b(ViewGroup viewGroup) {
        return this.c != 0 ? new ein(this.a, this.b) : new jeq(this.a, this.b);
    }
}
