package defpackage;

import android.os.Bundle;
import com.google.android.libraries.youtube.ads.model.SurveyAd;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xjd implements xiz {
    final /* synthetic */ xji a;

    public xjd(xji xjiVar) {
        this.a = xjiVar;
    }

    @Override // defpackage.xiz
    public final void a(Bundle bundle) {
        xji xjiVar = this.a;
        HashMap hashMap = new HashMap();
        if (bundle != null) {
            hashMap.put("com.google.android.libraries.youtube.innertube.bundle", bundle);
        }
        SurveyAd surveyAd = xjiVar.e;
        if (surveyAd == null || surveyAd.D() == null) {
            return;
        }
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", xjiVar.b);
        xjiVar.a.c(xjiVar.e.D(), hashMap);
    }

    @Override // defpackage.xiz
    public final void b(int[] iArr) {
        xji xjiVar = this.a;
        if (xjiVar.h != null) {
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                arrayList.add(Integer.valueOf(i));
            }
            xjiVar.h.e(arrayList);
            xjiVar.c.q(xjiVar.h);
        }
        xjiVar.c.h();
        xjiVar.b(xce.SURVEY_ENDED);
    }

    @Override // defpackage.xiz
    public final void c(int i, int i2) {
        xji xjiVar = this.a;
        xgp xgpVar = xjiVar.h;
        if (xgpVar != null) {
            xgpVar.f();
            xjiVar.h.d();
            xjiVar.c.q(xjiVar.h);
        }
        xjiVar.c.j(i, i2);
        xjiVar.b(xce.USER_SKIPPED);
    }
}
