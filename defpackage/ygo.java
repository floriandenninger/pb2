package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ygo extends yfs implements ajyc, yaw {
    public ajjz ae;
    public aahd af;
    public acra ag;
    public ajyg ah;
    public yay ai;
    public ypa aj;
    private ImageView ak;
    private LinearLayout al;
    private TextView am;
    private TextView an;
    private TextView ao;
    private TextView ap;
    private avmw aq;

    private final void aH(TextView textView, apmh apmhVar, boolean z, Map map) {
        ajyf a = this.ah.a(textView);
        apmg apmgVar = null;
        if (apmhVar != null && (apmhVar.b & 1) != 0 && (apmgVar = apmhVar.c) == null) {
            apmgVar = apmg.a;
        }
        a.a(apmgVar, this.ag, map);
        if (z) {
            a.c = this;
        }
    }

    @Override // defpackage.yaw
    public final void d(boolean z) {
        if (z) {
            kv();
            this.aj.d(new ygd());
        }
    }

    @Override // defpackage.yax
    public final boolean g() {
        return false;
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        o(0, R.style.UnlimitedFamily);
        this.ai.c(this);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        super.mg(layoutInflater, viewGroup, bundle);
        if (bundle == null) {
            bundle = this.m;
        }
        try {
            this.aq = (avmw) aonm.parseFrom(avmw.a, bundle.getByteArray("UnlimitedFamilyProfileInterstitialRenderer"), aomw.b());
        } catch (aoob unused) {
        }
        aqyg aqygVar4 = null;
        if (this.aq == null) {
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.family_pre_purchase_fragment_view, viewGroup, false);
        this.ak = (ImageView) inflate.findViewById(R.id.main_thumbnail);
        this.al = (LinearLayout) inflate.findViewById(R.id.secondary_thumbnails);
        this.am = (TextView) inflate.findViewById(R.id.member_info);
        this.an = (TextView) inflate.findViewById(R.id.member_title);
        HashMap hashMap = new HashMap();
        hashMap.put("accountName", "myaccount");
        TextView textView = (TextView) inflate.findViewById(R.id.manage_button);
        apmh apmhVar = this.aq.g;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        aH(textView, apmhVar, false, hashMap);
        this.ao = (TextView) inflate.findViewById(R.id.additional_info_header);
        this.ap = (TextView) inflate.findViewById(R.id.additional_info);
        TextView textView2 = (TextView) inflate.findViewById(R.id.action_button);
        apmh apmhVar2 = this.aq.k;
        if (apmhVar2 == null) {
            apmhVar2 = apmh.a;
        }
        aH(textView2, apmhVar2, true, null);
        TextView textView3 = (TextView) inflate.findViewById(R.id.dismiss_button);
        apmh apmhVar3 = this.aq.j;
        if (apmhVar3 == null) {
            apmhVar3 = apmh.a;
        }
        aH(textView3, apmhVar3, true, null);
        ajjz ajjzVar = this.ae;
        ImageView imageView = this.ak;
        avgg avggVar = this.aq.c;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ajjzVar.h(imageView, avggVar);
        for (avgg avggVar2 : this.aq.d) {
            ImageView imageView2 = (ImageView) layoutInflater.inflate(R.layout.family_pre_purchase_fragment_secondary_thumbnail, (ViewGroup) this.al, false);
            this.ae.h(imageView2, avggVar2);
            this.al.addView(imageView2);
        }
        int childCount = this.al.getChildCount();
        this.al.setVisibility(childCount > 0 ? 0 : 8);
        int dimensionPixelSize = qX().getDimensionPixelSize(childCount > 0 ? R.dimen.family_profile_main_thumbnail_size_small : R.dimen.family_profile_main_thumbnail_size_big);
        this.ak.getLayoutParams().height = dimensionPixelSize;
        this.ak.getLayoutParams().width = dimensionPixelSize;
        TextView textView4 = this.am;
        avmw avmwVar = this.aq;
        if ((avmwVar.b & 2) != 0) {
            aqygVar = avmwVar.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView4, ajcq.b(aqygVar));
        TextView textView5 = this.an;
        avmw avmwVar2 = this.aq;
        if ((avmwVar2.b & 4) != 0) {
            aqygVar2 = avmwVar2.f;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        whu.G(textView5, ajcq.b(aqygVar2));
        TextView textView6 = this.ao;
        avmw avmwVar3 = this.aq;
        if ((avmwVar3.b & 16) != 0) {
            aqygVar3 = avmwVar3.h;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        whu.G(textView6, ajcq.b(aqygVar3));
        TextView textView7 = this.ap;
        avmw avmwVar4 = this.aq;
        if ((avmwVar4.b & 32) != 0 && (aqygVar4 = avmwVar4.i) == null) {
            aqygVar4 = aqyg.a;
        }
        whu.G(textView7, aahk.a(aqygVar4, this.af, false));
        return inflate;
    }

    @Override // defpackage.ajyc
    public final void oC(aong aongVar) {
        dismiss();
    }

    @Override // defpackage.bv, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.ai.d(this);
    }
}
