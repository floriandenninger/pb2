package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.security.SecureRandom;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gwt {
    public final Random a;
    public String b;
    public apxf c;
    public apxf d;
    public apxf e;
    public String f;
    public final vgz g;

    public gwt(SecureRandom secureRandom, vgz vgzVar) {
        this.a = secureRandom;
        this.g = vgzVar;
    }

    private final boolean f(String str) {
        return str != null && str.equals(this.b);
    }

    public final boolean c(Uri uri) {
        return f(uri.getQueryParameter("token"));
    }

    public final boolean d(Activity activity) {
        Intent intent = activity.getIntent();
        if (!f(intent.getStringExtra("TOKEN_EXTRA"))) {
            zga.b("Invalid token");
            return false;
        }
        String stringExtra = intent.getStringExtra("URL_EXTRA");
        if (TextUtils.isEmpty(stringExtra)) {
            zga.b("Invalid url");
            return false;
        }
        Uri parse = Uri.parse(stringExtra);
        acv a = new acu().a();
        String u = ayeq.u(activity);
        int i = 1;
        if (!TextUtils.isEmpty(u)) {
            try {
                a.a.setPackage(u);
                a.a(activity, parse);
                return true;
            } catch (ActivityNotFoundException e) {
                zga.d("Unable to launch CustomTabsIntent.", e);
                return false;
            }
        }
        Intent intent2 = new Intent("android.intent.action.VIEW", parse);
        if (activity.getPackageManager().queryIntentActivities(intent2, 128).isEmpty()) {
            zga.b("Cannot open link to complete UriFlow.");
            return false;
        }
        ynm.j(this.g.b(new gws(this, i), angq.a), angq.a, gwr.a);
        activity.startActivity(intent2.setFlags(268435456));
        return true;
    }

    public final int e(Intent intent) {
        Uri data = intent.getData();
        if (data != null && c(data)) {
            String queryParameter = data.getQueryParameter("result");
            if ("success".equals(queryParameter)) {
                return 2;
            }
            if ("error".equals(queryParameter)) {
                return 3;
            }
            if ("cancel".equals(queryParameter)) {
                return 4;
            }
        }
        return 1;
    }
}
