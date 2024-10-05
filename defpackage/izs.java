package defpackage;

import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.InlinePlaybackRendererOuterClass;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class izs implements aaeg {
    private final AtomicBoolean a = new AtomicBoolean();
    private final axpg b;
    private final aadw c;

    public izs(aadw aadwVar, axpg axpgVar) {
        this.c = aadwVar;
        this.b = axpgVar;
    }

    private final amru b(long j, String str, avgg avggVar) {
        if ((j & 64) != 0) {
            apma a = apmb.a();
            a.copyOnWrite();
            ((apmb) a.instance).h(str);
            a.copyOnWrite();
            ((apmb) a.instance).g(true);
            if (avggVar != null && !avggVar.c.isEmpty()) {
                String str2 = ((avgf) avggVar.c.get(0)).c;
                a.copyOnWrite();
                ((apmb) a.instance).i(str2);
                int size = avggVar.c.size();
                a.copyOnWrite();
                ((apmb) a.instance).j(size);
            }
            acpl acplVar = (acpl) this.b.get();
            arpn a2 = arpp.a();
            a2.copyOnWrite();
            ((arpp) a2.instance).ch((apmb) a.build());
            acplVar.c((arpp) a2.build());
        }
        return avggVar != null ? amru.r(avggVar) : amru.q();
    }

    @Override // defpackage.aaeg
    public final /* bridge */ /* synthetic */ List a(Object obj) {
        aveh avehVar;
        avgg avggVar;
        if (this.a.compareAndSet(false, true) && (obj instanceof arjv)) {
            arjv arjvVar = (arjv) obj;
            if ((arjvVar.b & 64) != 0) {
                avdj avdjVar = this.c.b().u;
                if (avdjVar == null) {
                    avdjVar = avdj.a;
                }
                long j = avdjVar.r;
                arjw arjwVar = arjvVar.f;
                if (arjwVar == null) {
                    arjwVar = arjw.a;
                }
                if (arjwVar.b != 58173949) {
                    return amru.q();
                }
                aony aonyVar = ((arke) arjwVar.c).c;
                if (aonyVar.size() <= 0) {
                    return amru.q();
                }
                arjy arjyVar = (arjy) aonyVar.get(0);
                if (arjyVar.b == 58174010) {
                    avehVar = (aveh) arjyVar.c;
                } else {
                    avehVar = aveh.a;
                }
                apxf apxfVar = avehVar.d;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                if (apxfVar.pY(BrowseEndpointOuterClass.browseEndpoint)) {
                    apxf apxfVar2 = avehVar.d;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                    if (((aplt) apxfVar2.pX(BrowseEndpointOuterClass.browseEndpoint)).c.equals("FEwhat_to_watch")) {
                        aved avedVar = avehVar.k;
                        if (avedVar == null) {
                            avedVar = aved.a;
                        }
                        if ((avedVar.b & 1) == 0) {
                            return amru.q();
                        }
                        aved avedVar2 = avehVar.k;
                        if (avedVar2 == null) {
                            avedVar2 = aved.a;
                        }
                        auov auovVar = avedVar2.c;
                        if (auovVar == null) {
                            auovVar = auov.a;
                        }
                        aony aonyVar2 = auovVar.d;
                        if (aonyVar2.size() <= 0 || (((auoy) aonyVar2.get(0)).b & 16) == 0) {
                            return amru.q();
                        }
                        askd askdVar = ((auoy) aonyVar2.get(0)).j;
                        if (askdVar == null) {
                            askdVar = askd.a;
                        }
                        aony aonyVar3 = askdVar.e;
                        if (aonyVar3.size() <= 0) {
                            return amru.q();
                        }
                        askg askgVar = (askg) aonyVar3.get(0);
                        int i = askgVar.f;
                        if ((524288 & i) != 0) {
                            if ((1 & j) != 0) {
                                augj augjVar = askgVar.aj;
                                if (augjVar == null) {
                                    augjVar = augj.a;
                                }
                                String simpleName = augjVar.getClass().getSimpleName();
                                augh aughVar = augjVar.c;
                                if (aughVar == null) {
                                    aughVar = augh.a;
                                }
                                avgg avggVar2 = aughVar.d;
                                if (avggVar2 == null) {
                                    avggVar2 = avgg.a;
                                }
                                return b(j, simpleName, avggVar2);
                            }
                            return amru.q();
                        }
                        if ((Integer.MIN_VALUE & i) != 0) {
                            if ((2 & j) != 0) {
                                auha auhaVar = askgVar.ap;
                                if (auhaVar == null) {
                                    auhaVar = auha.a;
                                }
                                String simpleName2 = auhaVar.getClass().getSimpleName();
                                augz augzVar = auhaVar.c;
                                if (augzVar == null) {
                                    augzVar = augz.a;
                                }
                                avgg avggVar3 = augzVar.c;
                                if (avggVar3 == null) {
                                    avggVar3 = avgg.a;
                                }
                                return b(j, simpleName2, avggVar3);
                            }
                            return amru.q();
                        }
                        int i2 = askgVar.d;
                        if ((i2 & 512) != 0) {
                            if ((4 & j) != 0) {
                                auhx auhxVar = askgVar.aa;
                                if (auhxVar == null) {
                                    auhxVar = auhx.a;
                                }
                                String simpleName3 = auhxVar.getClass().getSimpleName();
                                aulq aulqVar = auhxVar.c;
                                if (aulqVar == null) {
                                    aulqVar = aulq.a;
                                }
                                avgg avggVar4 = ((arhz) aulqVar.pX(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer)).c;
                                if (avggVar4 == null) {
                                    avggVar4 = avgg.a;
                                }
                                return b(j, simpleName3, avggVar4);
                            }
                            return amru.q();
                        }
                        if ((134217728 & i) != 0) {
                            if ((8 & j) != 0) {
                                auhk auhkVar = askgVar.al;
                                if (auhkVar == null) {
                                    auhkVar = auhk.a;
                                }
                                String simpleName4 = auhkVar.getClass().getSimpleName();
                                augy augyVar = auhkVar.c;
                                if (augyVar == null) {
                                    augyVar = augy.a;
                                }
                                avgg avggVar5 = augyVar.c;
                                if (avggVar5 == null) {
                                    avggVar5 = avgg.a;
                                }
                                return b(j, simpleName4, avggVar5);
                            }
                            return amru.q();
                        }
                        if ((131072 & i) != 0) {
                            if ((16 & j) != 0) {
                                augf augfVar = askgVar.ai;
                                if (augfVar == null) {
                                    augfVar = augf.a;
                                }
                                String simpleName5 = augfVar.getClass().getSimpleName();
                                augy augyVar2 = augfVar.c;
                                if (augyVar2 == null) {
                                    augyVar2 = augy.a;
                                }
                                avgg avggVar6 = augyVar2.c;
                                if (avggVar6 == null) {
                                    avggVar6 = avgg.a;
                                }
                                return b(j, simpleName5, avggVar6);
                            }
                            return amru.q();
                        }
                        if ((askgVar.h & 1048576) != 0) {
                            if ((32 & j) != 0) {
                                aqrf aqrfVar = askgVar.av;
                                if (aqrfVar == null) {
                                    aqrfVar = aqrf.a;
                                }
                                String simpleName6 = aqrfVar.getClass().getSimpleName();
                                try {
                                    awqd awqdVar = ((awos) aonm.parseFrom(awos.a, ajdx.a(aqrfVar), aomw.b())).c;
                                    if (awqdVar == null) {
                                        awqdVar = awqd.a;
                                    }
                                    awog awogVar = ((awob) awqdVar.pX(awob.b)).e;
                                    if (awogVar == null) {
                                        awogVar = awog.a;
                                    }
                                    awrh awrhVar = ((awri) awogVar.pX(awri.b)).c;
                                    if (awrhVar == null) {
                                        awrhVar = awrh.a;
                                    }
                                    awre awreVar = awrhVar.b;
                                    if (awreVar == null) {
                                        awreVar = awre.a;
                                    }
                                    awrg awrgVar = awreVar.b;
                                    if (awrgVar == null) {
                                        awrgVar = awrg.a;
                                    }
                                    awpf awpfVar = awrgVar.b;
                                    if (awpfVar == null) {
                                        awpfVar = awpf.a;
                                    }
                                    avggVar = ahbn.n(awpfVar);
                                } catch (aoob unused) {
                                    zga.b("Failed to parse ElementRenderer when crawling for first Home thumbnail");
                                    avggVar = null;
                                }
                                return b(j, simpleName6, avggVar);
                            }
                            return amru.q();
                        }
                        if ((1073741824 & i) != 0) {
                            if ((128 & j) != 0) {
                                auhb auhbVar = askgVar.ao;
                                if (auhbVar == null) {
                                    auhbVar = auhb.a;
                                }
                                String simpleName7 = auhbVar.getClass().getSimpleName();
                                augz augzVar2 = auhbVar.c;
                                if (augzVar2 == null) {
                                    augzVar2 = augz.a;
                                }
                                avgg avggVar7 = augzVar2.c;
                                if (avggVar7 == null) {
                                    avggVar7 = avgg.a;
                                }
                                return b(j, simpleName7, avggVar7);
                            }
                            return amru.q();
                        }
                        int i3 = askgVar.g;
                        if ((i3 & 2) != 0) {
                            if ((256 & j) != 0) {
                                auhc auhcVar = askgVar.aq;
                                if (auhcVar == null) {
                                    auhcVar = auhc.a;
                                }
                                String simpleName8 = auhcVar.getClass().getSimpleName();
                                augz augzVar3 = auhcVar.c;
                                if (augzVar3 == null) {
                                    augzVar3 = augz.a;
                                }
                                avgg avggVar8 = augzVar3.c;
                                if (avggVar8 == null) {
                                    avggVar8 = avgg.a;
                                }
                                return b(j, simpleName8, avggVar8);
                            }
                            return amru.q();
                        }
                        if ((i3 & 8) != 0) {
                            if ((512 & j) != 0) {
                                auhd auhdVar = askgVar.as;
                                if (auhdVar == null) {
                                    auhdVar = auhd.a;
                                }
                                String simpleName9 = auhdVar.getClass().getSimpleName();
                                augz augzVar4 = auhdVar.c;
                                if (augzVar4 == null) {
                                    augzVar4 = augz.a;
                                }
                                avgg avggVar9 = augzVar4.c;
                                if (avggVar9 == null) {
                                    avggVar9 = avgg.a;
                                }
                                return b(j, simpleName9, avggVar9);
                            }
                            return amru.q();
                        }
                        if ((i3 & 4) != 0) {
                            if ((1024 & j) != 0) {
                                auhe auheVar = askgVar.ar;
                                if (auheVar == null) {
                                    auheVar = auhe.a;
                                }
                                String simpleName10 = auheVar.getClass().getSimpleName();
                                augz augzVar5 = auheVar.c;
                                if (augzVar5 == null) {
                                    augzVar5 = augz.a;
                                }
                                avgg avggVar10 = augzVar5.c;
                                if (avggVar10 == null) {
                                    avggVar10 = avgg.a;
                                }
                                return b(j, simpleName10, avggVar10);
                            }
                            return amru.q();
                        }
                        if ((67108864 & i) != 0) {
                            if ((2048 & j) != 0) {
                                auhj auhjVar = askgVar.ak;
                                if (auhjVar == null) {
                                    auhjVar = auhj.a;
                                }
                                String simpleName11 = auhjVar.getClass().getSimpleName();
                                augy augyVar3 = auhjVar.c;
                                if (augyVar3 == null) {
                                    augyVar3 = augy.a;
                                }
                                avgg avggVar11 = augyVar3.c;
                                if (avggVar11 == null) {
                                    avggVar11 = avgg.a;
                                }
                                return b(j, simpleName11, avggVar11);
                            }
                            return amru.q();
                        }
                        if ((268435456 & i) != 0) {
                            if ((4096 & j) != 0) {
                                auhl auhlVar = askgVar.am;
                                if (auhlVar == null) {
                                    auhlVar = auhl.a;
                                }
                                String simpleName12 = auhlVar.getClass().getSimpleName();
                                augy augyVar4 = auhlVar.c;
                                if (augyVar4 == null) {
                                    augyVar4 = augy.a;
                                }
                                avgg avggVar12 = augyVar4.c;
                                if (avggVar12 == null) {
                                    avggVar12 = avgg.a;
                                }
                                return b(j, simpleName12, avggVar12);
                            }
                            return amru.q();
                        }
                        if ((i & 536870912) != 0) {
                            if ((8192 & j) != 0) {
                                auhn auhnVar = askgVar.an;
                                if (auhnVar == null) {
                                    auhnVar = auhn.a;
                                }
                                String simpleName13 = auhnVar.getClass().getSimpleName();
                                auhm auhmVar = auhnVar.c;
                                if (auhmVar == null) {
                                    auhmVar = auhm.a;
                                }
                                avgg avggVar13 = auhmVar.c;
                                if (avggVar13 == null) {
                                    avggVar13 = avgg.a;
                                }
                                return b(j, simpleName13, avggVar13);
                            }
                            return amru.q();
                        }
                        if ((i2 & 256) != 0) {
                            if ((16384 & j) != 0) {
                                auia auiaVar = askgVar.Z;
                                if (auiaVar == null) {
                                    auiaVar = auia.a;
                                }
                                String simpleName14 = auiaVar.getClass().getSimpleName();
                                avgg avggVar14 = auiaVar.c;
                                if (avggVar14 == null) {
                                    avggVar14 = avgg.a;
                                }
                                return b(j, simpleName14, avggVar14);
                            }
                            return amru.q();
                        }
                        if ((j & 64) != 0) {
                            return amru.q();
                        }
                        String simpleName15 = whu.Z(askgVar).getClass().getSimpleName();
                        apma a = apmb.a();
                        a.copyOnWrite();
                        ((apmb) a.instance).j(0);
                        a.copyOnWrite();
                        ((apmb) a.instance).h(simpleName15);
                        a.copyOnWrite();
                        ((apmb) a.instance).g(false);
                        apmb apmbVar = (apmb) a.build();
                        acpl acplVar = (acpl) this.b.get();
                        arpn a2 = arpp.a();
                        a2.copyOnWrite();
                        ((arpp) a2.instance).ch(apmbVar);
                        acplVar.c((arpp) a2.build());
                        return amru.q();
                    }
                }
                return amru.q();
            }
        }
        return amru.q();
    }
}
