package com.google.android.apps.youtube.app.extensions.reel.common.browse;

import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import defpackage.acqx;
import defpackage.acqz;
import defpackage.acsb;
import defpackage.any;
import defpackage.aok;
import defpackage.hce;
import defpackage.hcf;
import defpackage.hpi;
import defpackage.hqa;
import defpackage.hqc;
import defpackage.wbs;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ReelBrowseFragmentToolbarController implements any {
    public Toolbar a;
    public hqc b;
    public final hqa c;
    public final hpi d;
    private hcf e;
    private final acqz f;

    public ReelBrowseFragmentToolbarController(hcf hcfVar, hqc hqcVar, hqa hqaVar, hpi hpiVar, acqz acqzVar) {
        this.e = hcfVar;
        this.b = hqcVar;
        this.c = hqaVar;
        this.f = acqzVar;
        this.d = hpiVar;
    }

    public final void g() {
        hcf hcfVar = this.e;
        if (hcfVar != null) {
            hcfVar.aI();
            acqz acqzVar = this.f;
            if (acqzVar != null) {
                acqzVar.mM().I(3, new acqx(acsb.c(22156)), null);
            }
        }
    }

    public final void h() {
        Drawable mutate = this.a.getResources().getDrawable(R.drawable.quantum_ic_arrow_back_grey600_24).mutate();
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(new int[]{R.attr.actionBarSize});
        float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
        layoutParams.height = (int) dimension;
        this.a.setLayoutParams(layoutParams);
        mutate.setColorFilter(wbs.Q(this.a.getContext(), R.attr.ytIconActiveOther), PorterDuff.Mode.SRC_ATOP);
        this.a.q(mutate);
        this.a.r(new hce(this, 1));
        this.a.o(R.string.accessibility_back);
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        this.a.x("");
        this.a = null;
        this.e = null;
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}
