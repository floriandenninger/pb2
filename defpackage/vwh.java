package defpackage;

import java.util.ArrayList;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vwh implements vwc {
    public vwg a;
    public Date b;
    public Date c;
    public Long d;
    public Long e;
    public Float f;
    public Float g;
    public Boolean h;
    public Boolean i;
    public Integer j;
    public Integer k;
    public Long l;
    public vwe m;

    @Override // defpackage.vwc
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final dfm a() {
        this.a.getClass();
        this.m.getClass();
        dfm dfmVar = new dfm();
        dfn dfnVar = new dfn();
        Long l = this.e;
        if (l != null) {
            dfnVar.l(l.longValue());
        }
        if (this.f != null) {
            dfnVar.f = r2.floatValue();
        }
        if (this.g != null) {
            dfnVar.g = r2.floatValue();
        }
        Boolean bool = this.h;
        if (bool != null) {
            dfnVar.m(bool.booleanValue());
        }
        Boolean bool2 = this.i;
        if (bool2 != null) {
            dfnVar.n(bool2.booleanValue());
        }
        Date date = this.b;
        if (date != null) {
            dfnVar.k(date);
        }
        Date date2 = this.c;
        if (date2 != null) {
            dfnVar.o(date2);
        }
        dfmVar.w(dfnVar);
        deq deqVar = new deq();
        der derVar = new der();
        Date date3 = this.b;
        if (date3 != null) {
            derVar.a = date3;
        }
        Long l2 = this.d;
        if (l2 != null) {
            derVar.c = l2.longValue();
        }
        Long l3 = this.e;
        if (l3 != null) {
            derVar.d = l3.longValue();
        }
        Date date4 = this.c;
        if (date4 != null) {
            derVar.b = date4;
        }
        deqVar.w(derVar);
        deo deoVar = new deo();
        deoVar.a = this.a.c;
        deoVar.b = "VideoHandler";
        deqVar.w(deoVar);
        des desVar = new des();
        desVar.w((dea) this.a.d.get());
        axkr axkrVar = new axkr();
        dei deiVar = new dei();
        deh dehVar = new deh();
        dehVar.r = 1;
        deiVar.w(dehVar);
        axkrVar.w(deiVar);
        desVar.w(axkrVar);
        dfa dfaVar = new dfa();
        dey deyVar = new dey();
        vwe vweVar = this.m;
        dgl dglVar = new dgl("mp4v");
        Integer num = vweVar.a;
        if (num != null) {
            dglVar.b = num.intValue();
        }
        Integer num2 = vweVar.b;
        if (num2 != null) {
            dglVar.c = num2.intValue();
        }
        axlv axlvVar = new axlv();
        axmc axmcVar = new axmc();
        axmcVar.a = 1;
        axlz axlzVar = new axlz();
        axlzVar.a = 108;
        axlzVar.b = 4;
        if (vweVar.c != null) {
            axlzVar.e = r11.intValue();
        }
        if (vweVar.d != null) {
            axlzVar.f = r5.intValue();
        }
        axmcVar.j = axlzVar;
        axmi axmiVar = new axmi();
        axmiVar.b();
        axmcVar.k = axmiVar;
        axlvVar.a = axmcVar;
        ((axlu) axlvVar).b = axmcVar.d();
        dglVar.w(axlvVar);
        axlt axltVar = new axlt();
        axltVar.a = 1;
        axltVar.b = 1;
        dglVar.w(axltVar);
        deyVar.w(dglVar);
        dfaVar.w(deyVar);
        dfl dflVar = new dfl();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new dfk(1L, this.j.intValue()));
        dflVar.b = arrayList;
        dfaVar.w(dflVar);
        dfc dfcVar = new dfc();
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(new dfb(1L, 1L, 1L));
        dfcVar.a = arrayList2;
        dfaVar.w(dfcVar);
        dez dezVar = new dez();
        if (this.k != null) {
            dezVar.a = new long[]{r5.intValue()};
        }
        dfaVar.w(dezVar);
        dfe dfeVar = new dfe();
        Long l4 = this.l;
        if (l4 != null) {
            dfeVar.a = new long[]{l4.longValue()};
        }
        dfaVar.w(dfeVar);
        desVar.w(dfaVar);
        deqVar.w(desVar);
        dfmVar.w(deqVar);
        return dfmVar;
    }
}
