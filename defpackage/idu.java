package defpackage;

import com.google.android.apps.youtube.app.common.endpoint.LoggingUrlsPingController;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class idu implements aahd {
    private final aagx a;
    private final LoggingUrlsPingController b;

    public idu(aagx aagxVar, LoggingUrlsPingController loggingUrlsPingController) {
        this.a = aagxVar;
        this.b = loggingUrlsPingController;
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
        aaha f = this.a.f(apxfVar);
        if (f != null && f != aaha.x) {
            this.b.h(apxfVar.d, map);
        }
        this.a.c(apxfVar, map);
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
