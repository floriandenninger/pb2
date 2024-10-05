package defpackage;

import android.app.Activity;
import android.os.Build;
import android.provider.Settings;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class gjn implements zar {
    public final Activity a;
    public final boolean b;
    int c;

    public gjn(Activity activity) {
        this.a = activity;
        boolean z = true;
        if (Build.VERSION.SDK_INT <= 27 && !Build.VERSION.RELEASE.startsWith("P")) {
            z = false;
        }
        this.b = z;
    }

    public final int a() {
        return etx.r(this.a);
    }

    public final void d(int i) {
        this.a.setRequestedOrientation(i);
    }

    public final boolean e() {
        return Settings.System.getInt(this.a.getContentResolver(), "accelerometer_rotation", 0) == 0;
    }

    @Override // defpackage.zar
    public final void lI(boolean z, int i) {
        this.c = true == z ? 2 : 1;
    }

    @Override // defpackage.zar
    public final void lJ(boolean z, int i) {
        lI(z, i);
    }
}
