package defpackage;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ylf {
    private int a = 0;
    private final azrw b;
    private final yle c;

    public ylf(azrw azrwVar, yle yleVar) {
        this.b = azrwVar;
        this.c = yleVar;
    }

    final synchronized String a(String str) {
        StringBuilder sb;
        String valueOf = String.valueOf(this.a);
        this.a = (this.a + 1) % 100000;
        sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append(":");
        sb.append(valueOf);
        return sb.toString();
    }

    public final void b(String str) {
        ((bzh) this.b.get()).d(str);
    }

    public final void c(String str) {
        ((bzh) this.b.get()).e(str);
    }

    public final void d(String str, long j, long j2, boolean z, int i, boolean z2, Bundle bundle, aeqp aeqpVar) {
        bze bzeVar = new bze(this.c.b(), j, TimeUnit.SECONDS, j2, TimeUnit.SECONDS);
        yjk.n(bzeVar, i, z2, bundle, aeqpVar, this.c);
        bzeVar.c(str);
        ((bzh) this.b.get()).f(str, true != z ? 2 : 1, bzeVar.b());
    }

    public final void e(String str, long j, boolean z, int i, Bundle bundle, aeqp aeqpVar, boolean z2) {
        int i2;
        String str2;
        byz byzVar = new byz(this.c.b());
        yjk.n(byzVar, i, false, bundle, aeqpVar, this.c);
        byzVar.e(j, TimeUnit.SECONDS);
        if (z2) {
            str2 = a(str);
            i2 = 4;
        } else {
            i2 = true != z ? 2 : 1;
            str2 = str;
        }
        byzVar.c(str);
        ((bzh) this.b.get()).g(str2, i2, byzVar.b());
    }
}
