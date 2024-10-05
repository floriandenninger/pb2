package defpackage;

import android.os.HandlerThread;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class azl implements amnv {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ azl(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.amnv
    public final Object get() {
        int i = this.b;
        if (i != 0) {
            return i != 1 ? Integer.valueOf(this.a) : new HandlerThread(azn.d(this.a, "ExoPlayer:MediaCodecAsyncAdapter:"));
        }
        return new HandlerThread(azn.d(this.a, "ExoPlayer:MediaCodecQueueingThread:"));
    }
}
