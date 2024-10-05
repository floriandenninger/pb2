package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class krv implements ajoq {
    private final Context a;
    private final ajjz b;
    private final aahd c;
    private final acra d;
    private final ftn e;
    private final fvf f;

    public krv(Context context, acra acraVar, ajjz ajjzVar, aahd aahdVar, ftn ftnVar, fvf fvfVar, byte[] bArr) {
        this.a = context;
        ajjzVar.getClass();
        this.b = ajjzVar;
        aahdVar.getClass();
        this.c = aahdVar;
        this.d = acraVar;
        this.e = ftnVar;
        this.f = fvfVar;
    }

    @Override // defpackage.ajoq
    public final /* bridge */ /* synthetic */ ajom b(ViewGroup viewGroup) {
        return new krw(this.a, viewGroup, this.d, this.b, this.c, this.e, this.f, null);
    }
}
