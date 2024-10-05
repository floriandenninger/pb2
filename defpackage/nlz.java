package defpackage;

import android.view.MenuItem;
import j$.util.Optional;
import j$.util.function.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nlz implements fzk {
    public final atda a;
    final /* synthetic */ nmb b;
    private final mdb c;

    public nlz(nmb nmbVar, atda atdaVar, mda mdaVar) {
        this.b = nmbVar;
        this.a = atdaVar;
        this.c = mdaVar.b();
    }

    @Override // defpackage.fze
    public final int g() {
        return this.c.a();
    }

    @Override // defpackage.fze
    public final int h() {
        return 0;
    }

    @Override // defpackage.fze
    public final fzd i() {
        return null;
    }

    @Override // defpackage.fze
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.fze
    public final boolean k() {
        return false;
    }

    @Override // defpackage.fze
    public final void l(MenuItem menuItem) {
    }

    @Override // defpackage.fze
    public final boolean m() {
        aomf aomfVar;
        acra acraVar = this.b.g;
        atda atdaVar = this.a;
        atdb atdbVar = atdaVar.c;
        if (atdbVar == null) {
            atdbVar = atdb.a;
        }
        if ((atdbVar.b & 16) != 0) {
            atdb atdbVar2 = atdaVar.c;
            if (atdbVar2 == null) {
                atdbVar2 = atdb.a;
            }
            aomfVar = atdbVar2.f;
        } else {
            atde atdeVar = atdaVar.d;
            if (atdeVar == null) {
                atdeVar = atde.a;
            }
            if ((atdeVar.b & 64) != 0) {
                atde atdeVar2 = atdaVar.d;
                if (atdeVar2 == null) {
                    atdeVar2 = atde.a;
                }
                aomfVar = atdeVar2.g;
            } else {
                atdd atddVar = atdaVar.e;
                if (atddVar == null) {
                    atddVar = atdd.a;
                }
                if ((atddVar.b & 4) != 0) {
                    atdd atddVar2 = atdaVar.e;
                    if (atddVar2 == null) {
                        atddVar2 = atdd.a;
                    }
                    aomfVar = atddVar2.c;
                } else {
                    atdk atdkVar = atdaVar.f;
                    if (atdkVar == null) {
                        atdkVar = atdk.a;
                    }
                    if ((atdkVar.b & 2048) != 0) {
                        atdk atdkVar2 = atdaVar.f;
                        if (atdkVar2 == null) {
                            atdkVar2 = atdk.a;
                        }
                        aomfVar = atdkVar2.j;
                    } else {
                        atcw atcwVar = atdaVar.g;
                        if (atcwVar == null) {
                            atcwVar = atcw.a;
                        }
                        if ((atcwVar.b & 16) != 0) {
                            atcw atcwVar2 = atdaVar.g;
                            if (atcwVar2 == null) {
                                atcwVar2 = atcw.a;
                            }
                            aomfVar = atcwVar2.f;
                        } else {
                            atcx atcxVar = atdaVar.h;
                            if (atcxVar == null) {
                                atcxVar = atcx.a;
                            }
                            if ((atcxVar.b & 16) != 0) {
                                atcx atcxVar2 = atdaVar.h;
                                if (atcxVar2 == null) {
                                    atcxVar2 = atcx.a;
                                }
                                aomfVar = atcxVar2.f;
                            } else {
                                avqw avqwVar = atdaVar.j;
                                if (avqwVar == null) {
                                    avqwVar = avqw.a;
                                }
                                if ((avqwVar.b & 1024) != 0) {
                                    avqw avqwVar2 = atdaVar.j;
                                    if (avqwVar2 == null) {
                                        avqwVar2 = avqw.a;
                                    }
                                    aomfVar = avqwVar2.c;
                                } else {
                                    avqx avqxVar = atdaVar.k;
                                    if (avqxVar == null) {
                                        avqxVar = avqx.a;
                                    }
                                    if ((avqxVar.b & 1024) != 0) {
                                        avqx avqxVar2 = atdaVar.k;
                                        if (avqxVar2 == null) {
                                            avqxVar2 = avqx.a;
                                        }
                                        aomfVar = avqxVar2.c;
                                    } else {
                                        atdg atdgVar = atdaVar.l;
                                        if (atdgVar == null) {
                                            atdgVar = atdg.a;
                                        }
                                        if ((atdgVar.b & 4) != 0) {
                                            atdg atdgVar2 = atdaVar.l;
                                            if (atdgVar2 == null) {
                                                atdgVar2 = atdg.a;
                                            }
                                            aomfVar = atdgVar2.d;
                                        } else {
                                            avpw avpwVar = atdaVar.m;
                                            if (avpwVar == null) {
                                                avpwVar = avpw.a;
                                            }
                                            if ((avpwVar.b & 128) != 0) {
                                                avpw avpwVar2 = atdaVar.m;
                                                if (avpwVar2 == null) {
                                                    avpwVar2 = avpw.a;
                                                }
                                                aomfVar = avpwVar2.g;
                                            } else {
                                                atcs atcsVar = atdaVar.n;
                                                if (atcsVar == null) {
                                                    atcsVar = atcs.a;
                                                }
                                                if ((atcsVar.b & 8) != 0) {
                                                    atcs atcsVar2 = atdaVar.n;
                                                    if (atcsVar2 == null) {
                                                        atcsVar2 = atcs.a;
                                                    }
                                                    aomfVar = atcsVar2.c;
                                                } else {
                                                    aqrf aqrfVar = atdaVar.p;
                                                    if (aqrfVar == null) {
                                                        aqrfVar = aqrf.a;
                                                    }
                                                    if ((aqrfVar.b & 8) != 0) {
                                                        aqrf aqrfVar2 = atdaVar.p;
                                                        if (aqrfVar2 == null) {
                                                            aqrfVar2 = aqrf.a;
                                                        }
                                                        aomfVar = aqrfVar2.e;
                                                    } else {
                                                        aomfVar = aomf.b;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        acraVar.I(3, new acqx(aomfVar.I()), null);
        Optional.ofNullable((apxf) Optional.ofNullable(adyu.dk(this.a)).orElseGet(new Supplier() { // from class: nly
            @Override // j$.util.function.Supplier
            public final Object get() {
                return adyu.dl(nlz.this.a);
            }
        })).ifPresent(new afyl(this.b.f, 1));
        return true;
    }

    @Override // defpackage.fzk
    public final int n() {
        return this.c.a;
    }

    @Override // defpackage.fzk
    public final CharSequence o() {
        return adyu.m0do(this.a);
    }
}
