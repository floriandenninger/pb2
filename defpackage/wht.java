package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wht implements ajoq {
    private final Context a;
    private final wid b;
    private final /* synthetic */ int c;

    public wht(Context context, wid widVar, int i, byte[] bArr) {
        this.c = i;
        context.getClass();
        this.a = context;
        this.b = widVar;
    }

    public wht(Context context, wid widVar, int i) {
        this.c = i;
        context.getClass();
        this.a = context;
        this.b = widVar;
    }

    @Override // defpackage.ajoq
    public final /* synthetic */ ajom b(ViewGroup viewGroup) {
        return this.c != 0 ? new wbt(this.a, this.b) : new whv(this.a, this.b);
    }
}
