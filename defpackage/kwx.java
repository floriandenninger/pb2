package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kwx extends kwu implements kwg, acqz {
    public zim ae;
    public acra af;
    public ohx ag;
    private kwh ah;

    @Override // defpackage.ce
    public final void S(Bundle bundle) {
        super.S(bundle);
        kwh kwhVar = this.ah;
        kwhVar.a();
        kwhVar.n.g(kwhVar);
    }

    @Override // defpackage.bv, defpackage.ce
    public final void lZ() {
        super.lZ();
        kwh kwhVar = this.ah;
        kwhVar.n.m(kwhVar);
        kwhVar.l.j();
    }

    @Override // defpackage.acqz
    public final acra mM() {
        return this.af;
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        o(2, this.ae.a);
        this.af.d(acsb.b(67374), null, null);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mg(layoutInflater, viewGroup, bundle);
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) layoutInflater.inflate(R.layout.suggested_playlist_videos_fragment, viewGroup, false);
        ohx ohxVar = this.ag;
        azrw azrwVar = ohxVar.i;
        zaw zawVar = (zaw) ohxVar.a.get();
        zawVar.getClass();
        Context context = (Context) ohxVar.d.get();
        context.getClass();
        Executor executor = (Executor) ohxVar.e.get();
        executor.getClass();
        ajyg ajygVar = (ajyg) ohxVar.f.get();
        ajygVar.getClass();
        ajvb ajvbVar = (ajvb) ohxVar.c.get();
        ajvbVar.getClass();
        ajxj ajxjVar = (ajxj) ohxVar.k.get();
        ajxjVar.getClass();
        lwk lwkVar = (lwk) ohxVar.h.get();
        lwkVar.getClass();
        ypa ypaVar = (ypa) ohxVar.g.get();
        ypaVar.getClass();
        sxw sxwVar = (sxw) ohxVar.b.get();
        sxwVar.getClass();
        loadingFrameLayout.getClass();
        aaea aaeaVar = (aaea) ohxVar.j.get();
        aaeaVar.getClass();
        this.ah = new kwh(azrwVar, zawVar, context, executor, ajygVar, ajvbVar, ajxjVar, lwkVar, ypaVar, sxwVar, this, loadingFrameLayout, this, aaeaVar, null, null);
        return loadingFrameLayout;
    }

    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        Dialog oq = super.oq(bundle);
        Window window = oq.getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.SlideDownAnimation);
        }
        return oq;
    }
}
