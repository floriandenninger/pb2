package defpackage;

import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pnc {
    public final Uri a;
    public final String b;
    public final pna c;
    public final List e;
    public final List g;
    public final Object h;
    public final pmw d = null;
    public final String f = null;

    public pnc(Uri uri, String str, pna pnaVar, List list, List list2, Object obj) {
        this.a = uri;
        this.b = str;
        this.c = pnaVar;
        this.e = list;
        this.g = list2;
        this.h = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pnc)) {
            return false;
        }
        pnc pncVar = (pnc) obj;
        if (this.a.equals(pncVar.a) && pts.R(this.b, pncVar.b) && pts.R(this.c, pncVar.c)) {
            pmw pmwVar = pncVar.d;
            if (pts.R(null, null) && this.e.equals(pncVar.e)) {
                String str = pncVar.f;
                if (pts.R(null, null) && this.g.equals(pncVar.g) && pts.R(this.h, pncVar.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        pna pnaVar = this.c;
        int hashCode3 = (((((hashCode2 + (pnaVar == null ? 0 : pnaVar.hashCode())) * 961) + this.e.hashCode()) * 961) + this.g.hashCode()) * 31;
        Object obj = this.h;
        return hashCode3 + (obj != null ? obj.hashCode() : 0);
    }
}
