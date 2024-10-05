package defpackage;

import android.app.Application;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ykc implements axqr {
    private final azrw a;

    public ykc(azrw azrwVar) {
        this.a = azrwVar;
    }

    public static Application b(Context context) {
        Application m = yjj.m(context);
        ayaw.k(m);
        return m;
    }

    public static ykc c(azrw azrwVar) {
        return new ykc(azrwVar);
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Application get() {
        return b((Context) ((axqs) this.a).a);
    }
}
