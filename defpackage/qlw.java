package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qlw implements qlj {
    public static final Charset a = Charset.forName("UTF-8");
    public static final uvp b;
    public static final ConcurrentHashMap c;
    static Boolean d;
    static Long e;
    public final Context f;

    static {
        uvp uvpVar = new uvp(rnu.a());
        if (uvpVar.e) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        uvp uvpVar2 = new uvp(uvpVar.b, "gms:playlog:service:samplingrules_", uvpVar.d, false, uvpVar.f, uvpVar.h);
        b = new uvp(uvpVar2.b, uvpVar2.c, "LogSamplingRulesV2__", uvpVar2.e, uvpVar2.f, uvpVar2.h);
        c = new ConcurrentHashMap();
        d = null;
        e = null;
    }

    public qlw(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext;
        if (applicationContext != null) {
            uvr.g(applicationContext);
        }
    }
}
