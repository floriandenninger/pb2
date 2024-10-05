package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class pam {
    public final String a;
    public final UUID b;
    public final pbe c;

    public pam(String str, UUID uuid, pbe pbeVar) {
        opn.h(str);
        this.a = str;
        this.b = uuid;
        this.c = pbeVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pam)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        pam pamVar = (pam) obj;
        return this.a.equals(pamVar.a) && pgz.p(this.b, pamVar.b) && pgz.p(this.c, pamVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 37;
        UUID uuid = this.b;
        int hashCode2 = (hashCode + (uuid != null ? uuid.hashCode() : 0)) * 37;
        pbe pbeVar = this.c;
        return hashCode2 + (pbeVar != null ? pbeVar.hashCode() : 0);
    }
}
