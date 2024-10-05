package defpackage;

import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dkl {
    private static final HashSet a;

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        hashSet.add("_changeset");
        hashSet.add("_firstlayout");
    }

    public dkl() {
        new HashSet();
        new HashSet();
    }

    public static boolean b(dkl dklVar) {
        return dklVar != null && dklVar.a();
    }

    protected abstract boolean a();
}
