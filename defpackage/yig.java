package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yig implements ajom {
    private final aahd a;
    private final View b;
    private final YouTubeTextView c;
    private final YouTubeTextView d;
    private final ajyf e;
    private final YouTubeTextView f;
    private final ajyf g;

    public yig(Context context, aahd aahdVar, ajyg ajygVar, ViewGroup viewGroup) {
        this.a = aahdVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.sponsorships_alert_layout, viewGroup, false);
        this.b = inflate;
        this.c = (YouTubeTextView) inflate.findViewById(R.id.alert_message_view);
        YouTubeTextView youTubeTextView = (YouTubeTextView) inflate.findViewById(R.id.action_button);
        this.d = youTubeTextView;
        this.e = ajygVar.a(youTubeTextView);
        YouTubeTextView youTubeTextView2 = (YouTubeTextView) inflate.findViewById(R.id.secondary_action_button);
        this.f = youTubeTextView2;
        this.g = ajygVar.a(youTubeTextView2);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        apmg apmgVar;
        auwt auwtVar = (auwt) obj;
        acra acraVar = ajokVar.a;
        YouTubeTextView youTubeTextView = this.c;
        apmg apmgVar2 = null;
        if ((auwtVar.b & 1) != 0) {
            aqygVar = auwtVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(youTubeTextView, aahk.a(aqygVar, this.a, false));
        ajyf ajyfVar = this.e;
        aulq aulqVar = auwtVar.d;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
            aulq aulqVar2 = auwtVar.d;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            apmgVar = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apmgVar = null;
        }
        ajyfVar.b(apmgVar, acraVar);
        ajyf ajyfVar2 = this.g;
        aulq aulqVar3 = auwtVar.e;
        if (aulqVar3 == null) {
            aulqVar3 = aulq.a;
        }
        if (aulqVar3.pY(ButtonRendererOuterClass.buttonRenderer)) {
            aulq aulqVar4 = auwtVar.e;
            if (aulqVar4 == null) {
                aulqVar4 = aulq.a;
            }
            apmgVar2 = (apmg) aulqVar4.pX(ButtonRendererOuterClass.buttonRenderer);
        }
        ajyfVar2.b(apmgVar2, acraVar);
    }
}
