package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ukg implements uke {
    public static final String[] a = {rrx.a("googleone")};
    public final Context b;
    public final anib c;

    public ukg(Context context, ExecutorService executorService) {
        this.b = context;
        this.c = anaf.C(executorService);
    }

    @Override // defpackage.uke
    public final anhy a() {
        return amkq.l(new ukf(this, 1), this.c);
    }
}
