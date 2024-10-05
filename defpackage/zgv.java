package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zgv implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ Class b;
    final /* synthetic */ int c;

    public zgv(Context context, Class cls, int i) {
        this.a = context;
        this.b = cls;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.getPackageManager().setComponentEnabledSetting(new ComponentName(this.a, (Class<?>) this.b), this.c, 1);
    }
}
