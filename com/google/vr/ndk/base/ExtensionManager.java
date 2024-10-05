package com.google.vr.ndk.base;

import defpackage.axim;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ExtensionManager {
    void onPause();

    void onResume();

    void reportTelemetry(axim aximVar);

    void setEnabled(boolean z);

    void shutdown();
}
