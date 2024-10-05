package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayhw implements aygf {
    public final aygf a;
    public volatile boolean b;
    public List c = new ArrayList();

    public ayhw(aygf aygfVar) {
        this.a = aygfVar;
    }

    private final void b(Runnable runnable) {
        synchronized (this) {
            if (this.b) {
                runnable.run();
            } else {
                this.c.add(runnable);
            }
        }
    }

    @Override // defpackage.aygf
    public final void a(Status status, ayge aygeVar, aycd aycdVar) {
        b(new ayhv(this, status, aygeVar, aycdVar));
    }

    @Override // defpackage.aygf
    public final void c(aycd aycdVar) {
        b(new ayhu(this, aycdVar));
    }

    @Override // defpackage.ayod
    public final void d(ayoc ayocVar) {
        if (this.b) {
            this.a.d(ayocVar);
        } else {
            b(new ayhs(this, ayocVar));
        }
    }

    @Override // defpackage.ayod
    public final void e() {
        if (this.b) {
            this.a.e();
        } else {
            b(new ayht(this));
        }
    }
}
