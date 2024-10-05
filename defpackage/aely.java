package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aely {
    public final String a;
    public final int b;
    public final Uri c;

    public aely(String str, int i, Uri uri) {
        this.a = str;
        this.b = i;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aely)) {
            return false;
        }
        aely aelyVar = (aely) obj;
        return this.a.equals(aelyVar.a) && this.b == aelyVar.b && amkq.b(this.c, aelyVar.c);
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 50);
        sb.append("PrewarmedHostInfo openedHost(");
        sb.append(str);
        sb.append("), rttMs(");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
