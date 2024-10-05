package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahay extends AudioDeviceCallback {
    final /* synthetic */ ahaz a;

    public ahay(ahaz ahazVar) {
        this.a = ahazVar;
    }

    private final void a() {
        ahaz ahazVar = this.a;
        ahazVar.b.a.h.c(ahazVar.a.a());
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        a();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        a();
    }
}
