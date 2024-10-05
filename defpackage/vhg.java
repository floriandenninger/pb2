package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vhg {
    public final aooy a;
    private final aomw b;

    public vhg(aooy aooyVar, aomw aomwVar) {
        if (aooyVar == null) {
            throw new NullPointerException("Null defaultValue");
        }
        this.a = aooyVar;
        if (aomwVar != null) {
            this.b = aomwVar;
            return;
        }
        throw new NullPointerException("Null extensionRegistryLite");
    }

    public static vhg a(aooy aooyVar, aomw aomwVar) {
        return new vhg(aooyVar, aomwVar);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aooy, java.lang.Object] */
    public final aooy b(InputStream inputStream) {
        return this.a.getParserForType().m(inputStream, this.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vhg) {
            vhg vhgVar = (vhg) obj;
            if (this.a.equals(vhgVar.a) && this.b.equals(vhgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54 + String.valueOf(valueOf2).length());
        sb.append("ProtoSerializer{defaultValue=");
        sb.append(valueOf);
        sb.append(", extensionRegistryLite=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public vhg() {
    }
}
