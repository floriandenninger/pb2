package com.google.vr.ndk.base;

import android.content.Context;
import com.google.vr.vrcore.controller.api.ControllerButtonEvent;
import com.google.vr.vrcore.controller.api.ControllerEventPacket;
import com.google.vr.vrcore.controller.api.ControllerEventPacket2;
import com.google.vr.vrcore.controller.api.ControllerOrientationEvent;
import com.google.vr.vrcore.controller.api.ControllerServiceBridge;
import defpackage.axgo;

/* compiled from: PG */
/* loaded from: classes3.dex */
class CardboardEmulator {
    private static final String TAG = "CardboardEmulator";
    private final ControllerServiceBridge controllerServiceBridge;
    private boolean resumed;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    class ControllerCallbacks implements ControllerServiceBridge.Callbacks {
        private final Runnable cardboardTriggerCallback;

        public ControllerCallbacks(Runnable runnable) {
            this.cardboardTriggerCallback = runnable;
        }

        @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
        public void onControllerEventPacket(ControllerEventPacket controllerEventPacket) {
            int i;
            for (int i2 = 0; i2 < controllerEventPacket.n; i2++) {
                ControllerButtonEvent f = controllerEventPacket.f(i2);
                if (f.c && ((i = f.b) == 1 || i == 3 || i == 7)) {
                    axgo.a(this.cardboardTriggerCallback);
                }
            }
        }

        @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
        public void onControllerEventPacket2(ControllerEventPacket2 controllerEventPacket2) {
            onControllerEventPacket(controllerEventPacket2);
        }

        @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
        public void onControllerRecentered(ControllerOrientationEvent controllerOrientationEvent) {
        }

        @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
        public void onControllerStateChanged(int i, int i2) {
        }

        @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
        public void onServiceConnected(int i) {
        }

        @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
        public void onServiceDisconnected() {
        }

        @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
        public void onServiceFailed() {
        }

        @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
        public void onServiceInitFailed(int i) {
        }

        @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
        public void onServiceUnavailable() {
        }
    }

    public CardboardEmulator(Context context, Runnable runnable) {
        this.controllerServiceBridge = createServiceBridge(context, new ControllerCallbacks(runnable));
    }

    protected ControllerServiceBridge createServiceBridge(Context context, ControllerServiceBridge.Callbacks callbacks) {
        return new ControllerServiceBridge(context, callbacks, 0);
    }

    public void onPause() {
        if (this.resumed) {
            this.resumed = false;
            this.controllerServiceBridge.requestUnbind();
        }
    }

    public void onResume() {
        if (this.resumed) {
            return;
        }
        this.resumed = true;
        this.controllerServiceBridge.requestBind();
    }
}
