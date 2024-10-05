package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.protos.youtube.api.innertube.FingerprintAuthRendererOuterClass$FingerprintAuthRenderer;
import com.google.protos.youtube.api.innertube.PasswordAuthRendererOuterClass$PasswordAuthRenderer;
import com.google.protos.youtube.api.innertube.PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wex extends wee {
    public wfa ae;
    public wft af;
    public wfk ag;
    public wfz ah;
    public acqz ai;
    public upp aj;
    public ajyw ak;
    public ajoy al;
    private FrameLayout am;
    private ajos an;
    private boolean ao = true;
    private boolean ap;

    public final void aH() {
        this.ao = false;
        dismiss();
    }

    public final void aI() {
        if (this.am.getChildCount() > 0) {
            View childAt = this.am.getChildAt(0);
            this.am.removeAllViews();
            this.an.b(childAt);
        }
    }

    public final void aJ(Object obj) {
        ammv s = ahbw.s(this.an, obj, this.am);
        if (s.h()) {
            ajom ajomVar = (ajom) s.c();
            ajok o = ahbw.o(ajomVar.a());
            o.a(this.ai.mM());
            ajomVar.oB(o, obj);
            this.am.addView(ajomVar.a());
        }
    }

    @Override // defpackage.bv, defpackage.ce
    public final void lZ() {
        Dialog dialog;
        if (this.ap && (dialog = this.d) != null) {
            dialog.setOnDismissListener(null);
            this.ap = false;
        }
        super.lZ();
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        this.ap = true;
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        ajnq ajnqVar = new ajnq();
        final int i = 1;
        ajnqVar.f(PasswordAuthRendererOuterClass$PasswordAuthRenderer.class, new ajoq(this) { // from class: wew
            public final /* synthetic */ wex a;

            {
                this.a = this;
            }

            @Override // defpackage.ajoq
            public final ajom b(ViewGroup viewGroup) {
                int i2 = i;
                if (i2 == 0) {
                    wex wexVar = this.a;
                    return wexVar.ak.f(wexVar.ae, viewGroup);
                }
                if (i2 == 1) {
                    wex wexVar2 = this.a;
                    return wexVar2.af.a(wexVar2.ae, viewGroup);
                }
                if (i2 == 2) {
                    wex wexVar3 = this.a;
                    return wexVar3.aj.c(wexVar3.ae, viewGroup);
                }
                if (i2 != 3) {
                    wex wexVar4 = this.a;
                    return wexVar4.al.y(wexVar4.ae, viewGroup);
                }
                wex wexVar5 = this.a;
                wfk wfkVar = wexVar5.ag;
                wfa wfaVar = wexVar5.ae;
                Context context = (Context) wfkVar.a.get();
                context.getClass();
                afsy afsyVar = (afsy) wfkVar.b.get();
                afsyVar.getClass();
                wdm wdmVar = (wdm) wfkVar.c.get();
                wdmVar.getClass();
                weh wehVar = (weh) wfkVar.d.get();
                wehVar.getClass();
                Activity activity = (Activity) wfkVar.e.get();
                activity.getClass();
                Handler handler = (Handler) wfkVar.f.get();
                handler.getClass();
                wft wftVar = (wft) wfkVar.g.get();
                ((whl) wfkVar.h.get()).getClass();
                wfaVar.getClass();
                return new wfj(context, afsyVar, wdmVar, wehVar, activity, handler, wftVar, wfaVar, wexVar5);
            }
        });
        final int i2 = 0;
        ajnqVar.f(FingerprintAuthRendererOuterClass$FingerprintAuthRenderer.class, new ajoq(this) { // from class: wew
            public final /* synthetic */ wex a;

            {
                this.a = this;
            }

            @Override // defpackage.ajoq
            public final ajom b(ViewGroup viewGroup) {
                int i22 = i2;
                if (i22 == 0) {
                    wex wexVar = this.a;
                    return wexVar.ak.f(wexVar.ae, viewGroup);
                }
                if (i22 == 1) {
                    wex wexVar2 = this.a;
                    return wexVar2.af.a(wexVar2.ae, viewGroup);
                }
                if (i22 == 2) {
                    wex wexVar3 = this.a;
                    return wexVar3.aj.c(wexVar3.ae, viewGroup);
                }
                if (i22 != 3) {
                    wex wexVar4 = this.a;
                    return wexVar4.al.y(wexVar4.ae, viewGroup);
                }
                wex wexVar5 = this.a;
                wfk wfkVar = wexVar5.ag;
                wfa wfaVar = wexVar5.ae;
                Context context = (Context) wfkVar.a.get();
                context.getClass();
                afsy afsyVar = (afsy) wfkVar.b.get();
                afsyVar.getClass();
                wdm wdmVar = (wdm) wfkVar.c.get();
                wdmVar.getClass();
                weh wehVar = (weh) wfkVar.d.get();
                wehVar.getClass();
                Activity activity = (Activity) wfkVar.e.get();
                activity.getClass();
                Handler handler = (Handler) wfkVar.f.get();
                handler.getClass();
                wft wftVar = (wft) wfkVar.g.get();
                ((whl) wfkVar.h.get()).getClass();
                wfaVar.getClass();
                return new wfj(context, afsyVar, wdmVar, wehVar, activity, handler, wftVar, wfaVar, wexVar5);
            }
        });
        final int i3 = 2;
        ajnqVar.f(aqws.class, new ajoq(this) { // from class: wew
            public final /* synthetic */ wex a;

            {
                this.a = this;
            }

            @Override // defpackage.ajoq
            public final ajom b(ViewGroup viewGroup) {
                int i22 = i3;
                if (i22 == 0) {
                    wex wexVar = this.a;
                    return wexVar.ak.f(wexVar.ae, viewGroup);
                }
                if (i22 == 1) {
                    wex wexVar2 = this.a;
                    return wexVar2.af.a(wexVar2.ae, viewGroup);
                }
                if (i22 == 2) {
                    wex wexVar3 = this.a;
                    return wexVar3.aj.c(wexVar3.ae, viewGroup);
                }
                if (i22 != 3) {
                    wex wexVar4 = this.a;
                    return wexVar4.al.y(wexVar4.ae, viewGroup);
                }
                wex wexVar5 = this.a;
                wfk wfkVar = wexVar5.ag;
                wfa wfaVar = wexVar5.ae;
                Context context = (Context) wfkVar.a.get();
                context.getClass();
                afsy afsyVar = (afsy) wfkVar.b.get();
                afsyVar.getClass();
                wdm wdmVar = (wdm) wfkVar.c.get();
                wdmVar.getClass();
                weh wehVar = (weh) wfkVar.d.get();
                wehVar.getClass();
                Activity activity = (Activity) wfkVar.e.get();
                activity.getClass();
                Handler handler = (Handler) wfkVar.f.get();
                handler.getClass();
                wft wftVar = (wft) wfkVar.g.get();
                ((whl) wfkVar.h.get()).getClass();
                wfaVar.getClass();
                return new wfj(context, afsyVar, wdmVar, wehVar, activity, handler, wftVar, wfaVar, wexVar5);
            }
        });
        final int i4 = 3;
        ajnqVar.f(PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.class, new ajoq(this) { // from class: wew
            public final /* synthetic */ wex a;

            {
                this.a = this;
            }

            @Override // defpackage.ajoq
            public final ajom b(ViewGroup viewGroup) {
                int i22 = i4;
                if (i22 == 0) {
                    wex wexVar = this.a;
                    return wexVar.ak.f(wexVar.ae, viewGroup);
                }
                if (i22 == 1) {
                    wex wexVar2 = this.a;
                    return wexVar2.af.a(wexVar2.ae, viewGroup);
                }
                if (i22 == 2) {
                    wex wexVar3 = this.a;
                    return wexVar3.aj.c(wexVar3.ae, viewGroup);
                }
                if (i22 != 3) {
                    wex wexVar4 = this.a;
                    return wexVar4.al.y(wexVar4.ae, viewGroup);
                }
                wex wexVar5 = this.a;
                wfk wfkVar = wexVar5.ag;
                wfa wfaVar = wexVar5.ae;
                Context context = (Context) wfkVar.a.get();
                context.getClass();
                afsy afsyVar = (afsy) wfkVar.b.get();
                afsyVar.getClass();
                wdm wdmVar = (wdm) wfkVar.c.get();
                wdmVar.getClass();
                weh wehVar = (weh) wfkVar.d.get();
                wehVar.getClass();
                Activity activity = (Activity) wfkVar.e.get();
                activity.getClass();
                Handler handler = (Handler) wfkVar.f.get();
                handler.getClass();
                wft wftVar = (wft) wfkVar.g.get();
                ((whl) wfkVar.h.get()).getClass();
                wfaVar.getClass();
                return new wfj(context, afsyVar, wdmVar, wehVar, activity, handler, wftVar, wfaVar, wexVar5);
            }
        });
        final int i5 = 4;
        ajnqVar.f(wfu.class, new ajoq(this) { // from class: wew
            public final /* synthetic */ wex a;

            {
                this.a = this;
            }

            @Override // defpackage.ajoq
            public final ajom b(ViewGroup viewGroup) {
                int i22 = i5;
                if (i22 == 0) {
                    wex wexVar = this.a;
                    return wexVar.ak.f(wexVar.ae, viewGroup);
                }
                if (i22 == 1) {
                    wex wexVar2 = this.a;
                    return wexVar2.af.a(wexVar2.ae, viewGroup);
                }
                if (i22 == 2) {
                    wex wexVar3 = this.a;
                    return wexVar3.aj.c(wexVar3.ae, viewGroup);
                }
                if (i22 != 3) {
                    wex wexVar4 = this.a;
                    return wexVar4.al.y(wexVar4.ae, viewGroup);
                }
                wex wexVar5 = this.a;
                wfk wfkVar = wexVar5.ag;
                wfa wfaVar = wexVar5.ae;
                Context context = (Context) wfkVar.a.get();
                context.getClass();
                afsy afsyVar = (afsy) wfkVar.b.get();
                afsyVar.getClass();
                wdm wdmVar = (wdm) wfkVar.c.get();
                wdmVar.getClass();
                weh wehVar = (weh) wfkVar.d.get();
                wehVar.getClass();
                Activity activity = (Activity) wfkVar.e.get();
                activity.getClass();
                Handler handler = (Handler) wfkVar.f.get();
                handler.getClass();
                wft wftVar = (wft) wfkVar.g.get();
                ((whl) wfkVar.h.get()).getClass();
                wfaVar.getClass();
                return new wfj(context, afsyVar, wdmVar, wehVar, activity, handler, wftVar, wfaVar, wexVar5);
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

    @Override // defpackage.bv, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.ao) {
            this.ae.j(5);
        }
        this.ah.c();
    }
}
