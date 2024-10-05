package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aklv implements ajoq {
    private final Context a;
    private final aahd b;
    private final /* synthetic */ int c;

    public aklv(Context context, aahd aahdVar, int i) {
        this.c = i;
        this.a = context;
        this.b = aahdVar;
    }

    public aklv(Context context, aahd aahdVar, int i, byte[] bArr) {
        this.c = i;
        this.a = context;
        aahdVar.getClass();
        this.b = aahdVar;
    }

    @Override // defpackage.ajoq
    public final /* synthetic */ ajom b(ViewGroup viewGroup) {
        return this.c != 0 ? new eip(this.a, this.b) : new aklw(this.a, this.b);
    }
}
