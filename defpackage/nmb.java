package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.protos.youtube.api.innertube.SharePlaylistEndpointOuterClass$SharePlaylistEndpoint;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer;
import j$.util.function.Function;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nmb extends nky implements ypd {
    public final glq e;
    public final aahd f;
    public final acra g;
    public final aalw h;
    public final mda i;
    private final giv j;
    private final ypa k;
    private final kyj l;
    private final BrowseResponseModel m;
    private final axzg n;

    public nmb(axzg axzgVar, giv givVar, ypa ypaVar, glq glqVar, aahd aahdVar, acra acraVar, kyj kyjVar, aalw aalwVar, mda mdaVar, aubg aubgVar, BrowseResponseModel browseResponseModel, byte[] bArr) {
        super(aubgVar);
        this.n = axzgVar;
        this.j = givVar;
        this.k = ypaVar;
        this.e = glqVar;
        this.f = aahdVar;
        this.g = acraVar;
        this.l = kyjVar;
        this.m = browseResponseModel;
        this.h = aalwVar;
        this.i = mdaVar;
    }

    private final void k(arzb arzbVar) {
        final aubg aubgVar;
        Optional b = b();
        if ((arzbVar.b & 4) == 0) {
            b.ifPresent(iwu.m);
            return;
        }
        if (b.isPresent()) {
            arzc arzcVar = arzbVar.d;
            if (arzcVar == null) {
                arzcVar = arzc.a;
            }
            if (arzcVar.b == 53272665) {
                arzc arzcVar2 = arzbVar.d;
                if (arzcVar2 == null) {
                    arzcVar2 = arzc.a;
                }
                if (arzcVar2.b == 53272665) {
                    aubgVar = (aubg) arzcVar2.c;
                } else {
                    aubgVar = aubg.a;
                }
            } else {
                aubgVar = null;
            }
            Optional.ofNullable(this.d).ifPresent(new Consumer() { // from class: nlv
                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    nmb nmbVar = nmb.this;
                    ((nln) obj).bp(nmbVar.a, aubgVar);
                }

                @Override // j$.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer.CC.$default$andThen(this, consumer);
                }
            });
            this.a = aubgVar;
        }
    }

    @Override // defpackage.nky
    public final amsx a(amsx amsxVar) {
        atdc atdcVar;
        atdc atdcVar2;
        aubg aubgVar = (aubg) this.a;
        amsv i = amsx.i();
        i.j(amsxVar);
        auay auayVar = aubgVar.y;
        if (auayVar == null) {
            auayVar = auay.a;
        }
        i.j(j(auayVar.b ? new nlx(this, aubgVar.h) : null));
        i.j(j(aubgVar.G.isEmpty() ? null : new nma(this, aubgVar.G, aubgVar.F.I())));
        arjz arjzVar = this.m.a.k;
        if (arjzVar == null) {
            arjzVar = arjz.a;
        }
        if (arjzVar.b == 66439850) {
            atdcVar = (atdc) arjzVar.c;
        } else {
            atdcVar = atdc.a;
        }
        final int i2 = 0;
        i.j((Iterable) Collection.EL.stream(atdcVar.c).map(new Function(this) { // from class: nlw
            public final /* synthetic */ nmb a;

            {
                this.a = this;
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                atda b;
                if (i2 == 0) {
                    nmb nmbVar = this.a;
                    atda atdaVar = (atda) obj;
                    if ((atdaVar.b & 1) != 0) {
                        atdb atdbVar = atdaVar.c;
                        if (atdbVar == null) {
                            atdbVar = atdb.a;
                        }
                        apxf apxfVar = atdbVar.e;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                        if (apxfVar.pY(SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.sharePlaylistEndpoint)) {
                            apxf apxfVar2 = atdbVar.e;
                            if (apxfVar2 == null) {
                                apxfVar2 = apxf.a;
                            }
                            aqyg aqygVar = atdbVar.c;
                            if (aqygVar == null) {
                                aqygVar = aqyg.a;
                            }
                            return Optional.of(new nmd(apxfVar2, ajcq.b(aqygVar), nmbVar.f, 1));
                        }
                    }
                    if ((atdaVar.b & 2) == 0 || (b = nmbVar.h.b(atdaVar, null)) == null) {
                        return Optional.empty();
                    }
                    atde atdeVar = b.d;
                    if (atdeVar == null) {
                        atdeVar = atde.a;
                    }
                    apxf apxfVar3 = atdeVar.e;
                    if (apxfVar3 == null) {
                        apxfVar3 = apxf.a;
                    }
                    aqyg aqygVar2 = atdeVar.c;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                    return Optional.of(new nmd(apxfVar3, ajcq.b(aqygVar2), nmbVar.f, 2));
                }
                nmb nmbVar2 = this.a;
                return new nlz(nmbVar2, (atda) obj, nmbVar2.i);
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return i2 != 0 ? Function.CC.$default$andThen(this, function) : Function.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return i2 != 0 ? Function.CC.$default$compose(this, function) : Function.CC.$default$compose(this, function);
            }
        }).filter(jzf.r).map(mjq.k).collect(ampm.a));
        aube aubeVar = aubgVar.M;
        if (aubeVar == null) {
            aubeVar = aube.a;
        }
        if (aubeVar.b == 66439850) {
            atdcVar2 = (atdc) aubeVar.c;
        } else {
            atdcVar2 = atdc.a;
        }
        final int i3 = 1;
        i.j((List) Collection.EL.stream(atdcVar2.c).map(new Function(this) { // from class: nlw
            public final /* synthetic */ nmb a;

            {
                this.a = this;
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                atda b;
                if (i3 == 0) {
                    nmb nmbVar = this.a;
                    atda atdaVar = (atda) obj;
                    if ((atdaVar.b & 1) != 0) {
                        atdb atdbVar = atdaVar.c;
                        if (atdbVar == null) {
                            atdbVar = atdb.a;
                        }
                        apxf apxfVar = atdbVar.e;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                        if (apxfVar.pY(SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.sharePlaylistEndpoint)) {
                            apxf apxfVar2 = atdbVar.e;
                            if (apxfVar2 == null) {
                                apxfVar2 = apxf.a;
                            }
                            aqyg aqygVar = atdbVar.c;
                            if (aqygVar == null) {
                                aqygVar = aqyg.a;
                            }
                            return Optional.of(new nmd(apxfVar2, ajcq.b(aqygVar), nmbVar.f, 1));
                        }
                    }
                    if ((atdaVar.b & 2) == 0 || (b = nmbVar.h.b(atdaVar, null)) == null) {
                        return Optional.empty();
                    }
                    atde atdeVar = b.d;
                    if (atdeVar == null) {
                        atdeVar = atde.a;
                    }
                    apxf apxfVar3 = atdeVar.e;
                    if (apxfVar3 == null) {
                        apxfVar3 = apxf.a;
                    }
                    aqyg aqygVar2 = atdeVar.c;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                    return Optional.of(new nmd(apxfVar3, ajcq.b(aqygVar2), nmbVar.f, 2));
                }
                nmb nmbVar2 = this.a;
                return new nlz(nmbVar2, (atda) obj, nmbVar2.i);
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return i3 != 0 ? Function.CC.$default$andThen(this, function) : Function.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return i3 != 0 ? Function.CC.$default$compose(this, function) : Function.CC.$default$compose(this, function);
            }
        }).collect(ampm.a));
        return i.g();
    }

    @Override // defpackage.nky
    public final CharSequence c() {
        aqyg aqygVar = null;
        if (this.n.m().booleanValue()) {
            return null;
        }
        aubg aubgVar = (aubg) this.a;
        if ((aubgVar.b & 2048) != 0 && (aqygVar = aubgVar.n) == null) {
            aqygVar = aqyg.a;
        }
        return ajcq.b(aqygVar);
    }

    @Override // defpackage.nky
    public final void e() {
        this.k.g(this);
    }

    @Override // defpackage.nky
    public final void g() {
        this.l.b(((aubg) this.a).h);
        this.k.m(this);
    }

    @Override // defpackage.nky
    public final boolean h() {
        return ((aubg) this.a).m;
    }

    @Override // defpackage.nky
    public final boolean i() {
        aubg aubgVar = (aubg) this.a;
        if ((aubgVar.b & 256) != 0) {
            asnf asnfVar = aubgVar.l;
            if (asnfVar == null) {
                asnfVar = asnf.a;
            }
            if (((asnfVar.b >> 24) & PrivateKeyType.INVALID) < 255) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ghf.class, gli.class, abbf.class, abbg.class, abbi.class};
        }
        if (i != 0) {
            if (i == 1) {
                this.j.c(false);
                return null;
            }
            if (i == 2) {
                abbf abbfVar = (abbf) obj;
                if (this.a == null || !b().isPresent() || !TextUtils.equals(((aubg) this.a).h, abbfVar.a)) {
                    return null;
                }
                k(abbfVar.c);
                return null;
            }
            if (i == 3) {
                abbg abbgVar = (abbg) obj;
                if (this.a == null || !b().isPresent() || !TextUtils.equals(((aubg) this.a).h, abbgVar.a)) {
                    return null;
                }
                arzb arzbVar = abbgVar.d;
                if ((arzbVar.b & 4) == 0) {
                    return null;
                }
                k(arzbVar);
                return null;
            }
            if (i == 4) {
                abbi abbiVar = (abbi) obj;
                if (this.a == null || !b().isPresent() || !TextUtils.equals(((aubg) this.a).h, abbiVar.a)) {
                    return null;
                }
                k(abbiVar.c);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        ghf ghfVar = (ghf) obj;
        aubg aubgVar = (aubg) this.a;
        if ((aubgVar.c & 4) == 0 || !TextUtils.equals(aubgVar.h, ghfVar.b())) {
            return null;
        }
        asnj asnjVar = ((aubg) this.a).A;
        if (asnjVar == null) {
            asnjVar = asnj.a;
        }
        asni asniVar = asnjVar.c;
        if (asniVar == null) {
            asniVar = asni.a;
        }
        aong aongVar = (aong) asniVar.toBuilder();
        asno a = ghfVar.a();
        aongVar.copyOnWrite();
        asni asniVar2 = (asni) aongVar.instance;
        asniVar2.d = a.e;
        asniVar2.b |= 2;
        asni asniVar3 = (asni) aongVar.build();
        asnj asnjVar2 = ((aubg) this.a).A;
        if (asnjVar2 == null) {
            asnjVar2 = asnj.a;
        }
        aone builder = asnjVar2.toBuilder();
        builder.copyOnWrite();
        asnj asnjVar3 = (asnj) builder.instance;
        asniVar3.getClass();
        asnjVar3.c = asniVar3;
        asnjVar3.b |= 1;
        asnj asnjVar4 = (asnj) builder.build();
        aone builder2 = ((aubg) this.a).toBuilder();
        builder2.copyOnWrite();
        aubg aubgVar2 = (aubg) builder2.instance;
        asnjVar4.getClass();
        aubgVar2.A = asnjVar4;
        aubgVar2.c |= 4;
        this.a = (aubg) builder2.build();
        return null;
    }

    private static Iterable j(Object obj) {
        if (obj == null) {
            return amvs.a;
        }
        return amsx.r(obj);
    }
}
