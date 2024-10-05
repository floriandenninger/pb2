package com.google.android.apps.youtube.embeddedplayer.service.jar;

import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.av;
import com.google.android.apps.youtube.embeddedplayer.service.model.PlaybackEventData;
import defpackage.alta;
import defpackage.amkq;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class n {
    public static final n a = new n(null);
    final WeakReference b;
    PlaybackEventData c;
    boolean d = false;

    public n(av avVar) {
        this.b = new WeakReference(avVar);
    }

    public final synchronized void a() {
        com.google.android.apps.youtube.embeddedplayer.service.model.g g = PlaybackEventData.g();
        g.d(5);
        PlaybackEventData playbackEventData = this.c;
        g.a = playbackEventData != null ? playbackEventData.f() : null;
        g.e(Long.MIN_VALUE);
        g.c(0L);
        PlaybackEventData playbackEventData2 = this.c;
        g.b(playbackEventData2 != null ? playbackEventData2.a() : 1.0f);
        b(g.a());
    }

    public final synchronized void b(PlaybackEventData playbackEventData) {
        if (playbackEventData.equals(this.c)) {
            return;
        }
        final av avVar = (av) this.b.get();
        if (avVar == null) {
            return;
        }
        if (this.d && playbackEventData.b() == 1) {
            return;
        }
        if (playbackEventData.b() == 1) {
            this.d = true;
        } else if (playbackEventData.b() == 5) {
            this.d = false;
        }
        final long c = playbackEventData.c();
        avVar.d.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.at
            @Override // java.lang.Runnable
            public final void run() {
                av avVar2 = av.this;
                long j = c;
                try {
                    n nVar = avVar2.n;
                    if (nVar != null) {
                        nVar.a(j);
                    }
                    avVar2.k.m(j);
                } catch (RemoteException unused) {
                    alta.B("Problem sending playback event to client.", new Object[0]);
                }
            }
        });
        final int b = playbackEventData.b();
        final String f = playbackEventData.f();
        final long e = playbackEventData.e();
        avVar.d.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.as
            @Override // java.lang.Runnable
            public final void run() {
                av avVar2 = av.this;
                int i = b;
                String str = f;
                long j = e;
                try {
                    n nVar = avVar2.n;
                    if (nVar != null) {
                        nVar.b(i);
                    }
                    avVar2.k.l(i, str, j);
                } catch (RemoteException unused) {
                    alta.B("Problem sending playback event to client.", new Object[0]);
                }
            }
        });
        this.c = playbackEventData;
    }

    public final synchronized boolean c(av avVar) {
        return amkq.b(this.b.get(), avVar);
    }
}
