package defpackage;

import java.security.MessageDigest;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csw implements cqi {
    private final Object b;
    private final int c;
    private final int d;
    private final Class e;
    private final Class f;
    private final cqi g;
    private final Map h;
    private final cqn i;
    private int j;

    public csw(Object obj, cqi cqiVar, int i, int i2, Map map, Class cls, Class cls2, cqn cqnVar) {
        did.ap(obj);
        this.b = obj;
        did.at(cqiVar, "Signature must not be null");
        this.g = cqiVar;
        this.c = i;
        this.d = i2;
        did.ap(map);
        this.h = map;
        did.at(cls, "Resource class must not be null");
        this.e = cls;
        this.f = cls2;
        did.ap(cqnVar);
        this.i = cqnVar;
    }

    @Override // defpackage.cqi
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cqi
    public final boolean equals(Object obj) {
        if (obj instanceof csw) {
            csw cswVar = (csw) obj;
            if (this.b.equals(cswVar.b) && this.g.equals(cswVar.g) && this.d == cswVar.d && this.c == cswVar.c && this.h.equals(cswVar.h) && this.e.equals(cswVar.e) && this.f.equals(cswVar.f) && this.i.equals(cswVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cqi
    public final int hashCode() {
        int i = this.j;
        if (i != 0) {
            return i;
        }
        int hashCode = this.b.hashCode();
        this.j = hashCode;
        int hashCode2 = (((((hashCode * 31) + this.g.hashCode()) * 31) + this.c) * 31) + this.d;
        this.j = hashCode2;
        int hashCode3 = (hashCode2 * 31) + this.h.hashCode();
        this.j = hashCode3;
        int hashCode4 = (hashCode3 * 31) + this.e.hashCode();
        this.j = hashCode4;
        int hashCode5 = (hashCode4 * 31) + this.f.hashCode();
        this.j = hashCode5;
        int hashCode6 = (hashCode5 * 31) + this.i.hashCode();
        this.j = hashCode6;
        return hashCode6;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        int i = this.c;
        int i2 = this.d;
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.g);
        int i3 = this.j;
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.i);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 151 + length2 + length3 + length4 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("EngineKey{model=");
        sb.append(valueOf);
        sb.append(", width=");
        sb.append(i);
        sb.append(", height=");
        sb.append(i2);
        sb.append(", resourceClass=");
        sb.append(valueOf2);
        sb.append(", transcodeClass=");
        sb.append(valueOf3);
        sb.append(", signature=");
        sb.append(valueOf4);
        sb.append(", hashCode=");
        sb.append(i3);
        sb.append(", transformations=");
        sb.append(valueOf5);
        sb.append(", options=");
        sb.append(valueOf6);
        sb.append('}');
        return sb.toString();
    }
}
