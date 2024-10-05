package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jvn implements Runnable {
    final /* synthetic */ jvo a;

    public jvn(jvo jvoVar) {
        this.a = jvoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yjk.f();
        HashMap hashMap = new HashMap(this.a.d);
        this.a.d.clear();
        if (!hashMap.isEmpty()) {
            this.a.b.b(new ArrayList(hashMap.keySet()), new jvm(hashMap));
        }
        this.a.e = null;
    }
}
