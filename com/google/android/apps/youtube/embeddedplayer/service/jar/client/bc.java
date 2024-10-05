package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.os.RemoteException;
import com.google.android.libraries.lidar.VisibilityChangeEventData;
import defpackage.oba;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bc implements com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.b {
    final /* synthetic */ bn a;

    public bc(bn bnVar) {
        this.a = bnVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.b
    public final boolean a(VisibilityChangeEventData visibilityChangeEventData) {
        if (!this.a.f()) {
            return false;
        }
        try {
            this.a.c.s(visibilityChangeEventData);
            return true;
        } catch (RemoteException e) {
            oba.B(e);
            return false;
        }
    }
}
