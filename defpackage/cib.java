package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cib {
    private static final Object d = new Object();
    public final Context a;
    public final String b;
    public final Map c;

    public cib(Drawable.Callback callback, String str, Map map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1);
            sb.append(str);
            sb.append('/');
            this.b = sb.toString();
        } else {
            this.b = str;
        }
        if (!(callback instanceof View)) {
            cll.a("LottieDrawable must be inside of a view for images to work.");
            this.c = new HashMap();
            this.a = null;
        } else {
            this.a = ((View) callback).getContext();
            this.c = map;
        }
    }

    public final void a(String str, Bitmap bitmap) {
        synchronized (d) {
            ((cga) this.c.get(str)).e = bitmap;
        }
    }
}
