package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import defpackage.ajbh;
import defpackage.aoo;
import defpackage.caz;
import defpackage.cbb;
import defpackage.ced;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SystemAlarmService extends aoo implements caz {
    private cbb a;
    private boolean b;

    static {
        ajbh.S("SystemAlarmService");
    }

    private final void b() {
        cbb cbbVar = new cbb(this);
        this.a = cbbVar;
        if (cbbVar.i == null) {
            cbbVar.i = this;
        } else {
            ajbh.X();
            ajbh.U(cbb.a, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        }
    }

    @Override // defpackage.caz
    public final void a() {
        this.b = true;
        ajbh.X().T(new Throwable[0]);
        ced.b();
        stopSelf();
    }

    @Override // defpackage.aoo, android.app.Service
    public final void onCreate() {
        super.onCreate();
        b();
        this.b = false;
    }

    @Override // defpackage.aoo, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.b = true;
        this.a.c();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.b) {
            ajbh.X();
            ajbh.V(new Throwable[0]);
            this.a.c();
            b();
            this.b = false;
        }
        if (intent == null) {
            return 3;
        }
        this.a.f(intent, i2);
        return 3;
    }
}
