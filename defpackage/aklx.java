package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aklx implements ajoq {
    private final Context a;

    public aklx(Context context) {
        this.a = context;
    }

    public final akly a() {
        return new akly(this.a);
    }

    @Override // defpackage.ajoq
    public final /* bridge */ /* synthetic */ ajom b(ViewGroup viewGroup) {
        return a();
    }
}
