package defpackage;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agef implements ylb {
    private final aguv a;
    private final /* synthetic */ int b;

    public agef(aguv aguvVar, int i) {
        this.b = i;
        this.a = aguvVar;
    }

    @Override // defpackage.ylb
    public final int a(Bundle bundle) {
        int i = this.b;
        if (i == 0) {
            CountDownLatch countDownLatch = this.a.a.j;
            if (countDownLatch == null) {
                countDownLatch = agvx.a;
            }
            try {
                countDownLatch.await();
                return 0;
            } catch (InterruptedException unused) {
                return 1;
            }
        }
        if (i == 1) {
            this.a.f(bundle.getString("intentAction"), bundle);
            return 0;
        }
        this.a.f(bundle.getString("intentAction"), bundle);
        return 0;
    }
}
