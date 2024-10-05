package com.google.vr.vrcore.controller.api;

import com.google.vr.vrcore.controller.api.ControllerServiceBridge;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class NativeCallbacks implements ControllerServiceBridge.Callbacks {
    private final long a;
    private boolean b;

    public NativeCallbacks(long j) {
        this.a = j;
    }

    private native void handleAccelEvent(long j, int i, long j2, float f, float f2, float f3);

    private native void handleBatteryEvent(long j, int i, long j2, boolean z, int i2);

    private native void handleButtonEvent(long j, int i, long j2, int i2, boolean z);

    private native void handleControllerRecentered(long j, int i, long j2, float f, float f2, float f3, float f4);

    private native void handleGyroEvent(long j, int i, long j2, float f, float f2, float f3);

    private native void handleOrientationEvent(long j, int i, long j2, float f, float f2, float f3, float f4);

    private native void handlePositionEvent(long j, int i, long j2, float f, float f2, float f3);

    private native void handleServiceConnected(long j, int i);

    private native void handleServiceDisconnected(long j);

    private native void handleServiceFailed(long j);

    private native void handleServiceInitFailed(long j, int i);

    private native void handleServiceUnavailable(long j);

    private native void handleStateChanged(long j, int i, int i2);

    private native void handleTouchEvent(long j, int i, long j2, int i2, float f, float f2);

    private native void handleTrackingStatusEvent(long j, int i, long j2, int i2);

    public synchronized void close() {
        this.b = true;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void onControllerEventPacket(ControllerEventPacket controllerEventPacket) {
        if (this.b) {
            return;
        }
        a(controllerEventPacket);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        return;
     */
    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void onControllerEventPacket2(com.google.vr.vrcore.controller.api.ControllerEventPacket2 r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            boolean r0 = r12.b     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L7
            monitor-exit(r12)
            return
        L7:
            r12.a(r13)     // Catch: java.lang.Throwable -> L6e
            r0 = 0
            r1 = 0
        Lc:
            boolean r2 = r12.b     // Catch: java.lang.Throwable -> L6e
            if (r2 != 0) goto L33
            int r2 = r13.c     // Catch: java.lang.Throwable -> L6e
            if (r1 >= r2) goto L33
            if (r1 >= r2) goto L2d
            com.google.vr.vrcore.controller.api.ControllerPositionEvent[] r2 = r13.d     // Catch: java.lang.Throwable -> L6e
            r2 = r2[r1]     // Catch: java.lang.Throwable -> L6e
            long r4 = r12.a     // Catch: java.lang.Throwable -> L6e
            int r6 = r2.e     // Catch: java.lang.Throwable -> L6e
            long r7 = r2.d     // Catch: java.lang.Throwable -> L6e
            float r9 = r2.a     // Catch: java.lang.Throwable -> L6e
            float r10 = r2.b     // Catch: java.lang.Throwable -> L6e
            float r11 = r2.c     // Catch: java.lang.Throwable -> L6e
            r3 = r12
            r3.handlePositionEvent(r4, r6, r7, r9, r10, r11)     // Catch: java.lang.Throwable -> L6e
            int r1 = r1 + 1
            goto Lc
        L2d:
            java.lang.IndexOutOfBoundsException r13 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L6e
            r13.<init>()     // Catch: java.lang.Throwable -> L6e
            throw r13     // Catch: java.lang.Throwable -> L6e
        L33:
            boolean r1 = r12.b     // Catch: java.lang.Throwable -> L6e
            if (r1 != 0) goto L6c
            int r1 = r13.h     // Catch: java.lang.Throwable -> L6e
            if (r0 >= r1) goto L56
            if (r0 >= r1) goto L50
            com.google.vr.vrcore.controller.api.ControllerTrackingStatusEvent[] r1 = r13.i     // Catch: java.lang.Throwable -> L6e
            r1 = r1[r0]     // Catch: java.lang.Throwable -> L6e
            long r3 = r12.a     // Catch: java.lang.Throwable -> L6e
            int r5 = r1.e     // Catch: java.lang.Throwable -> L6e
            long r6 = r1.d     // Catch: java.lang.Throwable -> L6e
            int r8 = r1.a     // Catch: java.lang.Throwable -> L6e
            r2 = r12
            r2.handleTrackingStatusEvent(r3, r5, r6, r8)     // Catch: java.lang.Throwable -> L6e
            int r0 = r0 + 1
            goto L33
        L50:
            java.lang.IndexOutOfBoundsException r13 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L6e
            r13.<init>()     // Catch: java.lang.Throwable -> L6e
            throw r13     // Catch: java.lang.Throwable -> L6e
        L56:
            boolean r0 = r13.e     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L6c
            com.google.vr.vrcore.controller.api.ControllerBatteryEvent r13 = r13.f     // Catch: java.lang.Throwable -> L6e
            long r1 = r12.a     // Catch: java.lang.Throwable -> L6e
            int r3 = r13.e     // Catch: java.lang.Throwable -> L6e
            long r4 = r13.d     // Catch: java.lang.Throwable -> L6e
            boolean r6 = r13.b     // Catch: java.lang.Throwable -> L6e
            int r7 = r13.a     // Catch: java.lang.Throwable -> L6e
            r0 = r12
            r0.handleBatteryEvent(r1, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r12)
            return
        L6c:
            monitor-exit(r12)
            return
        L6e:
            r13 = move-exception
            monitor-exit(r12)
            goto L72
        L71:
            throw r13
        L72:
            goto L71
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.vr.vrcore.controller.api.NativeCallbacks.onControllerEventPacket2(com.google.vr.vrcore.controller.api.ControllerEventPacket2):void");
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void onControllerRecentered(ControllerOrientationEvent controllerOrientationEvent) {
        if (this.b) {
            return;
        }
        handleControllerRecentered(this.a, controllerOrientationEvent.e, controllerOrientationEvent.d, controllerOrientationEvent.a, controllerOrientationEvent.b, controllerOrientationEvent.c, controllerOrientationEvent.f);
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void onControllerStateChanged(int i, int i2) {
        if (this.b) {
            return;
        }
        handleStateChanged(this.a, i, i2);
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void onServiceConnected(int i) {
        if (this.b) {
            return;
        }
        handleServiceConnected(this.a, 1);
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void onServiceDisconnected() {
        if (this.b) {
            return;
        }
        handleServiceDisconnected(this.a);
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void onServiceFailed() {
        if (this.b) {
            return;
        }
        handleServiceFailed(this.a);
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void onServiceInitFailed(int i) {
        if (this.b) {
            return;
        }
        handleServiceInitFailed(this.a, i);
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void onServiceUnavailable() {
        if (this.b) {
            return;
        }
        handleServiceUnavailable(this.a);
    }

    private final void a(ControllerEventPacket controllerEventPacket) {
        int i;
        int i2;
        int i3;
        int i4;
        for (int i5 = 0; !this.b && i5 < (i4 = controllerEventPacket.l); i5++) {
            if (i5 < i4) {
                ControllerAccelEvent controllerAccelEvent = controllerEventPacket.m[i5];
                handleAccelEvent(this.a, controllerAccelEvent.e, controllerAccelEvent.d, controllerAccelEvent.a, controllerAccelEvent.b, controllerAccelEvent.c);
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        for (int i6 = 0; !this.b && i6 < controllerEventPacket.n; i6++) {
            ControllerButtonEvent f = controllerEventPacket.f(i6);
            handleButtonEvent(this.a, f.e, f.d, f.b, f.c);
        }
        for (int i7 = 0; !this.b && i7 < (i3 = controllerEventPacket.p); i7++) {
            if (i7 < i3) {
                ControllerGyroEvent controllerGyroEvent = controllerEventPacket.q[i7];
                handleGyroEvent(this.a, controllerGyroEvent.e, controllerGyroEvent.d, controllerGyroEvent.a, controllerGyroEvent.b, controllerGyroEvent.c);
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        for (int i8 = 0; !this.b && i8 < (i2 = controllerEventPacket.r); i8++) {
            if (i8 < i2) {
                ControllerOrientationEvent controllerOrientationEvent = controllerEventPacket.s[i8];
                handleOrientationEvent(this.a, controllerOrientationEvent.e, controllerOrientationEvent.d, controllerOrientationEvent.a, controllerOrientationEvent.b, controllerOrientationEvent.c, controllerOrientationEvent.f);
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        for (int i9 = 0; !this.b && i9 < (i = controllerEventPacket.t); i9++) {
            if (i9 < i) {
                ControllerTouchEvent controllerTouchEvent = controllerEventPacket.u[i9];
                handleTouchEvent(this.a, controllerTouchEvent.e, controllerTouchEvent.d, controllerTouchEvent.b, controllerTouchEvent.c, controllerTouchEvent.f);
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
    }
}
