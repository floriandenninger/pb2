package defpackage;

import android.app.Application;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ruh extends anu {
    private static final amyi c = rwh.k();
    public final ruf b;

    public ruh(Application application, rsy rsyVar) {
        super(application);
        ruf rufVar = null;
        if (!rsyVar.d) {
            try {
                rufVar = rqr.f(application, rsyVar.g, rsyVar.h);
            } catch (IllegalStateException unused) {
            }
        } else {
            ((amyf) ((amyf) c.g()).i("com/google/android/libraries/accountlinking/supplier/ManagedDependencySupplierViewModel", "createManagedDependencySupplier", 63, "ManagedDependencySupplierViewModel.java")).q("Custom DependencySupplier is missing");
        }
        this.b = rufVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.apm
    public final void d() {
        ruf rufVar = this.b;
        if (rufVar != null) {
            rufVar.a();
        }
    }
}
