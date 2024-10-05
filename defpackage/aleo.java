package defpackage;

import android.content.Context;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aleo {
    public final Context a;
    private final ExecutorService b;
    private final yth c;
    private final aseb d;
    private axas e;

    public aleo(ExecutorService executorService, yth ythVar, Context context, aseb asebVar) {
        this.b = executorService;
        this.c = ythVar;
        this.a = context;
        this.d = asebVar;
    }

    public final axas a() {
        if (this.e == null) {
            final URL url = new URL(this.d.d);
            CronetEngine a = this.c.a(new yks() { // from class: alem
                @Override // defpackage.yks
                public final Object a(Object obj, Object obj2) {
                    aleo aleoVar = aleo.this;
                    URL url2 = url;
                    alen alenVar = new alen(aleoVar);
                    ExperimentalCronetEngine.Builder builder = (ExperimentalCronetEngine.Builder) obj;
                    builder.setLibraryLoader((CronetEngine.Builder.LibraryLoader) alenVar);
                    builder.enableQuic(true);
                    builder.enableHttp2(false);
                    builder.enableSdch(false);
                    if (url2.getDefaultPort() != -1) {
                        builder.addQuicHint(url2.getHost(), url2.getDefaultPort(), url2.getDefaultPort());
                    }
                    builder.setExperimentalOptions("{\"QUIC\": {\"connection_options\": \"IFWa,AKD3\"}}");
                    try {
                        return ((ExperimentalCronetEngine.Builder) obj).build();
                    } catch (Throwable th) {
                        String valueOf = String.valueOf(obj2);
                        zga.d(valueOf.length() != 0 ? "Failed to construct CronetEngine using ".concat(valueOf) : new String("Failed to construct CronetEngine using "), th);
                        return null;
                    }
                }
            });
            this.e = awxs.d(a != null ? new axau(a, new zhr(1), this.b) : new axab());
        }
        return this.e;
    }
}
