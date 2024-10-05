package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fsb implements ajoq {
    private final Context a;
    private final ajut b;

    public fsb(Context context, ajut ajutVar) {
        this.a = context;
        this.b = ajutVar;
    }

    @Override // defpackage.ajoq
    public final /* bridge */ /* synthetic */ ajom b(ViewGroup viewGroup) {
        return new fsa(this.a, this.b);
    }
}
