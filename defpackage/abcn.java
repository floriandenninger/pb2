package defpackage;

import com.google.protos.youtube.api.innertube.SetSettingEndpointOuterClass$SetSettingEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abcn implements aaha {
    public final azrw a;
    public final zaw b;
    private final abcp c;
    private final Executor d;

    public abcn(abcp abcpVar, azrw azrwVar, zaw zawVar, Executor executor) {
        this.c = abcpVar;
        this.a = azrwVar;
        this.b = zawVar;
        this.d = executor;
    }

    @Override // defpackage.aaha
    public final void kE(final apxf apxfVar, final Map map) {
        abco b = this.c.b();
        b.l(whl.G(apxfVar));
        b.d((SetSettingEndpointOuterClass$SetSettingEndpoint) apxfVar.pX(SetSettingEndpointOuterClass$SetSettingEndpoint.setSettingEndpoint));
        ynm.l(this.c.e(b), this.d, new ynk() { // from class: abcl
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                zaw zawVar = abcn.this.b;
                if (zawVar != null) {
                    zawVar.e(th);
                }
                zga.n("Error requesting SetSetting", th);
            }
        }, new ynl() { // from class: abcm
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                abcn abcnVar = abcn.this;
                Map map2 = map;
                apxf apxfVar2 = apxfVar;
                asbb asbbVar = (asbb) obj;
                if (abcnVar.a != null) {
                    ((aahd) abcnVar.a.get()).e(((SetSettingEndpointOuterClass$SetSettingEndpoint) apxfVar2.pX(SetSettingEndpointOuterClass$SetSettingEndpoint.setSettingEndpoint)).f, yjj.s(map2, "com.google.android.libraries.youtube.innertube.endpoint.tag"));
                    ((aahd) abcnVar.a.get()).e(asbbVar.c, null);
                }
            }
        }, anij.a);
    }
}
