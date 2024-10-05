package defpackage;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class snk extends dha {

    @dnt(a = 13)
    sww a;

    @dnt(a = 13)
    sxc b;

    @dnt(a = 13)
    String c;

    @dnt(a = 13)
    syd d;

    @dnt(a = 13)
    szx e;

    @dnt(a = 13)
    szx f;

    @dnt(a = 13)
    axog g;
    cgf v;

    @dnt(a = 13)
    sod w;

    public snk() {
        super("AnimatedType");
    }

    @Override // defpackage.dhk
    protected final int F() {
        return 3;
    }

    @Override // defpackage.dhk
    protected final Object L(Context context) {
        return snr.a(context);
    }

    @Override // defpackage.dhk
    protected final void S(dhe dheVar, Object obj) {
        snr.c(dheVar, (LottieAnimationView) obj, this.v, this.a, this.b, this.w, this.g, this.e, this.f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void V(dhe dheVar) {
        baql baqlVar = new baql();
        snr.e(dheVar, this.g, baqlVar);
        this.v = (cgf) baqlVar.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void W(dhe dheVar, Object obj) {
        snr.d((LottieAnimationView) obj, this.w);
    }

    @Override // defpackage.dhk
    public final boolean Y() {
        return true;
    }

    @Override // defpackage.dhk
    public final boolean ag() {
        return true;
    }

    @Override // defpackage.dhk
    protected final boolean ai(dha dhaVar, dha dhaVar2) {
        snk snkVar = (snk) dhaVar;
        snk snkVar2 = (snk) dhaVar2;
        return snr.b(new dim(snkVar.g, snkVar2 == null ? null : snkVar2.g), new dim(snkVar.c, snkVar2 != null ? snkVar2.c : null));
    }

    @Override // defpackage.dhk
    public final int aj() {
        return 3;
    }

    @Override // defpackage.dha
    /* renamed from: e */
    public final boolean f(dha dhaVar) {
        if (this == dhaVar) {
            return true;
        }
        if (dhaVar == null || getClass() != dhaVar.getClass()) {
            return false;
        }
        snk snkVar = (snk) dhaVar;
        if (this.k == snkVar.k) {
            return true;
        }
        sww swwVar = this.a;
        if (swwVar == null ? snkVar.a != null : !swwVar.equals(snkVar.a)) {
            return false;
        }
        sxc sxcVar = this.b;
        if (sxcVar == null ? snkVar.b != null : !sxcVar.equals(snkVar.b)) {
            return false;
        }
        sod sodVar = this.w;
        if (sodVar == null ? snkVar.w != null : !sodVar.equals(snkVar.w)) {
            return false;
        }
        String str = this.c;
        if (str == null ? snkVar.c != null : !str.equals(snkVar.c)) {
            return false;
        }
        syd sydVar = this.d;
        if (sydVar == null ? snkVar.d != null : !sydVar.equals(snkVar.d)) {
            return false;
        }
        szx szxVar = this.e;
        if (szxVar == null ? snkVar.e != null : !szxVar.equals(snkVar.e)) {
            return false;
        }
        szx szxVar2 = this.f;
        if (szxVar2 == null ? snkVar.f != null : !szxVar2.equals(snkVar.f)) {
            return false;
        }
        axog axogVar = this.g;
        return axogVar == null ? snkVar.g == null : axogVar.equals(snkVar.g);
    }

    @Override // defpackage.dha, defpackage.div
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((dha) obj);
    }

    @Override // defpackage.dha
    public final /* bridge */ /* synthetic */ dha j() {
        snk snkVar = (snk) super.j();
        snkVar.v = null;
        return snkVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dha
    public final void p(dha dhaVar) {
        this.v = ((snk) dhaVar).v;
    }
}
