package defpackage;

import androidx.work.impl.WorkDatabase;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cdv {
    public final WorkDatabase a;

    public cdv(WorkDatabase workDatabase) {
        this.a = workDatabase;
    }

    private final void c(String str, int i) {
        this.a.x().c(new ccl(str, i));
    }

    public final int a(String str) {
        this.a.h();
        try {
            Long b = this.a.x().b(str);
            int i = 0;
            int intValue = b != null ? b.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i = intValue + 1;
            }
            c(str, i);
            this.a.j();
            return intValue;
        } finally {
            this.a.i();
        }
    }

    public final int b() {
        int a;
        synchronized (cdv.class) {
            a = a("next_job_scheduler_id");
            if (a < 0) {
                c("next_job_scheduler_id", 1);
                a = 0;
            }
        }
        return a;
    }
}
