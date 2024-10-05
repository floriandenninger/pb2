package com.google.android.apps.youtube.embeddedplayer.service.hostappverification;

import defpackage.aorz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d {
    public final String a;
    public final aorz b;

    public d() {
    }

    public d(String str, aorz aorzVar) {
        this.a = str;
        this.b = aorzVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.a.equals(dVar.a) && this.b.equals(dVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43 + String.valueOf(valueOf).length());
        sb.append("HostAppVerificationData{token=");
        sb.append(str);
        sb.append(", apiAccess=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
