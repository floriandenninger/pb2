package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akkv implements ajms {
    public final String a;
    public final aqdw b;
    public final aqdy c;
    public final aqdz d;

    public akkv(String str, aqdw aqdwVar, aqdy aqdyVar, aqdz aqdzVar) {
        this.b = aqdwVar;
        this.c = aqdyVar;
        this.d = aqdzVar;
        if (TextUtils.isEmpty(str)) {
            this.a = b();
        } else {
            this.a = str;
        }
    }

    final long a() {
        aqdw aqdwVar = this.b;
        if (aqdwVar != null) {
            return aqdwVar.f;
        }
        aqdy aqdyVar = this.c;
        if (aqdyVar != null) {
            return aqdyVar.e;
        }
        aqdz aqdzVar = this.d;
        if (aqdzVar != null) {
            return aqdzVar.e;
        }
        return 0L;
    }

    public final String b() {
        if (!TextUtils.isEmpty(this.a)) {
            return this.a;
        }
        aqdw aqdwVar = this.b;
        if (aqdwVar != null) {
            if ((aqdwVar.b & 512) != 0) {
                return aqdwVar.h;
            }
            return null;
        }
        aqdy aqdyVar = this.c;
        if (aqdyVar != null) {
            return aqdyVar.g;
        }
        aqdz aqdzVar = this.d;
        if (aqdzVar == null || (aqdzVar.b & 4096) == 0) {
            return null;
        }
        return aqdzVar.g;
    }

    @Override // defpackage.ajms
    public final ajms e(ajms ajmsVar) {
        akkv akkvVar = (akkv) ajmsVar;
        return akkvVar.a() < a() ? this : akkvVar.a() > a() ? akkvVar : new akkv(this.a, this.b, this.c, this.d);
    }
}
