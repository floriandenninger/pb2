package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.FullscreenEngagementOverlayRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class krr {
    public static final mvo a;
    public final acra b;
    public final ViewGroup c;
    public final View d;
    public final muv e;
    public krt f;
    public mvf g;
    public mvf h;
    public muu i;
    public final oiy j;
    public final ogx k;
    private final mvg l;

    static {
        mvn mvnVar = new mvn();
        Integer valueOf = Integer.valueOf(R.attr.ytOverlayTextPrimary);
        mvnVar.a = valueOf;
        mvnVar.b = valueOf;
        mvnVar.c = valueOf;
        mvnVar.d = valueOf;
        Integer num = mvnVar.a;
        if (num == null || mvnVar.b == null || mvnVar.c == null || mvnVar.d == null) {
            StringBuilder sb = new StringBuilder();
            if (mvnVar.a == null) {
                sb.append(" defaultIconColorRes");
            }
            if (mvnVar.b == null) {
                sb.append(" selectedIconColorRes");
            }
            if (mvnVar.c == null) {
                sb.append(" defaultTextColorRes");
            }
            if (mvnVar.d == null) {
                sb.append(" selectedTextColorRes");
            }
            String valueOf2 = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf2);
            throw new IllegalStateException(sb2.toString());
        }
        a = new mvo(num.intValue(), mvnVar.b.intValue(), mvnVar.c.intValue(), mvnVar.d.intValue());
    }

    public krr(acra acraVar, ogx ogxVar, oiy oiyVar, mvg mvgVar, muv muvVar, ViewGroup viewGroup, View view, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.b = acraVar;
        this.c = viewGroup;
        this.d = view;
        this.k = ogxVar;
        this.j = oiyVar;
        this.l = mvgVar;
        this.e = muvVar;
    }

    public static aqzj b(aqzn aqznVar) {
        if (aqznVar == null) {
            return null;
        }
        aulq aulqVar = aqznVar.f;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (!aulqVar.pY(FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementActionBarRenderer)) {
            return null;
        }
        aulq aulqVar2 = aqznVar.f;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        return (aqzj) aulqVar2.pX(FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementActionBarRenderer);
    }

    public final mvf a() {
        return this.l.b(this.c, R.layout.fullscreen_engagement_action_bar_button, a);
    }
}
