package defpackage;

import com.google.android.libraries.elements.interfaces.JSController;
import com.google.android.libraries.elements.interfaces.JSEnvironment;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class str implements swv {
    private final JSEnvironment a;

    public str(JSEnvironment jSEnvironment) {
        this.a = jSEnvironment;
    }

    @Override // defpackage.swv
    public final aomu a() {
        return awov.b;
    }

    @Override // defpackage.swv
    public final /* bridge */ /* synthetic */ ayph b(Object obj, swu swuVar) {
        final awov awovVar = (awov) obj;
        final JSController controller = this.a.getController();
        final awpu awpuVar = swuVar.e;
        return ayph.j(new aypj() { // from class: stq
            @Override // defpackage.aypj
            public final void a(ayue ayueVar) {
                byte[] bArr;
                JSController jSController = JSController.this;
                awov awovVar2 = awovVar;
                awpu awpuVar2 = awpuVar;
                if (jSController == null) {
                    throw new syf("JavaScript controller is not provided");
                }
                byte[] byteArray = awovVar2.toByteArray();
                if (awpuVar2 != null) {
                    bArr = awpuVar2.toByteArray();
                } else {
                    bArr = syc.a;
                }
                Status executeControllerMethod = jSController.executeControllerMethod(byteArray, bArr);
                if (executeControllerMethod.f()) {
                    ayueVar.a();
                } else {
                    ayueVar.c(new syf(ammx.d(executeControllerMethod.getDescription())));
                }
            }
        });
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }
}
