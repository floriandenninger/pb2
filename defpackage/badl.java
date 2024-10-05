package defpackage;

import j$.util.Objects;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class badl implements Comparable, Serializable {
    private static final long serialVersionUID = 1;

    public static badl d(Object obj, Object obj2, Object obj3) {
        return new badk(obj, obj2, obj3);
    }

    public abstract Object a();

    public abstract Object b();

    public abstract Object c();

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        badl badlVar = (badl) obj;
        ajbh ajbhVar = new ajbh((char[]) null);
        ajbhVar.O(a(), badlVar.a());
        ajbhVar.O(b(), badlVar.b());
        ajbhVar.O(c(), badlVar.c());
        return ajbhVar.i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof badl) {
            badl badlVar = (badl) obj;
            if (Objects.equals(a(), badlVar.a()) && Objects.equals(b(), badlVar.b()) && Objects.equals(c(), badlVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "(" + a() + "," + b() + "," + c() + ")";
    }

    public final int hashCode() {
        return ((a() == null ? 0 : a().hashCode()) ^ (b() == null ? 0 : b().hashCode())) ^ (c() != null ? c().hashCode() : 0);
    }
}
