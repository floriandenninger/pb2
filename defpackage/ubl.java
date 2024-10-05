package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ubl {
    public final String a;
    public final String b;
    public final int c;

    public ubl() {
    }

    public ubl(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final aogz a() {
        aone createBuilder = aogz.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        aogz aogzVar = (aogz) createBuilder.instance;
        str.getClass();
        int i = 1;
        aogzVar.b |= 1;
        aogzVar.c = str;
        int i2 = this.c;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 1) {
            i = 3;
        } else if (i3 == 2) {
            i = 4;
        } else if (i3 == 3) {
            i = 5;
        } else if (i3 == 4) {
            i = 2;
        }
        createBuilder.copyOnWrite();
        aogz aogzVar2 = (aogz) createBuilder.instance;
        aogzVar2.e = i - 1;
        aogzVar2.b |= 4;
        if (!TextUtils.isEmpty(this.b)) {
            String str2 = this.b;
            createBuilder.copyOnWrite();
            aogz aogzVar3 = (aogz) createBuilder.instance;
            str2.getClass();
            aogzVar3.b |= 2;
            aogzVar3.d = str2;
        }
        return (aogz) createBuilder.build();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ubl) {
            ubl ublVar = (ubl) obj;
            if (this.a.equals(ublVar.a) && this.b.equals(ublVar.b)) {
                int i = this.c;
                int i2 = ublVar.c;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        int i = this.c;
        if (i != 0) {
            return hashCode ^ i;
        }
        throw null;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        int i = this.c;
        String str3 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "IMPORTANCE_NONE" : "IMPORTANCE_LOW" : "IMPORTANCE_HIGH" : "IMPORTANCE_DEFAULT" : "IMPORTANCE_UNSPECIFIED";
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50 + String.valueOf(str2).length() + str3.length());
        sb.append("ChimeNotificationChannel{id=");
        sb.append(str);
        sb.append(", group=");
        sb.append(str2);
        sb.append(", importance=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }
}
