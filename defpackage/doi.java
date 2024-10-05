package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class doi {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();

    public static void a(dop dopVar, dop dopVar2, String str) {
        if (dopVar.b.remove(dopVar2)) {
            Map map = dopVar2.a;
            if (map == null || map.remove(str) == null) {
                String valueOf = String.valueOf(str);
                throw new RuntimeException(valueOf.length() != 0 ? "Tried to remove non-existent input with name: ".concat(valueOf) : new String("Tried to remove non-existent input with name: "));
            }
            return;
        }
        throw new RuntimeException("Tried to remove non-existent input!");
    }
}
