package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iim extends iin {
    public final aaea t;
    public final ifw u;
    public final ily v;
    public ihm w;

    /* JADX WARN: Multi-variable type inference failed */
    public iim(aaea aaeaVar, ifw ifwVar, ilx ilxVar, ViewGroup viewGroup) {
        super(viewGroup);
        this.t = aaeaVar;
        this.u = ifwVar;
        nmc nmcVar = ((ijo) ilxVar).bw;
        Context context = (Context) nmcVar.i.get();
        context.getClass();
        ajjz ajjzVar = (ajjz) nmcVar.e.get();
        ajjzVar.getClass();
        ainy ainyVar = (ainy) nmcVar.f.get();
        ainyVar.getClass();
        acqz acqzVar = (acqz) nmcVar.c.get();
        acqzVar.getClass();
        imk imkVar = (imk) nmcVar.g.get();
        ika ikaVar = (ika) nmcVar.a.get();
        ikaVar.getClass();
        ily ilyVar = new ily(context, ajjzVar, ainyVar, acqzVar, imkVar, ikaVar, (ikr) nmcVar.b.get(), (ilb) nmcVar.d.get(), (aiqn) nmcVar.h.get(), ilxVar, null, null);
        this.v = ilyVar;
        viewGroup.addView(ilyVar, ilyVar.c());
    }

    @Override // defpackage.iin
    public final ihm E() {
        return this.w;
    }

    @Override // defpackage.iin
    public final void F() {
        ihm ihmVar = this.w;
        if (ihmVar != null) {
            this.u.e(ihmVar.d);
            this.w.f = null;
            this.w = null;
        }
        ily ilyVar = this.v;
        if (ilyVar != null) {
            ilyVar.f.c();
            this.v.f.b();
            ikn iknVar = this.v.a;
            if (iknVar != null) {
                iknVar.e();
                ftm ftmVar = iknVar.u;
                if (ftmVar != null) {
                    ftmVar.d();
                }
                LottieAnimationView lottieAnimationView = iknVar.l;
                if (lottieAnimationView != null) {
                    etx.M(lottieAnimationView, false);
                    iknVar.l = null;
                }
                ViewGroup viewGroup = iknVar.m;
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                    etx.M(iknVar.m, false);
                    iknVar.m = null;
                }
                iknVar.z.cancel();
                iknVar.A.c();
            }
        }
    }
}
