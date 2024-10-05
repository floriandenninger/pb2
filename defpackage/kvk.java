package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.sequencer.navigation.AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState;
import com.google.android.libraries.youtube.player.sequencer.state.OmegaSequencerState;
import com.google.android.libraries.youtube.player.sequencer.state.SequenceNavigatorState;
import com.google.android.libraries.youtube.player.sequencer.state.SequencerState;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kvk implements aiml {
    private final aimb a;
    private final aibl b;
    private final axzf c;
    private final alor d;

    public kvk(aimb aimbVar, alor alorVar, aibl aiblVar, axzf axzfVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = aimbVar;
        this.d = alorVar;
        this.b = aiblVar;
        this.c = axzfVar;
    }

    @Override // defpackage.aiml
    public final aimk b(PlaybackStartDescriptor playbackStartDescriptor) {
        aimt aimpVar;
        if (!playbackStartDescriptor.k().isEmpty() && this.c.d().booleanValue()) {
            aimpVar = this.b.b(playbackStartDescriptor);
        } else {
            aimpVar = new aimp(playbackStartDescriptor.k(), this.a.d(), juz.d);
        }
        return this.d.a(aimpVar);
    }

    @Override // defpackage.aiml
    public final aimk c(SequencerState sequencerState) {
        if (!(sequencerState instanceof OmegaSequencerState)) {
            return null;
        }
        SequenceNavigatorState sequenceNavigatorState = ((OmegaSequencerState) sequencerState).c;
        aimp aimpVar = sequenceNavigatorState instanceof AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState ? new aimp((AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState) sequenceNavigatorState, juz.e) : null;
        if (aimpVar == null) {
            return null;
        }
        return this.d.a(aimpVar);
    }

    @Override // defpackage.aiml
    public final boolean f(PlaybackStartDescriptor playbackStartDescriptor, aimk aimkVar) {
        if (!(aimkVar instanceof aimg) || !this.c.d().booleanValue()) {
            return false;
        }
        if (playbackStartDescriptor.k().isEmpty()) {
            return ((aimg) aimkVar).h(aibp.class);
        }
        return ((aimg) aimkVar).h(aimp.class);
    }
}
