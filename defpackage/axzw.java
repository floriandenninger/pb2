package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axzw {
    public static final axzr a = new axzt();

    public static axzp a(axzp axzpVar, List list) {
        axzpVar.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            axzpVar = new axzv(axzpVar, (axzs) it.next());
        }
        return axzpVar;
    }

    public static axzp b(axzp axzpVar, axzs... axzsVarArr) {
        return a(axzpVar, Arrays.asList(axzsVarArr));
    }
}
