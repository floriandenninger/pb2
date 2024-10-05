package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.protos.youtube.api.innertube.FingerprintAuthRendererOuterClass$FingerprintAuthRenderer;
import com.google.protos.youtube.api.innertube.PasswordAuthRendererOuterClass$PasswordAuthRenderer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wez extends wef {
    public wev af;
    public wft ag;
    public wfz ah;
    public acqz ai;
    public upp aj;
    public ajyw ak;
    public ajoy al;
    private FrameLayout am;
    private ajos an;
    private boolean ao = true;
    private boolean ap;

    public final void aF(Object obj) {
        ammv s = ahbw.s(this.an, obj, this.am);
        if (s.h()) {
            ajom ajomVar = (ajom) s.c();
            ajok o = ahbw.o(ajomVar.a());
            o.a(this.ai.mM());
            ajomVar.oB(o, obj);
            this.am.addView(ajomVar.a());
        }
    }

    @Override // defpackage.wek, defpackage.ce
    public final void lZ() {
        Dialog dialog;
        if (this.ap && (dialog = this.d) != null) {
            dialog.setOnDismissListener(null);
            this.ap = false;
        }
        super.lZ();
    }

    @Override // defpackage.wek, defpackage.ce
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        this.ap = true;
    }

    @Override // defpackage.wek, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        ajnq ajnqVar = new ajnq();
        final int i = 1;
        ajnqVar.f(PasswordAuthRendererOuterClass$PasswordAuthRenderer.class, new ajoq(this) { // from class: wey
            public final /* synthetic */ wez a;

            {
                this.a = this;
            }

            @Override // defpackage.ajoq
            public final ajom b(ViewGroup viewGroup) {
                int i2 = i;
                if (i2 == 0) {
                    wez wezVar = this.a;
                    return wezVar.ak.f(wezVar.af, viewGroup);
                }
                if (i2 == 1) {
                    wez wezVar2 = this.a;
                    return wezVar2.ag.a(wezVar2.af, viewGroup);
                }
                if (i2 != 2) {
                    wez wezVar3 = this.a;
                    return wezVar3.al.y(wezVar3.af, viewGroup);
                }
                wez wezVar4 = this.a;
                return wezVar4.aj.c(wezVar4.af, viewGroup);
            }
        });
        final int i2 = 0;
        ajnqVar.f(FingerprintAuthRendererOuterClass$FingerprintAuthRenderer.class, new ajoq(this) { // from class: wey
            public final /* synthetic */ wez a;

            {
                this.a = this;
            }

            @Override // defpackage.ajoq
            public final ajom b(ViewGroup viewGroup) {
                int i22 = i2;
                if (i22 == 0) {
                    wez wezVar = this.a;
                    return wezVar.ak.f(wezVar.af, viewGroup);
                }
                if (i22 == 1) {
                    wez wezVar2 = this.a;
                    return wezVar2.ag.a(wezVar2.af, viewGroup);
                }
                if (i22 != 2) {
                    wez wezVar3 = this.a;
                    return wezVar3.al.y(wezVar3.af, viewGroup);
                }
                wez wezVar4 = this.a;
                return wezVar4.aj.c(wezVar4.af, viewGroup);
            }
        });
        final int i3 = 2;
        ajnqVar.f(aqws.class, new ajoq(this) { // from class: wey
            public final /* synthetic */ wez a;

            {
                this.a = this;
            }

            @Override // defpackage.ajoq
            public final ajom b(ViewGroup viewGroup) {
                int i22 = i3;
                if (i22 == 0) {
                    wez wezVar = this.a;
                    return wezVar.ak.f(wezVar.af, viewGroup);
                }
                if (i22 == 1) {
                    wez wezVar2 = this.a;
                    return wezVar2.ag.a(wezVar2.af, viewGroup);
                }
                if (i22 != 2) {
                    wez wezVar3 = this.a;
                    return wezVar3.al.y(wezVar3.af, viewGroup);
                }
                wez wezVar4 = this.a;
                return wezVar4.aj.c(wezVar4.af, viewGroup);
            }
        });
        final int i4 = 3;
        ajnqVar.f(wfu.class, new ajoq(this) { // from class: wey
            public final /* synthetic */ wez a;

            {
                this.a = this;
            }

            @Override // defpackage.ajoq
            public final ajom b(ViewGroup viewGroup) {
                int i22 = i4;
                if (i22 == 0) {
                    wez wezVar = this.a;
                    return wezVar.ak.f(wezVar.af, viewGroup);
                }
                if (i22 == 1) {
                    wez wezVar2 = this.a;
                    return wezVar2.ag.a(wezVar2.af, viewGroup);
                }
                if (i22 != 2) {
                    wez wezVar3 = this.a;
                    return wezVar3.al.y(wezVar3.af, viewGroup);
                }
                wez wezVar4 = this.a;
                return wezVar4.aj.c(wezVar4.af, viewGroup);
            }
        });
        this.an = ajnqVar;
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = this.am;
        if (frameLayout == null) {
            FrameLayout frameLayout2 = new FrameLayout(C());
            this.am = frameLayout2;
            frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        } else if (frameLayout.getParent() != null) {
            ((ViewGroup) this.am.getParent()).removeView(this.am);
        }
        return this.am;
    }

    @Override // defpackage.wek, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.ao) {
            this.af.j(5);
        }
        this.ah.c();
    }

    public final void r() {
        this.ao = false;
        o();
    }

    public final void s() {
        if (this.am.getChildCount() > 0) {
            View childAt = this.am.getChildAt(0);
            this.am.removeAllViews();
            this.an.b(childAt);
        }
    }
}
