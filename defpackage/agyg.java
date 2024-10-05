package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agyg {
    public final boolean a;
    private final int b;

    public agyg() {
    }

    public agyg(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public static agyg a(boolean z) {
        aloj alojVar = new aloj();
        alojVar.b = Boolean.valueOf(z);
        alojVar.a = 0;
        Boolean bool = alojVar.b;
        if (bool == null || alojVar.a == null) {
            StringBuilder sb = new StringBuilder();
            if (alojVar.b == null) {
                sb.append(" shouldShow");
            }
            if (alojVar.a == null) {
                sb.append(" removeActionType");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new agyg(bool.booleanValue(), alojVar.a.intValue());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agyg) {
            agyg agygVar = (agyg) obj;
            if (this.a == agygVar.a && this.b == agygVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        boolean z = this.a;
        int i = this.b;
        StringBuilder sb = new StringBuilder(73);
        sb.append("OfflineActionDialogConfig{shouldShow=");
        sb.append(z);
        sb.append(", removeActionType=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
