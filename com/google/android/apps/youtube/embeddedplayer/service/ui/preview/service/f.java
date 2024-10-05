package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service;

import android.graphics.Bitmap;
import android.os.RemoteException;
import defpackage.ahxw;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class f implements ahxw {
    public com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c a;

    public f(com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.ahxw
    public final void b(Bitmap bitmap) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.g(bitmap);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahxw
    public final void kV() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.a();
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahxw
    public final void kX() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.h();
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahxw
    public final void nw() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.f();
            } catch (RemoteException unused) {
            }
        }
    }
}
