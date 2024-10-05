package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xpo extends xqc {
    public final Set a;

    public xpo(yaq yaqVar, ajvc ajvcVar, apzx apzxVar, yaq yaqVar2, yap yapVar, aadw aadwVar, byte[] bArr, byte[] bArr2) {
        super(yaqVar, ajvcVar, apzxVar, yaqVar2, yapVar, aadwVar, null, null);
        this.a = new HashSet();
    }

    private final void l(xpn xpnVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            xpnVar.a((xpa) it.next());
        }
    }

    @Override // defpackage.xqc, defpackage.xpa
    public final void c(final apyv apyvVar) {
        super.c(apyvVar);
        l(new xpn() { // from class: xpj
            @Override // defpackage.xpn
            public final void a(xpa xpaVar) {
                xpaVar.c(apyv.this);
            }
        });
    }

    @Override // defpackage.xqc, defpackage.xpa
    public final void d() {
        super.d();
        l(new xpn() { // from class: xpm
            @Override // defpackage.xpn
            public final void a(xpa xpaVar) {
                xpaVar.d();
            }
        });
    }

    @Override // defpackage.xqc, defpackage.xpa
    public final void e(final apyv apyvVar) {
        super.e(apyvVar);
        l(new xpn() { // from class: xpk
            @Override // defpackage.xpn
            public final void a(xpa xpaVar) {
                apyv apyvVar2;
                int i;
                apyv apyvVar3 = apyv.this;
                if (apyvVar3 == null) {
                    return;
                }
                apyx apyxVar = xpaVar.a().c;
                if (apyxVar == null) {
                    apyxVar = apyx.a;
                }
                if (apyxVar.b == 62285947) {
                    apyvVar2 = (apyv) apyxVar.c;
                } else {
                    apyvVar2 = apyv.a;
                }
                aone builder = apyvVar3.toBuilder();
                if (apyvVar2.e != 31 || (i = aobq.aA(((Integer) apyvVar2.f).intValue())) == 0) {
                    i = 1;
                }
                builder.copyOnWrite();
                apyv apyvVar4 = (apyv) builder.instance;
                apyvVar4.f = Integer.valueOf(i - 1);
                apyvVar4.e = 31;
                if ((apyvVar2.c & 1024) != 0) {
                    apxf apxfVar = apyvVar2.D;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    builder.copyOnWrite();
                    apyv apyvVar5 = (apyv) builder.instance;
                    apxfVar.getClass();
                    apyvVar5.D = apxfVar;
                    apyvVar5.c |= 1024;
                }
                if ((apyvVar2.b & 65536) != 0) {
                    apmh apmhVar = apyvVar2.q;
                    if (apmhVar == null) {
                        apmhVar = apmh.a;
                    }
                    builder.copyOnWrite();
                    apyv apyvVar6 = (apyv) builder.instance;
                    apmhVar.getClass();
                    apyvVar6.q = apmhVar;
                    apyvVar6.b |= 65536;
                }
                apxk apxkVar = apyvVar2.t;
                if (apxkVar == null) {
                    apxkVar = apxk.a;
                }
                apxj apxjVar = apxkVar.c;
                if (apxjVar == null) {
                    apxjVar = apxj.a;
                }
                if ((apxjVar.b & 4) != 0) {
                    apxk apxkVar2 = ((apyv) builder.instance).t;
                    if (apxkVar2 == null) {
                        apxkVar2 = apxk.a;
                    }
                    if ((apxkVar2.b & 1) != 0) {
                        apxk apxkVar3 = ((apyv) builder.instance).t;
                        if (apxkVar3 == null) {
                            apxkVar3 = apxk.a;
                        }
                        aone builder2 = apxkVar3.toBuilder();
                        apxk apxkVar4 = ((apyv) builder.instance).t;
                        if (apxkVar4 == null) {
                            apxkVar4 = apxk.a;
                        }
                        apxj apxjVar2 = apxkVar4.c;
                        if (apxjVar2 == null) {
                            apxjVar2 = apxj.a;
                        }
                        aone builder3 = apxjVar2.toBuilder();
                        apmh apmhVar2 = apxjVar.e;
                        if (apmhVar2 == null) {
                            apmhVar2 = apmh.a;
                        }
                        builder3.copyOnWrite();
                        apxj apxjVar3 = (apxj) builder3.instance;
                        apmhVar2.getClass();
                        apxjVar3.e = apmhVar2;
                        apxjVar3.b |= 4;
                        builder2.copyOnWrite();
                        apxk apxkVar5 = (apxk) builder2.instance;
                        apxj apxjVar4 = (apxj) builder3.build();
                        apxjVar4.getClass();
                        apxkVar5.c = apxjVar4;
                        apxkVar5.b |= 1;
                        builder.copyOnWrite();
                        apyv apyvVar7 = (apyv) builder.instance;
                        apxk apxkVar6 = (apxk) builder2.build();
                        apxkVar6.getClass();
                        apyvVar7.t = apxkVar6;
                        apyvVar7.b |= 4194304;
                    }
                }
                xpaVar.e((apyv) builder.build());
            }
        });
    }

    @Override // defpackage.xqc, defpackage.xpa
    public final void f(final apyv apyvVar, final apyv apyvVar2) {
        super.f(apyvVar, apyvVar2);
        l(new xpn() { // from class: xpl
            @Override // defpackage.xpn
            public final void a(xpa xpaVar) {
                xpaVar.f(apyv.this, apyvVar2);
            }
        });
    }

    public final void i() {
        apzp apzpVar = this.b.f;
        if (apzpVar == null) {
            apzpVar = apzp.a;
        }
        if ((apzpVar.b & 1) != 0) {
            apzp apzpVar2 = this.b.f;
            if (apzpVar2 == null) {
                apzpVar2 = apzp.a;
            }
            apzn apznVar = apzpVar2.c;
            if (apznVar == null) {
                apznVar = apzn.a;
            }
            for (apyx apyxVar : this.c.b(apznVar)) {
                super.c(apyxVar.b == 62285947 ? (apyv) apyxVar.c : null);
            }
        }
    }
}
