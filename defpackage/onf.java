package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class onf {
    private final Activity a;
    private final gji b;
    private final ffs c;

    public onf(Activity activity, ffs ffsVar, gji gjiVar) {
        this.a = activity;
        this.c = ffsVar;
        this.b = gjiVar;
    }

    public final fze a() {
        return new lze(this.a, this.c, new amnv() { // from class: one
            @Override // defpackage.amnv
            public final Object get() {
                return zhq.h(onf.this.b());
            }
        });
    }

    public final String b() {
        gir m = this.b.m();
        if (m != null) {
            return m.aU();
        }
        return null;
    }
}
