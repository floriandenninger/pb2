package defpackage;

import android.content.Context;
import com.google.android.gms.cast.framework.CastOptions;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qgy {
    public final Context a;
    public final String b;
    public final CastOptions c;
    public final qgp d;
    public final qhk e;

    public qgy(Context context, CastOptions castOptions, qhk qhkVar) {
        String s;
        if (castOptions.a().isEmpty()) {
            s = prh.r(castOptions.a);
        } else {
            String str = castOptions.a;
            List a = castOptions.a();
            if (str == null) {
                throw new IllegalArgumentException("applicationId cannot be null");
            }
            if (a == null) {
                throw new IllegalArgumentException("namespaces cannot be null");
            }
            s = prh.s(str, a);
        }
        this.d = new qgp(this);
        qip.an(context);
        this.a = context.getApplicationContext();
        qip.ax(s);
        this.b = s;
        this.c = castOptions;
        this.e = qhkVar;
    }
}
