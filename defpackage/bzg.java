package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bzg {
    private final UUID a;
    private final byr b;
    private final Set c;
    private final byr d;
    private final int e;
    private final int f;

    public bzg(UUID uuid, int i, byr byrVar, List list, byr byrVar2, int i2) {
        this.a = uuid;
        this.f = i;
        this.b = byrVar;
        this.c = new HashSet(list);
        this.d = byrVar2;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bzg bzgVar = (bzg) obj;
        if (this.e == bzgVar.e && this.a.equals(bzgVar.a) && this.f == bzgVar.f && this.b.equals(bzgVar.b) && this.c.equals(bzgVar.c)) {
            return this.d.equals(bzgVar.d);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int i = this.f;
        abm.e(i);
        return (((((((((hashCode * 31) + i) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e;
    }

    public final String toString() {
        return "WorkInfo{mId='" + this.a + "', mState=" + ((Object) abm.c(this.f)) + ", mOutputData=" + this.b + ", mTags=" + this.c + ", mProgress=" + this.d + '}';
    }
}
