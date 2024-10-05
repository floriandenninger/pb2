package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.InlineAuthCommandOuterClass$InlineAuthCommand;
import com.google.protos.youtube.api.innertube.YpcUpgradeDialogRendererOuterClass;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ydu extends ycr implements yfi {
    public ydl ae;
    public boolean af;
    DialogInterface.OnDismissListener ag;
    public yfl ah;
    public acqz ai;
    public aahd aj;
    public aarr ak;
    private Context al;
    private asfy am;

    @Override // defpackage.yfi
    public final void g() {
        ydl ydlVar = this.ae;
        if (ydlVar != null) {
            ydlVar.c(null);
        }
    }

    @Override // defpackage.yfi
    public final void h() {
        dismiss();
    }

    @Override // defpackage.ycr, defpackage.bv, defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        this.al = context;
    }

    @Override // defpackage.yfi
    public final void mJ(asfw asfwVar) {
        dismiss();
        ydl ydlVar = this.ae;
        if (ydlVar != null) {
            ydlVar.e(asfwVar);
        }
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        if (this.m.containsKey("get_cart_response")) {
            this.am = (asfy) this.ak.a(this.m.getByteArray("get_cart_response"), asfy.a);
        }
        o(0, 0);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        aulq aulqVar;
        InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand;
        awhv awhvVar;
        aulq aulqVar2;
        layoutInflater.getClass();
        if (this.am != null) {
            final int i = 1;
            this.d.setCanceledOnTouchOutside(true);
            final int i2 = 0;
            View inflate = layoutInflater.inflate(R.layout.upgrade_dialog_wrapper, viewGroup, false);
            FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.upgrade_dialog_view);
            asfy asfyVar = this.am;
            if (asfyVar.c == 15) {
                aulqVar = (aulq) asfyVar.d;
            } else {
                aulqVar = aulq.a;
            }
            aone builder = ((awhv) aulqVar.pX(YpcUpgradeDialogRendererOuterClass.ypcUpgradeDialogRenderer)).toBuilder();
            awhv awhvVar2 = (awhv) builder.build();
            aulq aulqVar3 = awhvVar2.f;
            if (aulqVar3 == null) {
                aulqVar3 = aulq.a;
            }
            apxf apxfVar = ((apmg) aulqVar3.pX(ButtonRendererOuterClass.buttonRenderer)).n;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            if (apxfVar.pY(InlineAuthCommandOuterClass$InlineAuthCommand.inlineAuthCommand)) {
                aulq aulqVar4 = awhvVar2.f;
                if (aulqVar4 == null) {
                    aulqVar4 = aulq.a;
                }
                apxf apxfVar2 = ((apmg) aulqVar4.pX(ButtonRendererOuterClass.buttonRenderer)).n;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                inlineAuthCommandOuterClass$InlineAuthCommand = (InlineAuthCommandOuterClass$InlineAuthCommand) apxfVar2.pX(InlineAuthCommandOuterClass$InlineAuthCommand.inlineAuthCommand);
            } else {
                inlineAuthCommandOuterClass$InlineAuthCommand = null;
            }
            HashMap hashMap = new HashMap();
            if (inlineAuthCommandOuterClass$InlineAuthCommand != null) {
                this.af = true;
                aahd aahdVar = this.aj;
                apxf apxfVar3 = inlineAuthCommandOuterClass$InlineAuthCommand.c;
                if (apxfVar3 == null) {
                    apxfVar3 = apxf.a;
                }
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", new ydt(aahdVar, apxfVar3, this.ae));
                aone builder2 = inlineAuthCommandOuterClass$InlineAuthCommand.toBuilder();
                builder2.copyOnWrite();
                InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand2 = (InlineAuthCommandOuterClass$InlineAuthCommand) builder2.instance;
                inlineAuthCommandOuterClass$InlineAuthCommand2.c = null;
                inlineAuthCommandOuterClass$InlineAuthCommand2.b &= -2;
                InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand3 = (InlineAuthCommandOuterClass$InlineAuthCommand) builder2.build();
                awhv awhvVar3 = (awhv) builder.instance;
                if ((awhvVar3.b & 4) == 0) {
                    awhvVar = (awhv) builder.build();
                } else {
                    aulq aulqVar5 = awhvVar3.f;
                    if (aulqVar5 == null) {
                        aulqVar5 = aulq.a;
                    }
                    apmg apmgVar = (apmg) aulqVar5.pX(ButtonRendererOuterClass.buttonRenderer);
                    apxf apxfVar4 = apmgVar.n;
                    if (apxfVar4 == null) {
                        apxfVar4 = apxf.a;
                    }
                    aong aongVar = (aong) apxfVar4.toBuilder();
                    aongVar.e(InlineAuthCommandOuterClass$InlineAuthCommand.inlineAuthCommand, inlineAuthCommandOuterClass$InlineAuthCommand3);
                    apxf apxfVar5 = (apxf) aongVar.build();
                    aong aongVar2 = (aong) apmgVar.toBuilder();
                    aongVar2.copyOnWrite();
                    apmg apmgVar2 = (apmg) aongVar2.instance;
                    apxfVar5.getClass();
                    apmgVar2.n = apxfVar5;
                    apmgVar2.b |= 8192;
                    apmg apmgVar3 = (apmg) aongVar2.build();
                    aulq aulqVar6 = ((awhv) builder.instance).f;
                    if (aulqVar6 == null) {
                        aulqVar6 = aulq.a;
                    }
                    aong aongVar3 = (aong) aulqVar6.toBuilder();
                    aongVar3.e(ButtonRendererOuterClass.buttonRenderer, apmgVar3);
                    builder.copyOnWrite();
                    awhv awhvVar4 = (awhv) builder.instance;
                    aulq aulqVar7 = (aulq) aongVar3.build();
                    aulqVar7.getClass();
                    awhvVar4.f = aulqVar7;
                    awhvVar4.b |= 4;
                    awhvVar = (awhv) builder.build();
                }
                builder = awhvVar.toBuilder();
                aone builder3 = this.am.toBuilder();
                asfy asfyVar2 = this.am;
                if (asfyVar2.c == 15) {
                    aulqVar2 = (aulq) asfyVar2.d;
                } else {
                    aulqVar2 = aulq.a;
                }
                aong aongVar4 = (aong) aulqVar2.toBuilder();
                aongVar4.e(YpcUpgradeDialogRendererOuterClass.ypcUpgradeDialogRenderer, (awhv) builder.build());
                builder3.copyOnWrite();
                asfy asfyVar3 = (asfy) builder3.instance;
                aulq aulqVar8 = (aulq) aongVar4.build();
                aulqVar8.getClass();
                asfyVar3.d = aulqVar8;
                asfyVar3.c = 15;
                this.am = (asfy) builder3.build();
            } else {
                this.af = false;
                hashMap.put("PostTransactionCallback", this);
            }
            yfl yflVar = this.ah;
            Context context = this.al;
            Runnable runnable = new Runnable(this) { // from class: yds
                public final /* synthetic */ ydu a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (i == 0) {
                        ydu yduVar = this.a;
                        if (yduVar.af) {
                            yduVar.dismiss();
                            return;
                        }
                        return;
                    }
                    ydu yduVar2 = this.a;
                    yduVar2.dismiss();
                    ydl ydlVar = yduVar2.ae;
                    if (ydlVar != null) {
                        ydlVar.b();
                    }
                }
            };
            Runnable runnable2 = new Runnable(this) { // from class: yds
                public final /* synthetic */ ydu a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (i2 == 0) {
                        ydu yduVar = this.a;
                        if (yduVar.af) {
                            yduVar.dismiss();
                            return;
                        }
                        return;
                    }
                    ydu yduVar2 = this.a;
                    yduVar2.dismiss();
                    ydl ydlVar = yduVar2.ae;
                    if (ydlVar != null) {
                        ydlVar.b();
                    }
                }
            };
            context.getClass();
            aahd aahdVar2 = (aahd) yflVar.a.get();
            aahdVar2.getClass();
            ajyg ajygVar = (ajyg) yflVar.b.get();
            ajygVar.getClass();
            yfk yfkVar = new yfk(context, aahdVar2, ajygVar, runnable, runnable2, hashMap);
            frameLayout.addView(yfkVar.c);
            ajok ajokVar = new ajok();
            ajokVar.a(this.ai.mM());
            this.ag = yfkVar;
            yfkVar.oB(ajokVar, (awhv) builder.build());
            return inflate;
        }
        dismiss();
        ydl ydlVar = this.ae;
        if (ydlVar != null && this.d == null) {
            ydlVar.c(null);
        }
        return null;
    }

    @Override // defpackage.bv, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ydl ydlVar = this.ae;
        if (ydlVar != null) {
            ydlVar.b();
        }
    }

    @Override // defpackage.bv, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterface.OnDismissListener onDismissListener = this.ag;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
