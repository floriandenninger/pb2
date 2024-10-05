package defpackage;

import android.media.AudioTrack;
import android.media.PlaybackParams;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ozf extends oze {
    private PlaybackParams f;
    private float g = 1.0f;

    private final void i() {
        PlaybackParams playbackParams;
        AudioTrack audioTrack = this.a;
        if (audioTrack == null || (playbackParams = this.f) == null) {
            return;
        }
        audioTrack.setPlaybackParams(playbackParams);
    }

    @Override // defpackage.ozd
    public final float a() {
        return this.g;
    }

    @Override // defpackage.oze, defpackage.ozd
    public final void f(AudioTrack audioTrack, boolean z) {
        super.f(audioTrack, z);
        i();
    }

    @Override // defpackage.ozd
    public final void g(PlaybackParams playbackParams) {
        if (playbackParams == null) {
            playbackParams = new PlaybackParams();
        }
        PlaybackParams allowDefaults = playbackParams.allowDefaults();
        this.f = allowDefaults;
        this.g = allowDefaults.getSpeed();
        i();
    }
}
