package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abet implements abeo {
    public amml a;
    public amml b;
    public Boolean c;
    private final azrw d;
    private final azrw e;

    public abet(azrw azrwVar, azrw azrwVar2) {
        this.d = azrwVar;
        this.e = azrwVar2;
    }

    @Override // defpackage.abeo
    public final anhy a() {
        anhy O;
        anhy b;
        final int i = 1;
        if (this.c != null) {
            final ylq ylqVar = (ylq) this.e.get();
            final amml ammlVar = new amml(this) { // from class: aber
                public final /* synthetic */ abet a;

                {
                    this.a = this;
                }

                @Override // defpackage.amml
                public final Object apply(Object obj) {
                    if (i == 0) {
                        abet abetVar = this.a;
                        awuu awuuVar = (awuu) obj;
                        aone builder = awuuVar.toBuilder();
                        amml ammlVar2 = abetVar.a;
                        if (ammlVar2 != null) {
                            atyi atyiVar = awuuVar.c;
                            if (atyiVar == null) {
                                atyiVar = atyi.a;
                            }
                            Object apply = ammlVar2.apply(atyiVar);
                            builder.copyOnWrite();
                            awuu awuuVar2 = (awuu) builder.instance;
                            awuuVar2.c = (atyi) apply;
                            awuuVar2.b |= 1;
                        }
                        amml ammlVar3 = abetVar.b;
                        if (ammlVar3 != null) {
                            apgh apghVar = awuuVar.d;
                            if (apghVar == null) {
                                apghVar = apgh.a;
                            }
                            apgh apghVar2 = (apgh) ammlVar3.apply(apghVar);
                            builder.copyOnWrite();
                            awuu awuuVar3 = (awuu) builder.instance;
                            apghVar2.getClass();
                            awuuVar3.d = apghVar2;
                            awuuVar3.b |= 2;
                        }
                        return (awuu) builder.build();
                    }
                    abet abetVar2 = this.a;
                    aone builder2 = ((awus) obj).toBuilder();
                    boolean booleanValue = abetVar2.c.booleanValue();
                    builder2.copyOnWrite();
                    awus awusVar = (awus) builder2.instance;
                    awusVar.b |= 1;
                    awusVar.c = booleanValue;
                    return (awus) builder2.build();
                }
            };
            final angq angqVar = angq.a;
            O = ylqVar.a(new anfz() { // from class: ylp
                @Override // defpackage.anfz
                public final anhy a(Object obj) {
                    return anfq.h(((vgz) obj).b(ammlVar, angqVar), new ylm(ylq.this, 0), angq.a);
                }
            });
        } else {
            O = anaf.O(null);
        }
        final int i2 = 0;
        if (this.a != null || this.b != null) {
            b = ((vgz) this.d.get()).b(new amml(this) { // from class: aber
                public final /* synthetic */ abet a;

                {
                    this.a = this;
                }

                @Override // defpackage.amml
                public final Object apply(Object obj) {
                    if (i2 == 0) {
                        abet abetVar = this.a;
                        awuu awuuVar = (awuu) obj;
                        aone builder = awuuVar.toBuilder();
                        amml ammlVar2 = abetVar.a;
                        if (ammlVar2 != null) {
                            atyi atyiVar = awuuVar.c;
                            if (atyiVar == null) {
                                atyiVar = atyi.a;
                            }
                            Object apply = ammlVar2.apply(atyiVar);
                            builder.copyOnWrite();
                            awuu awuuVar2 = (awuu) builder.instance;
                            awuuVar2.c = (atyi) apply;
                            awuuVar2.b |= 1;
                        }
                        amml ammlVar3 = abetVar.b;
                        if (ammlVar3 != null) {
                            apgh apghVar = awuuVar.d;
                            if (apghVar == null) {
                                apghVar = apgh.a;
                            }
                            apgh apghVar2 = (apgh) ammlVar3.apply(apghVar);
                            builder.copyOnWrite();
                            awuu awuuVar3 = (awuu) builder.instance;
                            apghVar2.getClass();
                            awuuVar3.d = apghVar2;
                            awuuVar3.b |= 2;
                        }
                        return (awuu) builder.build();
                    }
                    abet abetVar2 = this.a;
                    aone builder2 = ((awus) obj).toBuilder();
                    boolean booleanValue = abetVar2.c.booleanValue();
                    builder2.copyOnWrite();
                    awus awusVar = (awus) builder2.instance;
                    awusVar.b |= 1;
                    awusVar.c = booleanValue;
                    return (awus) builder2.build();
                }
            }, angq.a);
        } else {
            b = anaf.O(null);
        }
        return anaf.I(O, b).b(new abes(O, b, i2), angq.a);
    }
}
