package defpackage;

import com.google.protos.youtube.api.innertube.OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint;
import com.google.protos.youtube.api.innertube.OfflineabilityRendererOuterClass;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eyc implements aaha {
    private final agyr a;

    public eyc(agyr agyrVar) {
        agyrVar.getClass();
        this.a = agyrVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        atsb atsbVar;
        OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint = (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint) apxfVar.pX(OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint);
        int bR = anaf.bR(offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.d);
        if (bR == 0) {
            bR = 1;
        }
        int i = bR - 1;
        if (i != 1) {
            if (i == 2) {
                this.a.a(offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.c, agyg.a(false));
                return;
            }
            if (i != 8) {
                int bR2 = anaf.bR(offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.d);
                int i2 = bR2 != 0 ? bR2 : 1;
                StringBuilder sb = new StringBuilder(45);
                sb.append("Unsupported Offline Video Action: ");
                sb.append(i2 - 1);
                zga.l(sb.toString());
                return;
            }
            this.a.a(offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.c, agyg.a(true));
            return;
        }
        Object s = yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        atom atomVar = null;
        if (s instanceof aqcj) {
            aqcj aqcjVar = (aqcj) s;
            aqci aqciVar = aqcjVar.o;
            if (aqciVar == null) {
                aqciVar = aqci.a;
            }
            if ((1 & aqciVar.b) != 0) {
                aqci aqciVar2 = aqcjVar.o;
                if (aqciVar2 == null) {
                    aqciVar2 = aqci.a;
                }
                atsbVar = aqciVar2.c;
                if (atsbVar == null) {
                    atsbVar = atsb.a;
                }
            }
            atsbVar = null;
        } else if (s instanceof aubs) {
            aubs aubsVar = (aubs) s;
            aubq aubqVar = aubsVar.y;
            if (aubqVar == null) {
                aubqVar = aubq.a;
            }
            if (aubqVar.b == 60572968) {
                aubq aubqVar2 = aubsVar.y;
                if (aubqVar2 == null) {
                    aubqVar2 = aubq.a;
                }
                if (aubqVar2.b == 60572968) {
                    atsbVar = (atsb) aubqVar2.c;
                } else {
                    atsbVar = atsb.a;
                }
            }
            atsbVar = null;
        } else {
            if (s instanceof aubg) {
                aubg aubgVar = (aubg) s;
                aubf aubfVar = aubgVar.D;
                if (aubfVar == null) {
                    aubfVar = aubf.a;
                }
                if (aubfVar.b == 60572968) {
                    aubf aubfVar2 = aubgVar.D;
                    if (aubfVar2 == null) {
                        aubfVar2 = aubf.a;
                    }
                    if (aubfVar2.b == 60572968) {
                        atsbVar = (atsb) aubfVar2.c;
                    } else {
                        atsbVar = atsb.a;
                    }
                }
            }
            atsbVar = null;
        }
        if (atsbVar == null) {
            if ((offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.b & 8) != 0) {
                aulq aulqVar = offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.e;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                atsbVar = (atsb) aulqVar.pX(OfflineabilityRendererOuterClass.offlineabilityRenderer);
            } else {
                atsbVar = null;
            }
        }
        if (atsbVar == null) {
            String valueOf = String.valueOf(s);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 39);
            sb2.append("Object is not an offlineable playlist: ");
            sb2.append(valueOf);
            zga.b(sb2.toString());
            return;
        }
        acra acraVar = (acra) yjj.u(map, "com.google.android.libraries.youtube.logging.interaction_logger", acra.class);
        agyr agyrVar = this.a;
        String str = offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.c;
        if ((offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.b & 16) != 0 && (atomVar = offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.f) == null) {
            atomVar = atom.a;
        }
        agyrVar.j(str, atsbVar, acraVar, atomVar);
    }
}
