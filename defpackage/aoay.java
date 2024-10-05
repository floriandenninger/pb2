package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoay implements uyi {
    private static final AtomicBoolean a = new AtomicBoolean(false);
    private final aoax b;

    public aoay(aoax aoaxVar) {
        this.b = aoaxVar;
    }

    @Override // defpackage.uyi
    public final void a() {
        if (uye.b() && !a.getAndSet(true)) {
            amil l = amjw.l("AndroidLoggerConfig");
            try {
                amzt amztVar = new amzt();
                amztVar.a = this.b;
                if (amzu.a.compareAndSet(false, true)) {
                    Object obj = amztVar.a;
                    if (obj == null) {
                        obj = new anac();
                    }
                    if (!anaa.a.compareAndSet(null, obj)) {
                        throw new IllegalStateException("Logger backends can only be configured once.");
                    }
                    anaa.e();
                    anab.a.b.set(anah.a);
                    l.close();
                    return;
                }
                throw new IllegalStateException("Logger backend configuration may only occur once.");
            } catch (Throwable th) {
                try {
                    l.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
    }
}
