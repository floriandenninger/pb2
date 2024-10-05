package defpackage;

import com.google.protos.youtube.api.innertube.SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gtj implements aaha {
    private final ainy a;
    private final aivo b;

    public gtj(ainy ainyVar, aivo aivoVar) {
        this.a = ainyVar;
        this.b = aivoVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand setPlaybackStateCommandOuterClass$SetPlaybackStateCommand = apxfVar.pY(SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand.setPlaybackStateCommand) ? (SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand) apxfVar.pX(SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand.setPlaybackStateCommand) : null;
        if (setPlaybackStateCommandOuterClass$SetPlaybackStateCommand != null) {
            if ((setPlaybackStateCommandOuterClass$SetPlaybackStateCommand.b & 1) != 0) {
                switch ((aobq.bA(setPlaybackStateCommandOuterClass$SetPlaybackStateCommand.c) != 0 ? r3 : 1) - 1) {
                    case 1:
                        if (this.a.d()) {
                            return;
                        }
                        this.a.b();
                        return;
                    case 2:
                        if (this.a.d()) {
                            this.a.a();
                            return;
                        }
                        return;
                    case 3:
                        this.b.g(10000L);
                        return;
                    case 4:
                        this.b.g(-10000L);
                        return;
                    case 5:
                        this.b.k();
                        return;
                    case 6:
                        this.b.l();
                        return;
                    case 7:
                        this.a.B();
                        return;
                    default:
                        return;
                }
            }
        }
    }
}
