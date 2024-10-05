package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ccz {
    public String a;
    public byr b;
    public int c;
    public List d;
    public List e;
    public int f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccz)) {
            return false;
        }
        ccz cczVar = (ccz) obj;
        if (this.c != cczVar.c) {
            return false;
        }
        String str = this.a;
        if (str == null ? cczVar.a != null : !str.equals(cczVar.a)) {
            return false;
        }
        if (this.f != cczVar.f) {
            return false;
        }
        byr byrVar = this.b;
        if (byrVar == null ? cczVar.b != null : !byrVar.equals(cczVar.b)) {
            return false;
        }
        List list = this.d;
        if (list == null ? cczVar.d != null : !list.equals(cczVar.d)) {
            return false;
        }
        List list2 = this.e;
        if (list2 != null) {
            return list2.equals(cczVar.e);
        }
        return cczVar.e == null;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        int i = this.f;
        if (i != 0) {
            abm.e(i);
        } else {
            i = 0;
        }
        int i2 = (hashCode + i) * 31;
        byr byrVar = this.b;
        int hashCode2 = (((i2 + (byrVar != null ? byrVar.hashCode() : 0)) * 31) + this.c) * 31;
        List list = this.d;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List list2 = this.e;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }
}
