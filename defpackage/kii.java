package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kii {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public kii() {
    }

    public kii(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static kii a() {
        tmf tmfVar = new tmf();
        tmfVar.b(true);
        tmfVar.c = false;
        tmfVar.c(true);
        return tmfVar.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kii) {
            kii kiiVar = (kii) obj;
            if (this.a == kiiVar.a && this.b == kiiVar.b && this.c == kiiVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        StringBuilder sb = new StringBuilder(105);
        sb.append("ControlsVisibilityModel{isControlsOverlayVisible=");
        sb.append(z);
        sb.append(", isChangeAnimated=");
        sb.append(z2);
        sb.append(", shouldCancelHiding=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}
