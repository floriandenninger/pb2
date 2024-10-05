package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pnd implements plg {
    public final String a;
    public final pnc b;
    public final pnb c;
    public final pnf d;
    public final pmy e;

    static {
        new pmx().a();
    }

    public pnd(String str, pmy pmyVar, pnc pncVar, pnb pnbVar, pnf pnfVar) {
        this.a = str;
        this.b = pncVar;
        this.c = pnbVar;
        this.d = pnfVar;
        this.e = pmyVar;
    }

    public static pnd a(Uri uri) {
        pmx pmxVar = new pmx();
        pmxVar.a = uri;
        return pmxVar.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pnd)) {
            return false;
        }
        pnd pndVar = (pnd) obj;
        return pts.R(this.a, pndVar.a) && this.e.equals(pndVar.e) && pts.R(this.b, pndVar.b) && pts.R(this.c, pndVar.c) && pts.R(this.d, pndVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        pnc pncVar = this.b;
        return ((((((hashCode + (pncVar != null ? pncVar.hashCode() : 0)) * 31) + this.c.hashCode()) * 31) + this.e.hashCode()) * 31) + this.d.hashCode();
    }
}
