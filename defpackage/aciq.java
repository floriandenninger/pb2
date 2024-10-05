package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.Toast;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aciq extends achh implements View.OnClickListener, acfp {
    public Handler a;
    public ajdw ae;
    public aahv af;
    public afsy ag;
    public acfq ah;
    public acpz ai;
    public acra aj;
    public final Runnable ak = new Runnable() { // from class: acii
        @Override // java.lang.Runnable
        public final void run() {
            aciq.this.r();
        }
    };
    public aplq al;
    public ImageButton am;
    public CharSequence an;
    public aakv ao;
    public String ap;
    private ImageButton aq;
    private FrameLayout ar;
    private String as;
    private String at;
    public acfh b;
    public abya c;
    public aahd d;
    public acip e;

    public final void aF(View view) {
        aplq aplqVar = this.al;
        int i = R.drawable.ic_switch_camera_white_24dp;
        int i2 = R.drawable.quantum_ic_close_white_24;
        if (aplqVar != null) {
            aulq aulqVar = aplqVar.d;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
                aulq aulqVar2 = this.al.d;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                apmg apmgVar = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
                arfs arfsVar = apmgVar.g;
                if (arfsVar == null) {
                    arfsVar = arfs.a;
                }
                if ((arfsVar.b & 1) != 0) {
                    acfh acfhVar = this.b;
                    arfs arfsVar2 = apmgVar.g;
                    if (arfsVar2 == null) {
                        arfsVar2 = arfs.a;
                    }
                    arfr b = arfr.b(arfsVar2.c);
                    if (b == null) {
                        b = arfr.UNKNOWN;
                    }
                    int a = acfhVar.a(b);
                    if (a != 0) {
                        i2 = a;
                    }
                }
            }
            aulq aulqVar3 = this.al.e;
            if (aulqVar3 == null) {
                aulqVar3 = aulq.a;
            }
            if (aulqVar3.pY(ButtonRendererOuterClass.buttonRenderer)) {
                this.am = (ImageButton) view.findViewById(R.id.switch_camera_button);
                aulq aulqVar4 = this.al.e;
                if (aulqVar4 == null) {
                    aulqVar4 = aulq.a;
                }
                apmg apmgVar2 = (apmg) aulqVar4.pX(ButtonRendererOuterClass.buttonRenderer);
                arfs arfsVar3 = apmgVar2.g;
                if (arfsVar3 == null) {
                    arfsVar3 = arfs.a;
                }
                if ((arfsVar3.b & 1) != 0) {
                    acfh acfhVar2 = this.b;
                    arfs arfsVar4 = apmgVar2.g;
                    if (arfsVar4 == null) {
                        arfsVar4 = arfs.a;
                    }
                    arfr b2 = arfr.b(arfsVar4.c);
                    if (b2 == null) {
                        b2 = arfr.UNKNOWN;
                    }
                    int a2 = acfhVar2.a(b2);
                    if (a2 != 0) {
                        i = a2;
                    }
                }
            }
            aulq aulqVar5 = this.al.c;
            if (aulqVar5 == null) {
                aulqVar5 = aulq.a;
            }
            if (aulqVar5.pY(ElementRendererOuterClass.elementRenderer)) {
                aulq aulqVar6 = this.al.c;
                if (aulqVar6 == null) {
                    aulqVar6 = aulq.a;
                }
                ajds a3 = ajds.a((aqrf) aulqVar6.pX(ElementRendererOuterClass.elementRenderer));
                this.ae.oB(new ajok(), a3);
                this.ar.addView(this.ae.a());
            }
        }
        this.aq.setImageDrawable(aii.a(qR(), i2));
        this.am.setImageDrawable(aii.a(qR(), i));
    }

    public final void aG(int i) {
        this.ai.c(new acpx(i - 1, 14), aqxl.FLOW_TYPE_LIVE_STREAMING, this.at);
    }

    @Override // defpackage.ce
    public final void mD() {
        super.mD();
        this.a.removeCallbacks(this.ak);
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        Bundle bundle2 = this.m;
        if (bundle2.containsKey("ARG_SERIALIZED_PARAMS")) {
            String string = bundle2.getString("ARG_SERIALIZED_PARAMS");
            this.as = string;
            p(string, 5);
        }
        this.ao = this.af.a(this.ag.c());
        this.ah.a = this;
        this.at = UUID.randomUUID().toString();
        C().setRequestedOrientation(1);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.lc_participant_pre_join_fragment, viewGroup, false);
        this.aq = (ImageButton) inflate.findViewById(R.id.close_button);
        this.am = (ImageButton) inflate.findViewById(R.id.switch_camera_button);
        this.ar = (FrameLayout) inflate.findViewById(R.id.pre_join_panel);
        inflate.setOnClickListener(this);
        this.aq.setOnClickListener(this);
        this.am.setOnClickListener(this);
        if (this.al != null) {
            aF(inflate);
        }
        aG(20);
        return inflate;
    }

    public final void o(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (i <= 0) {
            Toast.makeText(qR(), R.string.lc_add_participant_failed, 1).show();
        }
        this.c.g(str, new acio(this, str, i));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.O == null) {
            return;
        }
        if (view == this.aq) {
            q();
            return;
        }
        ImageButton imageButton = this.am;
        if (view == imageButton) {
            this.e.U(imageButton);
        }
    }

    public final void p(String str, int i) {
        if (i <= 0) {
            Toast.makeText(C(), R.string.lc_join_stream_failed, 1).show();
        } else {
            this.c.b(str, new acil(this, str, i));
        }
    }

    public final void q() {
        this.e.T();
    }

    public final void r() {
        if (TextUtils.isEmpty(this.as)) {
            return;
        }
        this.c.b(this.as, new acim(this));
    }

    public final void s(aqdt aqdtVar) {
        ajdf.c(C(), aqdtVar, this.d, this.aj, new acij(this), null);
    }
}
