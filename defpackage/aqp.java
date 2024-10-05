package defpackage;

import android.os.IBinder;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aqp implements IBinder.DeathRecipient {
    public final String a;
    public final int b;
    public final int c;
    public final HashMap d = new HashMap();
    final /* synthetic */ arm e;
    public final ark f;
    public ypn g;

    public aqp(arm armVar, String str, int i, int i2, ark arkVar) {
        this.e = armVar;
        this.a = str;
        this.b = i;
        this.c = i2;
        new arn(str, i, i2);
        this.f = arkVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.e.d.post(new aqo(this));
    }
}
