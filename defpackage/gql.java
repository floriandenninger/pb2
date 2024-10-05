package defpackage;

import com.google.protos.youtube.api.innertube.CreatePostCommandOuterClass;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gql implements aaha {
    public final aahd a;
    public final zaw b;
    private final aavy c;
    private final afsy d;
    private final ajoy e;

    public gql(aavy aavyVar, ajoy ajoyVar, afsy afsyVar, aahd aahdVar, zaw zawVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = aavyVar;
        this.e = ajoyVar;
        this.d = afsyVar;
        this.a = aahdVar;
        this.b = zawVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (apxfVar.pY(CreatePostCommandOuterClass.createPostCommand)) {
            aqgw aqgwVar = (aqgw) apxfVar.pX(CreatePostCommandOuterClass.createPostCommand);
            if ((aqgwVar.b & 1) != 0) {
                arma armaVar = aqgwVar.c;
                if (armaVar == null) {
                    armaVar = arma.a;
                }
                aawa aawaVar = new aawa(this.e, this.d.c(), null, null, null);
                int i = armaVar.b;
                if ((i & 32) != 0) {
                    aawaVar.s = armaVar.h;
                }
                if ((i & 4) != 0) {
                    aawaVar.d(armaVar.g);
                }
                if ((armaVar.b & 2) != 0) {
                    aawaVar.e(armaVar.f);
                }
                int i2 = armaVar.c;
                if (i2 == 9) {
                    arlm arlmVar = (arlm) armaVar.d;
                    if ((arlmVar.b & 1) != 0) {
                        aawaVar.b = arlmVar.c;
                    }
                    if ((arlmVar.b & 4) != 0) {
                        argf argfVar = (armaVar.c == 9 ? (arlm) armaVar.d : arlm.a).e;
                        if (argfVar == null) {
                            argfVar = argf.a;
                        }
                        aawaVar.u = argfVar;
                    }
                    if (((armaVar.c == 9 ? (arlm) armaVar.d : arlm.a).b & 2) != 0) {
                        aawaVar.t = (armaVar.c == 9 ? (arlm) armaVar.d : arlm.a).d;
                    }
                } else if (i2 == 10) {
                    arln arlnVar = (arln) armaVar.d;
                    if ((arlnVar.b & 1) != 0) {
                        aawaVar.d = arlnVar.c;
                    }
                } else if (i2 == 8) {
                    aawaVar.a = ((arlp) armaVar.d).b;
                } else if (i2 == 7) {
                    arlr arlrVar = (arlr) armaVar.d;
                    if ((arlrVar.b & 1) != 0) {
                        aawaVar.c = arlrVar.c;
                    }
                } else if (i2 == 14) {
                    aawaVar.v = (arll) armaVar.d;
                } else if (i2 == 15) {
                    aawaVar.w = ((arlq) armaVar.d).c;
                }
                gqk gqkVar = new gqk(this, (aawb) yjj.u(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", aawb.class));
                aavy aavyVar = this.c;
                aavyVar.e.a(aavyVar.b.a(aawaVar, armb.a, new aavv(gqkVar), aavh.h, aavd.n));
            }
        }
    }
}
