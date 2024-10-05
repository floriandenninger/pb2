package com.google.android.apps.youtube.embeddedplayer.service.jar;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class q {
    public boolean a;
    private final com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.k b;

    public q(com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.k kVar) {
        kVar.getClass();
        this.b = kVar;
    }

    public final p a() {
        ClassLoader classLoader;
        if (this.a) {
            return p.OBSCURED;
        }
        if (this.b.j()) {
            ClassLoader classLoader2 = View.class.getClassLoader();
            ClassLoader classLoader3 = com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.h.class.getClassLoader();
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                try {
                    classLoader = Class.forName(stackTraceElement.getClassName()).getClassLoader();
                } catch (ClassNotFoundException unused) {
                }
                if (classLoader != null && !classLoader.equals(classLoader2) && !classLoader.equals(classLoader3)) {
                    return p.STACK_UNCLEAN;
                }
            }
            return p.VALID;
        }
        return p.OVERLAPPING;
    }
}
