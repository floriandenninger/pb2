package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class so {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static so b;
    private xc c;

    public static synchronized PorterDuffColorFilter b(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter b2;
        synchronized (so.class) {
            b2 = xc.b(i, mode);
        }
        return b2;
    }

    public static synchronized so d() {
        so soVar;
        synchronized (so.class) {
            if (b == null) {
                f();
            }
            soVar = b;
        }
        return soVar;
    }

    public static synchronized void f() {
        synchronized (so.class) {
            if (b == null) {
                so soVar = new so();
                b = soVar;
                soVar.c = xc.e();
                b.c.g(new sn());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized ColorStateList a(Context context, int i) {
        return this.c.a(context, i);
    }

    public final synchronized Drawable c(Context context, int i) {
        return this.c.c(context, i);
    }

    public final synchronized void e(Context context) {
        this.c.f(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized Drawable g(Context context, int i) {
        return this.c.d(context, i, true);
    }
}
