package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ebh extends dzg {
    public Long a;
    public Long b;
    public Long c;
    public Long d;

    public ebh() {
    }

    @Override // defpackage.dzg
    protected final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.a);
        hashMap.put(1, this.b);
        hashMap.put(2, this.c);
        hashMap.put(3, this.d);
        return hashMap;
    }

    public ebh(String str) {
        HashMap a = a(str);
        if (a != null) {
            this.a = (Long) a.get(0);
            this.b = (Long) a.get(1);
            this.c = (Long) a.get(2);
            this.d = (Long) a.get(3);
        }
    }
}
