package defpackage;

import android.content.Context;
import java.util.concurrent.Executors;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rue implements ruf {
    private static final amyi c = rwh.k();
    public final aybv a;
    public final anib b;
    private final CronetEngine d;

    public rue(Context context, String str, int i) {
        CronetEngine build;
        context.getClass();
        str.getClass();
        amkq.E(i > 0);
        try {
            build = new CronetEngine.Builder(context).build();
        } catch (Throwable th) {
            ((amyf) c.k().i("com/google/android/libraries/accountlinking/supplier/DefaultManagedDependencySupplier", "createCronetEngine", 64, "DefaultManagedDependencySupplier.java")).q("Default CronetEngine creation failed. Trying fallback.");
            for (CronetProvider cronetProvider : CronetProvider.getAllProviders(context)) {
                if (cronetProvider.getName().equals(CronetProvider.PROVIDER_NAME_FALLBACK) && cronetProvider.isEnabled()) {
                    ((amyf) c.k().i("com/google/android/libraries/accountlinking/supplier/DefaultManagedDependencySupplier", "createCronetEngine", 68, "DefaultManagedDependencySupplier.java")).q("Using fallback CronetEngine");
                    build = cronetProvider.createBuilder().build();
                }
            }
            ((amyf) ((amyf) c.g()).i("com/google/android/libraries/accountlinking/supplier/DefaultManagedDependencySupplier", "createCronetEngine", 72, "DefaultManagedDependencySupplier.java")).q("Unable to create CronetEngine. No implementation is available.");
            throw new IllegalStateException("There is no implementation of CronetEngine on this device", th);
        }
        this.d = build;
        this.a = ayfe.a(str, i, build).c();
        this.b = anaf.C(Executors.newFixedThreadPool(4));
    }

    @Override // defpackage.ruf
    public final void a() {
        this.d.shutdown();
        aybv aybvVar = this.a;
        aylc aylcVar = ((ayld) aybvVar).c;
        int i = aylc.a;
        aylcVar.a();
        ((aykx) ((ayio) aybvVar).a).n();
        this.b.shutdown();
    }
}
