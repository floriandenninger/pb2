package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lht implements aab {
    final /* synthetic */ lhu a;

    public lht(lhu lhuVar) {
        this.a = lhuVar;
    }

    @Override // defpackage.aab
    public final void a(Context context) {
        lhu lhuVar = this.a;
        if (lhuVar.a) {
            return;
        }
        lhuVar.a = true;
        Object lM = lhuVar.lM();
        VoiceSearchActivity voiceSearchActivity = (VoiceSearchActivity) lhuVar;
        eed eedVar = (eed) lM;
        voiceSearchActivity.b = (Handler) eedVar.a.an.get();
        voiceSearchActivity.aa = (akbc) eedVar.ka.get();
        voiceSearchActivity.n = (acsy) eedVar.a.ee.get();
        voiceSearchActivity.o = (aaea) eedVar.a.K.get();
        voiceSearchActivity.Y = (aadw) eedVar.a.D.get();
        voiceSearchActivity.p = eedVar.a.cO();
        voiceSearchActivity.q = eedVar.jP();
        voiceSearchActivity.r = (akfz) eedVar.a.xE.get();
        voiceSearchActivity.s = (aarr) eedVar.a.hV.get();
        voiceSearchActivity.t = (ysy) eedVar.a.as.get();
        voiceSearchActivity.u = (gni) eedVar.a.eA.get();
        voiceSearchActivity.v = (ypa) eedVar.a.B.get();
        voiceSearchActivity.ad = eedVar.mJ();
        voiceSearchActivity.ae = eedVar.mV();
        voiceSearchActivity.ac = (agcm) eedVar.a.a.bb.get();
        voiceSearchActivity.w = (ScheduledExecutorService) eedVar.a.f.get();
        voiceSearchActivity.x = (akcy) eedVar.aj.get();
        voiceSearchActivity.Z = new akap();
        voiceSearchActivity.ab = (axzg) eedVar.a.a.bt.get();
        voiceSearchActivity.y = (afsy) eedVar.a.au.get();
        voiceSearchActivity.z = new akfb((Executor) eedVar.a.f.get());
    }
}
