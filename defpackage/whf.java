package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class whf implements ajoq {
    private final Context a;
    private final ajjs b;
    private final acra c;
    private final wia d;

    public whf(Context context, ajjs ajjsVar, acra acraVar, wia wiaVar) {
        context.getClass();
        this.a = context;
        ajjsVar.getClass();
        this.b = ajjsVar;
        acraVar.getClass();
        this.c = acraVar;
        this.d = wiaVar;
    }

    @Override // defpackage.ajoq
    public final /* bridge */ /* synthetic */ ajom b(ViewGroup viewGroup) {
        return new whg(this.a, this.b, this.c, this.d);
    }
}
