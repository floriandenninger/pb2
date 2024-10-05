package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SlimVideoMetadataRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class njh extends njq {
    private static final String a;
    private final aahd b;
    private final axpg c;
    private final mvm d;
    private final aaea e;
    private final ViewGroup f;
    private final TextView g;
    private final LinearLayout h;
    private final View i;
    private final ViewGroup m;
    private final bwd n;

    static {
        String valueOf = String.valueOf(System.getProperty("line.separator"));
        String valueOf2 = String.valueOf(System.getProperty("line.separator"));
        a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public njh(Context context, axpg axpgVar, aahd aahdVar, c cVar, aaea aaeaVar, byte[] bArr, byte[] bArr2) {
        this.b = aahdVar;
        this.c = axpgVar;
        this.e = aaeaVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.slim_video_description, (ViewGroup) null);
        this.f = viewGroup;
        this.m = (ViewGroup) viewGroup.findViewById(R.id.slim_channel_metadata_container);
        this.g = (TextView) viewGroup.findViewById(R.id.description);
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.metadata_row_container);
        this.h = linearLayout;
        this.i = viewGroup.findViewById(R.id.bottom_separator);
        Context context2 = (Context) ((axqs) cVar.a).a;
        context2.getClass();
        ajos ajosVar = (ajos) cVar.b.get();
        linearLayout.getClass();
        this.d = new mvm(context2, ajosVar, linearLayout, new mvl(context2, ajosVar));
        bwk bwkVar = new bwk();
        fxy fxyVar = new fxy();
        fxyVar.y(R.id.container);
        bwkVar.f(fxyVar);
        njg njgVar = new njg();
        njgVar.y(R.id.slim_channel_metadata_container);
        njgVar.y(R.id.description);
        njgVar.y(R.id.metadata_row_container);
        njgVar.y(R.id.bottom_separator);
        bwkVar.f(njgVar);
        bvx bvxVar = new bvx();
        bvxVar.y(R.id.slim_channel_metadata_container);
        bvxVar.b = 400L;
        bwkVar.f(bvxVar);
        this.n = bwkVar;
    }

    private final void h() {
        boolean z = this.g.getVisibility() == 0 || this.h.getVisibility() == 0;
        int bn = aobq.bn(((auwa) this.k).f);
        int i = bn != 0 ? bn : 1;
        if (!z) {
            this.i.setVisibility(8);
        } else if (i != 2) {
            this.i.setVisibility(0);
        } else {
            this.i.setVisibility(4);
        }
    }

    private final void i() {
        aqyg aqygVar;
        auwa auwaVar = (auwa) this.k;
        aqyg aqygVar2 = null;
        if ((auwaVar.b & 1) != 0) {
            aqygVar = auwaVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        if ((auwaVar.b & 2) != 0 && (aqygVar2 = auwaVar.d) == null) {
            aqygVar2 = aqyg.a;
        }
        Spanned a2 = aahk.a(aqygVar2, this.b, false);
        if (this.l.f && (!TextUtils.isEmpty(b) || !TextUtils.isEmpty(a2))) {
            acra acraVar = this.j.a;
            aqyg aqygVar3 = auwaVar.d;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
            adyu.cd(aqygVar3, acraVar);
            aswb aswbVar = this.e.a().e;
            if (aswbVar == null) {
                aswbVar = aswb.a;
            }
            if (aswbVar.aw) {
                TextView textView = this.g;
                textView.setTextColor(wbs.Q(textView.getContext(), R.attr.ytTextPrimary));
            } else {
                TextView textView2 = this.g;
                textView2.setTextColor(wbs.Q(textView2.getContext(), R.attr.ytTextSecondary));
            }
            this.g.setVisibility(0);
            this.g.setImportantForAccessibility(1);
            this.g.setText(ajcq.k(a, b, a2));
            TextView textView3 = this.g;
            aswb aswbVar2 = this.e.a().e;
            if (aswbVar2 == null) {
                aswbVar2 = aswb.a;
            }
            textView3.setTextIsSelectable(aswbVar2.U);
            return;
        }
        this.g.setVisibility(8);
        this.g.setImportantForAccessibility(2);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void j() {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.njh.j():void");
    }

    private final void k() {
        this.m.setVisibility(8);
        if (this.l.f) {
            auwa auwaVar = (auwa) this.k;
            if ((auwaVar.b & 64) != 0) {
                aulq aulqVar = auwaVar.g;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                if (aulqVar.pY(SlimVideoMetadataRendererOuterClass.slimChannelMetadataRenderer)) {
                    this.m.setVisibility(0);
                    if (this.m.getChildCount() == 0) {
                        auvk auvkVar = (auvk) aulqVar.pX(SlimVideoMetadataRendererOuterClass.slimChannelMetadataRenderer);
                        njb njbVar = (njb) this.c.get();
                        this.m.addView(njbVar.a);
                        njbVar.oB(this.j, auvkVar);
                    }
                }
            }
        }
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.f;
    }

    @Override // defpackage.njq
    protected final void d() {
        k();
        i();
        j();
        h();
    }

    @Override // defpackage.njq
    protected final void e() {
        bwh.c(this.f);
        mvm mvmVar = this.d;
        mvmVar.e = 0;
        mvmVar.d = null;
        mvmVar.c.e(mvmVar.b);
        mvmVar.d(false);
        if (this.m.getChildCount() > 0) {
            ((njb) this.c.get()).e();
            this.m.removeAllViews();
        }
    }

    @Override // defpackage.njq, defpackage.ohu
    public final void oK() {
        bwh.b(this.f, this.n);
        k();
        i();
        j();
        h();
    }
}
