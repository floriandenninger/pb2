package defpackage;

import android.os.Bundle;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ofa {
    public boolean a;
    public CharSequence b;
    public CharSequence c;
    public avgg d;
    public acsm e;
    public aigr f;
    public Bundle g;
    public final fnt h;
    private final aarr i;
    private final List j = new ArrayList();
    private oey k;
    private WatchNextResponseModel l;

    public ofa(aarr aarrVar, fnt fntVar) {
        this.h = fntVar;
        this.i = aarrVar;
    }

    public static boolean k(aigr aigrVar) {
        return aigrVar.i == 12;
    }

    private final int l() {
        return !this.j.isEmpty() ? 1 : 0;
    }

    private final void m() {
        int l = l();
        oey oeyVar = this.k;
        if (oeyVar != null) {
            oeyVar.a(l);
        }
    }

    public final int a(WatchNextResponseModel watchNextResponseModel, acsm acsmVar) {
        oey oeyVar = this.k;
        if ((oeyVar != null ? (WatchNextResponseModel) oeyVar.get() : null) == watchNextResponseModel) {
            return 0;
        }
        this.k = watchNextResponseModel != null ? new oey(watchNextResponseModel, l()) : null;
        this.e = acsmVar;
        return 16;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel b() {
        /*
            r4 = this;
            com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel r0 = r4.l
            if (r0 != 0) goto L5d
            fnt r0 = r4.h
            apxf r0 = r0.b()
            r1 = 0
            if (r0 == 0) goto L3d
            aonk r2 = com.google.protos.youtube.api.innertube.WatchEndpointOuterClass.watchEndpoint
            boolean r2 = r0.pY(r2)
            if (r2 != 0) goto L16
            goto L3d
        L16:
            aonk r2 = com.google.protos.youtube.api.innertube.WatchEndpointOuterClass.watchEndpoint
            java.lang.Object r0 = r0.pX(r2)
            awdp r0 = (defpackage.awdp) r0
            awds r2 = r0.p
            if (r2 != 0) goto L24
            awds r2 = defpackage.awds.a
        L24:
            int r2 = r2.b
            r3 = 128400768(0x7a73d80, float:2.5163514E-34)
            if (r2 != r3) goto L3d
            awds r0 = r0.p
            if (r0 != 0) goto L31
            awds r0 = defpackage.awds.a
        L31:
            int r2 = r0.b
            if (r2 != r3) goto L3a
            java.lang.Object r0 = r0.c
            awdr r0 = (defpackage.awdr) r0
            goto L3e
        L3a:
            awdr r0 = defpackage.awdr.a
            goto L3e
        L3d:
            r0 = r1
        L3e:
            if (r0 == 0) goto L47
            aomf r0 = r0.b
            byte[] r0 = r0.I()
            goto L48
        L47:
            r0 = r1
        L48:
            if (r0 != 0) goto L4b
            return r1
        L4b:
            com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel r1 = new com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel
            aarr r2 = r4.i
            asfc r3 = defpackage.asfc.a
            aooy r0 = r2.a(r0, r3)
            asfc r0 = (defpackage.asfc) r0
            r1.<init>(r0)
            r4.l = r1
            return r1
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ofa.b():com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel");
    }

    public final WatchNextResponseModel c() {
        oey oeyVar = this.k;
        if (oeyVar != null) {
            return (WatchNextResponseModel) oeyVar.get();
        }
        return null;
    }

    public final CharSequence d() {
        if (this.b == null) {
            f();
        }
        return this.b;
    }

    public final void e(int i) {
        if (i == 0) {
            return;
        }
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((oez) it.next()).g(this, i);
        }
    }

    public final void f() {
        auov auovVar;
        aqyg aqygVar;
        if (b() == null || b().f == null) {
            return;
        }
        aset asetVar = b().f.c;
        if (asetVar == null) {
            asetVar = aset.a;
        }
        if (asetVar.b == 49399797) {
            aset asetVar2 = b().f.c;
            if (asetVar2 == null) {
                asetVar2 = aset.a;
            }
            if (asetVar2.b == 49399797) {
                auovVar = (auov) asetVar2.c;
            } else {
                auovVar = auov.a;
            }
            if (auovVar.d.size() != 0) {
                askd askdVar = ((auoy) auovVar.d.get(0)).j;
                if (askdVar == null) {
                    askdVar = askd.a;
                }
                if (askdVar.e.size() != 0) {
                    askg askgVar = (askg) askdVar.e.get(0);
                    if ((askgVar.b & 8388608) != 0) {
                        auvw auvwVar = askgVar.I;
                        if (auvwVar == null) {
                            auvwVar = auvw.a;
                        }
                        aqyg aqygVar2 = null;
                        if ((auvwVar.b & 2) != 0) {
                            aqygVar = auvwVar.c;
                            if (aqygVar == null) {
                                aqygVar = aqyg.a;
                            }
                        } else {
                            aqygVar = null;
                        }
                        this.b = ajcq.b(aqygVar);
                        auvv auvvVar = auvwVar.d;
                        if (auvvVar == null) {
                            auvvVar = auvv.a;
                        }
                        if ((auvvVar.b & 1) != 0) {
                            auvv auvvVar2 = auvwVar.d;
                            if (auvvVar2 == null) {
                                auvvVar2 = auvv.a;
                            }
                            auvs auvsVar = auvvVar2.c;
                            if (auvsVar == null) {
                                auvsVar = auvs.a;
                            }
                            if ((auvsVar.b & 2) != 0 && (aqygVar2 = auvsVar.d) == null) {
                                aqygVar2 = aqyg.a;
                            }
                            this.c = ajcq.b(aqygVar2);
                        }
                    }
                }
            }
        }
    }

    public final void g(oez oezVar) {
        if (this.j.contains(oezVar)) {
            return;
        }
        this.j.add(oezVar);
        m();
    }

    public final void h(boolean z) {
        if (this.a == z) {
            return;
        }
        this.a = z;
        e(1);
    }

    public final void i(Bundle bundle) {
        if (this.g == bundle) {
            return;
        }
        this.g = bundle;
        e(64);
    }

    public final void j(oez oezVar) {
        this.j.remove(oezVar);
        if (this.j.isEmpty()) {
            m();
        }
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.b("id", this.h);
        Y.g("isCurrentPlayback", this.a);
        Y.b("title", this.b);
        Y.e("idHashCode", this.h.hashCode());
        return Y.toString();
    }
}
