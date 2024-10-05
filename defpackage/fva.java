package defpackage;

import com.google.protos.youtube.api.innertube.ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fva implements afwx {
    final /* synthetic */ fvc a;
    private final apxf b;
    private final Map c;
    private final agak d;
    private final fhe e;

    public fva(fvc fvcVar, apxf apxfVar, fhe fheVar, Map map, agak agakVar, byte[] bArr) {
        this.a = fvcVar;
        this.b = apxfVar;
        this.e = fheVar;
        this.c = map;
        this.d = agakVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        zga.d("Error rating", cnqVar);
        this.a.b.e(cnqVar);
        ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint = (ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint) this.b.pX(ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.modifyChannelNotificationPreferenceEndpoint);
        if (modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.g.size() > 0) {
            ((aahd) this.a.a.get()).e(modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.g, this.d);
        }
        this.e.C();
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        apmp apmpVar;
        avae avaeVar;
        acra acraVar;
        arwn arwnVar = (arwn) obj;
        Map map = this.c;
        avaa avaaVar = null;
        if (map != null && (arwnVar.b & 128) != 0 && (acraVar = (acra) yjj.u(map, "com.google.android.libraries.youtube.logging.interaction_logger", acra.class)) != null) {
            acraVar.D(new acqx(arwnVar.i.I()));
            acraVar.u(new acqx(arwnVar.i.I()), null);
        }
        ((aahd) this.a.a.get()).d(arwnVar.d, this.c);
        ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint = (ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint) this.b.pX(ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.modifyChannelNotificationPreferenceEndpoint);
        ((aahd) this.a.a.get()).d(modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.e, this.c);
        if (modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.f.size() > 0) {
            ((aahd) this.a.a.get()).e(modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.f, this.d);
        }
        apmh apmhVar = arwnVar.e;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((apmhVar.b & 2) != 0) {
            apmh apmhVar2 = arwnVar.e;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            apmpVar = apmhVar2.d;
            if (apmpVar == null) {
                apmpVar = apmp.a;
            }
        } else {
            apmpVar = null;
        }
        arwh arwhVar = arwnVar.f;
        if (arwhVar == null) {
            arwhVar = arwh.a;
        }
        if (arwhVar.b == 119226798) {
            arwh arwhVar2 = arwnVar.f;
            if (arwhVar2 == null) {
                arwhVar2 = arwh.a;
            }
            if (arwhVar2.b == 119226798) {
                avaeVar = (avae) arwhVar2.c;
            } else {
                avaeVar = avae.a;
            }
        } else {
            avaeVar = null;
        }
        arwh arwhVar3 = arwnVar.f;
        if (arwhVar3 == null) {
            arwhVar3 = arwh.a;
        }
        if (arwhVar3.b == 136076983) {
            arwh arwhVar4 = arwnVar.f;
            if (arwhVar4 == null) {
                arwhVar4 = arwh.a;
            }
            if (arwhVar4.b == 136076983) {
                avaaVar = (avaa) arwhVar4.c;
            } else {
                avaaVar = avaa.a;
            }
        }
        if (!arwnVar.g.isEmpty()) {
            ipk c = ipl.c(arwnVar.g);
            c.f = apmpVar;
            c.e = avaeVar;
            c.d = avaaVar;
            boolean z = true;
            c.e(true);
            c.d(arwnVar.h);
            ipl a = c.a();
            this.a.c.c(a.b, a);
            ipn ipnVar = (ipn) this.a.c.b(ipn.b(arwnVar.g, true));
            if (ipnVar != null) {
                if (avaeVar != null) {
                    aone builder = ((aonm) ipnVar.a).toBuilder();
                    int size = ((apql) builder.instance).m.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        if ((builder.aa(size).b & 4) != 0) {
                            aone createBuilder = apqi.a.createBuilder();
                            createBuilder.copyOnWrite();
                            apqi apqiVar = (apqi) createBuilder.instance;
                            apqiVar.e = avaeVar;
                            apqiVar.b |= 4;
                            builder.ab(size, createBuilder);
                            break;
                        }
                    }
                    ipn.c(builder);
                    ipnVar = new ipn((apql) builder.build(), ipnVar.c);
                } else if (avaaVar != null) {
                    aone builder2 = ((aonm) ipnVar.a).toBuilder();
                    int size2 = ((apql) builder2.instance).m.size();
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        if ((builder2.aa(size2).b & 8) != 0) {
                            aone createBuilder2 = apqi.a.createBuilder();
                            createBuilder2.copyOnWrite();
                            apqi apqiVar2 = (apqi) createBuilder2.instance;
                            apqiVar2.f = avaaVar;
                            apqiVar2.b |= 8;
                            builder2.ab(size2, createBuilder2);
                            break;
                        }
                    }
                    ipn.c(builder2);
                    ipnVar = new ipn((apql) builder2.build(), ipnVar.c);
                } else {
                    z = false;
                }
                if (z) {
                    this.a.c.c(ipnVar.b, ipnVar);
                }
            }
        }
        this.e.D(apmpVar);
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
