package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public class acel extends ml implements axql {
    private volatile axps a;
    private final Object b = new Object();
    private boolean c = false;

    public acel() {
        addOnContextAvailableListener(new acek(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
        if (this.c) {
            return;
        }
        this.c = true;
        LiveCreationActivity liveCreationActivity = (LiveCreationActivity) this;
        eed eedVar = (eed) lM();
        liveCreationActivity.f = (Handler) eedVar.a.an.get();
        liveCreationActivity.g = (Executor) eedVar.a.f.get();
        liveCreationActivity.h = (ypa) eedVar.a.B.get();
        liveCreationActivity.i = (acfk) eedVar.kK();
        liveCreationActivity.j = (acfg) eedVar.ig.get();
        liveCreationActivity.k = (afsy) eedVar.a.au.get();
        liveCreationActivity.l = (aftn) eedVar.a.uZ.get();
        liveCreationActivity.m = (acra) eedVar.jk.get();
        liveCreationActivity.n = (waf) eedVar.jl.get();
        liveCreationActivity.o = (wan) eedVar.gL.get();
        liveCreationActivity.p = (wdm) eedVar.a.au.get();
        adyu.cr(liveCreationActivity, eedVar.jm.get());
        liveCreationActivity.q = (abya) eedVar.hM.get();
        liveCreationActivity.r = (shf) eedVar.a.g.get();
        liveCreationActivity.s = abfm.b();
        liveCreationActivity.t = eedVar.h();
        liveCreationActivity.aa = eedVar.mO();
        liveCreationActivity.Y = (abde) eedVar.a.wc.get();
        liveCreationActivity.u = (ScheduledExecutorService) eedVar.a.f.get();
        liveCreationActivity.v = (acpl) eedVar.a.aw.get();
        liveCreationActivity.w = axqq.a(eedVar.jp);
        liveCreationActivity.x = eedVar.hb();
        liveCreationActivity.z = (akvq) eedVar.a.mM.get();
        eedVar.is();
        liveCreationActivity.A = (SharedPreferences) eedVar.a.z.get();
        liveCreationActivity.B = (akai) eedVar.a.xH.get();
        liveCreationActivity.V = new akap();
        liveCreationActivity.Z = (agcm) eedVar.a.a.aO.get();
        liveCreationActivity.X = (vgz) eedVar.a.a.aN.get();
        liveCreationActivity.ar((wan) eedVar.gL.get());
    }

    @Override // defpackage.zv, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.u(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    @Override // defpackage.axql
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final axps lL() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new axps(this);
                }
            }
        }
        return this.a;
    }
}
