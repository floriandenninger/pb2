package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adkg {
    public final adkb a;
    public final SparseArray b;
    public final SparseArray c;
    public final adgd d;
    public final adke e;
    public final boolean f;
    public final adke g;
    public final List h;
    public final List i;
    public final Set j;
    public final Set k;
    public final List l;

    public adkg(adkb adkbVar, SparseArray sparseArray, SparseArray sparseArray2, adgd adgdVar, adke adkeVar, boolean z, adke adkeVar2, List list, List list2, Set set, Set set2, List list3) {
        this.a = adkbVar;
        this.b = sparseArray.clone();
        this.c = sparseArray2.clone();
        this.d = adgdVar;
        this.e = adkeVar;
        this.f = z;
        this.g = adkeVar2;
        this.h = new ArrayList(list);
        this.i = new ArrayList(list2);
        this.j = new HashSet(set);
        this.k = new HashSet(set2);
        this.l = new ArrayList(list3);
    }
}
