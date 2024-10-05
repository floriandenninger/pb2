package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azjw extends ArrayList implements azjr {
    private static final long serialVersionUID = 7063189396499112664L;
    volatile int a;

    public azjw() {
        super(16);
    }

    @Override // defpackage.azjr
    public final void b() {
        add(azqm.a);
        this.a++;
    }

    @Override // defpackage.azjr
    public final void c(Throwable th) {
        add(azqm.b(th));
        this.a++;
    }

    @Override // defpackage.azjr
    public final void d(Object obj) {
        azqm azqmVar = azqm.a;
        add(obj);
        this.a++;
    }

    @Override // defpackage.azjr
    public final void e(azjp azjpVar) {
        if (azjpVar.getAndIncrement() != 0) {
            return;
        }
        ayqd ayqdVar = azjpVar.b;
        int i = 1;
        while (!azjpVar.d) {
            int i2 = this.a;
            Integer num = (Integer) azjpVar.c;
            int intValue = num != null ? num.intValue() : 0;
            while (intValue < i2) {
                if (azqm.e(get(intValue), ayqdVar) || azjpVar.d) {
                    return;
                } else {
                    intValue++;
                }
            }
            azjpVar.c = Integer.valueOf(intValue);
            i = azjpVar.addAndGet(-i);
            if (i == 0) {
                return;
            }
        }
    }
}
