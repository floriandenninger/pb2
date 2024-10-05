package defpackage;

import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import com.google.protos.youtube.api.innertube.SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gtk implements aaha {
    private final YouTubeControlsOverlay a;

    public gtk(YouTubeControlsOverlay youTubeControlsOverlay) {
        this.a = youTubeControlsOverlay;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand setPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand = (SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand) apxfVar.pX(SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand.setPlayerControlsOverlayVisibilityCommand);
        if ((setPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand.b & 1) != 0) {
            if (setPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand.c) {
                this.a.R();
            } else {
                this.a.nf();
            }
        }
    }
}
