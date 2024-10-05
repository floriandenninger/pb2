package com.google.android.libraries.youtube.player.background.service;

import android.content.Intent;
import android.os.IBinder;
import defpackage.ahbp;
import defpackage.ahbr;
import defpackage.ahbs;
import defpackage.aifs;
import defpackage.aikd;
import defpackage.aimb;
import defpackage.ainy;
import defpackage.aioe;
import defpackage.banw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class BackgroundPlayerService extends ahbs {
    public ainy a;
    public aikd b;
    public aifs c;
    public banw d;
    public banw e;
    public aioe f;
    private final IBinder g = new ahbr();
    private boolean h;
    private boolean i;

    private final void c() {
        if (this.h) {
            return;
        }
        this.a.A();
        this.b.d(this);
        this.h = true;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (!this.i) {
            b();
            this.i = true;
        }
        c();
        return this.g;
    }

    @Override // defpackage.ahbs, android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.i = true;
        c();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.d.c(ahbp.a);
        boolean O = this.a.O();
        if (O) {
            this.a.s();
        }
        this.b.e(this);
        this.b.c(O);
        this.c.l();
        this.h = false;
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        this.e.c(ahbp.b);
        aioe aioeVar = this.f;
        aimb aimbVar = aioeVar.a;
        ainy ainyVar = aioeVar.b;
        if (aimbVar.c()) {
            ainyVar.s();
        }
    }
}
