package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cae extends btt {
    final Context c;

    public cae(Context context, int i, int i2) {
        super(i, i2);
        this.c = context;
    }

    @Override // defpackage.btt
    public final void a(buo buoVar) {
        if (this.b >= 10) {
            buoVar.l(new Object[]{"reschedule_needed", 1});
        } else {
            this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
