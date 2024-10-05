package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.net.NetworkException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class afwt implements ysl {
    public final anic a;
    private final afvy b;
    private final ysl c;
    private final Executor d;

    public afwt(anic anicVar, afvy afvyVar, ysl yslVar, Executor executor) {
        this.b = afvyVar;
        this.a = anicVar;
        this.c = yslVar;
        this.d = executor;
    }

    @Override // defpackage.ysl
    public final yvo a(final yvo yvoVar) {
        if (!yvoVar.j().isPresent()) {
            return this.c.a(yvoVar);
        }
        ynm.k(b(yvoVar), this.d, new ynk() { // from class: afwn
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                cnq cnqVar;
                yvo yvoVar2 = yvo.this;
                if (th instanceof cnq) {
                    cnqVar = (cnq) th;
                } else {
                    cnqVar = new cnq(th);
                }
                yvoVar2.o(cnqVar);
            }
        }, new afwo(yvoVar, 0));
        return yvoVar;
    }

    @Override // defpackage.ysl
    public final anhy b(final yvo yvoVar) {
        Optional j = yvoVar.j();
        if (!j.isPresent()) {
            return this.c.b(yvoVar);
        }
        return d(yvoVar, amkq.x(new amnv() { // from class: afwp
            @Override // defpackage.amnv
            public final Object get() {
                yvo yvoVar2 = yvo.this;
                try {
                    aone createBuilder = awyw.a.createBuilder();
                    String m = yvoVar2.m();
                    createBuilder.copyOnWrite();
                    awyw awywVar = (awyw) createBuilder.instance;
                    m.getClass();
                    awywVar.c = m;
                    amru amruVar = (amru) Collection.EL.stream(yvoVar2.f().entrySet()).map(acxx.n).collect(ampm.a);
                    createBuilder.copyOnWrite();
                    awyw awywVar2 = (awyw) createBuilder.instance;
                    aony aonyVar = awywVar2.d;
                    if (!aonyVar.c()) {
                        awywVar2.d = aonm.mutableCopy(aonyVar);
                    }
                    aolo.addAll((Iterable) amruVar, (List) awywVar2.d);
                    aomf x = aomf.x(yvoVar2.qm());
                    createBuilder.copyOnWrite();
                    ((awyw) createBuilder.instance).e = x;
                    String A = whl.A(yvoVar2.j);
                    createBuilder.copyOnWrite();
                    ((awyw) createBuilder.instance).b = A;
                    return (awyw) createBuilder.build();
                } catch (cnb e) {
                    throw new afws(e);
                }
            }
        }), this.b.a((awxc) j.get(), avlr.a), false);
    }

    @Override // defpackage.ysl
    public final void c() {
        this.c.c();
    }

    public final anhy d(final yvo yvoVar, final amnv amnvVar, final afvz afvzVar, boolean z) {
        yvo yvrVar;
        if (z) {
            try {
                yvrVar = new yvr(yvoVar, (awyw) amnvVar.get());
            } catch (afws e) {
                return anaf.O(cnm.a(e.a));
            }
        } else {
            yvrVar = yvoVar;
        }
        return aney.i(this.c.b(yvrVar), cnq.class, new anfz() { // from class: afwr
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                anhy N;
                amru amruVar;
                final afwt afwtVar = afwt.this;
                final afvz afvzVar2 = afvzVar;
                final yvo yvoVar2 = yvoVar;
                final amnv amnvVar2 = amnvVar;
                final cnq cnqVar = (cnq) obj;
                if (cnqVar instanceof cno) {
                    cnh cnhVar = ((cno) cnqVar).b;
                    aone createBuilder = awyx.a.createBuilder();
                    int i = cnhVar.a;
                    createBuilder.copyOnWrite();
                    ((awyx) createBuilder.instance).b = i;
                    aomf x = aomf.x(cnhVar.b);
                    createBuilder.copyOnWrite();
                    awyx awyxVar = (awyx) createBuilder.instance;
                    awyx.checkByteStringIsUtf8(x);
                    awyxVar.c = x.E();
                    List list = cnhVar.d;
                    if (list == null) {
                        amruVar = amru.q();
                    } else {
                        amruVar = (amru) Collection.EL.stream(list).map(acxx.m).collect(ampm.a);
                    }
                    createBuilder.copyOnWrite();
                    awyx awyxVar2 = (awyx) createBuilder.instance;
                    aony aonyVar = awyxVar2.d;
                    if (!aonyVar.c()) {
                        awyxVar2.d = aonm.mutableCopy(aonyVar);
                    }
                    aolo.addAll((Iterable) amruVar, (List) awyxVar2.d);
                    N = afvzVar2.a((awyx) createBuilder.build());
                } else {
                    int i2 = 1;
                    if (cnqVar instanceof cnp) {
                        N = afvzVar2.b(1);
                    } else if (cnqVar instanceof cng) {
                        Throwable cause = cnqVar.getCause();
                        if (!(cause instanceof NetworkException)) {
                            N = anaf.N(cnqVar);
                        } else {
                            int errorCode = ((NetworkException) cause).getErrorCode();
                            if (errorCode != 1) {
                                switch (errorCode) {
                                    case 5:
                                    case 6:
                                        i2 = 4;
                                        break;
                                    case 7:
                                    case 8:
                                        i2 = 5;
                                        break;
                                }
                                N = afvzVar2.b(i2);
                            }
                            i2 = 3;
                            N = afvzVar2.b(i2);
                        }
                    } else {
                        N = anaf.N(cnqVar);
                    }
                }
                return aney.h(anfq.i(anht.q(N), new anfz() { // from class: afwq
                    @Override // defpackage.anfz
                    public final anhy a(Object obj2) {
                        afwt afwtVar2 = afwt.this;
                        cnq cnqVar2 = cnqVar;
                        yvo yvoVar3 = yvoVar2;
                        amnv amnvVar3 = amnvVar2;
                        afvz afvzVar3 = afvzVar2;
                        awwv awwvVar = awwv.ACTION_TYPE_UNKNOWN;
                        int ordinal = ((awwv) obj2).ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                return afwtVar2.d(yvoVar3, amnvVar3, afvzVar3, true);
                            }
                            if (ordinal == 2) {
                                return anaf.N(cnqVar2);
                            }
                            if (ordinal != 3) {
                                throw new AssertionError();
                            }
                        }
                        return anaf.N(cnqVar2);
                    }
                }, afwtVar.a), cnq.class, adpv.t, angq.a);
            }
        }, this.a);
    }
}
