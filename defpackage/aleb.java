package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aleb {
    public final String a;
    public final amsx b;
    public final ammv c;

    public aleb() {
    }

    public aleb(String str, amsx amsxVar, ammv ammvVar) {
        this.a = str;
        this.b = amsxVar;
        this.c = ammvVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static alea a(String str) {
        alea aleaVar = new alea(null);
        if (str != null) {
            aleaVar.a = str;
            aleaVar.c(amvs.a);
            aleaVar.b(amlr.a);
            return aleaVar;
        }
        throw new NullPointerException("Null id");
    }

    public final boolean b() {
        return (TextUtils.isEmpty(this.a) || this.c.h() || !this.b.isEmpty()) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aleb) {
            aleb alebVar = (aleb) obj;
            if (this.a.equals(alebVar.a) && this.b.equals(alebVar.b) && this.c.equals(alebVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 59 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("UploadTaskFutureResult{id=");
        sb.append(str);
        sb.append(", unmetRequirements=");
        sb.append(valueOf);
        sb.append(", retryTime=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
