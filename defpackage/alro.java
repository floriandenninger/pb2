package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alro {
    public static final alro a = a().a();
    public final Integer b;
    public final Map c;

    public alro() {
    }

    public alro(Integer num, Map map) {
        this.b = num;
        this.c = map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static alrn a() {
        alrn alrnVar = new alrn();
        alrnVar.c(new HashMap());
        return alrnVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alro) {
            alro alroVar = (alro) obj;
            Integer num = this.b;
            if (num != null ? num.equals(alroVar.b) : alroVar.b == null) {
                if (this.c.equals(alroVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81 + String.valueOf(valueOf2).length());
        sb.append("LocalTestingConfig{defaultSplitInstallErrorCode=");
        sb.append(valueOf);
        sb.append(", splitInstallErrorCodeByModule=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        Integer num = this.b;
        return (((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode();
    }
}
