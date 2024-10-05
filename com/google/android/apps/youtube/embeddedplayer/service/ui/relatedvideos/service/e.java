package com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service;

import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f;
import com.google.android.apps.youtube.embeddedplayer.service.model.BitmapKey;
import com.google.android.apps.youtube.embeddedplayer.service.model.MutedAutoplayState;
import com.google.android.apps.youtube.embeddedplayer.service.model.RelatedVideoItem;
import com.google.android.apps.youtube.embeddedplayer.service.model.RelatedVideosScreen;
import com.google.android.apps.youtube.embeddedplayer.service.model.SelectableItemKey;
import com.google.android.apps.youtube.embeddedplayer.service.model.h;
import defpackage.aahd;
import defpackage.ahbw;
import defpackage.ahej;
import defpackage.aign;
import defpackage.ajcq;
import defpackage.aqsz;
import defpackage.aqyg;
import defpackage.atzx;
import defpackage.atzz;
import defpackage.avgg;
import defpackage.ayqw;
import defpackage.azrh;
import defpackage.rql;
import defpackage.ypd;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class e implements ypd {
    public aign a;
    public ahej b;
    public atzx c;
    public final com.google.android.apps.youtube.embeddedplayer.service.imageclient.service.b f;
    public final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.d g;
    public final d i;
    public final f j;
    public final rql k;
    private MutedAutoplayState l;
    private final com.google.android.apps.youtube.embeddedplayer.service.databus.service.a m;
    public final azrh d = azrh.aN(false);
    public final ayqw e = new ayqw();
    public final c h = new c();

    public e(f fVar, aahd aahdVar, rql rqlVar, com.google.android.apps.youtube.embeddedplayer.service.imageclient.service.b bVar, com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.d dVar, com.google.android.apps.youtube.embeddedplayer.service.databus.service.a aVar, byte[] bArr) {
        this.j = fVar;
        this.k = rqlVar;
        this.f = bVar;
        this.g = dVar;
        this.m = aVar;
        this.i = new d(fVar, aahdVar);
    }

    private final boolean g() {
        atzx atzxVar = this.c;
        return atzxVar != null && atzxVar.d.size() > 0;
    }

    private final boolean h() {
        aign aignVar = this.a;
        return aignVar != null && aignVar.a(aign.ENDED);
    }

    private final boolean i() {
        MutedAutoplayState mutedAutoplayState = this.l;
        return (mutedAutoplayState == null || mutedAutoplayState.g == 4) ? false : true;
    }

    public final void a() {
        this.m.a(RelatedVideosScreen.a);
    }

    public final void b(MutedAutoplayState mutedAutoplayState) {
        this.l = mutedAutoplayState;
        e();
        d();
    }

    public final void c() {
        CharSequence charSequence;
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        com.google.android.apps.youtube.embeddedplayer.service.databus.service.a aVar = this.m;
        atzx atzxVar = this.c;
        if (atzxVar == null || (atzxVar.c & 1) == 0) {
            charSequence = "";
        } else {
            aqyg aqygVar4 = atzxVar.f;
            if (aqygVar4 == null) {
                aqygVar4 = aqyg.a;
            }
            charSequence = ajcq.b(aqygVar4);
        }
        this.h.a();
        ArrayList arrayList = new ArrayList();
        atzx atzxVar2 = this.c;
        if (atzxVar2 != null) {
            for (atzz atzzVar : atzxVar2.d) {
                if ((atzzVar.b & 1) != 0) {
                    aqsz aqszVar = atzzVar.c;
                    if (aqszVar == null) {
                        aqszVar = aqsz.a;
                    }
                    RelatedVideoItem relatedVideoItem = null;
                    if (aqszVar != null) {
                        c cVar = this.h;
                        avgg avggVar = aqszVar.d;
                        if (avggVar == null) {
                            avggVar = avgg.a;
                        }
                        int i = c.a;
                        c.a = i + 1;
                        cVar.c.append(i, ahbw.B(avggVar));
                        BitmapKey bitmapKey = new BitmapKey(cVar.b, i);
                        d dVar = this.i;
                        int i2 = d.a;
                        d.a = i2 + 1;
                        dVar.c.append(i2, aqszVar);
                        SelectableItemKey selectableItemKey = new SelectableItemKey(dVar.b, i2);
                        h i3 = RelatedVideoItem.i();
                        i3.a = aqszVar.c;
                        if ((aqszVar.b & 8) != 0) {
                            aqygVar = aqszVar.f;
                            if (aqygVar == null) {
                                aqygVar = aqyg.a;
                            }
                        } else {
                            aqygVar = null;
                        }
                        i3.b = ajcq.b(aqygVar);
                        if ((aqszVar.b & 32) != 0) {
                            aqygVar2 = aqszVar.h;
                            if (aqygVar2 == null) {
                                aqygVar2 = aqyg.a;
                            }
                        } else {
                            aqygVar2 = null;
                        }
                        i3.c = ajcq.b(aqygVar2);
                        if ((aqszVar.b & 512) != 0) {
                            aqygVar3 = aqszVar.i;
                            if (aqygVar3 == null) {
                                aqygVar3 = aqyg.a;
                            }
                        } else {
                            aqygVar3 = null;
                        }
                        i3.d = ajcq.b(aqygVar3);
                        i3.e = bitmapKey;
                        i3.f = selectableItemKey;
                        i3.g = (aqszVar.b & 16384) != 0 ? aqszVar.k : null;
                        relatedVideoItem = i3.a();
                    }
                    if (relatedVideoItem != null) {
                        arrayList.add(relatedVideoItem);
                    }
                }
            }
        }
        aVar.a(new RelatedVideosScreen(charSequence, arrayList));
    }

    public final void d() {
        if (g() && !i() && h()) {
            c();
        }
    }

    public final void e() {
        aign aignVar;
        ahej ahejVar;
        boolean z = true;
        if (!g() || (aignVar = this.a) == null || !aignVar.a(aign.VIDEO_PLAYING, aign.ENDED) || i() || (((ahejVar = this.b) == null || !ahejVar.e()) && !h())) {
            z = false;
        }
        this.d.c(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ypd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class[] kz(java.lang.Class r4, java.lang.Object r5, int r6) {
        /*
            r3 = this;
            r4 = -1
            r0 = 2
            r1 = 1
            r2 = 0
            if (r6 == r4) goto Lc3
            if (r6 == 0) goto L61
            if (r6 == r1) goto L3f
            if (r6 != r0) goto L26
            ahej r5 = (defpackage.ahej) r5
            ahej r4 = r3.b
            if (r4 == 0) goto L1a
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L1a
            goto Ld3
        L1a:
            r3.b = r5
            r3.a()
            r3.e()
            r3.d()
            return r2
        L26:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r0 = 32
            r5.<init>(r0)
            java.lang.String r0 = "unsupported op code: "
            r5.append(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L3f:
            ahef r5 = (defpackage.ahef) r5
            aign r4 = r3.a
            if (r4 == 0) goto L51
            aign r6 = r5.c()
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L51
            goto Ld3
        L51:
            aign r4 = r5.c()
            r3.a = r4
            r3.a()
            r3.e()
            r3.d()
            return r2
        L61:
            ahdv r5 = (defpackage.ahdv) r5
            com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel r4 = r5.a()
            if (r4 != 0) goto L6b
        L69:
            r4 = r2
            goto La9
        L6b:
            asfc r4 = r4.a
            aseo r5 = r4.f
            if (r5 != 0) goto L73
            aseo r5 = defpackage.aseo.a
        L73:
            int r6 = r5.b
            r0 = 78882851(0x4b3a823, float:4.2237107E-36)
            if (r6 != r0) goto L7f
            java.lang.Object r5 = r5.c
            atzr r5 = (defpackage.atzr) r5
            goto L81
        L7f:
            atzr r5 = defpackage.atzr.a
        L81:
            atzo r5 = r5.g
            if (r5 != 0) goto L87
            atzo r5 = defpackage.atzo.a
        L87:
            int r5 = r5.b
            r5 = r5 & r1
            if (r5 == 0) goto L69
            aseo r4 = r4.f
            if (r4 != 0) goto L92
            aseo r4 = defpackage.aseo.a
        L92:
            int r5 = r4.b
            if (r5 != r0) goto L9b
            java.lang.Object r4 = r4.c
            atzr r4 = (defpackage.atzr) r4
            goto L9d
        L9b:
            atzr r4 = defpackage.atzr.a
        L9d:
            atzo r4 = r4.g
            if (r4 != 0) goto La3
            atzo r4 = defpackage.atzo.a
        La3:
            atzx r4 = r4.c
            if (r4 != 0) goto La9
            atzx r4 = defpackage.atzx.a
        La9:
            atzx r5 = r3.c
            boolean r5 = defpackage.amkq.b(r4, r5)
            if (r5 == 0) goto Lb2
            goto Ld3
        Lb2:
            r3.c = r4
            com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.c r4 = r3.h
            r4.a()
            r3.a()
            r3.e()
            r3.d()
            return r2
        Lc3:
            r4 = 3
            java.lang.Class[] r2 = new java.lang.Class[r4]
            r4 = 0
            java.lang.Class<ahdv> r5 = defpackage.ahdv.class
            r2[r4] = r5
            java.lang.Class<ahef> r4 = defpackage.ahef.class
            r2[r1] = r4
            java.lang.Class<ahej> r4 = defpackage.ahej.class
            r2[r0] = r4
        Ld3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.e.kz(java.lang.Class, java.lang.Object, int):java.lang.Class[]");
    }
}
