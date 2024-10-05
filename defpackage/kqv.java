package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kqv extends ahus implements wor {
    public woq a;
    private final kqt c;
    private final kqt d;
    private final kqt e;
    private kqt f;
    private boolean g;
    private int h;

    public kqv(Context context, krd krdVar, krh krhVar, kri kriVar) {
        super(context);
        krdVar.getClass();
        this.c = krdVar;
        krhVar.getClass();
        this.d = krhVar;
        kriVar.getClass();
        this.e = kriVar;
        m();
    }

    @Override // defpackage.ahuy
    public final View a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.main_ad_cta_overlay, (ViewGroup) null, false);
        inflate.setVisibility(0);
        return inflate;
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahuy
    public final void d(Context context, View view) {
        if (this.f == null) {
            return;
        }
        if (ab(1)) {
            this.f.b(view);
            this.f.c();
        }
        if (ab(2)) {
            this.f.g(this.h, this.g);
        }
    }

    @Override // defpackage.wor
    public final void k() {
        this.a = null;
        m();
    }

    public final void m() {
        this.c.d();
        this.d.d();
        kri kriVar = (kri) this.e;
        ViewGroup viewGroup = kriVar.c;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            kriVar.c.setVisibility(8);
        }
        if (kriVar.b != null) {
            kriVar.a.b(null);
            kriVar.b = null;
        }
        kriVar.e = null;
        kriVar.d = null;
        this.f = null;
        this.h = 1;
        Z(3);
        kV();
    }

    @Deprecated
    public final void n(boolean z) {
        kqt kqtVar = this.f;
        if (kqtVar != null) {
            kqtVar.e(z);
        }
    }

    @Override // defpackage.ahuy
    public final boolean nt() {
        return this.f != null;
    }

    @Override // defpackage.wor
    public final void o(woq woqVar) {
        this.a = woqVar;
    }

    @Override // defpackage.wor
    public final void p(aooy aooyVar) {
        m();
        if (aooyVar instanceof apfm) {
            kqt kqtVar = this.c;
            ((kre) kqtVar).r = (apfm) aooyVar;
            this.f = kqtVar;
        } else if (aooyVar instanceof apxa) {
            kqt kqtVar2 = this.d;
            ((kre) kqtVar2).r = (apxa) aooyVar;
            this.f = kqtVar2;
        } else if (aooyVar instanceof aqrj) {
            kqt kqtVar3 = this.e;
            ((kri) kqtVar3).d = (aqrj) aooyVar;
            this.f = kqtVar3;
        }
        kqt kqtVar4 = this.f;
        if (kqtVar4 != null) {
            kqtVar4.f(this.a);
            Z(1);
            kX();
        }
    }

    @Override // defpackage.wor
    public final void q(boolean z) {
        n(z);
    }

    @Override // defpackage.wor
    public final void r(int i, boolean z) {
        this.h = i;
        this.g = z;
        Z(2);
    }
}
