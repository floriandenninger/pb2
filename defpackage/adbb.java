package defpackage;

import com.google.protos.youtube.api.innertube.MdxPairingEndpointOuterClass;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adbb implements aaha {
    private static final String b = zga.a("MDX.MdxPairingCommand");
    public final addy a;
    private final ci c;
    private final adlj d;

    public adbb(ci ciVar, adlj adljVar, addy addyVar) {
        this.c = ciVar;
        this.d = adljVar;
        this.a = addyVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (!apxfVar.pY(MdxPairingEndpointOuterClass.mdxPairingEndpoint)) {
            zga.m(b, "Mdx pairing endpoint not filled");
            return;
        }
        atcc atccVar = (atcc) apxfVar.pX(MdxPairingEndpointOuterClass.mdxPairingEndpoint);
        if ((atccVar.b & 1) == 0) {
            zga.m(b, "Mdx pairing endpoint missing pairing code");
        } else {
            this.d.h(new adgn(atccVar.c), yki.c(this.c, new adba(this)));
        }
    }
}
