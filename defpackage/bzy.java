package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bzy extends btt {
    public bzy() {
        super(3, 4);
    }

    @Override // defpackage.btt
    public final void a(buo buoVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            buoVar.g("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    }
}
