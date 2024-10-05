package com.google.vr.ndk.base;

import android.os.RemoteException;
import com.google.vr.vrcore.library.api.ObjectWrapper;
import defpackage.axie;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GvrUiLayout {
    private final axie impl;

    public GvrUiLayout(axie axieVar) {
        this.impl = axieVar;
    }

    public void setCloseButtonListener(Runnable runnable) {
        try {
            this.impl.setCloseButtonListener(ObjectWrapper.a(runnable));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void setTransitionViewEnabled(boolean z) {
        try {
            this.impl.setTransitionViewEnabled(z);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void setViewerName(String str) {
        try {
            this.impl.setViewerName(str);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
