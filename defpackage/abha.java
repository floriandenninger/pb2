package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abha implements abqd {
    public final Handler a;
    public final ajpd b = new ajpd();
    final Map c = new HashMap();
    public final abgz d = new abgz(this);
    public final axze e;

    public abha(Handler handler, axze axzeVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = handler;
        this.e = axzeVar;
    }

    private final void f() {
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            this.a.removeCallbacks((abgy) it.next());
        }
        this.c.clear();
        this.b.clear();
    }

    public final void a(String str, Object obj, long j) {
        yjk.f();
        if (this.c.containsKey(str)) {
            return;
        }
        abgy abgyVar = new abgy(this, str, obj, j, System.currentTimeMillis());
        this.c.put(str, abgyVar);
        this.b.add(0, obj);
        this.a.postDelayed(abgyVar, j);
    }

    @Override // defpackage.abqd
    public final void mU() {
        yjk.f();
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            this.a.removeCallbacks((abgy) it.next());
        }
    }

    @Override // defpackage.abqd
    public final void mV() {
        yjk.f();
        for (abgy abgyVar : this.c.values()) {
            long currentTimeMillis = (abgyVar.c + abgyVar.b) - System.currentTimeMillis();
            if (currentTimeMillis <= 0) {
                this.a.post(abgyVar);
            } else {
                this.a.postDelayed(abgyVar, currentTimeMillis);
            }
        }
    }

    @Override // defpackage.abqd
    public final void mW() {
        yjk.f();
        f();
    }

    @Override // defpackage.abqd
    public final void mX() {
        yjk.f();
        f();
    }
}
