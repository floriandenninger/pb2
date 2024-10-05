package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cje implements ciz {
    public final boolean a;
    public final int b;

    public cje(int i, boolean z) {
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.ciz
    public final cgo a(cfz cfzVar, cjp cjpVar) {
        if (cfzVar.j) {
            return new cgx(this);
        }
        cll.a("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        int i = this.b;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "EXCLUDE_INTERSECTIONS" : "INTERSECT" : "SUBTRACT" : "ADD" : "MERGE";
        StringBuilder sb = new StringBuilder(str.length() + 17);
        sb.append("MergePaths{mode=");
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
