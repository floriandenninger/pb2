package defpackage;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.audiofocus.PlaybackAudioManager$RestorableState;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahaw {
    public final Context a;
    public final aifs b;
    public final aaoz c;
    public final AudioManager d;
    public final ahau e;
    public final banw f;
    public final ahat g;
    public ahav h;
    public PlaybackAudioManager$RestorableState i;
    public int j;
    public PlayerResponseModel k;
    public int l = 2;
    private final Executor m;

    public ahaw(Context context, aifs aifsVar, aaoz aaozVar, Executor executor, banw banwVar) {
        context.getClass();
        this.a = context;
        aifsVar.getClass();
        this.b = aifsVar;
        aaozVar.getClass();
        this.c = aaozVar;
        executor.getClass();
        this.m = executor;
        this.f = banwVar;
        this.j = 0;
        this.i = new PlaybackAudioManager$RestorableState();
        this.d = (AudioManager) context.getSystemService("audio");
        this.e = new ahau(this);
        ahat ahatVar = new ahat(this);
        this.g = ahatVar;
        ahatVar.a();
    }

    public final void a() {
        if (this.i.a) {
            this.m.execute(new Runnable() { // from class: ahas
                @Override // java.lang.Runnable
                public final void run() {
                    ahaw ahawVar = ahaw.this;
                    if (ahawVar.b.m) {
                        return;
                    }
                    aifo.a(aifn.AUDIOMANAGER, "AudioFocus Requested", new Object[0]);
                    if (ahawVar.d.requestAudioFocus(ahawVar.e, 3, 1) == 1) {
                        aifo.a(aifn.AUDIOMANAGER, "AudioFocus Granted", new Object[0]);
                        ahau ahauVar = ahawVar.e;
                        int i = ahau.e;
                        ahauVar.c.j = 1;
                        ahauVar.a = false;
                        return;
                    }
                    aifo.a(aifn.AUDIOMANAGER, "AudioFocus DENIED", new Object[0]);
                }
            });
        }
    }
}
