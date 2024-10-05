package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bqe {
    public boolean a;
    boolean b;

    public final bqf a() {
        return new bqf(this);
    }

    public final void b(boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.b = z;
        }
    }
}
