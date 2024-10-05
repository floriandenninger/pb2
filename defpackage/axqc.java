package defpackage;

import android.app.Application;
import android.app.Service;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axqc implements axqk {
    private final Service a;
    private Object b;

    public axqc(Service service) {
        this.a = service;
    }

    @Override // defpackage.axqk
    public final Object lM() {
        if (this.b == null) {
            Application application = this.a.getApplication();
            ayaw.q(application instanceof axqk, "Sting service must be attached to an @Sting Application. Found: %s", application.getClass());
            efa jF = ((axqb) axfq.n(application, axqb.class)).jF();
            jF.b = this.a;
            ayaw.j(jF.b, Service.class);
            this.b = new ehx(jF.a, jF.b);
        }
        return this.b;
    }
}
