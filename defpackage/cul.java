package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cul {
    static final int a;
    public final ActivityManager b;
    public float d;
    public final cum g;
    public float c = 2.0f;
    public float e = 0.33f;
    public int f = 4194304;

    static {
        a = Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public cul(Context context) {
        this.d = a;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.b = activityManager;
        this.g = new cum(context.getResources().getDisplayMetrics());
        if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
            return;
        }
        this.d = 0.0f;
    }

    public final void a(float f) {
        did.aq(f >= 0.0f, "Bitmap pool screens must be greater than or equal to 0");
        this.d = f;
    }

    public final void b(float f) {
        did.aq(f >= 0.0f, "Memory cache screens must be greater than or equal to 0");
        this.c = f;
    }

    public final dkb c() {
        return new dkb(this);
    }
}
