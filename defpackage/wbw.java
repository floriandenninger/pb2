package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wbw implements ajoq {
    private final Context a;
    private final ajjz b;
    private final acra c;
    private final wia d;
    private final wic e;
    private final ajut f;
    private final akpq g;

    public wbw(Context context, ajjz ajjzVar, acra acraVar, wia wiaVar, wic wicVar, ajut ajutVar, akpq akpqVar, byte[] bArr) {
        context.getClass();
        this.a = context;
        ajjzVar.getClass();
        this.b = ajjzVar;
        acraVar.getClass();
        this.c = acraVar;
        this.d = wiaVar;
        this.e = wicVar;
        this.f = ajutVar;
        this.g = akpqVar;
    }

    public final wbx a() {
        return new wbx(this.a, this.b, this.c, this.d, this.e, this.f, this.g, null);
    }

    @Override // defpackage.ajoq
    public final /* bridge */ /* synthetic */ ajom b(ViewGroup viewGroup) {
        return a();
    }
}
