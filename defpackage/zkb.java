package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zkb {
    public final Uri a;
    public final Object b;
    public final Long c;
    public final int d;
    private final Object e;

    public zkb() {
    }

    public zkb(Uri uri, int i, Object obj, Object obj2, Long l) {
        this.a = uri;
        this.d = i;
        this.e = obj;
        this.b = obj2;
        this.c = l;
    }

    public static zkb a(Uri uri, int i, Object obj, Object obj2, Long l) {
        return new zkb(uri, i, obj, obj2, l);
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zkb) {
            zkb zkbVar = (zkb) obj;
            if (this.a.equals(zkbVar.a) && this.d == zkbVar.d && ((obj2 = this.e) != null ? obj2.equals(zkbVar.e) : zkbVar.e == null) && ((obj3 = this.b) != null ? obj3.equals(zkbVar.b) : zkbVar.b == null)) {
                Long l = this.c;
                Long l2 = zkbVar.c;
                if (l != null ? l.equals(l2) : l2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.d) * 1000003;
        Object obj = this.e;
        int hashCode2 = (hashCode ^ (obj == null ? 0 : obj.hashCode())) * 1000003;
        Object obj2 = this.b;
        int hashCode3 = (hashCode2 ^ (obj2 == null ? 0 : obj2.hashCode())) * 1000003;
        Long l = this.c;
        return hashCode3 ^ (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.d != 1 ? "DELETED" : "UPDATED";
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.b);
        String valueOf4 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        int length2 = str.length();
        StringBuilder sb = new StringBuilder(length + 76 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("DataSyncModelChange{path=");
        sb.append(valueOf);
        sb.append(", updateType=");
        sb.append(str);
        sb.append(", previousModel=");
        sb.append(valueOf2);
        sb.append(", nextModel=");
        sb.append(valueOf3);
        sb.append(", expiry=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
