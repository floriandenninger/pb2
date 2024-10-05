package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class plc {
    public plb a;
    public float b = 1.0f;
    private final AudioManager c;
    private final pla d;
    private int e;

    public plc(Context context, Handler handler, plb plbVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        pse.c(audioManager);
        this.c = audioManager;
        this.a = plbVar;
        this.d = new pla(this, handler);
        this.e = 0;
    }

    public static final void d() {
        if (pts.R(null, null)) {
            return;
        }
        pse.f(true, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public final void a() {
        if (this.e == 0) {
            return;
        }
        if (pts.a < 26) {
            this.c.abandonAudioFocus(this.d);
        }
        c(0);
    }

    public final void b(int i) {
        plb plbVar = this.a;
        if (plbVar != null) {
            pok pokVar = (pok) plbVar;
            boolean E = pokVar.a.E();
            pokVar.a.O(E, i, pom.o(E, i));
        }
    }

    public final void c(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.b == f) {
            return;
        }
        this.b = f;
        plb plbVar = this.a;
        if (plbVar != null) {
            ((pok) plbVar).a.H();
        }
    }

    public final int e(boolean z) {
        a();
        return z ? 1 : -1;
    }
}
