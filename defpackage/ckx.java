package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ckx implements cld {
    public static final ckx a = new ckx();
    private static final clg b = clg.a("c", "v", "i", "o");

    private ckx() {
    }

    @Override // defpackage.cld
    public final /* bridge */ /* synthetic */ Object a(clh clhVar, float f) {
        if (clhVar.r() == 1) {
            clhVar.i();
        }
        clhVar.j();
        List list = null;
        List list2 = null;
        List list3 = null;
        boolean z = false;
        while (clhVar.p()) {
            int c = clhVar.c(b);
            if (c == 0) {
                z = clhVar.q();
            } else if (c == 1) {
                list = cko.d(clhVar, f);
            } else if (c == 2) {
                list2 = cko.d(clhVar, f);
            } else if (c == 3) {
                list3 = cko.d(clhVar, f);
            } else {
                clhVar.n();
                clhVar.o();
            }
        }
        clhVar.l();
        if (clhVar.r() == 2) {
            clhVar.k();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (list.isEmpty()) {
            return new cji(new PointF(), false, Collections.emptyList());
        }
        int size = list.size();
        PointF pointF = (PointF) list.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) list.get(i);
            int i2 = i - 1;
            arrayList.add(new cic(cln.f((PointF) list.get(i2), (PointF) list3.get(i2)), cln.f(pointF2, (PointF) list2.get(i)), pointF2));
        }
        if (z) {
            PointF pointF3 = (PointF) list.get(0);
            int i3 = size - 1;
            arrayList.add(new cic(cln.f((PointF) list.get(i3), (PointF) list3.get(i3)), cln.f(pointF3, (PointF) list2.get(0)), pointF3));
        }
        return new cji(pointF, z, arrayList);
    }
}
