package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aklf implements ajoq {
    private final Context a;
    private final aahd b;
    private final acra c;
    private final Runnable d;
    private final aklg e;
    private final aoae f;

    public aklf(Context context, aahd aahdVar, aoae aoaeVar, acra acraVar, Runnable runnable, aklg aklgVar, byte[] bArr) {
        this.a = context;
        this.b = aahdVar;
        this.f = aoaeVar;
        this.c = acraVar;
        this.d = runnable;
        this.e = aklgVar;
    }

    @Override // defpackage.ajoq
    public final /* bridge */ /* synthetic */ ajom b(ViewGroup viewGroup) {
        return new aklh(this.a, this.b, this.f, this.c, this.e, this.d, null);
    }
}
