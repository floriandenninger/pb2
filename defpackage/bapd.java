package defpackage;

import com.google.vr.cardboard.ExternalSurfaceManager;
import org.webrtc.JniCommon;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bapd implements Runnable {
    public final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public /* synthetic */ bapd(long j, int i) {
        this.b = i;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            ExternalSurfaceManager.nativeCallback(this.a);
        } else {
            JniCommon.nativeReleaseRef(this.a);
        }
    }
}
