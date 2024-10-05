package defpackage;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gix {
    public final PaneDescriptor a;
    public final int b;
    public final boolean c;

    public gix() {
    }

    public gix(PaneDescriptor paneDescriptor, int i, boolean z) {
        this.a = paneDescriptor;
        this.b = i;
        this.c = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static giw b() {
        return new giw();
    }

    public final giw a() {
        giw giwVar = new giw();
        giwVar.a = this.a;
        giwVar.c(this.b);
        giwVar.b(this.c);
        return giwVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gix) {
            gix gixVar = (gix) obj;
            PaneDescriptor paneDescriptor = this.a;
            if (paneDescriptor != null ? paneDescriptor.equals(gixVar.a) : gixVar.a == null) {
                if (this.b == gixVar.b && this.c == gixVar.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        PaneDescriptor paneDescriptor = this.a;
        return (((((paneDescriptor == null ? 0 : paneDescriptor.hashCode()) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 87);
        sb.append("PaneNavigationAction{targetDescriptor=");
        sb.append(valueOf);
        sb.append(", navigationType=");
        sb.append(i);
        sb.append(", clearHistory=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
