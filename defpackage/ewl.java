package defpackage;

import android.content.Intent;
import com.google.protos.youtube.api.innertube.AppStoreEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ewl implements ykj, fxi {
    private final apxf a;
    private final aahd b;
    private final fxj c;
    private final gfz d;
    private boolean e;

    public ewl(apxf apxfVar, aahd aahdVar, fxj fxjVar, gfz gfzVar) {
        this.a = apxfVar;
        this.b = aahdVar;
        this.c = fxjVar;
        this.d = gfzVar;
    }

    private final void c() {
        this.b.e(((apfr) this.a.pX(AppStoreEndpointOuterClass.appStoreEndpoint)).g, null);
    }

    @Override // defpackage.fxi
    public final void a() {
    }

    @Override // defpackage.fxi
    public final void b() {
        if (this.e) {
            c();
            this.c.i(this);
        }
    }

    @Override // defpackage.ykj
    public final void kD(int i, int i2, Intent intent) {
        if (i != 907) {
            return;
        }
        this.d.m(5);
        if (i2 != 0) {
            return;
        }
        fxj fxjVar = this.c;
        if (fxjVar.b) {
            c();
        } else {
            fxjVar.g(this);
            this.e = true;
        }
    }
}
