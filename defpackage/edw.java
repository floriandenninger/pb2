package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class edw implements edu {
    public static final amxj a = amxj.l("com/google/android/apps/search/assistant/platform/appintegration/client/GrpcConnector");
    private static final aydn c = aydn.b(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.search.assistant.platform.appintegration.endpoint.AppIntegrationService"));
    public final sgd b;
    private final String d;
    private final sge e;
    private aypb f;
    private final aypb g;

    public edw(Context context, sgd sgdVar) {
        aoau a2 = aoau.a((Application) context.getApplicationContext(), c);
        a2.d = new aoaq(qnn.b(context));
        aybv c2 = a2.c.c();
        String packageName = context.getPackageName();
        this.g = new edv(this);
        this.e = (sge) sge.b(new amko(1), c2);
        this.d = packageName;
        this.b = sgdVar;
    }

    @Override // defpackage.edu
    public final int a() {
        return d() ? 3 : 0;
    }

    @Override // defpackage.edu
    public final void b(sgu sguVar) {
        aone createBuilder = sgg.a.createBuilder();
        createBuilder.copyOnWrite();
        sgg sggVar = (sgg) createBuilder.instance;
        sguVar.getClass();
        sggVar.d = sguVar;
        sggVar.b |= 2;
        if ((sguVar.b & 16) != 0) {
            sgn sgnVar = sguVar.f;
            if (sgnVar == null) {
                sgnVar = sgn.c();
            }
            if (sgnVar.a().equals(sgm.NAVIGATION_STATE_CHANGED)) {
                createBuilder.copyOnWrite();
                sgg.a((sgg) createBuilder.instance);
            }
        }
        this.f.c((sgg) createBuilder.build());
    }

    @Override // defpackage.edu
    public final boolean c(sgu sguVar) {
        ((amxh) ((amxh) a.b()).i("com/google/android/apps/search/assistant/platform/appintegration/client/GrpcConnector", "connect", 87, "GrpcConnector.java")).q("#connect");
        if (tcq.a.compareAndSet(false, true)) {
            ayom.c(aomw.b());
        }
        sge sgeVar = this.e;
        aypb aypbVar = this.g;
        axzp axzpVar = sgeVar.a;
        aych aychVar = sgf.a;
        if (aychVar == null) {
            synchronized (sgf.class) {
                aychVar = sgf.a;
                if (aychVar == null) {
                    ayce a2 = aych.a();
                    a2.c = aycg.BIDI_STREAMING;
                    a2.d = aych.c("java.com.google.android.libraries.assistant.appintegration.shared.grpc.AppIntegrationService", "StartSession");
                    a2.b();
                    a2.a = ayom.b(sgg.a);
                    a2.b = ayom.b(sgh.a);
                    aychVar = a2.a();
                    sgf.a = aychVar;
                }
            }
        }
        aypb b = ayox.b(axzpVar.a(aychVar, sgeVar.b), aypbVar);
        this.f = b;
        aone createBuilder = sgg.a.createBuilder();
        createBuilder.copyOnWrite();
        sgg sggVar = (sgg) createBuilder.instance;
        sguVar.getClass();
        sggVar.d = sguVar;
        sggVar.b |= 2;
        String str = this.d;
        createBuilder.copyOnWrite();
        sgg sggVar2 = (sgg) createBuilder.instance;
        str.getClass();
        sggVar2.b |= 1;
        sggVar2.c = str;
        createBuilder.copyOnWrite();
        sgg.a((sgg) createBuilder.instance);
        b.c((sgg) createBuilder.build());
        this.b.e.a();
        return true;
    }

    @Override // defpackage.edu
    public final boolean d() {
        return this.f != null;
    }
}
