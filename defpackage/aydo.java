package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aydo {
    public static final aydo a = new aydo();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        String hexString = Integer.toHexString(1);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 18);
        sb.append("BindServiceFlags{");
        sb.append(hexString);
        sb.append("}");
        return sb.toString();
    }
}
