package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ttj {
    public final boolean a;
    private final Object b;
    private final Object c;

    private ttj(boolean z, Object obj, Object obj2) {
        this.a = z;
        this.b = obj;
        this.c = obj2;
    }

    public static ttj a(Object obj) {
        return new ttj(true, obj, null);
    }

    public static ttj b(Object obj) {
        return new ttj(false, null, obj);
    }

    public static boolean e(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public final Object c() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("Either was not left");
    }

    public final Object d() {
        if (f()) {
            return this.c;
        }
        throw new IllegalStateException("Either was not right");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ttj)) {
            return false;
        }
        ttj ttjVar = (ttj) obj;
        return this.a ? ttjVar.a && e(c(), ttjVar.c()) : ttjVar.f() && e(d(), ttjVar.d());
    }

    public final boolean f() {
        return !this.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, this.c});
    }

    public static boolean g(ttj ttjVar, ttj ttjVar2, Comparator comparator) {
        Object obj;
        if (ttjVar == null || !ttjVar.a || (obj = ttjVar.b) == null || ttjVar2 == null || !ttjVar2.a || ttjVar2.b == null) {
            return e(ttjVar, ttjVar2);
        }
        ArrayList arrayList = new ArrayList((Collection) obj);
        ArrayList arrayList2 = new ArrayList((Collection) ttjVar2.b);
        Collections.sort(arrayList, comparator);
        Collections.sort(arrayList2, comparator);
        return arrayList.equals(arrayList2);
    }
}
