package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class caw implements cbh, bzo, cel {
    public final Context a;
    public final int b;
    public final String c;
    public final cbb d;
    public final cbi e;
    public PowerManager.WakeLock f;
    public boolean g = false;
    private int i = 0;
    private final Object h = new Object();

    static {
        ajbh.S("DelayMetCommandHandler");
    }

    public caw(Context context, int i, String str, cbb cbbVar) {
        this.a = context;
        this.b = i;
        this.d = cbbVar;
        this.c = str;
        this.e = new cbi(context, cbbVar.j, this);
    }

    private final void d() {
        synchronized (this.h) {
            this.e.b();
            this.d.c.a(this.c);
            PowerManager.WakeLock wakeLock = this.f;
            if (wakeLock != null && wakeLock.isHeld()) {
                ajbh X = ajbh.X();
                String.format("Releasing wakelock %s for WorkSpec %s", this.f, this.c);
                X.T(new Throwable[0]);
                this.f.release();
            }
        }
    }

    @Override // defpackage.bzo
    public final void a(String str, boolean z) {
        ajbh X = ajbh.X();
        String.format("onExecuted %s, %s", str, Boolean.valueOf(z));
        X.T(new Throwable[0]);
        d();
        if (z) {
            Intent f = cas.f(this.a, this.c);
            cbb cbbVar = this.d;
            cbbVar.d(new cay(cbbVar, f, this.b));
        }
        if (this.g) {
            Intent b = cas.b(this.a);
            cbb cbbVar2 = this.d;
            cbbVar2.d(new cay(cbbVar2, b, this.b));
        }
    }

    @Override // defpackage.cel
    public final void b(String str) {
        ajbh X = ajbh.X();
        String.format("Exceeded time limits on execution for %s", str);
        X.T(new Throwable[0]);
        c();
    }

    public final void c() {
        synchronized (this.h) {
            if (this.i >= 2) {
                ajbh X = ajbh.X();
                String.format("Already stopped work for %s", this.c);
                X.T(new Throwable[0]);
            } else {
                this.i = 2;
                ajbh X2 = ajbh.X();
                String.format("Stopping work for WorkSpec %s", this.c);
                X2.T(new Throwable[0]);
                Intent g = cas.g(this.a, this.c);
                cbb cbbVar = this.d;
                cbbVar.d(new cay(cbbVar, g, this.b));
                if (this.d.d.f(this.c)) {
                    ajbh X3 = ajbh.X();
                    String.format("WorkSpec %s needs to be rescheduled", this.c);
                    X3.T(new Throwable[0]);
                    Intent f = cas.f(this.a, this.c);
                    cbb cbbVar2 = this.d;
                    cbbVar2.d(new cay(cbbVar2, f, this.b));
                } else {
                    ajbh X4 = ajbh.X();
                    String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.c);
                    X4.T(new Throwable[0]);
                }
            }
        }
    }

    @Override // defpackage.cbh
    public final void e(List list) {
        if (list.contains(this.c)) {
            synchronized (this.h) {
                if (this.i != 0) {
                    ajbh X = ajbh.X();
                    String.format("Already started work for %s", this.c);
                    X.T(new Throwable[0]);
                } else {
                    this.i = 1;
                    ajbh X2 = ajbh.X();
                    String.format("onAllConstraintsMet for %s", this.c);
                    X2.T(new Throwable[0]);
                    if (this.d.d.g(this.c)) {
                        cen cenVar = this.d.c;
                        String str = this.c;
                        synchronized (cenVar.d) {
                            ajbh X3 = ajbh.X();
                            String.format("Starting timer for %s", str);
                            X3.T(new Throwable[0]);
                            cenVar.a(str);
                            cem cemVar = new cem(cenVar, str);
                            cenVar.b.put(str, cemVar);
                            cenVar.c.put(str, this);
                            cenVar.a.schedule(cemVar, 600000L, TimeUnit.MILLISECONDS);
                        }
                    } else {
                        d();
                    }
                }
            }
        }
    }

    @Override // defpackage.cbh
    public final void f(List list) {
        c();
    }
}
