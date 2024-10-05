package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dxz {
    private String a;
    private long b;
    private Map c;

    public dxz(String str, long j, Map map) {
        this.a = str;
        this.b = j;
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public long a() {
        return this.b;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public dxz clone() {
        return new dxz(this.a, this.b, new HashMap(this.c));
    }

    public Object c(String str) {
        if (this.c.containsKey(str)) {
            return this.c.get(str);
        }
        return null;
    }

    public String d() {
        return this.a;
    }

    public Map e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxz)) {
            return false;
        }
        dxz dxzVar = (dxz) obj;
        if (this.b == dxzVar.b && this.a.equals(dxzVar.a)) {
            return this.c.equals(dxzVar.c);
        }
        return false;
    }

    public void f(String str) {
        this.a = str;
    }

    public void g(String str, Object obj) {
        if (obj == null) {
            this.c.remove(str);
        } else {
            this.c.put(str, obj);
        }
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.c.hashCode();
    }

    public String toString() {
        String str = this.a;
        long j = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55 + String.valueOf(valueOf).length());
        sb.append("Event{name='");
        sb.append(str);
        sb.append("', timestamp=");
        sb.append(j);
        sb.append(", params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
