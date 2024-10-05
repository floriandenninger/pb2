package defpackage;

import com.google.protos.youtube.api.innertube.TimeDelayedEndpoint$CreateTimeDelayedEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class gus implements Runnable {
    final TimeDelayedEndpoint$CreateTimeDelayedEndpoint a;
    final Map b;
    final String c;
    final /* synthetic */ gut d;

    public gus(gut gutVar, TimeDelayedEndpoint$CreateTimeDelayedEndpoint timeDelayedEndpoint$CreateTimeDelayedEndpoint, Map map, String str) {
        this.d = gutVar;
        this.a = timeDelayedEndpoint$CreateTimeDelayedEndpoint;
        this.b = map;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        whl.J(this.d.a, this.a.e, this.b);
        whl.J(this.d.a, this.a.g, this.b);
        aahd aahdVar = this.d.a;
        apxf apxfVar = this.a.f;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.c(apxfVar, this.b);
        this.d.b.remove(this.c);
    }
}
