package defpackage;

import android.os.Bundle;
import com.google.android.libraries.youtube.ads.model.SurveyAd;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xip implements xiz {
    final /* synthetic */ xiu a;

    public xip(xiu xiuVar) {
        this.a = xiuVar;
    }

    @Override // defpackage.xiz
    public final void a(Bundle bundle) {
        xiu xiuVar = this.a;
        HashMap hashMap = new HashMap();
        if (bundle != null) {
            hashMap.put("com.google.android.libraries.youtube.innertube.bundle", bundle);
        }
        SurveyAd surveyAd = xiuVar.d;
        if (surveyAd == null || surveyAd.D() == null) {
            return;
        }
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", xiuVar.b);
        xiuVar.a.c(xiuVar.d.D(), hashMap);
    }

    @Override // defpackage.xiz
    public final void b(int[] iArr) {
        xiu xiuVar = this.a;
        if (xiuVar.g != null) {
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                arrayList.add(Integer.valueOf(i));
            }
            xiuVar.g.e(arrayList);
            xiuVar.c.q(xiuVar.g);
        }
        xiuVar.c.h();
        xiuVar.b(xce.SURVEY_ENDED);
    }

    @Override // defpackage.xiz
    public final void c(int i, int i2) {
        xiu xiuVar = this.a;
        xgp xgpVar = xiuVar.g;
        if (xgpVar != null) {
            xgpVar.f();
            xiuVar.g.d();
            xiuVar.c.q(xiuVar.g);
        }
        xiuVar.c.j(i, i2);
        xiuVar.b(xce.USER_SKIPPED);
    }
}
