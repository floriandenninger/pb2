package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.JSController;
import com.google.android.libraries.elements.interfaces.JSEnvironment;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class stv implements swv {
    public final azrw a;
    public final axpg b;
    private final JSEnvironment c;

    public stv(JSEnvironment jSEnvironment, azrw azrwVar, axpg axpgVar) {
        this.c = jSEnvironment;
        this.a = azrwVar;
        this.b = axpgVar;
    }

    @Override // defpackage.swv
    public final aomu a() {
        return awox.b;
    }

    @Override // defpackage.swv
    public final /* bridge */ /* synthetic */ ayph b(Object obj, final swu swuVar) {
        final awox awoxVar = (awox) obj;
        final JSController controller = this.c.getController();
        final awpu awpuVar = swuVar.e;
        return ayph.j(new aypj() { // from class: sts
            @Override // defpackage.aypj
            public final void a(ayue ayueVar) {
                byte[] bArr;
                stv stvVar = stv.this;
                JSController jSController = controller;
                swu swuVar2 = swuVar;
                awox awoxVar2 = awoxVar;
                awpu awpuVar2 = awpuVar;
                if (jSController == null) {
                    throw new syf("JavaScript controller is not provided");
                }
                ammv ammvVar = (ammv) stvVar.a.get();
                if (!ammvVar.h()) {
                    throw new syf("ByteStore is not provided");
                }
                final stu stuVar = new stu(ayueVar);
                stn stnVar = new stn((sww) stvVar.b.get(), swuVar2);
                byte[] byteArray = awoxVar2.toByteArray();
                if (awpuVar2 != null) {
                    bArr = awpuVar2.toByteArray();
                } else {
                    bArr = syc.a;
                }
                jSController.executeFunction(byteArray, bArr, (ByteStore) ammvVar.c(), stnVar, stuVar);
                ayueVar.d(new ayrr() { // from class: stt
                    @Override // defpackage.ayrr
                    public final void a() {
                        stu.this.a = null;
                    }
                });
            }
        });
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }
}
