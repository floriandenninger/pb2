package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amfa {
    public final int a;
    public final int b;

    public amfa() {
    }

    public amfa(byte[] bArr) {
        this.a = 1;
        this.b = 2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof amfa) && this.b == ((amfa) obj).b;
    }

    public final int hashCode() {
        return this.b ^ (-722379962);
    }

    public final String toString() {
        String str = this.b != 1 ? "CREDENTIAL" : "DEVICE";
        StringBuilder sb = new StringBuilder(str.length() + 36);
        sb.append("StorageSpec{type=FILES, directBoot=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
