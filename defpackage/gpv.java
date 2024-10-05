package defpackage;

import android.os.Bundle;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gpv implements aaha {
    public final zaw a;
    private final ci b;
    private final afsy c;
    private final aftn d;
    private final axzg e;
    private final c f;

    public gpv(ci ciVar, afsy afsyVar, aftn aftnVar, zaw zawVar, c cVar, axzg axzgVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.b = ciVar;
        this.c = afsyVar;
        this.d = aftnVar;
        this.a = zawVar;
        this.f = cVar;
        this.e = axzgVar;
    }

    public final void b(apxf apxfVar) {
        this.f.e();
        iwn iwnVar = new iwn();
        Bundle bundle = iwnVar.m;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putByteArray("navigation_endpoint", apxfVar.toByteArray());
        iwnVar.af(bundle);
        dn k = this.b.getSupportFragmentManager().k();
        k.r(iwnVar, "DialogFragmentFromNavigation");
        if (((Boolean) this.e.v().x(false).aJ().e(0).aB()).booleanValue()) {
            k.e();
        } else {
            k.k();
        }
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (this.c.t()) {
            b(apxfVar);
        } else {
            this.d.c(this.b, null, new gpu(this, apxfVar));
        }
    }
}
