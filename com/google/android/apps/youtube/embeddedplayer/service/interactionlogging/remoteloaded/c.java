package com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded;

import android.os.RemoteException;
import defpackage.oba;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class c implements b {
    private final com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d b;

    public c(com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d dVar) {
        this.b = dVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b
    public final void a(byte[] bArr) {
        try {
            this.b.c(bArr);
        } catch (RemoteException e) {
            oba.B(e);
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b
    public final void b(int i) {
        try {
            this.b.h(i);
        } catch (RemoteException e) {
            oba.B(e);
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b
    public final void c(byte[] bArr) {
        try {
            this.b.i(bArr);
        } catch (RemoteException e) {
            oba.B(e);
        }
    }
}
