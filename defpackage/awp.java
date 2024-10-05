package defpackage;

import android.media.AudioTrack;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awp extends Thread {
    final /* synthetic */ AudioTrack a;
    final /* synthetic */ awx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awp(awx awxVar, AudioTrack audioTrack) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.b = awxVar;
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
