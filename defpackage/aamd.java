package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aamd {
    public final auov a;
    public amru b;
    private amru c;

    public aamd(auov auovVar) {
        auovVar.getClass();
        this.a = auovVar;
    }

    public final amru a() {
        if (this.c == null) {
            this.c = (amru) ((ayqj) aypy.T(this.a.d).Y(new ayrv() { // from class: aamc
                @Override // defpackage.ayrv
                public final Object a(Object obj) {
                    auoy auoyVar = (auoy) obj;
                    int i = auoyVar.b;
                    if ((i & 16) == 0) {
                        if ((i & 65536) != 0) {
                            ausu ausuVar = auoyVar.v;
                            if (ausuVar == null) {
                                ausuVar = ausu.a;
                            }
                            ausw auswVar = ausuVar.r;
                            if (auswVar == null) {
                                auswVar = ausw.a;
                            }
                            if ((auswVar.b & 8) != 0) {
                                return ammv.j(new aamj(ausuVar));
                            }
                            ausw auswVar2 = ausuVar.r;
                            if (auswVar2 == null) {
                                auswVar2 = ausw.a;
                            }
                            if ((auswVar2.b & 4) != 0) {
                                return ammv.j(new aaly(ausuVar));
                            }
                            if ((ausuVar.b & 4194304) != 0) {
                                ausw auswVar3 = ausuVar.r;
                                if (auswVar3 == null) {
                                    auswVar3 = ausw.a;
                                }
                                aonm aonmVar = null;
                                if (auswVar3 != null) {
                                    int i2 = auswVar3.b;
                                    if ((i2 & 1) != 0) {
                                        aonmVar = auswVar3.c;
                                        if (aonmVar == null) {
                                            aonmVar = araz.a;
                                        }
                                    } else if ((i2 & 2) != 0) {
                                        aonmVar = auswVar3.d;
                                        if (aonmVar == null) {
                                            aonmVar = arcz.a;
                                        }
                                    } else if ((i2 & 4) != 0) {
                                        aonmVar = auswVar3.e;
                                        if (aonmVar == null) {
                                            aonmVar = arfa.a;
                                        }
                                    } else if ((i2 & 8) != 0) {
                                        aonmVar = auswVar3.f;
                                        if (aonmVar == null) {
                                            aonmVar = avvq.a;
                                        }
                                    } else if ((i2 & 16) != 0) {
                                        aonmVar = auswVar3.g;
                                        if (aonmVar == null) {
                                            aonmVar = ausi.a;
                                        }
                                    } else if ((i2 & 32) != 0) {
                                        aonmVar = auswVar3.h;
                                        if (aonmVar == null) {
                                            aonmVar = aush.a;
                                        }
                                    } else if ((i2 & 64) != 0) {
                                        aonmVar = auswVar3.i;
                                        if (aonmVar == null) {
                                            aonmVar = arfc.a;
                                        }
                                    } else if ((i2 & 128) != 0) {
                                        aonmVar = auswVar3.j;
                                        if (aonmVar == null) {
                                            aonmVar = atdn.a;
                                        }
                                    } else if ((i2 & 256) != 0) {
                                        aonmVar = auswVar3.k;
                                        if (aonmVar == null) {
                                            aonmVar = avpj.a;
                                        }
                                    } else if ((i2 & 512) != 0 && (aonmVar = auswVar3.l) == null) {
                                        aonmVar = avre.a;
                                    }
                                }
                                if (aonmVar != null) {
                                    return ammv.j(ausuVar);
                                }
                            }
                        } else {
                            aooy Y = whu.Y(auoyVar);
                            if (Y != null) {
                                return ammv.j(Y);
                            }
                        }
                        return amlr.a;
                    }
                    askd askdVar = auoyVar.j;
                    if (askdVar == null) {
                        askdVar = askd.a;
                    }
                    return ammv.j(new aalz(askdVar));
                }
            }).p(nuw.c).aD(zcz.h)).X();
        }
        return this.c;
    }
}
