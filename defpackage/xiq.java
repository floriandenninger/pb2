package defpackage;

import com.google.android.libraries.youtube.ads.model.SurveyAd;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xiq implements xix {
    final /* synthetic */ xiu a;

    public xiq(xiu xiuVar) {
        this.a = xiuVar;
    }

    @Override // defpackage.xix
    public final void a() {
        xiu xiuVar = this.a;
        xiu.i(xiuVar.f);
        SurveyAd surveyAd = xiuVar.d;
        if (surveyAd == null) {
            return;
        }
        xiuVar.a.d(surveyAd.c.f, xiuVar.a());
        xiuVar.h();
    }

    @Override // defpackage.xix
    public final void b(List list) {
        xiu xiuVar = this.a;
        xiu.i(xiuVar.f);
        whl.J(xiuVar.a, list, xiuVar.a());
        xiuVar.h();
    }
}
