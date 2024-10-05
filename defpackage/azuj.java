package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azuj {
    public azuj(azxe azxeVar) {
        azxeVar.getClass();
    }

    public static final Class a(azux azuxVar) {
        String name;
        azuxVar.getClass();
        Class a = ((azug) azuxVar).a();
        if (!a.isPrimitive() || (name = a.getName()) == null) {
            return a;
        }
        switch (name.hashCode()) {
            case -1325958191:
                return name.equals("double") ? Double.class : a;
            case 104431:
                return name.equals("int") ? Integer.class : a;
            case 3039496:
                return name.equals("byte") ? Byte.class : a;
            case 3052374:
                return name.equals("char") ? Character.class : a;
            case 3327612:
                return name.equals("long") ? Long.class : a;
            case 3625364:
                return name.equals("void") ? Void.class : a;
            case 64711720:
                return name.equals("boolean") ? Boolean.class : a;
            case 97526364:
                return name.equals("float") ? Float.class : a;
            case 109413500:
                return name.equals("short") ? Short.class : a;
            default:
                return a;
        }
    }

    public static List b(azuz azuzVar) {
        ArrayList arrayList = new ArrayList();
        Iterator a = azuzVar.a();
        while (a.hasNext()) {
            arrayList.add(a.next());
        }
        int size = arrayList.size();
        return size != 0 ? size != 1 ? arrayList : aype.c(arrayList.get(0)) : azsh.a;
    }

    public static int c(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static int d(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static int e(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static final void f(azsv azsvVar, CancellationException cancellationException) {
        azxg azxgVar = (azxg) azsvVar.get(azxg.b);
        if (azxgVar == null) {
            return;
        }
        azxgVar.k(cancellationException);
    }

    public static /* synthetic */ azww g(azxg azxgVar, boolean z, aztu aztuVar, int i) {
        int i2 = (z ? 1 : 0) & ((i & 1) ^ 1);
        return azxgVar.j(1 == i2, (i & 2) != 0, aztuVar);
    }

    public static final void h(azwt azwtVar, azsq azsqVar, boolean z) {
        Object b = ((azvt) azwtVar).b();
        Throwable e = azwtVar.e(b);
        Object l = e != null ? aype.l(e) : azwtVar.c(b);
        if (z) {
            azzm azzmVar = (azzm) azsqVar;
            azsq azsqVar2 = azzmVar.b;
            Object obj = azzmVar.d;
            azsv context = azsqVar2.getContext();
            Object b2 = baae.b(context, obj);
            if (b2 != baae.a) {
                azwh.c(azsqVar2, context);
            }
            try {
                azzmVar.b.resumeWith(l);
                return;
            } finally {
                baae.c(context, b2);
            }
        }
        azsqVar.resumeWith(l);
    }

    public static final boolean i(int i) {
        return i == 1 || i == 2;
    }
}
