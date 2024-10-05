package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchHalfPlateV0Activity;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lhy implements aab {
    final /* synthetic */ lhz a;

    public lhy(lhz lhzVar) {
        this.a = lhzVar;
    }

    @Override // defpackage.aab
    public final void a(Context context) {
        lhz lhzVar = this.a;
        if (lhzVar.a) {
            return;
        }
        lhzVar.a = true;
        Object lM = lhzVar.lM();
        VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity = (VoiceSearchHalfPlateV0Activity) lhzVar;
        eed eedVar = (eed) lM;
        voiceSearchHalfPlateV0Activity.b = (Handler) eedVar.a.an.get();
        voiceSearchHalfPlateV0Activity.W = (akbc) eedVar.ka.get();
        voiceSearchHalfPlateV0Activity.n = (acsy) eedVar.a.ee.get();
        voiceSearchHalfPlateV0Activity.o = (aaea) eedVar.a.K.get();
        voiceSearchHalfPlateV0Activity.U = (aadw) eedVar.a.D.get();
        voiceSearchHalfPlateV0Activity.p = eedVar.a.cO();
        voiceSearchHalfPlateV0Activity.q = eedVar.jP();
        voiceSearchHalfPlateV0Activity.r = (akfz) eedVar.a.xE.get();
        voiceSearchHalfPlateV0Activity.s = (aarr) eedVar.a.hV.get();
        voiceSearchHalfPlateV0Activity.t = (ysy) eedVar.a.as.get();
        voiceSearchHalfPlateV0Activity.u = (gni) eedVar.a.eA.get();
        voiceSearchHalfPlateV0Activity.v = (ypa) eedVar.a.B.get();
        voiceSearchHalfPlateV0Activity.Z = eedVar.mJ();
        voiceSearchHalfPlateV0Activity.aa = eedVar.mV();
        voiceSearchHalfPlateV0Activity.Y = (agcm) eedVar.a.a.bb.get();
        voiceSearchHalfPlateV0Activity.w = (ScheduledExecutorService) eedVar.a.f.get();
        voiceSearchHalfPlateV0Activity.x = (akcy) eedVar.aj.get();
        voiceSearchHalfPlateV0Activity.V = new akap();
        voiceSearchHalfPlateV0Activity.X = (axzg) eedVar.a.a.bt.get();
        voiceSearchHalfPlateV0Activity.y = (afsy) eedVar.a.au.get();
    }
}
