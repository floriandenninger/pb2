package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.IconBadgeRendererOuterClass;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class nlb extends nky implements ypd {
    public final aahd e;
    public final acra f;
    public final mda g;
    public final ohg h;
    public final ajyw i;
    private final ypa j;
    private final BrowseResponseModel k;

    public nlb(aahd aahdVar, ypa ypaVar, mda mdaVar, ohg ohgVar, ajyw ajywVar, acra acraVar, BrowseResponseModel browseResponseModel, Object obj, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(obj);
        this.k = browseResponseModel;
        this.e = aahdVar;
        this.j = ypaVar;
        this.g = mdaVar;
        this.h = ohgVar;
        this.i = ajywVar;
        this.f = acraVar;
    }

    @Override // defpackage.nky
    public amsx a(amsx amsxVar) {
        amsx amsxVar2;
        atdc atdcVar;
        final int i = 2;
        amsx amsxVar3 = (amsx) Collection.EL.stream(this.k.a.m).filter(jzf.n).map(new Function(this) { // from class: nkz
            public final /* synthetic */ nlb a;

            {
                this.a = this;
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                int i2 = i;
                if (i2 != 0) {
                    return i2 != 1 ? Function.CC.$default$andThen(this, function) : Function.CC.$default$andThen(this, function);
                }
                return Function.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                int i2 = i;
                if (i2 != 0) {
                    return i2 != 1 ? Function.CC.$default$compose(this, function) : Function.CC.$default$compose(this, function);
                }
                return Function.CC.$default$compose(this, function);
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                int i2 = i;
                if (i2 != 0) {
                    if (i2 == 1) {
                        nlb nlbVar = this.a;
                        apmg apmgVar = (apmg) obj;
                        apxf apxfVar = apmgVar.o;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                        aqyg aqygVar = apmgVar.i;
                        if (aqygVar == null) {
                            aqygVar = aqyg.a;
                        }
                        return nlbVar.j(apxfVar, aqygVar, nlbVar.g);
                    }
                    nlb nlbVar2 = this.a;
                    aulq aulqVar = (aulq) obj;
                    if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
                        return nlbVar2.h.a(nlbVar2.f, (apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer), new ArrayList());
                    }
                    return nlbVar2.i.k(nlbVar2.f, (arfm) aulqVar.pX(IconBadgeRendererOuterClass.iconBadgeRenderer));
                }
                nlb nlbVar3 = this.a;
                atda atdaVar = (atda) obj;
                int i3 = atdaVar.b;
                if ((i3 & 1) != 0) {
                    atdb atdbVar = atdaVar.c;
                    if (atdbVar == null) {
                        atdbVar = atdb.a;
                    }
                    apxf apxfVar2 = atdbVar.e;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                    aqyg aqygVar2 = atdbVar.c;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                    return Optional.of(nlbVar3.j(apxfVar2, aqygVar2, nlbVar3.g));
                }
                if ((i3 & 2) != 0) {
                    atde atdeVar = atdaVar.d;
                    if (atdeVar == null) {
                        atdeVar = atde.a;
                    }
                    apxf apxfVar3 = atdeVar.e;
                    if (apxfVar3 == null) {
                        apxfVar3 = apxf.a;
                    }
                    aqyg aqygVar3 = atdeVar.c;
                    if (aqygVar3 == null) {
                        aqygVar3 = aqyg.a;
                    }
                    return Optional.ofNullable(nlbVar3.j(apxfVar3, aqygVar3, nlbVar3.g));
                }
                return Optional.empty();
            }
        }).collect(ampm.b);
        if (!amsxVar3.isEmpty()) {
            amsxVar = (amsx) Collection.EL.stream(amsxVar).filter(jzf.j).collect(ampm.b);
        }
        amsv i2 = amsx.i();
        i2.j(amsxVar3);
        i2.j(amsxVar);
        arjz arjzVar = this.k.a.k;
        if (arjzVar == null) {
            arjzVar = arjz.a;
        }
        BrowseResponseModel browseResponseModel = this.k;
        if ((browseResponseModel.a.b & 131072) != 0) {
            if (arjzVar.b == 66439850) {
                atdcVar = (atdc) arjzVar.c;
            } else {
                atdcVar = atdc.a;
            }
            final int i3 = 0;
            amsxVar2 = (amsx) Collection.EL.stream(atdcVar.c).map(new Function(this) { // from class: nkz
                public final /* synthetic */ nlb a;

                {
                    this.a = this;
                }

                @Override // j$.util.function.Function
                public final /* synthetic */ Function andThen(Function function) {
                    int i22 = i3;
                    if (i22 != 0) {
                        return i22 != 1 ? Function.CC.$default$andThen(this, function) : Function.CC.$default$andThen(this, function);
                    }
                    return Function.CC.$default$andThen(this, function);
                }

                @Override // j$.util.function.Function
                public final /* synthetic */ Function compose(Function function) {
                    int i22 = i3;
                    if (i22 != 0) {
                        return i22 != 1 ? Function.CC.$default$compose(this, function) : Function.CC.$default$compose(this, function);
                    }
                    return Function.CC.$default$compose(this, function);
                }

                @Override // j$.util.function.Function
                public final Object apply(Object obj) {
                    int i22 = i3;
                    if (i22 != 0) {
                        if (i22 == 1) {
                            nlb nlbVar = this.a;
                            apmg apmgVar = (apmg) obj;
                            apxf apxfVar = apmgVar.o;
                            if (apxfVar == null) {
                                apxfVar = apxf.a;
                            }
                            aqyg aqygVar = apmgVar.i;
                            if (aqygVar == null) {
                                aqygVar = aqyg.a;
                            }
                            return nlbVar.j(apxfVar, aqygVar, nlbVar.g);
                        }
                        nlb nlbVar2 = this.a;
                        aulq aulqVar = (aulq) obj;
                        if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
                            return nlbVar2.h.a(nlbVar2.f, (apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer), new ArrayList());
                        }
                        return nlbVar2.i.k(nlbVar2.f, (arfm) aulqVar.pX(IconBadgeRendererOuterClass.iconBadgeRenderer));
                    }
                    nlb nlbVar3 = this.a;
                    atda atdaVar = (atda) obj;
                    int i32 = atdaVar.b;
                    if ((i32 & 1) != 0) {
                        atdb atdbVar = atdaVar.c;
                        if (atdbVar == null) {
                            atdbVar = atdb.a;
                        }
                        apxf apxfVar2 = atdbVar.e;
                        if (apxfVar2 == null) {
                            apxfVar2 = apxf.a;
                        }
                        aqyg aqygVar2 = atdbVar.c;
                        if (aqygVar2 == null) {
                            aqygVar2 = aqyg.a;
                        }
                        return Optional.of(nlbVar3.j(apxfVar2, aqygVar2, nlbVar3.g));
                    }
                    if ((i32 & 2) != 0) {
                        atde atdeVar = atdaVar.d;
                        if (atdeVar == null) {
                            atdeVar = atde.a;
                        }
                        apxf apxfVar3 = atdeVar.e;
                        if (apxfVar3 == null) {
                            apxfVar3 = apxf.a;
                        }
                        aqyg aqygVar3 = atdeVar.c;
                        if (aqygVar3 == null) {
                            aqygVar3 = aqyg.a;
                        }
                        return Optional.ofNullable(nlbVar3.j(apxfVar3, aqygVar3, nlbVar3.g));
                    }
                    return Optional.empty();
                }
            }).filter(jzf.o).map(mjq.e).collect(ampm.b);
        } else {
            final int i4 = 1;
            amsxVar2 = (amsx) Collection.EL.stream(browseResponseModel.g()).filter(jzf.k).flatMap(mjq.g).filter(jzf.i).map(mjq.f).filter(jzf.m).map(mjq.d).flatMap(mjq.c).map(mjq.h).filter(jzf.l).map(new Function(this) { // from class: nkz
                public final /* synthetic */ nlb a;

                {
                    this.a = this;
                }

                @Override // j$.util.function.Function
                public final /* synthetic */ Function andThen(Function function) {
                    int i22 = i4;
                    if (i22 != 0) {
                        return i22 != 1 ? Function.CC.$default$andThen(this, function) : Function.CC.$default$andThen(this, function);
                    }
                    return Function.CC.$default$andThen(this, function);
                }

                @Override // j$.util.function.Function
                public final /* synthetic */ Function compose(Function function) {
                    int i22 = i4;
                    if (i22 != 0) {
                        return i22 != 1 ? Function.CC.$default$compose(this, function) : Function.CC.$default$compose(this, function);
                    }
                    return Function.CC.$default$compose(this, function);
                }

                @Override // j$.util.function.Function
                public final Object apply(Object obj) {
                    int i22 = i4;
                    if (i22 != 0) {
                        if (i22 == 1) {
                            nlb nlbVar = this.a;
                            apmg apmgVar = (apmg) obj;
                            apxf apxfVar = apmgVar.o;
                            if (apxfVar == null) {
                                apxfVar = apxf.a;
                            }
                            aqyg aqygVar = apmgVar.i;
                            if (aqygVar == null) {
                                aqygVar = aqyg.a;
                            }
                            return nlbVar.j(apxfVar, aqygVar, nlbVar.g);
                        }
                        nlb nlbVar2 = this.a;
                        aulq aulqVar = (aulq) obj;
                        if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
                            return nlbVar2.h.a(nlbVar2.f, (apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer), new ArrayList());
                        }
                        return nlbVar2.i.k(nlbVar2.f, (arfm) aulqVar.pX(IconBadgeRendererOuterClass.iconBadgeRenderer));
                    }
                    nlb nlbVar3 = this.a;
                    atda atdaVar = (atda) obj;
                    int i32 = atdaVar.b;
                    if ((i32 & 1) != 0) {
                        atdb atdbVar = atdaVar.c;
                        if (atdbVar == null) {
                            atdbVar = atdb.a;
                        }
                        apxf apxfVar2 = atdbVar.e;
                        if (apxfVar2 == null) {
                            apxfVar2 = apxf.a;
                        }
                        aqyg aqygVar2 = atdbVar.c;
                        if (aqygVar2 == null) {
                            aqygVar2 = aqyg.a;
                        }
                        return Optional.of(nlbVar3.j(apxfVar2, aqygVar2, nlbVar3.g));
                    }
                    if ((i32 & 2) != 0) {
                        atde atdeVar = atdaVar.d;
                        if (atdeVar == null) {
                            atdeVar = atde.a;
                        }
                        apxf apxfVar3 = atdeVar.e;
                        if (apxfVar3 == null) {
                            apxfVar3 = apxf.a;
                        }
                        aqyg aqygVar3 = atdeVar.c;
                        if (aqygVar3 == null) {
                            aqygVar3 = aqyg.a;
                        }
                        return Optional.ofNullable(nlbVar3.j(apxfVar3, aqygVar3, nlbVar3.g));
                    }
                    return Optional.empty();
                }
            }).collect(ampm.b);
        }
        i2.j(amsxVar2);
        return i2.g();
    }

    @Override // defpackage.nky
    public final void e() {
        this.j.h(this, nlb.class);
    }

    @Override // defpackage.nky
    public final void g() {
        this.j.m(this);
    }

    public final fze j(apxf apxfVar, aqyg aqygVar, mda mdaVar) {
        return new nla(this, apxfVar, ajcq.b(aqygVar), mdaVar);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{exg.class, exh.class};
        }
        if (i == 0) {
            if (!((Boolean) Optional.ofNullable(((exg) obj).a()).map(mjq.i).orElse(false)).booleanValue()) {
                return null;
            }
            Optional.ofNullable(this.c).ifPresent(iwu.i);
            return null;
        }
        if (i == 1) {
            if (!((Boolean) Optional.ofNullable(((exh) obj).a()).map(mjq.j).orElse(false)).booleanValue()) {
                return null;
            }
            b().ifPresent(iwu.j);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
