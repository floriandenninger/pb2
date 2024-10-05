package defpackage;

import com.google.android.libraries.youtube.ads.model.SurveyAd;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xje implements xix {
    final /* synthetic */ xji a;

    public xje(xji xjiVar) {
        this.a = xjiVar;
    }

    @Override // defpackage.xix
    public final void a() {
        xji xjiVar = this.a;
        xji.i(xjiVar.g);
        SurveyAd surveyAd = xjiVar.e;
        if (surveyAd == null) {
            return;
        }
        xjiVar.a.d(surveyAd.c.f, xjiVar.a());
        xjiVar.h();
    }

    @Override // defpackage.xix
    public final void b(List list) {
        xji xjiVar = this.a;
        xji.i(xjiVar.g);
        whl.J(xjiVar.a, list, xjiVar.a());
        xjiVar.h();
    }
}
