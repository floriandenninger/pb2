package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ygn extends yfr implements ajde, ajyc, yav {
    public ajyg ae;
    public ajjz af;
    public aahd ag;
    public acra ah;
    public yay ai;
    public ypa aj;
    private apmg ak;
    private avmv al;

    private final void aH(TextView textView, apmh apmhVar, Map map) {
        ajyf a = this.ae.a(textView);
        apmg apmgVar = null;
        if (apmhVar != null && (apmhVar.b & 1) != 0 && (apmgVar = apmhVar.c) == null) {
            apmgVar = apmg.a;
        }
        a.a(apmgVar, this.ah, map);
        a.c = this;
    }

    @Override // defpackage.ajde
    public final void a() {
    }

    @Override // defpackage.ajde
    public final void b() {
        dismiss();
    }

    @Override // defpackage.ajde
    public final void c(boolean z) {
    }

    @Override // defpackage.yav
    public final void d() {
        kv();
    }

    @Override // defpackage.yav
    public final void e() {
        kv();
    }

    @Override // defpackage.yax
    public final boolean g() {
        return true;
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        o(0, R.style.UnlimitedFamily);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        apmg apmgVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        super.mg(layoutInflater, viewGroup, bundle);
        if (bundle == null) {
            bundle = this.m;
        }
        try {
            this.al = (avmv) aonm.parseFrom(avmv.a, bundle.getByteArray("UnlimitedFamilyMessageInterstitialRenderer"), aomw.b());
        } catch (aoob unused) {
        }
        aqyg aqygVar3 = null;
        if (this.al == null) {
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.family_post_purchase_fragment_view, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.thumb_image_view);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.content);
        TextView textView3 = (TextView) inflate.findViewById(R.id.footer);
        TextView textView4 = (TextView) inflate.findViewById(R.id.action);
        TextView textView5 = (TextView) inflate.findViewById(R.id.dismiss);
        HashMap hashMap = new HashMap();
        hashMap.put("confirmDialogControllerListener", this);
        apmh apmhVar = this.al.h;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        aH(textView4, apmhVar, null);
        apmh apmhVar2 = this.al.g;
        if (apmhVar2 == null) {
            apmhVar2 = apmh.a;
        }
        aH(textView5, apmhVar2, hashMap);
        apmh apmhVar3 = this.al.h;
        if (apmhVar3 == null) {
            apmhVar3 = apmh.a;
        }
        if ((apmhVar3.b & 1) != 0) {
            apmh apmhVar4 = this.al.h;
            if (apmhVar4 == null) {
                apmhVar4 = apmh.a;
            }
            apmgVar = apmhVar4.c;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
        } else {
            apmgVar = null;
        }
        this.ak = apmgVar;
        avmv avmvVar = this.al;
        if ((avmvVar.b & 2) != 0) {
            aqygVar = avmvVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.b(aqygVar));
        avmv avmvVar2 = this.al;
        if ((avmvVar2.b & 4) != 0) {
            aqygVar2 = avmvVar2.e;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        whu.G(textView2, aahk.a(aqygVar2, this.ag, false));
        avmv avmvVar3 = this.al;
        if ((avmvVar3.b & 8) != 0 && (aqygVar3 = avmvVar3.f) == null) {
            aqygVar3 = aqyg.a;
        }
        whu.G(textView3, aahk.a(aqygVar3, this.ag, false));
        ajjz ajjzVar = this.af;
        avgg avggVar = this.al.c;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ajjzVar.h(imageView, avggVar);
        this.ai.a(this);
        return inflate;
    }

    @Override // defpackage.ajyc
    public final void oC(aong aongVar) {
        if (aongVar == null || !((apmg) aongVar.build()).equals(this.ak)) {
            return;
        }
        apxf apxfVar = this.ak.o;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        if (apxfVar.pY(UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.unlimitedCreateFamilyEndpoint)) {
            return;
        }
        dismiss();
    }

    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        Dialog oq = super.oq(bundle);
        oq.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: ygm
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                ygn ygnVar = ygn.this;
                if (i != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                ygnVar.aj.d(new ygd());
                return false;
            }
        });
        return oq;
    }
}
