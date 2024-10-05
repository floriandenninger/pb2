package defpackage;

import android.media.AudioManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahau implements AudioManager.OnAudioFocusChangeListener {
    public static final /* synthetic */ int e = 0;
    public final /* synthetic */ ahaw c;
    public boolean a = false;
    public boolean b = false;
    public int d = 1;

    public ahau(ahaw ahawVar) {
        this.c = ahawVar;
    }

    public final boolean a() {
        return this.d != 1;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        if (this.c.b.m) {
            return;
        }
        if (i == -3) {
            aifo.a(aifn.AUDIOMANAGER, "AudioFocus DUCK", new Object[0]);
            ahav ahavVar = this.c.h;
            if (ahavVar != null) {
                ahavVar.c(true);
                this.c.j = 2;
                return;
            }
            return;
        }
        if (i == -2 || i == -1) {
            aifo.a(aifn.AUDIOMANAGER, "AudioFocus LOSS", new Object[0]);
            ahav ahavVar2 = this.c.h;
            if (ahavVar2 != null) {
                this.a = ahavVar2.d() && i == -2;
                ahaw ahawVar = this.c;
                if (ahawVar.l == 2) {
                    ahawVar.h.a();
                } else {
                    ahawVar.h.e();
                }
            }
            this.c.j = 0;
            return;
        }
        if (i == 1 || i == 2 || i == 3) {
            aifo.a(aifn.AUDIOMANAGER, "AudioFocus GAIN", new Object[0]);
            ahaw ahawVar2 = this.c;
            ahawVar2.j = 1;
            ahav ahavVar3 = ahawVar2.h;
            if (ahavVar3 != null) {
                ahavVar3.c(false);
            }
            if (this.a) {
                if (this.c.b.k || a()) {
                    this.a = false;
                    this.b = false;
                    ahav ahavVar4 = this.c.h;
                    if (ahavVar4 != null) {
                        ahavVar4.b();
                        return;
                    }
                    return;
                }
                this.b = true;
            }
        }
    }
}
