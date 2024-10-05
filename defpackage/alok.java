package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alok {
    public final int a;
    public final boolean b;

    public alok() {
    }

    public alok(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public static alok a(int i) {
        aloj alojVar = new aloj();
        alojVar.a = Integer.valueOf(i);
        alojVar.b = false;
        Integer num = alojVar.a;
        if (num == null || alojVar.b == null) {
            StringBuilder sb = new StringBuilder();
            if (alojVar.a == null) {
                sb.append(" appUpdateType");
            }
            if (alojVar.b == null) {
                sb.append(" allowAssetPackDeletion");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new alok(num.intValue(), alojVar.b.booleanValue());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alok) {
            alok alokVar = (alok) obj;
            if (this.a == alokVar.a && this.b == alokVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.a;
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(73);
        sb.append("AppUpdateOptions{appUpdateType=");
        sb.append(i);
        sb.append(", allowAssetPackDeletion=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
