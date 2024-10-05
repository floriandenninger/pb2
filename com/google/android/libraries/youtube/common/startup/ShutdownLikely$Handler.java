package com.google.android.libraries.youtube.common.startup;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.MessageQueue;
import defpackage.any;
import defpackage.aok;
import defpackage.yjk;
import defpackage.yyf;
import java.lang.Thread;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ShutdownLikely$Handler implements ComponentCallbacks2, Thread.UncaughtExceptionHandler, MessageQueue.IdleHandler, any {
    public final Application a;
    public Thread.UncaughtExceptionHandler b;
    final /* synthetic */ yyf c;

    public ShutdownLikely$Handler(yyf yyfVar, Context context) {
        this.c = yyfVar;
        Application application = null;
        if (yjk.h() && (context instanceof Application)) {
            application = (Application) context;
        }
        this.a = application;
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        this.c.c(yyf.b, 0);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20) {
            this.c.c(yyf.b, 0);
        } else if (i >= 60 || (i >= 15 && i < 20)) {
            this.c.c(yyf.c, 1);
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.c.c(yyf.b, 1);
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        this.c.c(yyf.e, 8);
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            this.c.c(yyf.a, 2);
        } catch (RuntimeException unused) {
        }
        try {
            this.c.c(yyf.a, 3);
        } catch (RuntimeException unused2) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
