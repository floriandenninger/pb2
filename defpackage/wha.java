package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wha implements ajoq {
    private final Context a;
    private final zaw b;
    private final wib c;

    public wha(Context context, zaw zawVar, wib wibVar) {
        context.getClass();
        this.a = context;
        zawVar.getClass();
        this.b = zawVar;
        this.c = wibVar;
    }

    @Override // defpackage.ajoq
    public final /* bridge */ /* synthetic */ ajom b(ViewGroup viewGroup) {
        return new whb(this.a, this.b, this.c);
    }
}
