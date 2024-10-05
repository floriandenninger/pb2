package defpackage;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class sjd implements Serializable, sjr {
    private static final TimeUnit a = TimeUnit.MINUTES;
    private static final long serialVersionUID = 0;

    @Override // defpackage.sjr
    public final int a() {
        return 1;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return sjr.class;
    }

    @Override // defpackage.sjr
    public final int b() {
        return 1000;
    }

    @Override // defpackage.sjr
    public final int c() {
        return 1;
    }

    @Override // defpackage.sjr
    public final int d() {
        return 1;
    }

    @Override // defpackage.sjr
    public final int e() {
        return 1000;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sjr) {
            sjr sjrVar = (sjr) obj;
            sjrVar.d();
            sjrVar.e();
            sjrVar.a();
            sjrVar.b();
            sjrVar.c();
            sjrVar.f();
            if (a.equals(sjrVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.sjr
    public final long f() {
        return 1L;
    }

    @Override // defpackage.sjr
    public final TimeUnit g() {
        return a;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (a.hashCode() ^ (-810573619)) - 1944263094;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.android.libraries.concurrent.monitoring.ThreadMonitoringConfiguration()";
    }
}
