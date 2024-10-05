package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.sequencer.navigation.AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState;
import com.google.android.libraries.youtube.player.sequencer.navigation.VideoIdsSequenceNavigator$VideoIdsSequenceNavigatorState;
import com.google.android.libraries.youtube.player.sequencer.state.OmegaSequencerState;
import com.google.android.libraries.youtube.player.sequencer.state.SequenceNavigatorState;
import com.google.android.libraries.youtube.player.sequencer.state.SequencerState;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aimc implements aiml {
    private final aimj a;
    private final alor b;

    public aimc(aimj aimjVar, alor alorVar, byte[] bArr) {
        this.a = aimjVar;
        this.b = alorVar;
    }

    @Override // defpackage.aiml
    public final aimk b(PlaybackStartDescriptor playbackStartDescriptor) {
        aimt aimpVar;
        yjk.f();
        aimj aimjVar = this.a;
        playbackStartDescriptor.getClass();
        if (playbackStartDescriptor.m() != null) {
            aimpVar = new aimv(playbackStartDescriptor);
        } else {
            aimpVar = new aimp(playbackStartDescriptor.k(), aimjVar.a.d(), aimjVar.b);
        }
        return this.b.a(aimpVar);
    }

    @Override // defpackage.aiml
    public final aimk c(SequencerState sequencerState) {
        aimt aimpVar;
        if (sequencerState == null) {
            return null;
        }
        if (sequencerState instanceof OmegaSequencerState) {
            aimj aimjVar = this.a;
            SequenceNavigatorState sequenceNavigatorState = ((OmegaSequencerState) sequencerState).c;
            if (sequenceNavigatorState instanceof VideoIdsSequenceNavigator$VideoIdsSequenceNavigatorState) {
                aimpVar = new aimv((VideoIdsSequenceNavigator$VideoIdsSequenceNavigatorState) sequenceNavigatorState);
            } else {
                aimpVar = sequenceNavigatorState instanceof AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState ? new aimp((AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState) sequenceNavigatorState, aimjVar.b) : null;
            }
            if (aimpVar == null) {
                return null;
            }
            return this.b.a(aimpVar);
        }
        String valueOf = String.valueOf(sequencerState.getClass().getSimpleName());
        afsi.b(1, 10, valueOf.length() != 0 ? "Sequencer state restoration failed: ".concat(valueOf) : new String("Sequencer state restoration failed: "));
        return null;
    }

    @Override // defpackage.aiml
    public final /* synthetic */ boolean f(PlaybackStartDescriptor playbackStartDescriptor, aimk aimkVar) {
        return false;
    }
}
