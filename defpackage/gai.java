package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gai {
    public final Optional a;
    public final boolean b;
    public final Optional c;

    public gai() {
    }

    public gai(Optional optional, boolean z, Optional optional2) {
        this.a = optional;
        this.b = z;
        this.c = optional2;
    }

    public static gah a() {
        gah gahVar = new gah(null);
        gahVar.a = Optional.empty();
        gahVar.b(true);
        gahVar.b = Optional.empty();
        return gahVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gai) {
            gai gaiVar = (gai) obj;
            if (this.a.equals(gaiVar.a) && this.b == gaiVar.b && this.c.equals(gaiVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 77 + String.valueOf(valueOf2).length());
        sb.append("BottomBarModel{pivotBarStyle=");
        sb.append(valueOf);
        sb.append(", shouldShowPivotBar=");
        sb.append(z);
        sb.append(", navigationBarStyle=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
