package com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.service;

import android.util.SparseArray;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f;
import com.google.android.apps.youtube.embeddedplayer.service.model.SelectableItemKey;
import com.google.android.apps.youtube.embeddedplayer.service.model.i;
import defpackage.aahc;
import defpackage.aahd;
import defpackage.apxf;
import defpackage.atza;
import defpackage.atzb;
import defpackage.atzc;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class c implements i {
    public SelectableItemKey a;
    public SelectableItemKey b;
    public SelectableItemKey c;
    public final SparseArray d = new SparseArray();
    public long e;
    public atzb f;
    private final f g;
    private final aahd h;
    private final a i;

    public c(f fVar, aahd aahdVar, a aVar) {
        this.g = fVar;
        this.h = aahdVar;
        this.i = aVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.model.i
    public final void a(int i) {
        if (this.f == null) {
            return;
        }
        Object obj = this.d.get(i);
        if (obj == null || (obj instanceof atzb) || (obj instanceof atza)) {
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint.starttime", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.e)));
            aahd aahdVar = this.h;
            apxf apxfVar = this.f.c;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, hashMap);
        } else if (obj instanceof atzc) {
            aahd aahdVar2 = this.h;
            apxf apxfVar2 = ((atzc) obj).b;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            aahc.a(aahdVar2, apxfVar2);
        }
        if (obj != null) {
            byte[] bArr = null;
            if (obj instanceof atzb) {
                atzb atzbVar = (atzb) obj;
                if ((atzbVar.b & 32) != 0) {
                    bArr = atzbVar.f.I();
                }
            } else if (obj instanceof atza) {
                atza atzaVar = (atza) obj;
                if ((atzaVar.b & 4) != 0) {
                    bArr = atzaVar.d.I();
                }
            } else if (obj instanceof atzc) {
                bArr = ((atzc) obj).d.I();
            }
            if (bArr != null) {
                this.g.j(bArr);
            }
        }
        this.i.a.a(3);
    }
}
