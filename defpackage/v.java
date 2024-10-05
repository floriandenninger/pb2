package defpackage;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class v implements Serializable {
    private static final long serialVersionUID = 1;
    public final String a;
    public final p b;
    public final s c;
    public final s d;

    public v(String str, p pVar, s sVar, s sVar2) {
        this.a = str;
        this.b = pVar;
        this.c = sVar;
        this.d = sVar2;
    }

    @Deprecated
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        String concat;
        String str = this.a;
        String obj = this.b.toString();
        s sVar = this.c;
        String str2 = "";
        if (sVar == null) {
            concat = "";
        } else {
            String valueOf = String.valueOf(sVar.toString());
            concat = valueOf.length() != 0 ? " ".concat(valueOf) : new String(" ");
        }
        s sVar2 = this.d;
        if (sVar2 != null) {
            String valueOf2 = String.valueOf(sVar2.toString());
            str2 = valueOf2.length() != 0 ? " ".concat(valueOf2) : new String(" ");
        }
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(obj).length() + String.valueOf(concat).length() + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append(concat);
        sb.append(str2);
        return sb.toString();
    }
}
