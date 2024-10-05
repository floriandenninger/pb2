package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import com.google.protos.youtube.api.innertube.ApplicationHelpEndpointOuterClass;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand;
import com.google.protos.youtube.api.innertube.OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import com.google.protos.youtube.api.innertube.UserFeedbackEndpointOuterClass;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lnt implements aahd {
    public final Activity a;
    public final azrw b;
    private final azrw c;
    private final azrw d;
    private final lno e;
    private final exu f;
    private final aloh g;

    public lnt(Activity activity, azrw azrwVar, azrw azrwVar2, lno lnoVar, azrw azrwVar3, aloh alohVar, exu exuVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = activity;
        this.b = azrwVar;
        this.d = azrwVar2;
        this.c = azrwVar3;
        this.e = lnoVar;
        this.g = alohVar;
        this.f = exuVar;
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void a(apxf apxfVar) {
        aahc.a(this, apxfVar);
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void b(List list) {
        aahc.b(this, list);
    }

    @Override // defpackage.aahd
    public final void c(apxf apxfVar, Map map) {
        if (apxfVar.pY(BrowseEndpointOuterClass.browseEndpoint)) {
            Intent r = this.g.r();
            r.putExtra("navigation_endpoint", apxfVar.toByteArray());
            this.a.startActivity(r);
            return;
        }
        if (apxfVar.pY(OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint.openSourceLicensesEndpoint)) {
            Activity activity = this.a;
            activity.startActivity(new Intent(activity, (Class<?>) LicenseMenuActivity.class));
            return;
        }
        if (apxfVar.pY(ApplicationHelpEndpointOuterClass.applicationHelpEndpoint)) {
            lnn lnnVar = this.e.a;
            if (lnnVar != null) {
                lnnVar.aJ();
                return;
            }
            return;
        }
        if (apxfVar.pY(UrlEndpointOuterClass.urlEndpoint)) {
            fav.F(this.a, wbs.aj(((avuo) apxfVar.pX(UrlEndpointOuterClass.urlEndpoint)).c));
            return;
        }
        if (apxfVar.pY(UserFeedbackEndpointOuterClass.userFeedbackEndpoint)) {
            ((akrh) this.d.get()).b(new akrg() { // from class: lns
                @Override // defpackage.akrg
                public final void a(Bundle bundle) {
                    lnt lntVar = lnt.this;
                    ((aloh) lntVar.b.get()).c(yjk.Q(lntVar.a), bundle, null);
                }
            });
        } else if (!apxfVar.pY(LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.localWatchHistoryCommand)) {
            try {
                ((aagx) this.c.get()).f(apxfVar).kE(apxfVar, map);
            } catch (aahm unused) {
            }
        } else {
            this.f.kE(apxfVar, map);
        }
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void d(List list, Map map) {
        aahc.c(this, list, map);
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void e(List list, Object obj) {
        aahc.d(this, list, obj);
    }
}
