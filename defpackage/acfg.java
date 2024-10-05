package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AndroidApplicationEndpointOuterClass;
import com.google.protos.youtube.api.innertube.AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint;
import com.google.protos.youtube.api.innertube.AuthorizedUrlEndpointOuterClass;
import com.google.protos.youtube.api.innertube.CopyTextEndpointOuterClass$CopyTextEndpoint;
import com.google.protos.youtube.api.innertube.ShareEndpointOuterClass$ShareEndpoint;
import com.google.protos.youtube.api.innertube.ShareEndpointOuterClass$ShareEntityEndpoint;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acfg implements aahd {
    private final aahd a;
    private final aagx b;
    private final ci c;
    private final azrw d;

    public acfg(ci ciVar, aahd aahdVar, aagx aagxVar, azrw azrwVar) {
        aahdVar.getClass();
        this.a = aahdVar;
        ciVar.getClass();
        this.c = ciVar;
        this.b = aagxVar;
        this.d = azrwVar;
    }

    private final void f(apxf apxfVar, ce ceVar) {
        if (this.c.isFinishing()) {
            return;
        }
        Bundle bundle = ceVar.m;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putByteArray("navigation_endpoint", apxfVar.toByteArray());
        ceVar.af(bundle);
        dn k = this.c.getSupportFragmentManager().k();
        k.r(ceVar, "DialogFragmentFromNavigation");
        k.k();
    }

    private final boolean g(apxf apxfVar) {
        if (apxfVar.pY(ShareEndpointOuterClass$ShareEntityEndpoint.shareEntityEndpoint)) {
            f(apxfVar, new akkr());
            return true;
        }
        if (apxfVar.pY(ShareEndpointOuterClass$ShareEndpoint.shareEndpoint)) {
            f(apxfVar, new acjs());
            return true;
        }
        if (apxfVar.pY(CopyTextEndpointOuterClass$CopyTextEndpoint.copyTextEndpoint)) {
            CopyTextEndpointOuterClass$CopyTextEndpoint copyTextEndpointOuterClass$CopyTextEndpoint = (CopyTextEndpointOuterClass$CopyTextEndpoint) apxfVar.pX(CopyTextEndpointOuterClass$CopyTextEndpoint.copyTextEndpoint);
            ((ClipboardManager) this.c.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text/plain", copyTextEndpointOuterClass$CopyTextEndpoint.b));
            if (copyTextEndpointOuterClass$CopyTextEndpoint.c.isEmpty()) {
                return true;
            }
            aahc.c(this, copyTextEndpointOuterClass$CopyTextEndpoint.c, null);
            return true;
        }
        if (apxfVar.pY(AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.androidShareIntentEndpoint)) {
            AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint = (AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint) apxfVar.pX(AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.androidShareIntentEndpoint);
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            for (askp askpVar : androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.c) {
                intent.putExtra(askpVar.e, askpVar.c == 2 ? (String) askpVar.d : "");
            }
            intent.setType(androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.d);
            this.c.startActivity(Intent.createChooser(intent, null));
            return true;
        }
        if (apxfVar.pY(AndroidApplicationEndpointOuterClass.androidAppEndpoint)) {
            Intent aC = wbs.aC();
            apcn apcnVar = (apcn) apxfVar.pX(AndroidApplicationEndpointOuterClass.androidAppEndpoint);
            aC.setClassName(apcnVar.c, apcnVar.d);
            for (askp askpVar2 : apcnVar.e) {
                aC.putExtra(askpVar2.e, askpVar2.c == 2 ? (String) askpVar2.d : "");
            }
            try {
                this.c.startActivity(aC);
                return true;
            } catch (ActivityNotFoundException unused) {
                whu.K(this.c, R.string.lc_error_generic, 0);
                return true;
            }
        }
        if (apxfVar.pY(UrlEndpointOuterClass.urlEndpoint)) {
            Uri aj = wbs.aj(((avuo) apxfVar.pX(UrlEndpointOuterClass.urlEndpoint)).c);
            ci ciVar = this.c;
            Intent intent2 = new Intent("android.intent.action.VIEW", aj);
            ajcq.q(ciVar, intent2);
            h(this.c, intent2.setFlags(268435456));
            return true;
        }
        if (!apxfVar.pY(AuthorizedUrlEndpointOuterClass.authorizedUrlEndpoint)) {
            return false;
        }
        Uri aj2 = wbs.aj(((apgt) apxfVar.pX(AuthorizedUrlEndpointOuterClass.authorizedUrlEndpoint)).b);
        ci ciVar2 = this.c;
        Intent intent3 = new Intent("android.intent.action.VIEW", aj2);
        ajcq.q(ciVar2, intent3);
        h(this.c, intent3.setFlags(268435456));
        return true;
    }

    private static final void h(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, context.getString(R.string.lc_error_browser_not_found), 1).show();
        }
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
        if (g(apxfVar)) {
            return;
        }
        try {
            this.b.f(apxfVar).kE(apxfVar, map);
        } catch (aahm unused) {
            String valueOf = String.valueOf(Arrays.toString(Thread.currentThread().getStackTrace()));
            afsi.b(2, 29, valueOf.length() != 0 ? "No binding found for command routed to LiveCreationCommandRouter. \n".concat(valueOf) : new String("No binding found for command routed to LiveCreationCommandRouter. \n"));
            this.a.c(apxfVar, map);
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
