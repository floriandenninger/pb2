package defpackage;

import java.util.Map;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpt implements cqw {
    public final cpl a;
    public cqv b;
    private final cps c;
    private final cvo d;

    public cpt(cps cpsVar, cpl cplVar, cvo cvoVar) {
        this.c = cpsVar;
        this.a = cplVar;
        this.d = cvoVar;
    }

    @Override // defpackage.cqw
    public final Class a() {
        return this.a.a();
    }

    @Override // defpackage.cqw
    public final void b() {
        cpp cppVar;
        UrlRequest urlRequest;
        cps cpsVar = this.c;
        cvo cvoVar = this.d;
        synchronized (cpsVar) {
            cppVar = (cpp) cpsVar.d.get(cvoVar);
        }
        if (cppVar != null) {
            synchronized (cppVar.g) {
                cppVar.a.remove(this);
                if (cppVar.a.isEmpty()) {
                    cppVar.e = true;
                    cppVar.g.d.remove(cppVar.b);
                }
            }
            if (!cppVar.e || (urlRequest = cppVar.d) == null) {
                return;
            }
            urlRequest.cancel();
        }
    }

    @Override // defpackage.cqw
    public final void c() {
    }

    @Override // defpackage.cqw
    public final void d(cof cofVar, cqv cqvVar) {
        cpp cppVar;
        boolean z;
        this.b = cqvVar;
        cps cpsVar = this.c;
        cvo cvoVar = this.d;
        synchronized (cpsVar) {
            cppVar = (cpp) cpsVar.d.get(cvoVar);
            if (cppVar == null) {
                cppVar = cpsVar.c.a(cvoVar);
                cpsVar.d.put(cvoVar, cppVar);
                z = true;
            } else {
                z = false;
            }
            synchronized (cppVar.g) {
                cppVar.a.add(this);
            }
        }
        if (z) {
            cppVar.c = cofVar;
            ajkn ajknVar = cpsVar.e;
            String c = cvoVar.c();
            int intValue = ((Integer) cps.a.get(cofVar)).intValue();
            Map d = cvoVar.d();
            UrlRequest.Builder priority = ((CronetEngine) ajknVar.a.get()).newUrlRequestBuilder(c, cppVar, angq.a).allowDirectExecutor().setPriority(intValue);
            for (Map.Entry entry : d.entrySet()) {
                String str = (String) entry.getKey();
                if (!"Accept-Encoding".equalsIgnoreCase(str) && !"User-Agent".equalsIgnoreCase(str)) {
                    priority.addHeader((String) entry.getKey(), (String) entry.getValue());
                }
            }
            cppVar.d = priority.build();
            cppVar.d.start();
            if (cppVar.e) {
                cppVar.d.cancel();
            }
        }
    }

    @Override // defpackage.cqw
    public final int e() {
        return 2;
    }
}
