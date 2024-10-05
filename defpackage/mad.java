package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mad {
    public final aahd a;
    public final acqz b;
    public atdc c;
    public final mda d;
    private final azrs e;
    private amru f;

    public mad(aahd aahdVar, mda mdaVar, acqz acqzVar) {
        azrs aT = azrh.aN(Optional.empty()).aT();
        this.e = aT;
        this.a = aahdVar;
        this.d = mdaVar;
        aT.Y(new ayrv() { // from class: maa
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                return mad.this.a((Optional) obj);
            }
        }).aJ().aN();
        this.b = acqzVar;
    }

    public final amru a(Optional optional) {
        return (amru) Collection.EL.stream((List) optional.map(jyr.o).orElse(amru.q())).map(jyr.n).map(new Function() { // from class: mab
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return Function.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                apxf apxfVar;
                mad madVar = mad.this;
                aooy aooyVar = (aooy) obj;
                aqyg aqygVar = null;
                if (aooyVar instanceof atdb) {
                    mda mdaVar = madVar.d;
                    aahd aahdVar = madVar.a;
                    atdb atdbVar = (atdb) aooyVar;
                    acra mM = madVar.b.mM();
                    if ((atdbVar.b & 4) != 0) {
                        apxf apxfVar2 = atdbVar.e;
                        if (apxfVar2 == null) {
                            apxfVar2 = apxf.a;
                        }
                        apxfVar = apxfVar2;
                    } else {
                        apxfVar = null;
                    }
                    if ((atdbVar.b & 1) != 0 && (aqygVar = atdbVar.c) == null) {
                        aqygVar = aqyg.a;
                    }
                    return Optional.of(new mac(mdaVar, aahdVar, apxfVar, ajcq.b(aqygVar), atdbVar.f, mM));
                }
                if (aooyVar instanceof atde) {
                    mda mdaVar2 = madVar.d;
                    aahd aahdVar2 = madVar.a;
                    atde atdeVar = (atde) aooyVar;
                    apxf apxfVar3 = atdeVar.e;
                    if (apxfVar3 == null) {
                        apxfVar3 = apxf.a;
                    }
                    apxf apxfVar4 = apxfVar3;
                    if ((atdeVar.b & 1) != 0 && (aqygVar = atdeVar.c) == null) {
                        aqygVar = aqyg.a;
                    }
                    return Optional.of(new mac(mdaVar2, aahdVar2, apxfVar4, ajcq.b(aqygVar), null, null));
                }
                return Optional.empty();
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return Function.CC.$default$compose(this, function);
            }
        }).filter(jzf.e).map(jyr.p).collect(ampm.a);
    }

    public final amru b() {
        if (this.f == null) {
            this.f = a(Optional.ofNullable(this.c));
        }
        return this.f;
    }

    public final void c(atdc atdcVar) {
        this.c = atdcVar;
        this.f = null;
        this.e.c(Optional.ofNullable(atdcVar));
    }
}
