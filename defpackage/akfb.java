package defpackage;

import android.media.AudioTrack;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akfb {
    public final Executor a;
    public AudioTrack b;

    public akfb(Executor executor) {
        this.a = anaf.E(executor);
    }

    public final anhy a() {
        return anaf.T(new anfy() { // from class: akez
            @Override // defpackage.anfy
            public final anhy a() {
                akfb akfbVar = akfb.this;
                if (akfbVar.b()) {
                    if (akfbVar.b.getPlayState() != 1) {
                        akfbVar.b.stop();
                    } else {
                        return anhv.a;
                    }
                }
                AudioTrack audioTrack = akfbVar.b;
                if (audioTrack != null) {
                    audioTrack.release();
                    akfbVar.b = null;
                }
                return anhv.a;
            }
        }, this.a);
    }

    public final boolean b() {
        AudioTrack audioTrack = this.b;
        return audioTrack != null && audioTrack.getState() == 1;
    }
}
