package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.AgeVerificationEndpointOuterClass$AgeVerificationEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eif implements aaha, ykj {
    public final ykz a;
    private final aahd b;
    private final ci c;
    private final Executor d;
    private final afsy e;
    private final ety f;
    private final ainl g;
    private final adlt h;
    private apxf i;
    private final wcf j;

    public eif(aahd aahdVar, ci ciVar, wcf wcfVar, Executor executor, ykz ykzVar, afsy afsyVar, ety etyVar, ainl ainlVar, adlt adltVar) {
        this.b = aahdVar;
        this.c = ciVar;
        this.j = wcfVar;
        this.d = executor;
        this.a = ykzVar;
        this.e = afsyVar;
        this.f = etyVar;
        this.g = ainlVar;
        this.h = adltVar;
    }

    @Override // defpackage.ykj
    public final void kD(int i, int i2, Intent intent) {
        if (i == 2300) {
            if (this.h.g() == null || this.h.g().a() != 1) {
                this.f.f();
                apxf apxfVar = this.i;
                if (apxfVar != null) {
                    this.b.a(apxfVar);
                }
                this.i = null;
                return;
            }
            if (this.i != null) {
                ainl ainlVar = this.g;
                aifz d = PlaybackStartDescriptor.d();
                d.a = this.i;
                ainlVar.d(d.a());
            }
            this.i = null;
        }
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (this.e.t() && apxfVar != null && apxfVar.pY(AgeVerificationEndpointOuterClass$AgeVerificationEndpoint.ageVerificationEndpoint)) {
            AgeVerificationEndpointOuterClass$AgeVerificationEndpoint ageVerificationEndpointOuterClass$AgeVerificationEndpoint = (AgeVerificationEndpointOuterClass$AgeVerificationEndpoint) apxfVar.pX(AgeVerificationEndpointOuterClass$AgeVerificationEndpoint.ageVerificationEndpoint);
            apxf apxfVar2 = ageVerificationEndpointOuterClass$AgeVerificationEndpoint.c;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            this.i = apxfVar2;
            try {
                this.d.execute(new afsu(this.c, this.j.a(this.e.c()), ageVerificationEndpointOuterClass$AgeVerificationEndpoint.b, new zfi() { // from class: eie
                    @Override // defpackage.zfi
                    public final void a(Object obj) {
                        eif eifVar = eif.this;
                        acv a = new acu().a();
                        a.a.setData(Uri.parse((String) obj));
                        eifVar.a.a(a.a, 2300, eifVar);
                    }
                }));
            } catch (Exception unused) {
                this.f.f();
            }
        }
    }
}
