package defpackage;

import android.content.Context;
import android.os.PowerManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aguu implements aguk {
    public final PowerManager.WakeLock a;
    public final agzr b;
    private Thread c;

    public aguu(Context context, agzr agzrVar) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        powerManager.getClass();
        this.a = powerManager.newWakeLock(1, getClass().getName());
        this.b = agzrVar;
    }

    @Override // defpackage.aguk
    public final void a(aguf agufVar) {
        agut agutVar = new agut(this, agufVar);
        this.c = agutVar;
        agutVar.start();
    }
}
