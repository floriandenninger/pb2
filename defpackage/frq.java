package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class frq implements ajoq {
    private final Context a;
    private final wmw b;
    private final aoae c;

    public frq(Context context, wmw wmwVar, aoae aoaeVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = context;
        this.b = wmwVar;
        this.c = aoaeVar;
    }

    @Override // defpackage.ajoq
    public final /* bridge */ /* synthetic */ ajom b(ViewGroup viewGroup) {
        return new frr(this.a, viewGroup, this.b, this.c, null, null, null, null);
    }
}
