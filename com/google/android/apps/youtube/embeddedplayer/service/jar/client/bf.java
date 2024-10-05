package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.os.RemoteException;
import defpackage.oba;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bf implements com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.b {
    final /* synthetic */ bn a;

    public bf(bn bnVar) {
        this.a = bnVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.b
    public final void a() {
        this.a.x.m();
        try {
            this.a.c.N();
        } catch (RemoteException e) {
            oba.B(e);
        }
        com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.h hVar = this.a.B;
        hVar.k = 0;
        hVar.j = 0;
        hVar.i = 0;
        if (hVar.f.hasMessages(0)) {
            hVar.l = "Surface was destroyed. Please make sure the fragment is fully visible on screen.";
            hVar.d.b();
        }
        this.a.k = false;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.b
    public final void b() {
        bn bnVar = this.a;
        bnVar.k = true;
        if (bnVar.l) {
            bnVar.b();
        }
    }
}
