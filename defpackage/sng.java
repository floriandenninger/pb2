package defpackage;

import com.google.android.libraries.elements.interfaces.JSControllerInitializationMode;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sng {
    public final JSControllerInitializationMode a;
    public final boolean b;
    public final int c;
    public final boolean d;

    public sng() {
    }

    public sng(JSControllerInitializationMode jSControllerInitializationMode, boolean z, int i, boolean z2) {
        this.a = jSControllerInitializationMode;
        this.b = z;
        this.c = i;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sng) {
            sng sngVar = (sng) obj;
            if (this.a.equals(sngVar.a) && this.b == sngVar.b && this.c == sngVar.c && this.d == sngVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c) * 1000003) ^ (true == this.d ? 1231 : 1237);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        int i = this.c;
        boolean z2 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 120);
        sb.append("JavaScriptConfig{initializationMode=");
        sb.append(valueOf);
        sb.append(", enableVmContextLru=");
        sb.append(z);
        sb.append(", vmContextLruSize=");
        sb.append(i);
        sb.append(", shouldLockVmIsolate=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
