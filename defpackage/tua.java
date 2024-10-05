package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tua {
    public final String a;
    public final String b;

    public tua() {
    }

    public static void a(Context context, String str) {
        new tua(context.getPackageName(), str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tua) {
            tua tuaVar = (tua) obj;
            if (this.a.equals(tuaVar.a)) {
                String str = this.b;
                String str2 = tuaVar.b;
                if (str != null ? str.equals(str2) : str2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * (-721379959);
        String str = this.b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 53 + "null".length() + String.valueOf(str2).length());
        sb.append("ApplicationId{packageName=");
        sb.append(str);
        sb.append(", moduleName=null, instanceId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public tua(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.a = str;
        this.b = str2;
    }
}
