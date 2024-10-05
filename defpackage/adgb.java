package defpackage;

import android.os.Bundle;
import com.google.android.libraries.youtube.mdx.model.ScreenId;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class adgb {
    public static String q(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return bundle.getString("screen");
    }

    public static int r(Bundle bundle) {
        int i;
        if (bundle == null || (i = bundle.getInt("mdx_session_type", -1)) == -1) {
            return 0;
        }
        int cS = amkq.cS(i);
        int i2 = cS - 1;
        if (cS == 0) {
            throw null;
        }
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return cS;
        }
        return 0;
    }

    public abstract ScreenId b();

    public abstract String c();

    public abstract String d();

    public abstract int e();

    public abstract String h();

    public abstract boolean j(adgb adgbVar);

    public abstract Bundle s();
}
