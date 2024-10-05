package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ke {
    private final kh a;

    public ke() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new kg();
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.a = new kg();
        } else {
            this.a = new kf();
        }
    }

    public final ko a() {
        return this.a.a();
    }

    @Deprecated
    public final void b(fn fnVar) {
        this.a.b(fnVar);
    }

    @Deprecated
    public final void c(fn fnVar) {
        this.a.c(fnVar);
    }

    public ke(ko koVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new kg(koVar);
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.a = new kg(koVar);
        } else {
            this.a = new kf(koVar);
        }
    }
}
