package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.watch.player.ReelSequenceNavigator$ReelSequenceNavigatorState;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.sequencer.state.OmegaSequencerState;
import com.google.android.libraries.youtube.player.sequencer.state.SequencerState;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kvg implements aiml {
    private final alor a;
    private final ajoy b;

    public kvg(ajoy ajoyVar, alor alorVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.b = ajoyVar;
        this.a = alorVar;
    }

    @Override // defpackage.aiml
    public final aimk b(PlaybackStartDescriptor playbackStartDescriptor) {
        apxf apxfVar = playbackStartDescriptor.b;
        boolean z = false;
        if (apxfVar != null && apxfVar.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            z = true;
        }
        amkq.J(z, "[%s] should be reel playback", playbackStartDescriptor);
        return this.a.a(this.b.H());
    }

    @Override // defpackage.aiml
    public final aimk c(SequencerState sequencerState) {
        if ((sequencerState instanceof OmegaSequencerState) && (((OmegaSequencerState) sequencerState).c instanceof ReelSequenceNavigator$ReelSequenceNavigatorState)) {
            return this.a.a(this.b.H());
        }
        return null;
    }

    @Override // defpackage.aiml
    public final /* synthetic */ boolean f(PlaybackStartDescriptor playbackStartDescriptor, aimk aimkVar) {
        return false;
    }
}
