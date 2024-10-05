package defpackage;

import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;
import com.google.protos.youtube.api.innertube.OfflineabilityRendererOuterClass;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eye implements aaha {
    private final agzj a;
    private final fjs b;
    private final azrw c;
    private final jlj d;
    private final Executor e;
    private final axzf f;

    public eye(agzj agzjVar, fjs fjsVar, azrw azrwVar, jlj jljVar, Executor executor, axzf axzfVar, byte[] bArr, byte[] bArr2) {
        this.a = agzjVar;
        this.b = fjsVar;
        this.c = azrwVar;
        this.d = jljVar;
        this.e = executor;
        this.f = axzfVar;
    }

    public static /* synthetic */ void b(Throwable th) {
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
        sb.append("Failed to handle the error state when add the video.");
        sb.append(valueOf);
        zga.b(sb.toString());
    }

    private final void d(String str, boolean z) {
        if (this.b.h()) {
            agnv e = ((agof) this.c.get()).a().m().e(str);
            agnu agnuVar = e == null ? null : e.j;
            if (e == null || agnuVar == null) {
                return;
            }
            this.a.e(agnuVar, z);
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
        sb.append("Trying to renew download (id=");
        sb.append(str);
        sb.append(") but user does not have downloads.");
        zga.l(sb.toString());
    }

    private final void e(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint, boolean z) {
        int i = offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c;
        if (i != 7) {
            this.a.c(i == 1 ? (String) offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d : "", z);
        } else {
            this.a.d((String) offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d, z);
        }
    }

    public final void c(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint, atsb atsbVar, acra acraVar, atom atomVar) {
        int i = offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c;
        if (i != 7) {
            this.a.n(i == 1 ? (String) offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d : "", atsbVar, null, acraVar, atomVar);
        } else {
            this.a.v((String) offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d, atsbVar, acraVar, atomVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        final String g;
        final atsb atsbVar;
        Boolean bool;
        final OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) apxfVar.pX(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint);
        int i = offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c;
        if (i == 1) {
            g = (String) offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d;
        } else {
            g = aalt.g(i == 7 ? (String) offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d : "");
        }
        int bK = anaf.bK(offlineVideoEndpointOuterClass$OfflineVideoEndpoint.f);
        if (bK == 0) {
            bK = 1;
        }
        atom atomVar = null;
        switch (bK - 1) {
            case 1:
                Object s = yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
                if ((offlineVideoEndpointOuterClass$OfflineVideoEndpoint.b & 32) != 0) {
                    aulq aulqVar = offlineVideoEndpointOuterClass$OfflineVideoEndpoint.g;
                    if (aulqVar == null) {
                        aulqVar = aulq.a;
                    }
                    atsbVar = (atsb) aulqVar.pX(OfflineabilityRendererOuterClass.offlineabilityRenderer);
                } else {
                    atsbVar = null;
                }
                if (atsbVar == null) {
                    if (s instanceof aqdb) {
                        aqdb aqdbVar = (aqdb) s;
                        aqda aqdaVar = aqdbVar.t;
                        if (aqdaVar == null) {
                            aqdaVar = aqda.a;
                        }
                        if ((aqdaVar.b & 1) != 0) {
                            aqda aqdaVar2 = aqdbVar.t;
                            if (aqdaVar2 == null) {
                                aqdaVar2 = aqda.a;
                            }
                            atsbVar = aqdaVar2.c;
                            if (atsbVar == null) {
                                atsbVar = atsb.a;
                            }
                        }
                        atsbVar = null;
                    } else if (s instanceof aubw) {
                        aubw aubwVar = (aubw) s;
                        aubv aubvVar = aubwVar.s;
                        if (aubvVar == null) {
                            aubvVar = aubv.a;
                        }
                        if (aubvVar.b == 60572968) {
                            aubv aubvVar2 = aubwVar.s;
                            if (aubvVar2 == null) {
                                aubvVar2 = aubv.a;
                            }
                            if (aubvVar2.b == 60572968) {
                                atsbVar = (atsb) aubvVar2.c;
                            } else {
                                atsbVar = atsb.a;
                            }
                        }
                        atsbVar = null;
                    } else if (s instanceof ardf) {
                        ardf ardfVar = (ardf) s;
                        arde ardeVar = ardfVar.t;
                        if (ardeVar == null) {
                            ardeVar = arde.a;
                        }
                        if ((ardeVar.b & 1) != 0) {
                            arde ardeVar2 = ardfVar.t;
                            if (ardeVar2 == null) {
                                ardeVar2 = arde.a;
                            }
                            atsbVar = ardeVar2.c;
                            if (atsbVar == null) {
                                atsbVar = atsb.a;
                            }
                        }
                        atsbVar = null;
                    } else if (s instanceof audj) {
                        audj audjVar = (audj) s;
                        audi audiVar = audjVar.q;
                        if (audiVar == null) {
                            audiVar = audi.a;
                        }
                        if ((audiVar.b & 1) != 0) {
                            audi audiVar2 = audjVar.q;
                            if (audiVar2 == null) {
                                audiVar2 = audi.a;
                            }
                            atsbVar = audiVar2.c;
                            if (atsbVar == null) {
                                atsbVar = atsb.a;
                            }
                        }
                        atsbVar = null;
                    } else if (s instanceof awal) {
                        awal awalVar = (awal) s;
                        if ((awalVar.b & 1024) != 0) {
                            awak awakVar = awalVar.m;
                            if (awakVar == null) {
                                awakVar = awak.a;
                            }
                            atsbVar = awakVar.b;
                            if (atsbVar == null) {
                                atsbVar = atsb.a;
                            }
                        }
                        atsbVar = null;
                    } else if (s instanceof avzv) {
                        avzv avzvVar = (avzv) s;
                        avzu avzuVar = avzvVar.u;
                        if (avzuVar == null) {
                            avzuVar = avzu.a;
                        }
                        if ((avzuVar.b & 1) != 0) {
                            avzu avzuVar2 = avzvVar.u;
                            if (avzuVar2 == null) {
                                avzuVar2 = avzu.a;
                            }
                            atsbVar = avzuVar2.c;
                            if (atsbVar == null) {
                                atsbVar = atsb.a;
                            }
                        }
                        atsbVar = null;
                    } else if (s instanceof jal) {
                        jal jalVar = (jal) s;
                        avzu avzuVar3 = jalVar.a().u;
                        if (avzuVar3 == null) {
                            avzuVar3 = avzu.a;
                        }
                        if ((avzuVar3.b & 1) != 0) {
                            avzu avzuVar4 = jalVar.a().u;
                            if (avzuVar4 == null) {
                                avzuVar4 = avzu.a;
                            }
                            atsbVar = avzuVar4.c;
                            if (atsbVar == null) {
                                atsbVar = atsb.a;
                            }
                        }
                        atsbVar = null;
                    } else {
                        if (s instanceof avwg) {
                            avwg avwgVar = (avwg) s;
                            avwf avwfVar = avwgVar.n;
                            if (avwfVar == null) {
                                avwfVar = avwf.a;
                            }
                            if (avwfVar.b == 60572968) {
                                avwf avwfVar2 = avwgVar.n;
                                if (avwfVar2 == null) {
                                    avwfVar2 = avwf.a;
                                }
                                if (avwfVar2.b == 60572968) {
                                    atsbVar = (atsb) avwfVar2.c;
                                } else {
                                    atsbVar = atsb.a;
                                }
                            }
                        }
                        atsbVar = null;
                    }
                }
                if (atsbVar == null) {
                    String valueOf = String.valueOf(s);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                    sb.append("Object is not an offlineable video: ");
                    sb.append(valueOf);
                    zga.b(sb.toString());
                    return;
                }
                final acra acraVar = (acra) yjj.u(map, "com.google.android.libraries.youtube.logging.interaction_logger", acra.class);
                aqvj aqvjVar = this.f.a.b().C;
                if (aqvjVar == null) {
                    aqvjVar = aqvj.a;
                }
                if (aqvjVar.a(45353483L)) {
                    aoot aootVar = aqvjVar.b;
                    if (!aootVar.containsKey(45353483L)) {
                        throw new IllegalArgumentException();
                    }
                    aqvk aqvkVar = (aqvk) aootVar.get(45353483L);
                    bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
                } else {
                    bool = false;
                }
                if (!bool.booleanValue()) {
                    if ((offlineVideoEndpointOuterClass$OfflineVideoEndpoint.b & 64) != 0 && (atomVar = offlineVideoEndpointOuterClass$OfflineVideoEndpoint.h) == null) {
                        atomVar = atom.a;
                    }
                    c(offlineVideoEndpointOuterClass$OfflineVideoEndpoint, atsbVar, acraVar, atomVar);
                    return;
                }
                final jlj jljVar = this.d;
                anhy i2 = anfq.i(anht.q(((agof) jljVar.c.get()).a().m().h(g)), new anfz() { // from class: jli
                    @Override // defpackage.anfz
                    public final anhy a(Object obj) {
                        jlj jljVar2 = jlj.this;
                        ammv ammvVar = (ammv) obj;
                        if (!ammvVar.h()) {
                            return anaf.O(ammw.a(null, false));
                        }
                        return anfq.h(((agpr) jljVar2.b.get()).b((agnv) ammvVar.c()), new jit((agnv) ammvVar.c(), 2), jljVar2.f);
                    }
                }, jljVar.f);
                ynm.k(i2, jljVar.e, gwr.r, new ynl() { // from class: jlh
                    @Override // defpackage.ynl, defpackage.zfi
                    public final void a(Object obj) {
                        jlj jljVar2 = jlj.this;
                        String str = g;
                        acra acraVar2 = acraVar;
                        ammw ammwVar = (ammw) obj;
                        agnv agnvVar = (agnv) ammwVar.a;
                        boolean booleanValue = ((Boolean) ammwVar.b).booleanValue();
                        if (agnvVar == null || !booleanValue) {
                            return;
                        }
                        if (jljVar2.b(agnvVar)) {
                            jljVar2.a.m(null, str, null, true);
                            return;
                        }
                        if (agnvVar.r()) {
                            whu.K(jljVar2.d, R.string.add_video_to_offline_error, 1);
                            return;
                        }
                        if (agnvVar.x()) {
                            agnu agnuVar = agnvVar.j;
                            if (agnuVar.f()) {
                                jljVar2.a.e(agnuVar, true);
                                return;
                            }
                            Object d = agnuVar.d();
                            if (d != null) {
                                jljVar2.a.q(str, d, acraVar2);
                                return;
                            }
                            return;
                        }
                        jljVar2.a.c(str, true);
                    }
                });
                ynm.k(anfq.h(i2, icu.h, jljVar.f), this.e, egw.h, new ynl() { // from class: eyd
                    @Override // defpackage.ynl, defpackage.zfi
                    public final void a(Object obj) {
                        atom atomVar2;
                        eye eyeVar = eye.this;
                        OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint2 = offlineVideoEndpointOuterClass$OfflineVideoEndpoint;
                        atsb atsbVar2 = atsbVar;
                        acra acraVar2 = acraVar;
                        if (Boolean.TRUE.equals((Boolean) obj)) {
                            return;
                        }
                        if ((offlineVideoEndpointOuterClass$OfflineVideoEndpoint2.b & 64) != 0) {
                            atomVar2 = offlineVideoEndpointOuterClass$OfflineVideoEndpoint2.h;
                            if (atomVar2 == null) {
                                atomVar2 = atom.a;
                            }
                        } else {
                            atomVar2 = null;
                        }
                        eyeVar.c(offlineVideoEndpointOuterClass$OfflineVideoEndpoint2, atsbVar2, acraVar2, atomVar2);
                    }
                });
                return;
            case 2:
                e(offlineVideoEndpointOuterClass$OfflineVideoEndpoint, false);
                return;
            case 3:
                if (this.b.h()) {
                    ((agof) this.c.get()).a().m().x(g);
                    return;
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(g).length() + 63);
                sb2.append("Trying to pause download (id=");
                sb2.append(g);
                sb2.append(") but user does not have downloads");
                zga.l(sb2.toString());
                return;
            case 4:
                this.a.s();
                return;
            case 5:
                if (this.b.h()) {
                    ((agof) this.c.get()).a().m().z(g);
                    return;
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(g).length() + 65);
                sb3.append("Trying to resume download (id=");
                sb3.append(g);
                sb3.append(") but user does not have downloads.");
                zga.l(sb3.toString());
                return;
            case 6:
            default:
                int bK2 = anaf.bK(offlineVideoEndpointOuterClass$OfflineVideoEndpoint.f);
                String bL = anaf.bL(bK2 != 0 ? bK2 : 1);
                StringBuilder sb4 = new StringBuilder(bL.length() + 34);
                sb4.append("Unsupported Offline Video Action: ");
                sb4.append(bL);
                zga.l(sb4.toString());
                return;
            case 7:
                int i3 = offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c;
                if (i3 != 7) {
                    this.a.m(offlineVideoEndpointOuterClass$OfflineVideoEndpoint.e, i3 == 1 ? (String) offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d : "", null, true);
                    return;
                } else {
                    this.a.u(offlineVideoEndpointOuterClass$OfflineVideoEndpoint.e, (String) offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d);
                    return;
                }
            case 8:
                d(g, false);
                return;
            case 9:
                e(offlineVideoEndpointOuterClass$OfflineVideoEndpoint, true);
                return;
            case 10:
                d(g, true);
                return;
        }
    }
}
