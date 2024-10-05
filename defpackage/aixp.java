package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aixp implements Comparator, Serializable {
    public static final int a(aixn aixnVar, aixn aixnVar2) {
        long j = aixnVar.a;
        long j2 = aixnVar2.a;
        if (j != j2) {
            return j < j2 ? -1 : 1;
        }
        if (aixnVar.a() != aixnVar2.a()) {
            return aixnVar2.a() - aixnVar.a();
        }
        int i = aixnVar.c - 1;
        int i2 = aixnVar2.c - 1;
        return i != i2 ? i - i2 : aixnVar.b().compareTo(aixnVar2.b());
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return a((aixn) obj, (aixn) obj2);
    }
}
