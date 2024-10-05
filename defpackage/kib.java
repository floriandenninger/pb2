package defpackage;

import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.apps.youtube.app.player.overlay.ControlsOverlayAlwaysShownController;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kib {
    public final /* synthetic */ ControlsOverlayAlwaysShownController a;

    public kib(ControlsOverlayAlwaysShownController controlsOverlayAlwaysShownController) {
        this.a = controlsOverlayAlwaysShownController;
    }

    public final void a(adjm adjmVar) {
        if (b(adjmVar)) {
            ControlsOverlayAlwaysShownController controlsOverlayAlwaysShownController = this.a;
            controlsOverlayAlwaysShownController.b = false;
            controlsOverlayAlwaysShownController.g();
        }
    }

    public final boolean b(adjm adjmVar) {
        azrw azrwVar;
        if (!(adjmVar instanceof jcs)) {
            return false;
        }
        jcs jcsVar = (jcs) adjmVar;
        return jcsVar.f().isPresent() && (azrwVar = this.a.a) != null && ((Optional) azrwVar.get()).isPresent() && jcsVar.f().isPresent() && ((MediaRouteButton) ((Optional) this.a.a.get()).get()).equals(jcsVar.f().get());
    }
}
