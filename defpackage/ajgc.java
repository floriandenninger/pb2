package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajgc {
    public final Object a;
    public final asht b;
    public final acra c;
    public final apxf d;
    public final List e;

    public ajgc() {
    }

    public ajgc(Object obj, asht ashtVar, acra acraVar, apxf apxfVar, List list) {
        this.a = obj;
        this.b = ashtVar;
        this.c = acraVar;
        this.d = apxfVar;
        this.e = list;
    }

    public static ajgb a() {
        return new ajgb();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajgc) {
            ajgc ajgcVar = (ajgc) obj;
            Object obj2 = this.a;
            if (obj2 != null ? obj2.equals(ajgcVar.a) : ajgcVar.a == null) {
                asht ashtVar = this.b;
                if (ashtVar != null ? ashtVar.equals(ajgcVar.b) : ajgcVar.b == null) {
                    acra acraVar = this.c;
                    if (acraVar != null ? acraVar.equals(ajgcVar.c) : ajgcVar.c == null) {
                        apxf apxfVar = this.d;
                        if (apxfVar != null ? apxfVar.equals(ajgcVar.d) : ajgcVar.d == null) {
                            List list = this.e;
                            List list2 = ajgcVar.e;
                            if (list != null ? list.equals(list2) : list2 == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 119 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("YouTubeCustomCommandEventDataImpl{tag=");
        sb.append(valueOf);
        sb.append(", interactionLoggingClientData=");
        sb.append(valueOf2);
        sb.append(", interactionLogger=");
        sb.append(valueOf3);
        sb.append(", command=");
        sb.append(valueOf4);
        sb.append(", customConverters=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = ((obj == null ? 0 : obj.hashCode()) ^ 1000003) * 1000003;
        asht ashtVar = this.b;
        int hashCode2 = (hashCode ^ (ashtVar == null ? 0 : ashtVar.hashCode())) * 1000003;
        acra acraVar = this.c;
        int hashCode3 = (hashCode2 ^ (acraVar == null ? 0 : acraVar.hashCode())) * 1000003;
        apxf apxfVar = this.d;
        int hashCode4 = (hashCode3 ^ (apxfVar == null ? 0 : apxfVar.hashCode())) * 1000003;
        List list = this.e;
        return hashCode4 ^ (list != null ? list.hashCode() : 0);
    }
}
