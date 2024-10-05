package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivityV2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lhv implements aab {
    final /* synthetic */ lhw a;

    public lhv(lhw lhwVar) {
        this.a = lhwVar;
    }

    @Override // defpackage.aab
    public final void a(Context context) {
        lhw lhwVar = this.a;
        if (lhwVar.a) {
            return;
        }
        lhwVar.a = true;
        Object lM = lhwVar.lM();
        VoiceSearchActivityV2 voiceSearchActivityV2 = (VoiceSearchActivityV2) lhwVar;
        eed eedVar = (eed) lM;
        voiceSearchActivityV2.b = (Handler) eedVar.a.an.get();
        voiceSearchActivityV2.p = eedVar.ms();
        azrw azrwVar = eedVar.f;
        efz efzVar = eedVar.a;
        voiceSearchActivityV2.t = new ajyw(azrwVar, efzVar.eA, efzVar.a.bt, (short[]) null, (byte[]) null, (char[]) null);
        voiceSearchActivityV2.e = (acsy) eedVar.a.ee.get();
        voiceSearchActivityV2.f = (aaea) eedVar.a.K.get();
        voiceSearchActivityV2.n = (aadw) eedVar.a.D.get();
        voiceSearchActivityV2.g = eedVar.a.cO();
        voiceSearchActivityV2.h = (gni) eedVar.a.eA.get();
        voiceSearchActivityV2.i = (ypa) eedVar.a.B.get();
        voiceSearchActivityV2.s = eedVar.mJ();
        voiceSearchActivityV2.o = new akap();
        voiceSearchActivityV2.r = new ogx(eedVar.a.D, eedVar.kb, eedVar.ka, eedVar.aj, (char[]) null, (byte[]) null, (byte[]) null);
        voiceSearchActivityV2.q = (axzg) eedVar.a.a.bt.get();
        voiceSearchActivityV2.j = (afsy) eedVar.a.au.get();
    }
}
