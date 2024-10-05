package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class poq {
    public final Context a;
    public final Handler b;
    public final AudioManager c;
    public pop d;
    public int e;
    private final pon f;
    private int g;
    private boolean h;

    public poq(Context context, Handler handler, pon ponVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = handler;
        this.f = ponVar;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        pse.d(audioManager);
        this.c = audioManager;
        this.e = 3;
        this.g = c(audioManager, 3);
        this.h = d(audioManager, this.e);
        pop popVar = new pop(this);
        try {
            applicationContext.registerReceiver(popVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.d = popVar;
        } catch (RuntimeException e) {
            prh.k("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    private static int c(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder(60);
            sb.append("Could not retrieve stream volume for stream type ");
            sb.append(i);
            prh.k("StreamVolumeManager", sb.toString(), e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    private static boolean d(AudioManager audioManager, int i) {
        if (pts.a >= 23) {
            return audioManager.isStreamMute(i);
        }
        return c(audioManager, i) == 0;
    }

    public final void a(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        b();
        pok pokVar = (pok) this.f;
        plo t = pom.t(pokVar.a.g);
        if (t.equals(pokVar.a.q)) {
            return;
        }
        pom pomVar = pokVar.a;
        pomVar.q = t;
        Iterator it = pomVar.d.iterator();
        while (it.hasNext()) {
            ((pny) it.next()).X();
        }
    }

    public final void b() {
        int c = c(this.c, this.e);
        boolean d = d(this.c, this.e);
        if (this.g == c && this.h == d) {
            return;
        }
        this.g = c;
        this.h = d;
        Iterator it = ((pok) this.f).a.d.iterator();
        while (it.hasNext()) {
            ((pny) it.next()).Y();
        }
    }
}
