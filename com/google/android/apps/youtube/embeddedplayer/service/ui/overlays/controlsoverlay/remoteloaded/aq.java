package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import defpackage.ahvb;
import defpackage.aicf;
import defpackage.aicg;
import defpackage.aick;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aq {
    public static final Duration a = Duration.ofSeconds(10);
    public Runnable b;
    public final Handler c;
    public final aicg d;
    public boolean e;
    public aick f;
    private final ahvb g;

    public aq(Context context, Handler handler, ahvb ahvbVar) {
        this.c = handler;
        this.g = ahvbVar;
        this.d = new ap(context);
    }

    public final void a(MotionEvent motionEvent, View view) {
        aicf aicfVar = new aicf(motionEvent, aicf.a(motionEvent, view.getWidth(), false), false);
        int i = aicfVar.b;
        if (i == 0 || this.f == null) {
            return;
        }
        if (i == 1) {
            this.g.m();
        } else {
            this.g.l();
        }
        this.d.c(aicfVar);
        this.c.removeCallbacks(this.b);
        this.c.postDelayed(this.b, 650L);
        this.e = true;
        this.f.e(this.d.b(), aicfVar, false);
    }

    public final void b() {
        this.e = false;
        this.d.d();
    }
}
