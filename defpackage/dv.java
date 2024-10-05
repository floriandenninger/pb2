package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.support.v4.graphics.drawable.IconCompat;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dv {
    final Bundle a;
    public final ei[] b;
    public boolean c;
    boolean d;

    @Deprecated
    public int e;
    public CharSequence f;
    public PendingIntent g;
    private IconCompat h;

    public dv(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this(i == 0 ? null : IconCompat.f(i), charSequence, pendingIntent, new Bundle(), null, true, true);
    }

    public final IconCompat a() {
        int i;
        if (this.h == null && (i = this.e) != 0) {
            this.h = IconCompat.f(i);
        }
        return this.h;
    }

    public dv(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, ei[] eiVarArr, boolean z, boolean z2) {
        this.d = true;
        this.h = iconCompat;
        if (iconCompat != null && iconCompat.b() == 2) {
            this.e = iconCompat.a();
        }
        this.f = dy.d(charSequence);
        this.g = pendingIntent;
        this.a = bundle;
        this.b = eiVarArr;
        this.c = z;
        this.d = z2;
    }
}
