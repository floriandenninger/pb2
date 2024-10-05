package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abkq extends abkb implements abqe {
    public Executor ae;
    public zaw af;
    public abht ag;
    public ajen ah;
    public ViewGroup ai;
    public View aj;
    public View ak;
    public TextView al;
    public byte[] am;
    private ImageView an;
    public aazg b;
    public ajvb c;
    public abjr d;
    public abjt e;

    @Override // defpackage.ce
    public final void S(Bundle bundle) {
        super.S(bundle);
        View view = this.O;
        if (this.d.c) {
            view.setBackgroundColor(0);
        }
        this.ai = (ViewGroup) view.findViewById(R.id.purchase_flow_container);
        this.aj = view.findViewById(R.id.loading_container);
        this.ak = view.findViewById(R.id.error_container);
        this.an = (ImageView) view.findViewById(R.id.error_image);
        this.al = (TextView) view.findViewById(R.id.error_message);
        view.findViewById(R.id.retry).setOnClickListener(new abkp(this));
        Context qR = qR();
        this.an.setImageDrawable(aii.a(qR, this.e.a(0)));
        this.al.setTextColor(aih.d(qR, this.e.a(1)));
        q();
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        ViewGroup viewGroup = this.ai;
        if (viewGroup == null) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.ai.getChildAt(i);
            if (childAt != null) {
                ajom q = ahbw.q(childAt);
                if (q instanceof abqc) {
                    ((abqc) q).k();
                }
            }
        }
    }

    @Override // defpackage.abqe
    public final void aF() {
        Activity activity = this.a;
        if (activity == null) {
            return;
        }
        activity.setRequestedOrientation(1);
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        this.c.a(aspz.class);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.live_chat_purchase_flow, viewGroup, false);
    }

    @Override // defpackage.abqe
    public final void p() {
        o();
    }

    public final void q() {
        this.aj.setVisibility(0);
        this.ai.setVisibility(8);
        this.ak.setVisibility(8);
        Bundle bundle = this.m;
        apxf c = aahg.c(bundle.getByteArray("navigation_endpoint"));
        this.am = c.c.I();
        aazg aazgVar = this.b;
        aayv aayvVar = new aayv(aazgVar.f, aazgVar.a.c(), null, null, null);
        aayvVar.a = ((LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint) c.pX(LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.liveChatPurchaseMessageEndpoint)).b;
        if ((c.b & 1) == 0) {
            aayvVar.k();
        } else {
            aayvVar.l(c.c);
        }
        byte[] byteArray = bundle.getByteArray("ARG_CHAT_MESSAGE");
        asrh asrhVar = null;
        if (byteArray != null) {
            try {
                asrhVar = (asrh) aonm.parseFrom(asrh.a, byteArray, aomw.b());
            } catch (aoob unused) {
            }
        }
        if (asrhVar != null) {
            aayvVar.b = asrhVar;
        }
        aazg aazgVar2 = this.b;
        ynm.k(aazgVar2.k.b(aayvVar, angq.a), this.ae, new ynk() { // from class: abkn
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                abkq abkqVar = abkq.this;
                abkqVar.aj.setVisibility(8);
                abkqVar.ak.setVisibility(0);
                abkqVar.al.setText(abkqVar.af.b(th));
            }
        }, new ynl() { // from class: abko
            /* JADX WARN: Type inference failed for: r5v2, types: [ajos, java.lang.Object] */
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                aruh aruhVar;
                aruh aruhVar2;
                aruh aruhVar3;
                apxf apxfVar;
                abkq abkqVar = abkq.this;
                arug arugVar = (arug) obj;
                abkqVar.aj.setVisibility(8);
                abkqVar.ai.removeAllViews();
                ((acqq) abkqVar.ag.p).F(new acqx(arugVar.e.I()), new acqx(abkqVar.am));
                abkqVar.ag.p.u(new acqx(arugVar.e.I()), null);
                int i = arugVar.b;
                if (i != 6) {
                    if (i == 3) {
                        aruhVar = (aruh) arugVar.c;
                    } else {
                        aruhVar = aruh.a;
                    }
                    if ((aruhVar.b & 1) == 0) {
                        abkqVar.ak.setVisibility(0);
                        return;
                    }
                    if (arugVar.b == 3) {
                        aruhVar2 = (aruh) arugVar.c;
                    } else {
                        aruhVar2 = aruh.a;
                    }
                    aspz aspzVar = aruhVar2.c;
                    if (aspzVar == null) {
                        aspzVar = aspz.a;
                    }
                    ajom r = ahbw.r(abkqVar.c.get(), aspzVar, abkqVar.ai);
                    if (r != null) {
                        ajok ajokVar = new ajok();
                        ajokVar.f("listenerKey", abkqVar);
                        View a = r.a();
                        abkqVar.ai.addView(a);
                        abkqVar.ai.setVisibility(0);
                        if (arugVar.b == 3) {
                            aruhVar3 = (aruh) arugVar.c;
                        } else {
                            aruhVar3 = aruh.a;
                        }
                        aspz aspzVar2 = aruhVar3.c;
                        if (aspzVar2 == null) {
                            aspzVar2 = aspz.a;
                        }
                        r.oB(ajokVar, aspzVar2);
                        a.requestFocus();
                        return;
                    }
                    abkqVar.aj.setVisibility(8);
                    abkqVar.ak.setVisibility(0);
                    return;
                }
                if (((apxf) arugVar.c).pY(aqrk.a)) {
                    abkqVar.o();
                    try {
                        amrz k = amrz.k("com.google.android.libraries.youtube.logging.interaction_logger", abkqVar.ag.p);
                        ajen ajenVar = abkqVar.ah;
                        if (arugVar.b == 6) {
                            apxfVar = (apxf) arugVar.c;
                        } else {
                            apxfVar = apxf.a;
                        }
                        ajenVar.kE(apxfVar, k);
                        return;
                    } catch (aahm unused2) {
                        return;
                    }
                }
                Log.e("LiveChatPurchaseFlow", "No usable Command provided!");
                abkqVar.aj.setVisibility(8);
                abkqVar.ak.setVisibility(0);
            }
        });
    }

    @Override // defpackage.abqe
    public final void r() {
        o();
    }

    @Override // defpackage.abqe
    public final void s() {
        ce ceVar = this.C;
        if (ceVar != null) {
            dd mN = ceVar.mN();
            if (mN.a() > 0) {
                mN.K();
            } else {
                o();
            }
        }
    }
}
