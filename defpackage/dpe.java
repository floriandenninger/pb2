package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dpe {
    private static final List c = new ArrayList();
    public dpd a;
    public final List b = new ArrayList();

    private static final int b(List list, String str) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            dpi dpiVar = (dpi) it.next();
            if (dpiVar.i.equals(str)) {
                break;
            }
            i += dpiVar.g;
        }
        return i;
    }

    private static final String c(dpi dpiVar, String str) {
        if (dpiVar != null && dpiVar.a == null) {
            return dpiVar.getClass().getSimpleName();
        }
        if (dpiVar == null) {
            return "";
        }
        String simpleName = dpiVar.getClass().getSimpleName();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(simpleName).length());
        sb.append(str);
        sb.append("->");
        sb.append(simpleName);
        return sb.toString();
    }

    public static dpd a(dpj dpjVar, dpi dpiVar, dpi dpiVar2, List list, aoae aoaeVar, String str, String str2, String str3, String str4, boolean z) {
        dpd dpdVar;
        dpd dpdVar2;
        if (dpiVar == null && dpiVar2 == null) {
            throw new IllegalStateException("Both currentRoot and newRoot are null.");
        }
        if (dpiVar2 == null) {
            int i = dpiVar.g;
            list.add(dpiVar);
            dpd d = dpd.d(dpiVar.g, dpiVar2, z);
            for (int i2 = 0; i2 < i; i2++) {
                d.f(dpb.e(null));
            }
            return d;
        }
        String c2 = c(dpiVar, str2);
        String c3 = c(dpiVar2, str3);
        if (dpiVar == null || dpk.h(dpiVar, dpiVar2)) {
            aoaeVar.S(str, dpiVar, dpiVar2, c2, c3, true, str4);
            if (dpiVar2.g()) {
                dpd d2 = dpd.d(dpiVar == null ? 0 : dpiVar.g, dpiVar2, z);
                dpiVar2.e(dpiVar2.c, d2, dpiVar, dpiVar2);
                dpiVar2.g = d2.d;
                return d2;
            }
            dpd c4 = dpd.c(dpiVar2, z);
            Map b = dpi.b(dpiVar);
            Map b2 = dpi.b(dpiVar2);
            List arrayList = dpiVar == null ? c : new ArrayList(dpiVar.h);
            List list2 = dpiVar2.h;
            int i3 = 0;
            int i4 = -1;
            int i5 = -1;
            while (i3 < list2.size()) {
                String str5 = ((dpi) list2.get(i3)).i;
                if (b.containsKey(str5)) {
                    hx hxVar = (hx) b.get(str5);
                    dpi dpiVar3 = (dpi) hxVar.a;
                    int intValue = ((Integer) hxVar.b).intValue();
                    if (i5 > intValue) {
                        for (int i6 = 0; i6 < dpiVar3.g; i6++) {
                            c4.f(dpb.a(0, b(arrayList, str5), i4, 1, null, null, null, null));
                        }
                        arrayList.remove(intValue);
                        arrayList.add(i5, dpiVar3);
                        int size = arrayList.size();
                        int i7 = 0;
                        while (i7 < size) {
                            dpi dpiVar4 = (dpi) arrayList.get(i7);
                            hx hxVar2 = (hx) b.get(dpiVar4.i);
                            if (((Integer) hxVar2.b).intValue() != i7) {
                                dpdVar2 = c4;
                                b.put(dpiVar4.i, new hx((dpi) hxVar2.a, Integer.valueOf(i7)));
                            } else {
                                dpdVar2 = c4;
                            }
                            i7++;
                            c4 = dpdVar2;
                        }
                    } else {
                        dpdVar = c4;
                        if (intValue > i5) {
                            i4 = (b(arrayList, str5) + ((dpi) arrayList.get(intValue)).g) - 1;
                            i5 = intValue;
                            i3++;
                            c4 = dpdVar;
                        }
                        i3++;
                        c4 = dpdVar;
                    }
                }
                dpdVar = c4;
                i3++;
                c4 = dpdVar;
            }
            dpd dpdVar3 = c4;
            SparseArray sparseArray = new SparseArray();
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                String str6 = ((dpi) arrayList.get(i8)).i;
                dpi dpiVar5 = (dpi) arrayList.get(i8);
                if (b2.get(str6) == null) {
                    sparseArray.put(i8, a(dpjVar, dpiVar5, null, list, aoaeVar, str, c2, c3, str4, z));
                }
            }
            int i9 = 0;
            for (int i10 = 0; i10 < list2.size(); i10++) {
                dpi dpiVar6 = (dpi) list2.get(i10);
                hx hxVar3 = (hx) b.get(dpiVar6.i);
                int intValue2 = hxVar3 != null ? ((Integer) hxVar3.b).intValue() : -1;
                if (intValue2 < 0) {
                    dpd dpdVar4 = (dpd) sparseArray.get(i9);
                    dpd a = a(dpjVar, null, dpiVar6, list, aoaeVar, str, c2, c3, str4, z);
                    sparseArray.put(i9, dpd.e(dpdVar4, a));
                    if (dpdVar4 != null) {
                        dpdVar4.g();
                    }
                    a.g();
                } else {
                    dpd dpdVar5 = (dpd) sparseArray.get(intValue2);
                    dpd a2 = a(dpjVar, (dpi) arrayList.get(intValue2), dpiVar6, list, aoaeVar, str, c2, c3, str4, z);
                    sparseArray.put(intValue2, dpd.e(dpdVar5, a2));
                    if (dpdVar5 != null) {
                        dpdVar5.g();
                    }
                    a2.g();
                    i9 = intValue2;
                }
            }
            int size2 = sparseArray.size();
            dpd dpdVar6 = dpdVar3;
            for (int i11 = 0; i11 < size2; i11++) {
                dpd dpdVar7 = (dpd) sparseArray.valueAt(i11);
                dpdVar6 = dpd.e(dpdVar6, dpdVar7);
                if (dpdVar7 != null) {
                    dpdVar7.g();
                }
            }
            dpiVar2.g = dpdVar6.d;
            return dpdVar6;
        }
        dpd d3 = dpd.d(dpiVar.g, dpiVar2, z);
        dpiVar2.g = d3.d;
        aoaeVar.S(str, dpiVar, dpiVar2, c2, c3, false, str4);
        return d3;
    }
}
