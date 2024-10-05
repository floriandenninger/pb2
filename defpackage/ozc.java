package defpackage;

import android.media.AudioTrack;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ozc extends Thread {
    final /* synthetic */ AudioTrack a;
    final /* synthetic */ ozi b;

    public ozc(ozi oziVar, AudioTrack audioTrack) {
        this.b = oziVar;
        this.a = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.a.flush();
            this.a.release();
        } finally {
            this.b.a.open();
        }
    }
}
