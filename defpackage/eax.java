package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eax extends dzg {
    public Long a;
    public Boolean b;
    public Boolean c;

    public eax() {
    }

    @Override // defpackage.dzg
    protected final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.a);
        hashMap.put(1, this.b);
        hashMap.put(2, this.c);
        return hashMap;
    }

    public eax(String str) {
        HashMap a = a(str);
        if (a != null) {
            this.a = (Long) a.get(0);
            this.b = (Boolean) a.get(1);
            this.c = (Boolean) a.get(2);
        }
    }
}
