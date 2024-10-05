package defpackage;

import com.google.protos.youtube.api.innertube.ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint;
import com.google.protos.youtube.api.innertube.SetSettingEndpointOuterClass$SetSettingEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ewr implements aaha {
    public final aahd a;
    public final zaw b;
    private final abcp c;
    private final ScheduledExecutorService d;
    private final Executor e;
    private final Runnable f;
    private final akdj g;
    private final afsy h;
    private final akdz i;
    private final akec j;

    public ewr(abcp abcpVar, ScheduledExecutorService scheduledExecutorService, Executor executor, final akey akeyVar, akdj akdjVar, afsy afsyVar, aahd aahdVar, zaw zawVar, akdz akdzVar, akec akecVar) {
        this.c = abcpVar;
        scheduledExecutorService.getClass();
        this.d = scheduledExecutorService;
        this.e = executor;
        akeyVar.getClass();
        this.f = new Runnable() { // from class: ewq
            @Override // java.lang.Runnable
            public final void run() {
                akey.this.d();
            }
        };
        akdjVar.getClass();
        this.g = akdjVar;
        afsyVar.getClass();
        this.h = afsyVar;
        this.a = aahdVar;
        this.b = zawVar;
        akdzVar.getClass();
        this.i = akdzVar;
        akecVar.getClass();
        this.j = akecVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (this.h.t()) {
            this.d.execute(this.f);
        } else {
            this.g.a.getWritableDatabase().delete("suggestions", "1", null);
        }
        this.i.a();
        this.j.a();
        aone createBuilder = SetSettingEndpointOuterClass$SetSettingEndpoint.a.createBuilder();
        String str = ((ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint) apxfVar.pX(ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint.clearSearchHistorySettingEndpoint)).b;
        createBuilder.copyOnWrite();
        SetSettingEndpointOuterClass$SetSettingEndpoint setSettingEndpointOuterClass$SetSettingEndpoint = (SetSettingEndpointOuterClass$SetSettingEndpoint) createBuilder.instance;
        str.getClass();
        setSettingEndpointOuterClass$SetSettingEndpoint.b |= 1;
        setSettingEndpointOuterClass$SetSettingEndpoint.e = str;
        SetSettingEndpointOuterClass$SetSettingEndpoint setSettingEndpointOuterClass$SetSettingEndpoint2 = (SetSettingEndpointOuterClass$SetSettingEndpoint) createBuilder.build();
        abco b = this.c.b();
        b.l(whl.G(apxfVar));
        b.d(setSettingEndpointOuterClass$SetSettingEndpoint2);
        ynm.l(this.c.e(b), this.e, new ynk() { // from class: ewo
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                zaw zawVar = ewr.this.b;
                if (zawVar != null) {
                    zawVar.e(th);
                }
                zga.n("Error requesting SetSetting", th);
            }
        }, new ynl() { // from class: ewp
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                asbb asbbVar = (asbb) obj;
                aahd aahdVar = ewr.this.a;
                if (aahdVar != null) {
                    aahdVar.d(asbbVar.c, null);
                }
            }
        }, anij.a);
    }
}
