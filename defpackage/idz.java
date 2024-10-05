package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelWatchActivityCaptionsLifecycleObserver;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class idz implements ahxs {
    final /* synthetic */ ReelWatchActivityCaptionsLifecycleObserver a;

    public idz(ReelWatchActivityCaptionsLifecycleObserver reelWatchActivityCaptionsLifecycleObserver) {
        this.a = reelWatchActivityCaptionsLifecycleObserver;
    }

    @Override // defpackage.ahxs
    public final void ps(SubtitleTrack subtitleTrack) {
        ReelWatchActivityCaptionsLifecycleObserver reelWatchActivityCaptionsLifecycleObserver = this.a;
        reelWatchActivityCaptionsLifecycleObserver.a.j(subtitleTrack);
        reelWatchActivityCaptionsLifecycleObserver.b.G(subtitleTrack);
    }
}
