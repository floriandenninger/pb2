package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ear extends dzg {
    public long a;
    public long b;

    public ear() {
        this.a = -1L;
        this.b = -1L;
    }

    @Override // defpackage.dzg
    protected final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, Long.valueOf(this.a));
        hashMap.put(1, Long.valueOf(this.b));
        return hashMap;
    }

    public ear(String str) {
        this.a = -1L;
        this.b = -1L;
        HashMap a = a(str);
        if (a != null) {
            this.a = ((Long) a.get(0)).longValue();
            this.b = ((Long) a.get(1)).longValue();
        }
    }
}
