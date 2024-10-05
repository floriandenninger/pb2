package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import com.google.android.apps.youtube.app.extensions.livecreation.MainLiveCreationActivity;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class gzo extends LiveCreationActivity {
    private boolean a = false;

    public gzo() {
        addOnContextAvailableListener(new gzn(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.acel
    public final void f() {
        if (this.a) {
            return;
        }
        this.a = true;
        MainLiveCreationActivity mainLiveCreationActivity = (MainLiveCreationActivity) this;
        eed eedVar = (eed) lM();
        mainLiveCreationActivity.f = (Handler) eedVar.a.an.get();
        mainLiveCreationActivity.g = (Executor) eedVar.a.f.get();
        mainLiveCreationActivity.h = (ypa) eedVar.a.B.get();
        mainLiveCreationActivity.i = (acfk) eedVar.kK();
        mainLiveCreationActivity.j = (acfg) eedVar.ig.get();
        mainLiveCreationActivity.k = (afsy) eedVar.a.au.get();
        mainLiveCreationActivity.l = (aftn) eedVar.a.uZ.get();
        mainLiveCreationActivity.m = (acra) eedVar.jk.get();
        mainLiveCreationActivity.n = (waf) eedVar.jl.get();
        mainLiveCreationActivity.o = (wan) eedVar.gL.get();
        mainLiveCreationActivity.p = (wdm) eedVar.a.au.get();
        adyu.cr(mainLiveCreationActivity, eedVar.jm.get());
        mainLiveCreationActivity.q = (abya) eedVar.hM.get();
        mainLiveCreationActivity.r = (shf) eedVar.a.g.get();
        mainLiveCreationActivity.s = abfm.b();
        mainLiveCreationActivity.t = eedVar.h();
        mainLiveCreationActivity.aa = eedVar.mO();
        mainLiveCreationActivity.Y = (abde) eedVar.a.wc.get();
        mainLiveCreationActivity.u = (ScheduledExecutorService) eedVar.a.f.get();
        mainLiveCreationActivity.v = (acpl) eedVar.a.aw.get();
        mainLiveCreationActivity.w = axqq.a(eedVar.jp);
        mainLiveCreationActivity.x = eedVar.hb();
        mainLiveCreationActivity.z = (akvq) eedVar.a.mM.get();
        eedVar.is();
        mainLiveCreationActivity.A = (SharedPreferences) eedVar.a.z.get();
        mainLiveCreationActivity.B = (akai) eedVar.a.xH.get();
        mainLiveCreationActivity.V = new akap();
        mainLiveCreationActivity.Z = (agcm) eedVar.a.a.aO.get();
        mainLiveCreationActivity.X = (vgz) eedVar.a.a.aN.get();
        mainLiveCreationActivity.ar((wan) eedVar.gL.get());
        mainLiveCreationActivity.a = eedVar.aE();
        mainLiveCreationActivity.b = (akcy) eedVar.aj.get();
    }
}
