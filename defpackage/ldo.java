package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ldo extends ldd {
    private final YouTubeTextView b;
    private final ajop c;

    public ldo(Context context, gma gmaVar, aahd aahdVar) {
        super(context, aahdVar);
        this.c = gmaVar;
        YouTubeTextView youTubeTextView = (YouTubeTextView) View.inflate(context, R.layout.did_you_mean_item, null);
        this.b = youTubeTextView;
        gmaVar.c(youTubeTextView);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.c).b;
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aqgh aqghVar = (aqgh) obj;
        aqyg aqygVar2 = null;
        ajokVar.a.u(new acqx(aqghVar.f), null);
        YouTubeTextView youTubeTextView = this.b;
        if ((aqghVar.b & 1) != 0) {
            aqygVar = aqghVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        if ((aqghVar.b & 2) != 0 && (aqygVar2 = aqghVar.d) == null) {
            aqygVar2 = aqyg.a;
        }
        Spanned b2 = ajcq.b(aqygVar2);
        apxf apxfVar = aqghVar.e;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        youTubeTextView.setText(d(b, b2, apxfVar, ajokVar.a.k()));
        this.c.e(ajokVar);
    }
}
