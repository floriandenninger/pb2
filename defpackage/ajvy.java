package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ajvy extends ajud implements ypd {
    private final ajoc a;
    public final ajpd h;
    public final ajpd m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajvy(aasm aasmVar, ajvb ajvbVar, ypa ypaVar, zaw zawVar, acra acraVar) {
        super(aasmVar, ypaVar, zawVar, acraVar);
        ajvbVar.get();
        ajvbVar.a(audc.class);
        ypaVar.g(this);
        ajoc ajocVar = new ajoc();
        this.a = ajocVar;
        ajpd ajpdVar = new ajpd();
        this.h = ajpdVar;
        ajpd ajpdVar2 = new ajpd();
        this.m = ajpdVar2;
        ajocVar.m(ajpdVar);
        ajocVar.m(this.i);
        ajocVar.m(ajpdVar2);
    }

    private static amru m(audc audcVar) {
        if (audcVar.e.size() == 0) {
            return amru.q();
        }
        ArrayList arrayList = new ArrayList(audcVar.e.size());
        for (audd auddVar : audcVar.e) {
            int i = auddVar.b;
            if ((i & 1) != 0) {
                atmt atmtVar = auddVar.c;
                if (atmtVar == null) {
                    atmtVar = atmt.a;
                }
                arrayList.add(ahbj.o(atmtVar));
            } else if ((i & 2) != 0) {
                aufe aufeVar = auddVar.d;
                if (aufeVar == null) {
                    aufeVar = aufe.a;
                }
                arrayList.add(ahbj.o(aufeVar));
            }
        }
        return amru.o(arrayList);
    }

    private final amru n(audc audcVar) {
        if (audcVar.d.size() == 0) {
            return amru.q();
        }
        ArrayList arrayList = new ArrayList(audcVar.d.size());
        Iterator it = audcVar.d.iterator();
        while (it.hasNext()) {
            aone builder = ((aude) it.next()).toBuilder();
            aude audeVar = (aude) builder.instance;
            int i = audeVar.b;
            if ((i & 1) != 0) {
                audj audjVar = audeVar.c;
                if (audjVar == null) {
                    audjVar = audj.a;
                }
                aong aongVar = (aong) audjVar.toBuilder();
                aongVar.e(audg.b, audcVar.f);
                builder.copyOnWrite();
                aude audeVar2 = (aude) builder.instance;
                audj audjVar2 = (audj) aongVar.build();
                audjVar2.getClass();
                audeVar2.c = audjVar2;
                audeVar2.b |= 1;
                audj audjVar3 = ((aude) builder.instance).c;
                if (audjVar3 == null) {
                    audjVar3 = audj.a;
                }
                arrayList.add(audjVar3);
            } else if ((i & 8) == 0) {
                d(arrayList, (aude) builder.build());
            } else {
                aqgn aqgnVar = audeVar.f;
                if (aqgnVar == null) {
                    aqgnVar = aqgn.a;
                }
                arrayList.add(aqgnVar);
            }
        }
        return amru.o(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajud
    public final void C(Object obj, int i) {
        this.h.add(i, obj);
    }

    @Override // defpackage.ajud
    public final void G(Object obj) {
        if (obj != null) {
            this.h.remove(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(final abbi abbiVar) {
        this.h.m(new ammy() { // from class: ajvx
            @Override // defpackage.ammy
            public final boolean a(Object obj) {
                abbi abbiVar2 = abbi.this;
                if (!(obj instanceof audj)) {
                    return false;
                }
                audj audjVar = (audj) obj;
                return ((String) audjVar.pX(audg.b)).equals(abbiVar2.a) && audjVar.o.equals(abbiVar2.b);
            }
        });
    }

    protected void d(List list, aude audeVar) {
    }

    protected void k(audc audcVar) {
    }

    @Override // defpackage.ajud, defpackage.ypd
    public Class[] kz(Class cls, Object obj, int i) {
        if (cls != ajvy.class) {
            return ahbw.m(this, obj, i);
        }
        if (i == -1) {
            return new Class[]{abbi.class};
        }
        if (i == 0) {
            c((abbi) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public void l(audc audcVar) {
        if (audcVar == null) {
            super.lD();
            this.h.clear();
            this.m.clear();
            return;
        }
        lu(m(audcVar));
        amru n = n(audcVar);
        int size = this.h.size();
        int i = 0;
        for (Object obj : n) {
            if (i < size) {
                this.h.n(i, obj);
            } else {
                this.h.add(i, obj);
            }
            i++;
        }
        if (i < size) {
            this.h.h(i, size - i);
        }
        k(audcVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajtz
    public final /* bridge */ /* synthetic */ void lB(Object obj, ajcd ajcdVar) {
        audc audcVar = (audc) obj;
        super.lB(audcVar, ajcdVar);
        if (audcVar == null) {
            return;
        }
        if (ajcdVar != ajcd.RELOAD) {
            lu(m(audcVar));
            this.h.addAll(n(audcVar));
            k(audcVar);
            return;
        }
        l(audcVar);
    }

    @Override // defpackage.ajud, defpackage.ajvc
    public final ajng lC() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajtz
    public final /* bridge */ /* synthetic */ Object nn(aulp aulpVar) {
        if (aulpVar == null || !aulpVar.pY(audc.b)) {
            return null;
        }
        return (audc) aulpVar.pX(audc.b);
    }
}
