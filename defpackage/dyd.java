package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dyd implements Iterable, dyn, dyj {
    final SortedMap a;
    final Map b;

    public dyd() {
        this.a = new TreeMap();
        this.b = new TreeMap();
    }

    public final int b() {
        return this.a.size();
    }

    public final int c() {
        if (this.a.isEmpty()) {
            return 0;
        }
        return ((Integer) this.a.lastKey()).intValue() + 1;
    }

    @Override // defpackage.dyn
    public final dyn d() {
        dyd dydVar = new dyd();
        for (Map.Entry entry : this.a.entrySet()) {
            if (entry.getValue() instanceof dyj) {
                dydVar.a.put((Integer) entry.getKey(), (dyn) entry.getValue());
            } else {
                dydVar.a.put((Integer) entry.getKey(), ((dyn) entry.getValue()).d());
            }
        }
        return dydVar;
    }

    public final dyn e(int i) {
        dyn dynVar;
        if (i < c()) {
            return (!s(i) || (dynVar = (dyn) this.a.get(Integer.valueOf(i))) == null) ? f : dynVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dyd)) {
            return false;
        }
        dyd dydVar = (dyd) obj;
        if (c() != dydVar.c()) {
            return false;
        }
        if (this.a.isEmpty()) {
            return dydVar.a.isEmpty();
        }
        for (int intValue = ((Integer) this.a.firstKey()).intValue(); intValue <= ((Integer) this.a.lastKey()).intValue(); intValue++) {
            if (!e(intValue).equals(dydVar.e(intValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.dyj
    public final dyn f(String str) {
        dyn dynVar;
        if ("length".equals(str)) {
            return new dyg(Double.valueOf(c()));
        }
        return (!t(str) || (dynVar = (dyn) this.b.get(str)) == null) ? f : dynVar;
    }

    @Override // defpackage.dyn
    public final Boolean g() {
        return true;
    }

    @Override // defpackage.dyn
    public final Double h() {
        if (this.a.size() == 1) {
            return e(0).h();
        }
        if (this.a.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // defpackage.dyn
    public final String i() {
        return toString();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new dyc(this);
    }

    public final String j(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            for (int i = 0; i < c(); i++) {
                dyn e = e(i);
                sb.append(str);
                if (!(e instanceof dyr) && !(e instanceof dyl)) {
                    sb.append(e.i());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final Iterator k() {
        return this.a.keySet().iterator();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:50:0x0194. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [dyd] */
    /* JADX WARN: Type inference failed for: r0v108, types: [dyq] */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v111, types: [dyg] */
    /* JADX WARN: Type inference failed for: r0v29, types: [dyg] */
    /* JADX WARN: Type inference failed for: r0v30, types: [dyg] */
    /* JADX WARN: Type inference failed for: r0v31, types: [dyg] */
    /* JADX WARN: Type inference failed for: r0v47, types: [dyn] */
    /* JADX WARN: Type inference failed for: r0v51, types: [dyg] */
    /* JADX WARN: Type inference failed for: r0v52, types: [dyg] */
    /* JADX WARN: Type inference failed for: r0v53, types: [dyg] */
    /* JADX WARN: Type inference failed for: r0v63, types: [dyd] */
    /* JADX WARN: Type inference failed for: r0v64, types: [dyd] */
    /* JADX WARN: Type inference failed for: r0v68, types: [dyn] */
    /* JADX WARN: Type inference failed for: r0v70, types: [dyg] */
    /* JADX WARN: Type inference failed for: r0v73, types: [dyn] */
    /* JADX WARN: Type inference failed for: r0v75, types: [dyn] */
    /* JADX WARN: Type inference failed for: r0v79, types: [dyn] */
    /* JADX WARN: Type inference failed for: r0v81, types: [dyd] */
    /* JADX WARN: Type inference failed for: r0v89, types: [dyn] */
    /* JADX WARN: Type inference failed for: r0v92, types: [dyn] */
    /* JADX WARN: Type inference failed for: r0v93, types: [dyn] */
    /* JADX WARN: Type inference failed for: r0v94, types: [dyn] */
    @Override // defpackage.dyn
    public final dyn ks(String str, dxk dxkVar, List list) {
        char c;
        dyd dydVar;
        dyn dygVar;
        String str2;
        dyn dyqVar;
        dyd dydVar2;
        double min;
        dyh dyhVar;
        if ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) {
            switch (str.hashCode()) {
                case -1776922004:
                    if (str.equals("toString")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case -1354795244:
                    if (str.equals("concat")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1274492040:
                    if (str.equals("filter")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -934873754:
                    if (str.equals("reduce")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -895859076:
                    if (str.equals("splice")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case -678635926:
                    if (str.equals("forEach")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -467511597:
                    if (str.equals("lastIndexOf")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -277637751:
                    if (str.equals("unshift")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 107868:
                    if (str.equals("map")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 111185:
                    if (str.equals("pop")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 3267882:
                    if (str.equals("join")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3452698:
                    if (str.equals("push")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 3536116:
                    if (str.equals("some")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 3536286:
                    if (str.equals("sort")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 96891675:
                    if (str.equals("every")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 109407362:
                    if (str.equals("shift")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 109526418:
                    if (str.equals("slice")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 965561430:
                    if (str.equals("reduceRight")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 1099846370:
                    if (str.equals("reverse")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 1943291465:
                    if (str.equals("indexOf")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            double d = 0.0d;
            switch (c) {
                case 0:
                    dyn d2 = d();
                    if (list.isEmpty()) {
                        return d2;
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        dyn b = dxkVar.b((dyn) it.next());
                        if (!(b instanceof dyf)) {
                            dyd dydVar3 = (dyd) d2;
                            int c2 = dydVar3.c();
                            if (b instanceof dyd) {
                                dyd dydVar4 = (dyd) b;
                                Iterator k = dydVar4.k();
                                while (k.hasNext()) {
                                    Integer num = (Integer) k.next();
                                    dydVar3.q(num.intValue() + c2, dydVar4.e(num.intValue()));
                                }
                            } else {
                                dydVar3.q(c2, b);
                            }
                        } else {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                    }
                    return d2;
                case 1:
                    esv.B("every", 1, list);
                    dyn b2 = dxkVar.b((dyn) list.get(0));
                    if (!(b2 instanceof dym)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (c() != 0 && esv.n(this, dxkVar, (dym) b2, false, true).c() != c()) {
                        return dyn.l;
                    }
                    return dyn.k;
                case 2:
                    esv.B("filter", 1, list);
                    dyn b3 = dxkVar.b((dyn) list.get(0));
                    if (!(b3 instanceof dym)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (b() == 0) {
                        return new dyd();
                    }
                    dyn d3 = d();
                    dyd n = esv.n(this, dxkVar, (dym) b3, null, true);
                    dyd dydVar5 = new dyd();
                    Iterator k2 = n.k();
                    while (k2.hasNext()) {
                        dydVar5.n(((dyd) d3).e(((Integer) k2.next()).intValue()));
                    }
                    return dydVar5;
                case 3:
                    esv.B("forEach", 1, list);
                    dyn b4 = dxkVar.b((dyn) list.get(0));
                    if (!(b4 instanceof dym)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (b() == 0) {
                        return dyn.f;
                    }
                    esv.o(this, dxkVar, (dym) b4);
                    return dyn.f;
                case 4:
                    dydVar = this;
                    esv.E("indexOf", 2, list);
                    dyn dynVar = dyn.f;
                    if (!list.isEmpty()) {
                        dynVar = dxkVar.b((dyn) list.get(0));
                    }
                    if (list.size() > 1) {
                        double u = esv.u(dxkVar.b((dyn) list.get(1)).h().doubleValue());
                        if (u >= c()) {
                            dygVar = new dyg(Double.valueOf(-1.0d));
                            return dygVar;
                        }
                        if (u < 0.0d) {
                            double c3 = c();
                            Double.isNaN(c3);
                            d = c3 + u;
                        } else {
                            d = u;
                        }
                    }
                    Iterator k3 = k();
                    while (true) {
                        if (k3.hasNext()) {
                            int intValue = ((Integer) k3.next()).intValue();
                            double d4 = intValue;
                            if (d4 >= d && esv.G(dydVar.e(intValue), dynVar)) {
                                dygVar = new dyg(Double.valueOf(d4));
                            }
                        } else {
                            dygVar = new dyg(Double.valueOf(-1.0d));
                        }
                    }
                    return dygVar;
                case 5:
                    dydVar = this;
                    esv.E("join", 1, list);
                    if (c() == 0) {
                        dygVar = dyn.m;
                        return dygVar;
                    }
                    if (list.size() > 0) {
                        dyn b5 = dxkVar.b((dyn) list.get(0));
                        str2 = ((b5 instanceof dyl) || (b5 instanceof dyr)) ? "" : b5.i();
                    } else {
                        str2 = ",";
                    }
                    dyqVar = new dyq(dydVar.j(str2));
                    return dyqVar;
                case 6:
                    dydVar = this;
                    esv.E("lastIndexOf", 2, list);
                    dyn dynVar2 = dyn.f;
                    if (!list.isEmpty()) {
                        dynVar2 = dxkVar.b((dyn) list.get(0));
                    }
                    double c4 = c() - 1;
                    if (list.size() > 1) {
                        dyn b6 = dxkVar.b((dyn) list.get(1));
                        c4 = Double.isNaN(b6.h().doubleValue()) ? c() - 1 : esv.u(b6.h().doubleValue());
                        if (c4 < 0.0d) {
                            double c5 = c();
                            Double.isNaN(c5);
                            c4 += c5;
                        }
                    }
                    if (c4 < 0.0d) {
                        dygVar = new dyg(Double.valueOf(-1.0d));
                    } else {
                        int min2 = (int) Math.min(c(), c4);
                        while (true) {
                            if (min2 >= 0) {
                                if (dydVar.s(min2) && esv.G(dydVar.e(min2), dynVar2)) {
                                    dygVar = new dyg(Double.valueOf(min2));
                                } else {
                                    min2--;
                                }
                            } else {
                                dygVar = new dyg(Double.valueOf(-1.0d));
                            }
                        }
                    }
                    return dygVar;
                case 7:
                    dydVar = this;
                    esv.B("map", 1, list);
                    dyn b7 = dxkVar.b((dyn) list.get(0));
                    if (!(b7 instanceof dym)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (c() == 0) {
                        dygVar = new dyd();
                    } else {
                        dygVar = esv.o(dydVar, dxkVar, (dym) b7);
                    }
                    return dygVar;
                case '\b':
                    dydVar = this;
                    esv.B("pop", 0, list);
                    int c6 = c();
                    if (c6 == 0) {
                        dygVar = dyn.f;
                        return dygVar;
                    }
                    int i = c6 - 1;
                    dyqVar = dydVar.e(i);
                    dydVar.p(i);
                    return dyqVar;
                case '\t':
                    dydVar = this;
                    if (!list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            dydVar.n(dxkVar.b((dyn) it2.next()));
                        }
                    }
                    dygVar = new dyg(Double.valueOf(c()));
                    return dygVar;
                case '\n':
                    dydVar = this;
                    dygVar = esv.p(dydVar, dxkVar, list, true);
                    return dygVar;
                case 11:
                    dydVar = this;
                    dygVar = esv.p(dydVar, dxkVar, list, false);
                    return dygVar;
                case '\f':
                    dydVar2 = this;
                    esv.B("reverse", 0, list);
                    int c7 = c();
                    if (c7 != 0) {
                        for (int i2 = 0; i2 < c7 / 2; i2++) {
                            if (dydVar2.s(i2)) {
                                dyn e = dydVar2.e(i2);
                                dydVar2.q(i2, null);
                                int i3 = (c7 - 1) - i2;
                                if (dydVar2.s(i3)) {
                                    dydVar2.q(i2, dydVar2.e(i3));
                                }
                                dydVar2.q(i3, e);
                            }
                        }
                    }
                    return dydVar2;
                case '\r':
                    dydVar = this;
                    esv.B("shift", 0, list);
                    if (c() == 0) {
                        dygVar = dyn.f;
                        return dygVar;
                    }
                    dyqVar = dydVar.e(0);
                    dydVar.p(0);
                    return dyqVar;
                case 14:
                    dydVar = this;
                    esv.E("slice", 2, list);
                    if (list.isEmpty()) {
                        dygVar = d();
                    } else {
                        double c8 = c();
                        double u2 = esv.u(dxkVar.b((dyn) list.get(0)).h().doubleValue());
                        if (u2 < 0.0d) {
                            Double.isNaN(c8);
                            min = Math.max(u2 + c8, 0.0d);
                        } else {
                            min = Math.min(u2, c8);
                        }
                        if (list.size() == 2) {
                            double u3 = esv.u(dxkVar.b((dyn) list.get(1)).h().doubleValue());
                            if (u3 < 0.0d) {
                                Double.isNaN(c8);
                                c8 = Math.max(c8 + u3, 0.0d);
                            } else {
                                c8 = Math.min(c8, u3);
                            }
                        }
                        dygVar = new dyd();
                        for (int i4 = (int) min; i4 < c8; i4++) {
                            dygVar.n(dydVar.e(i4));
                        }
                    }
                    return dygVar;
                case 15:
                    dydVar = this;
                    esv.B("some", 1, list);
                    dyn b8 = dxkVar.b((dyn) list.get(0));
                    if (!(b8 instanceof dyh)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (c() == 0) {
                        dygVar = dyn.l;
                    } else {
                        dyh dyhVar2 = (dyh) b8;
                        Iterator k4 = k();
                        while (true) {
                            if (k4.hasNext()) {
                                int intValue2 = ((Integer) k4.next()).intValue();
                                if (dydVar.s(intValue2) && dyhVar2.a(dxkVar, Arrays.asList(dydVar.e(intValue2), new dyg(Double.valueOf(intValue2)), dydVar)).g().booleanValue()) {
                                    dygVar = dyn.k;
                                }
                            } else {
                                dygVar = dyn.l;
                            }
                        }
                    }
                    return dygVar;
                case 16:
                    dydVar2 = this;
                    esv.E("sort", 1, list);
                    if (c() >= 2) {
                        List m = m();
                        if (list.isEmpty()) {
                            dyhVar = null;
                        } else {
                            dyn b9 = dxkVar.b((dyn) list.get(0));
                            if (!(b9 instanceof dyh)) {
                                throw new IllegalArgumentException("Comparator should be a method");
                            }
                            dyhVar = (dyh) b9;
                        }
                        Collections.sort(m, new dyx(dyhVar, dxkVar));
                        o();
                        Iterator it3 = m.iterator();
                        int i5 = 0;
                        while (it3.hasNext()) {
                            dydVar2.q(i5, (dyn) it3.next());
                            i5++;
                        }
                    }
                    return dydVar2;
                case 17:
                    dydVar = this;
                    if (list.isEmpty()) {
                        dygVar = new dyd();
                        return dygVar;
                    }
                    int u4 = (int) esv.u(dxkVar.b((dyn) list.get(0)).h().doubleValue());
                    if (u4 < 0) {
                        u4 = Math.max(0, u4 + c());
                    } else if (u4 > c()) {
                        u4 = c();
                    }
                    int c9 = c();
                    dyd dydVar6 = new dyd();
                    if (list.size() > 1) {
                        int max = Math.max(0, (int) esv.u(dxkVar.b((dyn) list.get(1)).h().doubleValue()));
                        if (max > 0) {
                            for (int i6 = u4; i6 < Math.min(c9, u4 + max); i6++) {
                                dydVar6.n(dydVar.e(u4));
                                dydVar.p(u4);
                            }
                        }
                        if (list.size() > 2) {
                            for (int i7 = 2; i7 < list.size(); i7++) {
                                dyn b10 = dxkVar.b((dyn) list.get(i7));
                                if (b10 instanceof dyf) {
                                    throw new IllegalArgumentException("Failed to parse elements to add");
                                }
                                int i8 = (u4 + i7) - 2;
                                if (i8 >= 0) {
                                    if (i8 >= c()) {
                                        dydVar.q(i8, b10);
                                    } else {
                                        for (int intValue3 = ((Integer) dydVar.a.lastKey()).intValue(); intValue3 >= i8; intValue3--) {
                                            SortedMap sortedMap = dydVar.a;
                                            Integer valueOf = Integer.valueOf(intValue3);
                                            dyn dynVar3 = (dyn) sortedMap.get(valueOf);
                                            if (dynVar3 != null) {
                                                dydVar.q(intValue3 + 1, dynVar3);
                                                dydVar.a.remove(valueOf);
                                            }
                                        }
                                        dydVar.q(i8, b10);
                                    }
                                } else {
                                    StringBuilder sb = new StringBuilder(32);
                                    sb.append("Invalid value index: ");
                                    sb.append(i8);
                                    throw new IllegalArgumentException(sb.toString());
                                }
                            }
                        }
                    } else {
                        while (u4 < c9) {
                            dydVar6.n(dydVar.e(u4));
                            dydVar.q(u4, null);
                            u4++;
                        }
                    }
                    return dydVar6;
                case 18:
                    dydVar = this;
                    esv.B("toString", 0, list);
                    dygVar = new dyq(toString());
                    return dygVar;
                case 19:
                    if (list.isEmpty()) {
                        dydVar = this;
                    } else {
                        dyd dydVar7 = new dyd();
                        Iterator it4 = list.iterator();
                        while (it4.hasNext()) {
                            dyn b11 = dxkVar.b((dyn) it4.next());
                            if (!(b11 instanceof dyf)) {
                                dydVar7.n(b11);
                            } else {
                                throw new IllegalStateException("Argument evaluation failed");
                            }
                        }
                        int c10 = dydVar7.c();
                        Iterator k5 = k();
                        while (k5.hasNext()) {
                            Integer num2 = (Integer) k5.next();
                            dydVar7.q(num2.intValue() + c10, e(num2.intValue()));
                        }
                        dydVar = this;
                        o();
                        Iterator k6 = dydVar7.k();
                        while (k6.hasNext()) {
                            Integer num3 = (Integer) k6.next();
                            dydVar.q(num3.intValue(), dydVar7.e(num3.intValue()));
                        }
                    }
                    dygVar = new dyg(Double.valueOf(c()));
                    return dygVar;
                default:
                    throw new IllegalArgumentException("Command not supported");
            }
        }
        return esv.q(this, new dyq(str), dxkVar, list);
    }

    @Override // defpackage.dyn
    public final Iterator l() {
        return new dyb(this.a.keySet().iterator(), this.b.keySet().iterator());
    }

    public final List m() {
        ArrayList arrayList = new ArrayList(c());
        for (int i = 0; i < c(); i++) {
            arrayList.add(e(i));
        }
        return arrayList;
    }

    public final void n(dyn dynVar) {
        q(c(), dynVar);
    }

    public final void o() {
        this.a.clear();
    }

    public final void p(int i) {
        int intValue = ((Integer) this.a.lastKey()).intValue();
        if (i > intValue || i < 0) {
            return;
        }
        this.a.remove(Integer.valueOf(i));
        if (i == intValue) {
            SortedMap sortedMap = this.a;
            int i2 = i - 1;
            Integer valueOf = Integer.valueOf(i2);
            if (sortedMap.containsKey(valueOf) || i2 < 0) {
                return;
            }
            this.a.put(valueOf, dyn.f);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) this.a.lastKey()).intValue()) {
                return;
            }
            SortedMap sortedMap2 = this.a;
            Integer valueOf2 = Integer.valueOf(i);
            dyn dynVar = (dyn) sortedMap2.get(valueOf2);
            if (dynVar != null) {
                this.a.put(Integer.valueOf(i - 1), dynVar);
                this.a.remove(valueOf2);
            }
        }
    }

    @Override // defpackage.dyj
    public final void r(String str, dyn dynVar) {
        if (dynVar == null) {
            this.b.remove(str);
        } else {
            this.b.put(str, dynVar);
        }
    }

    public final boolean s(int i) {
        if (i < 0 || i > ((Integer) this.a.lastKey()).intValue()) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Out of bounds index: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        return this.a.containsKey(Integer.valueOf(i));
    }

    @Override // defpackage.dyj
    public final boolean t(String str) {
        return "length".equals(str) || this.b.containsKey(str);
    }

    public final String toString() {
        return j(",");
    }

    public final void q(int i, dyn dynVar) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Out of bounds index: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (dynVar == null) {
            this.a.remove(Integer.valueOf(i));
        } else {
            this.a.put(Integer.valueOf(i), dynVar);
        }
    }

    public dyd(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                q(i, (dyn) list.get(i));
            }
        }
    }

    public dyd(dyn... dynVarArr) {
        this(Arrays.asList(dynVarArr));
    }
}
