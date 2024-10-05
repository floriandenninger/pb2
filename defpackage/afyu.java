package defpackage;

import android.content.Context;
import android.os.PowerManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afyu implements afyx {
    public final zfe a;
    public PowerManager b;
    private final Context c;

    public afyu(Context context, zfe zfeVar) {
        this.c = context;
        this.a = zfeVar;
    }

    public final void a() {
        if (this.b == null) {
            this.b = (PowerManager) this.c.getSystemService("power");
        }
    }
}
