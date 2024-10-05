package defpackage;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ghk extends gid {
    private final PaneDescriptor a;
    private final gir b;
    private final PaneDescriptor c;

    public ghk(PaneDescriptor paneDescriptor, gir girVar, PaneDescriptor paneDescriptor2) {
        this.a = paneDescriptor;
        this.b = girVar;
        if (paneDescriptor2 == null) {
            throw new NullPointerException("Null newDescriptor");
        }
        this.c = paneDescriptor2;
    }

    @Override // defpackage.gid
    public PaneDescriptor a() {
        return this.a;
    }

    @Override // defpackage.gid
    public PaneDescriptor b() {
        return this.c;
    }

    @Override // defpackage.gid
    public gir c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gid) {
            gid gidVar = (gid) obj;
            PaneDescriptor paneDescriptor = this.a;
            if (paneDescriptor != null ? paneDescriptor.equals(gidVar.a()) : gidVar.a() == null) {
                gir girVar = this.b;
                if (girVar != null ? girVar.equals(gidVar.c()) : gidVar.c() == null) {
                    if (this.c.equals(gidVar.b())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 74 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("FragmentReplaceEvent{currentDescriptor=");
        sb.append(valueOf);
        sb.append(", currentFragment=");
        sb.append(valueOf2);
        sb.append(", newDescriptor=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }

    public int hashCode() {
        PaneDescriptor paneDescriptor = this.a;
        int hashCode = ((paneDescriptor == null ? 0 : paneDescriptor.hashCode()) ^ 1000003) * 1000003;
        gir girVar = this.b;
        return ((hashCode ^ (girVar != null ? girVar.hashCode() : 0)) * 1000003) ^ this.c.hashCode();
    }
}
