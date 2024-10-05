package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tdt {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public tdt(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public static tds a() {
        return new tds();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            tdt tdtVar = (tdt) obj;
            if (Objects.equals(this.a, tdtVar.a) && Objects.equals(this.b, tdtVar.b) && Objects.equals(this.c, tdtVar.c) && Objects.equals(this.d, tdtVar.d) && Objects.equals(this.e, tdtVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e);
    }
}
