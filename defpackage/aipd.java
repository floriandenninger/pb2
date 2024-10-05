package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.video.state.DirectorSavedState;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aipd {
    public aiwk a;
    private final aimb b;

    public aipd(aimb aimbVar) {
        this.b = aimbVar;
    }

    public final synchronized void a() {
        aiwk aiwkVar = this.a;
        if (aiwkVar != null) {
            aiwkVar.K();
        }
        this.a = null;
    }

    public final synchronized void b(DirectorSavedState directorSavedState, aigd aigdVar) {
        aiwk aiwkVar = this.a;
        if (aiwkVar != null) {
            aiwkVar.K();
        }
        this.a = this.b.a().b(directorSavedState, aigdVar);
    }

    public final synchronized void c(PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar) {
        aiwk aiwkVar = this.a;
        if (aiwkVar != null) {
            aiwkVar.K();
        }
        this.a = this.b.a().a(playbackStartDescriptor, aigdVar);
    }
}
