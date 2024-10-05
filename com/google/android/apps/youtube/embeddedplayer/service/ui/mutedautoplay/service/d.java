package com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.service;

import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f;
import com.google.android.apps.youtube.embeddedplayer.service.model.MutedAutoplayState;
import com.google.android.apps.youtube.embeddedplayer.service.model.SelectableItemKey;
import com.google.android.youtube.R;
import defpackage.ahej;
import defpackage.aign;
import defpackage.ajcq;
import defpackage.aqyg;
import defpackage.atza;
import defpackage.atzb;
import defpackage.atzc;
import defpackage.ayrs;
import defpackage.azrh;
import defpackage.ypd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d implements ypd {
    public final f a;
    public final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.d b;
    public c c;
    public ahej d;
    public aign e;
    public atzb f;
    public atza g;
    public atzc h;
    public final azrh i;
    private final Context j;

    public d(Context context, f fVar, com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.d dVar, final com.google.android.apps.youtube.embeddedplayer.service.databus.service.a aVar) {
        azrh e = azrh.e();
        this.i = e;
        this.j = context;
        this.a = fVar;
        this.b = dVar;
        e.ax(new ayrs() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.service.b
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                com.google.android.apps.youtube.embeddedplayer.service.databus.service.a.this.a((MutedAutoplayState) obj);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0109  */
    @Override // defpackage.ypd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class[] kz(java.lang.Class r6, java.lang.Object r7, int r8) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.service.d.kz(java.lang.Class, java.lang.Object, int):java.lang.Class[]");
    }

    public final void a(int i) {
        SelectableItemKey selectableItemKey;
        SelectableItemKey selectableItemKey2;
        CharSequence string;
        MutedAutoplayState mutedAutoplayState;
        aqyg aqygVar;
        atza atzaVar;
        azrh azrhVar = this.i;
        atzb atzbVar = this.f;
        if (atzbVar == null) {
            mutedAutoplayState = MutedAutoplayState.a;
        } else {
            c cVar = this.c;
            cVar.f = atzbVar;
            cVar.d.append(1, atzbVar);
            SelectableItemKey selectableItemKey3 = cVar.a;
            c cVar2 = this.c;
            atza atzaVar2 = this.g;
            if (atzaVar2 == null) {
                selectableItemKey = cVar2.a;
            } else {
                cVar2.d.append(2, atzaVar2);
                selectableItemKey = cVar2.b;
            }
            SelectableItemKey selectableItemKey4 = selectableItemKey;
            c cVar3 = this.c;
            atzc atzcVar = this.h;
            if (atzcVar == null) {
                selectableItemKey2 = cVar3.a;
            } else {
                cVar3.d.append(3, atzcVar);
                selectableItemKey2 = cVar3.c;
            }
            SelectableItemKey selectableItemKey5 = selectableItemKey2;
            atza atzaVar3 = this.g;
            if (atzaVar3 != null) {
                if ((atzaVar3.b & 1) != 0) {
                    aqygVar = atzaVar3.c;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                } else {
                    aqygVar = null;
                }
                string = ajcq.b(aqygVar);
            } else {
                string = this.j.getString(R.string.continue_watching);
            }
            mutedAutoplayState = new MutedAutoplayState(selectableItemKey3, selectableItemKey4, selectableItemKey5, string, this.h != null ? r1.c : 3000L, i);
        }
        azrhVar.c(mutedAutoplayState);
        if (i == 1) {
            atzb atzbVar2 = this.f;
            if (atzbVar2 != null) {
                this.a.q(atzbVar2.f.I());
                return;
            }
            return;
        }
        if (i != 2 || (atzaVar = this.g) == null) {
            return;
        }
        this.a.q(atzaVar.d.I());
    }
}
