package com.google.vr.ndk.base;

import android.app.PendingIntent;
import android.view.View;
import com.google.vr.vrcore.library.api.ObjectWrapper;
import defpackage.axia;
import defpackage.axie;
import defpackage.axih;

/* compiled from: PG */
/* loaded from: classes3.dex */
class GvrLayoutImplWrapper extends axia {
    private final GvrLayoutImpl impl;

    public GvrLayoutImplWrapper(GvrLayoutImpl gvrLayoutImpl) {
        this.impl = gvrLayoutImpl;
    }

    @Override // defpackage.axib
    public boolean enableAsyncReprojection(int i) {
        return this.impl.enableAsyncReprojection(i);
    }

    @Override // defpackage.axib
    public boolean enableCardboardTriggerEmulation(axih axihVar) {
        return this.impl.enableCardboardTriggerEmulation((Runnable) ObjectWrapper.b(axihVar, Runnable.class));
    }

    @Override // defpackage.axib
    public long getNativeGvrContext() {
        return this.impl.getGvrApi().getNativeGvrContext();
    }

    @Override // defpackage.axib
    public axih getRootView() {
        return ObjectWrapper.a(this.impl);
    }

    @Override // defpackage.axib
    public axie getUiLayout() {
        return this.impl.getUiLayoutImpl();
    }

    @Override // defpackage.axib
    public void onBackPressed() {
        this.impl.onBackPressed();
    }

    @Override // defpackage.axib
    public void onPause() {
        this.impl.onPause();
    }

    @Override // defpackage.axib
    public void onResume() {
        this.impl.onResume();
    }

    @Override // defpackage.axib
    public boolean setOnDonNotNeededListener(axih axihVar) {
        return this.impl.setOnDonNotNeededListener((Runnable) ObjectWrapper.b(axihVar, Runnable.class));
    }

    @Override // defpackage.axib
    public void setPresentationView(axih axihVar) {
        this.impl.setPresentationView((View) ObjectWrapper.b(axihVar, View.class));
    }

    @Override // defpackage.axib
    public void setReentryIntent(axih axihVar) {
        this.impl.setReentryIntent((PendingIntent) ObjectWrapper.b(axihVar, PendingIntent.class));
    }

    @Override // defpackage.axib
    public void setStereoModeEnabled(boolean z) {
        this.impl.setStereoModeEnabled(z);
    }

    @Override // defpackage.axib
    public void shutdown() {
        this.impl.shutdown();
    }
}
