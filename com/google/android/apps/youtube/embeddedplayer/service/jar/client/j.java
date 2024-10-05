package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.os.Handler;
import defpackage.alvc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class j implements com.google.android.apps.youtube.embeddedplayer.service.jar.d {
    final /* synthetic */ alvc a;

    public j(alvc alvcVar) {
        this.a = alvcVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.d
    public final void a(int i) {
        if (i == 0 || i == 5) {
            this.a.h.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.h
                @Override // java.lang.Runnable
                public final void run() {
                    j jVar = j.this;
                    jVar.a.I.g();
                    jVar.a.H.g();
                }
            });
            return;
        }
        if (i == 1) {
            alvc alvcVar = this.a;
            Handler handler = alvcVar.h;
            final com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.c cVar = alvcVar.I;
            cVar.getClass();
            handler.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.i
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.c.this.e();
                }
            });
        }
    }
}
