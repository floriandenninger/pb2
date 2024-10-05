package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fsk extends ajpc implements fyv {
    private aqlc a;
    private final akbu b;
    private final View c;
    private final Button d;
    private final ajyd e;
    private final View f;
    private final YouTubeTextView g;
    private final ajyd h;
    private final fso i;
    private final fyx j;
    private final fsl k;

    public fsk(Context context, aahd aahdVar, aoae aoaeVar, ajjz ajjzVar, akbu akbuVar, fyx fyxVar, byte[] bArr) {
        this.b = akbuVar;
        this.j = fyxVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.donation_companion, (ViewGroup) null, false);
        this.c = inflate;
        this.k = new fsl((ViewGroup) inflate.findViewById(R.id.campaign_group), true, ajjzVar);
        Button button = (Button) inflate.findViewById(R.id.donation_button);
        this.d = button;
        whu.E(button, button.getBackground());
        this.e = new ajyd(aahdVar, aoaeVar, button, null);
        this.i = new fso(context, (ViewGroup) inflate.findViewById(R.id.progress_group), aahdVar);
        this.f = inflate.findViewById(R.id.divider);
        YouTubeTextView youTubeTextView = (YouTubeTextView) inflate.findViewById(R.id.expand_button);
        this.g = youTubeTextView;
        whu.E(youTubeTextView, youTubeTextView.getBackground());
        this.h = new ajyd(aahdVar, aoaeVar, youTubeTextView, null);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    public final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        apmg apmgVar;
        apmg apmgVar2;
        aqyg aqygVar;
        aqyg aqygVar2;
        aqlc aqlcVar = (aqlc) obj;
        acra acraVar = ajokVar.a;
        this.a = aqlcVar;
        this.k.a(aqlcVar);
        arej arejVar = null;
        if ((aqlcVar.b & 256) != 0) {
            apmh apmhVar = aqlcVar.f;
            if (apmhVar == null) {
                apmhVar = apmh.a;
            }
            apmgVar = apmhVar.c;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
        } else {
            apmgVar = null;
        }
        this.e.b(apmgVar, acraVar);
        if (apmgVar != null) {
            Button button = this.d;
            if ((apmgVar.b & 256) != 0) {
                aqygVar2 = apmgVar.i;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
            } else {
                aqygVar2 = null;
            }
            whu.G(button, ajcq.b(aqygVar2));
        }
        this.i.a(aqlcVar);
        if ((aqlcVar.b & 16384) != 0) {
            apmh apmhVar2 = aqlcVar.l;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            apmgVar2 = apmhVar2.c;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
        } else {
            apmgVar2 = null;
        }
        this.h.b(apmgVar2, acraVar);
        if (apmgVar2 != null) {
            YouTubeTextView youTubeTextView = this.g;
            if ((apmgVar2.b & 256) != 0) {
                aqygVar = apmgVar2.i;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            whu.G(youTubeTextView, ajcq.b(aqygVar));
            this.f.setVisibility(0);
            if ((apmgVar2.b & 4096) != 0) {
                arel arelVar = apmgVar2.m;
                if (arelVar == null) {
                    arelVar = arel.a;
                }
                if (arelVar.b == 102716411) {
                    arejVar = (arej) arelVar.c;
                } else {
                    arejVar = arej.a;
                }
            }
            if (arejVar != null) {
                this.b.b(arejVar, this.g, apmgVar2, acraVar);
            }
        } else {
            this.f.setVisibility(8);
        }
        this.j.c(aqlcVar.y, this);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqlc) obj).z.I();
    }

    @Override // defpackage.fyv
    public final void f(String str, aqlc aqlcVar) {
        aqlc aqlcVar2 = this.a;
        if (aqlcVar2 == null || !aqlcVar2.y.equals(str)) {
            return;
        }
        this.i.a(aqlcVar);
    }
}
