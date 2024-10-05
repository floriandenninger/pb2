package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alch extends albk {
    private final afsy a;
    private final aseb b;
    private final akyo c;
    private final abde e;
    private final axze f;

    public alch(aaea aaeaVar, afsy afsyVar, aseb asebVar, abde abdeVar, akyo akyoVar, axze axzeVar, akyb akybVar, alep alepVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(aaeaVar, avtr.UPLOAD_PROCESSOR_TYPE_SAVE_METADATA, akybVar, axzeVar, alepVar, null, null, null);
        this.a = afsyVar;
        this.b = asebVar;
        this.e = abdeVar;
        this.f = axzeVar;
        this.c = akyoVar;
    }

    @Override // defpackage.aldq
    public final akyq a(akzs akzsVar) {
        return this.c;
    }

    @Override // defpackage.aldq
    public final akzp b(akzs akzsVar) {
        akzp akzpVar = akzsVar.ac;
        return akzpVar == null ? akzp.a : akzpVar;
    }

    @Override // defpackage.albk
    public final anhy c(String str, akwm akwmVar, akzs akzsVar) {
        aone createBuilder;
        afsx d = this.a.d(akzsVar.e);
        if (d != null) {
            if ((akzsVar.b & 32) != 0) {
                arvt arvtVar = akzsVar.j;
                if (arvtVar == null) {
                    arvtVar = arvt.a;
                }
                createBuilder = arvtVar.toBuilder();
            } else {
                createBuilder = arvt.a.createBuilder();
                aone createBuilder2 = arvo.a.createBuilder();
                akzw akzwVar = akzsVar.i;
                if (akzwVar == null) {
                    akzwVar = akzw.a;
                }
                if (!akzwVar.c.isEmpty()) {
                    akzw akzwVar2 = akzsVar.i;
                    if (akzwVar2 == null) {
                        akzwVar2 = akzw.a;
                    }
                    String str2 = akzwVar2.c;
                    createBuilder2.copyOnWrite();
                    arvo arvoVar = (arvo) createBuilder2.instance;
                    str2.getClass();
                    arvoVar.b |= 1;
                    arvoVar.c = str2;
                    createBuilder.copyOnWrite();
                    arvt arvtVar2 = (arvt) createBuilder.instance;
                    arvo arvoVar2 = (arvo) createBuilder2.build();
                    arvoVar2.getClass();
                    arvtVar2.f = arvoVar2;
                    arvtVar2.b |= 8;
                    aone createBuilder3 = arvb.a.createBuilder();
                    akzw akzwVar3 = akzsVar.i;
                    if (akzwVar3 == null) {
                        akzwVar3 = akzw.a;
                    }
                    String str3 = akzwVar3.d;
                    createBuilder3.copyOnWrite();
                    arvb arvbVar = (arvb) createBuilder3.instance;
                    str3.getClass();
                    arvbVar.b |= 1;
                    arvbVar.c = str3;
                    createBuilder.copyOnWrite();
                    arvt arvtVar3 = (arvt) createBuilder.instance;
                    arvb arvbVar2 = (arvb) createBuilder3.build();
                    arvbVar2.getClass();
                    arvtVar3.g = arvbVar2;
                    arvtVar3.b |= 16;
                    aone createBuilder4 = arvj.a.createBuilder();
                    akzv akzvVar = akzv.PRIVATE;
                    akzw akzwVar4 = akzsVar.i;
                    if (akzwVar4 == null) {
                        akzwVar4 = akzw.a;
                    }
                    akzv a = akzv.a(akzwVar4.e);
                    if (a == null) {
                        a = akzv.PRIVATE;
                    }
                    int ordinal = a.ordinal();
                    if (ordinal == 0) {
                        createBuilder4.copyOnWrite();
                        arvj arvjVar = (arvj) createBuilder4.instance;
                        arvjVar.c = 0;
                        arvjVar.b |= 1;
                    } else if (ordinal == 1) {
                        createBuilder4.copyOnWrite();
                        arvj arvjVar2 = (arvj) createBuilder4.instance;
                        arvjVar2.c = 1;
                        arvjVar2.b |= 1;
                    } else if (ordinal == 2) {
                        createBuilder4.copyOnWrite();
                        arvj arvjVar3 = (arvj) createBuilder4.instance;
                        arvjVar3.c = 2;
                        arvjVar3.b |= 1;
                    }
                    createBuilder.copyOnWrite();
                    arvt arvtVar4 = (arvt) createBuilder.instance;
                    arvj arvjVar4 = (arvj) createBuilder4.build();
                    arvjVar4.getClass();
                    arvtVar4.h = arvjVar4;
                    arvtVar4.b |= 32;
                    aone createBuilder5 = arvm.a.createBuilder();
                    akzw akzwVar5 = akzsVar.i;
                    if (akzwVar5 == null) {
                        akzwVar5 = akzw.a;
                    }
                    aony aonyVar = akzwVar5.f;
                    createBuilder5.copyOnWrite();
                    arvm arvmVar = (arvm) createBuilder5.instance;
                    aony aonyVar2 = arvmVar.b;
                    if (!aonyVar2.c()) {
                        arvmVar.b = aonm.mutableCopy(aonyVar2);
                    }
                    aolo.addAll((Iterable) aonyVar, (List) arvmVar.b);
                    createBuilder.copyOnWrite();
                    arvt arvtVar5 = (arvt) createBuilder.instance;
                    arvm arvmVar2 = (arvm) createBuilder5.build();
                    arvmVar2.getClass();
                    arvtVar5.j = arvmVar2;
                    arvtVar5.b |= 256;
                    akzw akzwVar6 = akzsVar.i;
                    if (akzwVar6 == null) {
                        akzwVar6 = akzw.a;
                    }
                    if ((akzwVar6.b & 8) != 0) {
                        aone createBuilder6 = arvf.a.createBuilder();
                        akzw akzwVar7 = akzsVar.i;
                        if (akzwVar7 == null) {
                            akzwVar7 = akzw.a;
                        }
                        akzu akzuVar = akzwVar7.g;
                        if (akzuVar == null) {
                            akzuVar = akzu.a;
                        }
                        double d2 = akzuVar.b;
                        createBuilder6.copyOnWrite();
                        arvf arvfVar = (arvf) createBuilder6.instance;
                        arvfVar.b |= 1;
                        arvfVar.c = d2;
                        akzw akzwVar8 = akzsVar.i;
                        if (akzwVar8 == null) {
                            akzwVar8 = akzw.a;
                        }
                        akzu akzuVar2 = akzwVar8.g;
                        if (akzuVar2 == null) {
                            akzuVar2 = akzu.a;
                        }
                        double d3 = akzuVar2.c;
                        createBuilder6.copyOnWrite();
                        arvf arvfVar2 = (arvf) createBuilder6.instance;
                        arvfVar2.b |= 2;
                        arvfVar2.d = d3;
                        akzw akzwVar9 = akzsVar.i;
                        if (akzwVar9 == null) {
                            akzwVar9 = akzw.a;
                        }
                        akzu akzuVar3 = akzwVar9.g;
                        if (akzuVar3 == null) {
                            akzuVar3 = akzu.a;
                        }
                        String str4 = akzuVar3.d;
                        createBuilder6.copyOnWrite();
                        arvf arvfVar3 = (arvf) createBuilder6.instance;
                        str4.getClass();
                        arvfVar3.b |= 8;
                        arvfVar3.f = str4;
                        akzw akzwVar10 = akzsVar.i;
                        if (akzwVar10 == null) {
                            akzwVar10 = akzw.a;
                        }
                        akzu akzuVar4 = akzwVar10.g;
                        if (akzuVar4 == null) {
                            akzuVar4 = akzu.a;
                        }
                        String str5 = akzuVar4.e;
                        createBuilder6.copyOnWrite();
                        arvf arvfVar4 = (arvf) createBuilder6.instance;
                        str5.getClass();
                        arvfVar4.b |= 4;
                        arvfVar4.e = str5;
                        createBuilder.copyOnWrite();
                        arvt arvtVar6 = (arvt) createBuilder.instance;
                        arvf arvfVar5 = (arvf) createBuilder6.build();
                        arvfVar5.getClass();
                        arvtVar6.m = arvfVar5;
                        arvtVar6.b |= 32768;
                    }
                } else {
                    throw new AssertionError("Metadata update with empty title");
                }
            }
            aone aoneVar = createBuilder;
            String str6 = akzsVar.Y;
            aoneVar.copyOnWrite();
            arvt arvtVar7 = (arvt) aoneVar.instance;
            str6.getClass();
            arvtVar7.b = 2 | arvtVar7.b;
            arvtVar7.e = str6;
            abde abdeVar = this.e;
            byte[] bArr = aaef.b;
            aasp aaspVar = abdeVar.b;
            aazv aazvVar = new aazv(abdeVar.f, d, aoneVar, null, null, null);
            aazvVar.m(bArr);
            arvu arvuVar = (arvu) aaspVar.d(aazvVar);
            if ((arvuVar.b & 4) != 0) {
                arvx arvxVar = arvuVar.d;
                if (arvxVar == null) {
                    arvxVar = arvx.a;
                }
                int dx = amkq.dx(arvxVar.c);
                if (dx == 0 || dx == 1) {
                    return anaf.O(t(this.d.d(), true));
                }
            }
            return anaf.O(t(this.d.c(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_INNERTUBE_FAILED), true));
        }
        throw akwe.a(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_IDENTITY_NOT_FOUND);
    }

    @Override // defpackage.aldq
    public final ayro e() {
        return albr.e;
    }

    @Override // defpackage.aldq
    public final String f() {
        return "SaveMetadataTask";
    }

    @Override // defpackage.aldq
    public final boolean h() {
        return false;
    }

    @Override // defpackage.albk
    public final boolean i(akzs akzsVar) {
        int i = akzsVar.b;
        return ((i & 1) == 0 || (akzsVar.c & 524288) == 0 || (i & 16) == 0) ? false : true;
    }

    @Override // defpackage.albk
    public final akwp k(Throwable th, akzs akzsVar, boolean z) {
        if (th instanceof aasx) {
            alep alepVar = this.d;
            avtq avtqVar = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_INNERTUBE_FAILED;
            akzp akzpVar = akzsVar.ac;
            if (akzpVar == null) {
                akzpVar = akzp.a;
            }
            akzpVar.getClass();
            return t(alepVar.o(avtqVar, akzpVar, this.b.i, this.f), z);
        }
        return super.k(th, akzsVar, z);
    }
}
