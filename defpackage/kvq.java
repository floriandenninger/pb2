package defpackage;

import android.os.Bundle;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kvq implements aaha {
    public final zaw a;
    private final ci b;
    private final afsy c;
    private final aftn d;
    private final axzg e;

    public kvq(ci ciVar, afsy afsyVar, aftn aftnVar, zaw zawVar, axzg axzgVar, byte[] bArr, byte[] bArr2) {
        this.b = ciVar;
        this.c = afsyVar;
        this.d = aftnVar;
        this.a = zawVar;
        this.e = axzgVar;
    }

    public final void b(apxf apxfVar) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("navigation_endpoint", apxfVar.toByteArray());
        kwx kwxVar = new kwx();
        kwxVar.af(bundle);
        dn k = this.b.getSupportFragmentManager().k();
        k.r(kwxVar, "SuggestedPlaylistVideosFragment");
        if (((Boolean) this.e.v().x(false).aJ().e(0).aB()).booleanValue()) {
            k.d();
        } else {
            k.a();
        }
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (this.c.t()) {
            b(apxfVar);
        } else {
            this.d.c(this.b, null, new kvp(this, apxfVar));
        }
    }
}
