package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aexz {
    public static boolean g(aexz aexzVar, aexz aexzVar2) {
        if (aexzVar != aexzVar2) {
            if (aexzVar != null && aexzVar2 != null) {
                aexy aexyVar = (aexy) aexzVar;
                aexy aexyVar2 = (aexy) aexzVar2;
                if (aexyVar.c != aexyVar2.c || !TextUtils.equals(aexyVar.b, aexyVar2.b)) {
                }
            }
            return false;
        }
        return true;
    }

    public static aexz h(int i, int i2, pms pmsVar, String str) {
        return new aexy(i, i2, pmsVar, str);
    }

    public abstract int a();

    public abstract pms b();

    public abstract String c();

    public abstract int d();

    public asi e() {
        throw null;
    }

    public bel f() {
        throw null;
    }
}
