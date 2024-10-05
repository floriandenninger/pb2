package defpackage;

import com.google.protos.youtube.api.innertube.AutoconnectEndpointOuterClass$AutoconnectEndpoint;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adae {
    public static final /* synthetic */ int g = 0;
    public final aczr a;
    public final acys b;
    public final Executor c;
    public final aczv d;
    public final adaf e;
    public acyp f;

    static {
        zga.a("Handoff.ResponseController");
    }

    public adae(aczr aczrVar, acys acysVar, Executor executor, aczv aczvVar, adaf adafVar) {
        this.a = aczrVar;
        this.b = acysVar;
        this.c = executor;
        this.d = aczvVar;
        this.e = adafVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(final arsw arswVar, final adah adahVar) {
        apxf apxfVar = arswVar.c;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        if (apxfVar.pY(AutoconnectEndpointOuterClass$AutoconnectEndpoint.autoconnectEndpoint)) {
            apxf apxfVar2 = arswVar.c;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            AutoconnectEndpointOuterClass$AutoconnectEndpoint autoconnectEndpointOuterClass$AutoconnectEndpoint = (AutoconnectEndpointOuterClass$AutoconnectEndpoint) apxfVar2.pX(AutoconnectEndpointOuterClass$AutoconnectEndpoint.autoconnectEndpoint);
            if ((autoconnectEndpointOuterClass$AutoconnectEndpoint.b & 1) != 0) {
                final String str = autoconnectEndpointOuterClass$AutoconnectEndpoint.c;
                ynm.i(this.d.a(), new ynl() { // from class: adaa
                    @Override // defpackage.ynl, defpackage.zfi
                    public final void a(Object obj) {
                        adae adaeVar = adae.this;
                        arsw arswVar2 = arswVar;
                        String str2 = str;
                        adah adahVar2 = adahVar;
                        String str3 = (String) obj;
                        ardp ardpVar = arswVar2.d;
                        if (ardpVar == null) {
                            ardpVar = ardp.a;
                        }
                        ardo ardoVar = ardpVar.b;
                        if (ardoVar == null) {
                            ardoVar = ardo.a;
                        }
                        if (!ardoVar.b.equals(str3)) {
                            adaeVar.d.c();
                        }
                        ardp ardpVar2 = arswVar2.d;
                        if (ardpVar2 == null) {
                            ardpVar2 = ardp.a;
                        }
                        ardo ardoVar2 = ardpVar2.b;
                        if (ardoVar2 == null) {
                            ardoVar2 = ardo.a;
                        }
                        ardo ardoVar3 = ardoVar2;
                        apxf apxfVar3 = arswVar2.c;
                        if (apxfVar3 == null) {
                            apxfVar3 = apxf.a;
                        }
                        adaeVar.f = new adad(adaeVar, str2, ardoVar3, apxfVar3, adahVar2);
                        adaeVar.b.b(adaeVar.f);
                    }
                });
            }
        }
    }
}
