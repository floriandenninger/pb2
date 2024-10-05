package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class len extends ldd {
    private final View b;
    private final YouTubeTextView c;
    private final YouTubeTextView d;
    private final ajop e;

    public len(Context context, gma gmaVar, aahd aahdVar) {
        super(context, aahdVar);
        this.e = gmaVar;
        View inflate = View.inflate(context, R.layout.showing_results_for_item, null);
        this.b = inflate;
        this.c = (YouTubeTextView) inflate.findViewById(R.id.showing_results_for);
        this.d = (YouTubeTextView) inflate.findViewById(R.id.search_instead_for);
        gmaVar.c(inflate);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.e).b;
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        aqgm aqgmVar = (aqgm) obj;
        aqyg aqygVar4 = null;
        ajokVar.a.u(new acqx(aqgmVar.i), null);
        YouTubeTextView youTubeTextView = this.c;
        if ((aqgmVar.b & 1) != 0) {
            aqygVar = aqgmVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        if ((aqgmVar.b & 2) != 0) {
            aqygVar2 = aqgmVar.d;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        Spanned b2 = ajcq.b(aqygVar2);
        apxf apxfVar = aqgmVar.e;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        youTubeTextView.setText(d(b, b2, apxfVar, ajokVar.a.k()));
        YouTubeTextView youTubeTextView2 = this.d;
        if ((aqgmVar.b & 8) != 0) {
            aqygVar3 = aqgmVar.f;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        Spanned b3 = ajcq.b(aqygVar3);
        if ((aqgmVar.b & 16) != 0 && (aqygVar4 = aqgmVar.g) == null) {
            aqygVar4 = aqyg.a;
        }
        Spanned b4 = ajcq.b(aqygVar4);
        apxf apxfVar2 = aqgmVar.h;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        youTubeTextView2.setText(d(b3, b4, apxfVar2, ajokVar.a.k()));
        this.e.e(ajokVar);
    }
}
