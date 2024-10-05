package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaku {
    public static final aaku a = d().s();
    public final aqud b;

    public aaku(aqud aqudVar) {
        aqudVar.getClass();
        this.b = aqudVar;
    }

    public static aaku a(byte[] bArr) {
        return new aaku((aqud) aonm.parseFrom(aqud.a, bArr, aomw.b()));
    }

    public static aaku b(aqud aqudVar) {
        return new aaku(aqudVar);
    }

    public static awxk d() {
        return new awxk(null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String c(String str) {
        if (!this.b.a(str)) {
            return null;
        }
        aqud aqudVar = this.b;
        aomf aomfVar = aomf.b;
        aoot aootVar = aqudVar.b;
        if (aootVar.containsKey(str)) {
            aomfVar = (aomf) aootVar.get(str);
        }
        return aomfVar.E();
    }

    public final awxk e() {
        return new awxk(this.b.toBuilder());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aaku) {
            return amkq.b(this.b, ((aaku) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(Collections.unmodifiableMap(this.b.b));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
        sb.append("EntityMetadata{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
