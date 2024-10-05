package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adxn implements axqr {
    private final azrw a;

    public adxn(azrw azrwVar) {
        this.a = azrwVar;
    }

    public static adxm b(Context context) {
        return new adxm(context);
    }

    public static adxn c(azrw azrwVar) {
        return new adxn(azrwVar);
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final adxm get() {
        return b((Context) ((axqs) this.a).a);
    }
}
