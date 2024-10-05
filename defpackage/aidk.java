package defpackage;

import j$.util.function.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aidk implements Function {
    private final /* synthetic */ int p;
    public static final /* synthetic */ aidk o = new aidk(14);
    public static final /* synthetic */ aidk n = new aidk(13);
    public static final /* synthetic */ aidk m = new aidk(12);
    public static final /* synthetic */ aidk l = new aidk(11);
    public static final /* synthetic */ aidk k = new aidk(10);
    public static final /* synthetic */ aidk j = new aidk(9);
    public static final /* synthetic */ aidk i = new aidk(8);
    public static final /* synthetic */ aidk h = new aidk(7);
    public static final /* synthetic */ aidk g = new aidk(6);
    public static final /* synthetic */ aidk f = new aidk(5);
    public static final /* synthetic */ aidk e = new aidk(4);
    public static final /* synthetic */ aidk d = new aidk(3);
    public static final /* synthetic */ aidk c = new aidk(2);
    public static final /* synthetic */ aidk b = new aidk(1);
    public static final /* synthetic */ aidk a = new aidk(0);

    private /* synthetic */ aidk(int i2) {
        this.p = i2;
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        int i2;
        amts amtsVar;
        amqi amqiVar;
        amqi amqiVar2;
        amvf f2;
        amqi amqiVar3;
        switch (this.p) {
            case 0:
                return new aknd(null);
            case 1:
                return ((agnp) obj).f();
            case 2:
                return ((awtb) obj).c;
            case 3:
                return ((awtb) obj).d;
            case 4:
                return Integer.valueOf(((awtb) obj).e.size());
            case 5:
                return ((sbd) obj).b();
            case 6:
                awtm awtmVar = ((awti) obj).f;
                return awtmVar == null ? awtm.a : awtmVar;
            case 7:
                awto awtoVar = ((awti) obj).g;
                return awtoVar == null ? awto.a : awtoVar;
            case 8:
                return ((awti) obj).d;
            case 9:
                awti awtiVar = (awti) obj;
                awtj awtjVar = awtiVar.e;
                if (awtjVar == null) {
                    awtjVar = awtj.a;
                }
                if ((awtjVar.b & 2) != 0) {
                    awtj awtjVar2 = awtiVar.e;
                    if (awtjVar2 == null) {
                        awtjVar2 = awtj.a;
                    }
                    i2 = awtjVar2.d;
                } else {
                    i2 = -16777216;
                }
                return Integer.valueOf(i2);
            case 10:
                awto awtoVar2 = (awto) obj;
                if (awtoVar2.b == 1) {
                    return ((awtf) awtoVar2.c).b;
                }
                return new ArrayList();
            case 11:
                return ((amrp) obj).g();
            case 12:
                return ((amrw) obj).c();
            case 13:
                vak vakVar = (vak) obj;
                amrp amrpVar = new amrp(vakVar.a.size());
                Collections.sort(vakVar.a, amvf.c());
                Iterator it = vakVar.a.iterator();
                if (it instanceof amts) {
                    amtsVar = (amts) it;
                } else {
                    amtsVar = new amts(it);
                }
                while (amtsVar.hasNext()) {
                    amvf amvfVar = (amvf) amtsVar.next();
                    while (amtsVar.hasNext()) {
                        if (!amtsVar.b) {
                            amtsVar.c = amtsVar.a.next();
                            amtsVar.b = true;
                        }
                        amvf amvfVar2 = (amvf) amtsVar.c;
                        if (amvfVar.l(amvfVar2)) {
                            int compareTo = amvfVar.b.compareTo(amvfVar2.b);
                            int compareTo2 = amvfVar.c.compareTo(amvfVar2.c);
                            if (compareTo >= 0 && compareTo2 <= 0) {
                                f2 = amvfVar;
                            } else if (compareTo > 0 || compareTo2 < 0) {
                                if (compareTo < 0) {
                                    amqiVar = amvfVar2.b;
                                } else {
                                    amqiVar = amvfVar.b;
                                }
                                if (compareTo2 > 0) {
                                    amqiVar2 = amvfVar2.c;
                                } else {
                                    amqiVar2 = amvfVar.c;
                                }
                                f2 = amvf.f(amqiVar, amqiVar2);
                            } else {
                                f2 = amvfVar2;
                            }
                            amkq.L(f2.m(), "Overlapping ranges not permitted but found %s overlapping %s", amvfVar, amvfVar2);
                            amvf amvfVar3 = (amvf) amtsVar.next();
                            int compareTo3 = amvfVar.b.compareTo(amvfVar3.b);
                            int compareTo4 = amvfVar.c.compareTo(amvfVar3.c);
                            if (compareTo3 > 0 || compareTo4 < 0) {
                                if (compareTo3 < 0 || compareTo4 > 0) {
                                    amqi amqiVar4 = compareTo3 <= 0 ? amvfVar.b : amvfVar3.b;
                                    if (compareTo4 >= 0) {
                                        amqiVar3 = amvfVar.c;
                                    } else {
                                        amqiVar3 = amvfVar3.c;
                                    }
                                    amvfVar = amvf.f(amqiVar4, amqiVar3);
                                } else {
                                    amvfVar = amvfVar3;
                                }
                            }
                        }
                    }
                    amrpVar.h(amvfVar);
                }
                amru g2 = amrpVar.g();
                if (!g2.isEmpty()) {
                    if (((amvj) g2).c != 1 || !((amvf) amkq.bk(g2)).equals(amvf.a)) {
                        return new amsu(g2);
                    }
                    return amsu.b;
                }
                return amsu.a;
            default:
                return ((amsv) obj).g();
        }
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        switch (this.p) {
            case 0:
                return Function.CC.$default$andThen(this, function);
            case 1:
                return Function.CC.$default$andThen(this, function);
            case 2:
                return Function.CC.$default$andThen(this, function);
            case 3:
                return Function.CC.$default$andThen(this, function);
            case 4:
                return Function.CC.$default$andThen(this, function);
            case 5:
                return Function.CC.$default$andThen(this, function);
            case 6:
                return Function.CC.$default$andThen(this, function);
            case 7:
                return Function.CC.$default$andThen(this, function);
            case 8:
                return Function.CC.$default$andThen(this, function);
            case 9:
                return Function.CC.$default$andThen(this, function);
            case 10:
                return Function.CC.$default$andThen(this, function);
            case 11:
                return Function.CC.$default$andThen(this, function);
            case 12:
                return Function.CC.$default$andThen(this, function);
            case 13:
                return Function.CC.$default$andThen(this, function);
            default:
                return Function.CC.$default$andThen(this, function);
        }
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        switch (this.p) {
            case 0:
                return Function.CC.$default$compose(this, function);
            case 1:
                return Function.CC.$default$compose(this, function);
            case 2:
                return Function.CC.$default$compose(this, function);
            case 3:
                return Function.CC.$default$compose(this, function);
            case 4:
                return Function.CC.$default$compose(this, function);
            case 5:
                return Function.CC.$default$compose(this, function);
            case 6:
                return Function.CC.$default$compose(this, function);
            case 7:
                return Function.CC.$default$compose(this, function);
            case 8:
                return Function.CC.$default$compose(this, function);
            case 9:
                return Function.CC.$default$compose(this, function);
            case 10:
                return Function.CC.$default$compose(this, function);
            case 11:
                return Function.CC.$default$compose(this, function);
            case 12:
                return Function.CC.$default$compose(this, function);
            case 13:
                return Function.CC.$default$compose(this, function);
            default:
                return Function.CC.$default$compose(this, function);
        }
    }
}
