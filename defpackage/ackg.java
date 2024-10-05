package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ackg implements ajoq {
    public ajuv a;
    public ajuu b;
    private final Context c;
    private final aahd d;
    private final ajut e;

    public ackg(Context context, aahd aahdVar, ajut ajutVar) {
        this.c = context;
        this.d = aahdVar;
        this.e = ajutVar;
    }

    @Override // defpackage.ajoq
    public final /* bridge */ /* synthetic */ ajom b(ViewGroup viewGroup) {
        ajuu ajuuVar = this.b;
        ajuuVar.getClass();
        ajuv ajuvVar = this.a;
        ajuvVar.getClass();
        return new ackh(this.c, this.d, this.e, ajuuVar, ajuvVar);
    }
}
