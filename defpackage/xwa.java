package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xwa extends ajpc {
    private final ajjz a;
    private final ajoi b;
    private final View c;
    private final TextView d;
    private final FixedAspectRatioFrameLayout e;
    private final ImageView f;
    private final View g;

    public xwa(Context context, ajjz ajjzVar, aahd aahdVar) {
        context.getClass();
        ajjzVar.getClass();
        aahdVar.getClass();
        this.a = ajjzVar;
        View inflate = View.inflate(context, R.layout.comment_video_thumbnail_header, null);
        this.c = inflate;
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.e = (FixedAspectRatioFrameLayout) inflate.findViewById(R.id.comment_video_thumbnail_layout);
        this.f = (ImageView) inflate.findViewById(R.id.comment_video_thumbnail);
        this.g = inflate.findViewById(R.id.divider);
        this.b = new ajoi(aahdVar, inflate);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.b.c();
    }

    @Override // defpackage.ajpc
    public final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        apxf apxfVar;
        aqae aqaeVar = (aqae) obj;
        ajoi ajoiVar = this.b;
        acra acraVar = ajokVar.a;
        aqyg aqygVar = null;
        if ((aqaeVar.b & 4) != 0) {
            apxfVar = aqaeVar.e;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        ajoiVar.a(acraVar, apxfVar, ajokVar.e());
        TextView textView = this.d;
        if ((aqaeVar.b & 1) != 0 && (aqygVar = aqaeVar.c) == null) {
            aqygVar = aqyg.a;
        }
        whu.G(textView, ajcq.b(aqygVar));
        avgg avggVar = aqaeVar.d;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        float A = ahbw.A(avggVar);
        if (A > 0.0f) {
            this.e.a = A;
        }
        avgg avggVar2 = aqaeVar.d;
        if (avggVar2 == null) {
            avggVar2 = avgg.a;
        }
        boolean L = ahbw.L(avggVar2);
        whu.I(this.e, L);
        ajjz ajjzVar = this.a;
        ImageView imageView = this.f;
        avgg avggVar3 = aqaeVar.d;
        if (avggVar3 == null) {
            avggVar3 = avgg.a;
        }
        ajjzVar.h(imageView, avggVar3);
        whu.I(this.f, L);
        this.g.setVisibility(true != aqaeVar.f ? 8 : 0);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqae) obj).g.I();
    }
}
