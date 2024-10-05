package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acbe implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ acbf b;

    public acbe(acbf acbfVar, long j) {
        this.b = acbfVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SharedPreferences.Editor edit = this.b.d.edit();
        edit.putLong(acbf.c, this.a);
        edit.apply();
    }
}
