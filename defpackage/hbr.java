package defpackage;

import android.os.Handler;
import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class hbr extends aixi {
    final /* synthetic */ SfvAudioItemPlaybackController a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbr(SfvAudioItemPlaybackController sfvAudioItemPlaybackController, long j, long j2) {
        super(j, j2, 1, 1, null);
        this.a = sfvAudioItemPlaybackController;
    }

    @Override // defpackage.aixi
    protected final void a() {
        Handler handler = new Handler();
        final SfvAudioItemPlaybackController sfvAudioItemPlaybackController = this.a;
        handler.post(new Runnable() { // from class: hbq
            @Override // java.lang.Runnable
            public final void run() {
                SfvAudioItemPlaybackController.this.i();
            }
        });
    }
}
