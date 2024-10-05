package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aobh {
    public final String a;

    public aobh(ammr ammrVar, byte[] bArr, byte[] bArr2) {
        this.a = ammrVar.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aobh) {
            return Objects.equals(this.a, ((aobh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 25);
        sb.append("CapabilityAlias{alias='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }
}
