package com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint;

import com.google.protos.youtube.api.innertube.AddToToastActionOuterClass$AddToToastAction;
import defpackage.aaha;
import defpackage.ajcq;
import defpackage.aozx;
import defpackage.apxf;
import defpackage.aqyg;
import defpackage.atnc;
import defpackage.atnz;
import defpackage.otf;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class c implements aaha {
    private final otf a;

    public c(otf otfVar, byte[] bArr) {
        this.a = otfVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        aqyg aqygVar;
        AddToToastActionOuterClass$AddToToastAction addToToastActionOuterClass$AddToToastAction = (AddToToastActionOuterClass$AddToToastAction) apxfVar.pX(AddToToastActionOuterClass$AddToToastAction.addToToastAction);
        aozx aozxVar = addToToastActionOuterClass$AddToToastAction.b;
        if (aozxVar == null) {
            aozxVar = aozx.a;
        }
        if ((aozxVar.b & 2) != 0) {
            aozx aozxVar2 = addToToastActionOuterClass$AddToToastAction.b;
            if (aozxVar2 == null) {
                aozxVar2 = aozx.a;
            }
            atnc atncVar = aozxVar2.d;
            if (atncVar == null) {
                atncVar = atnc.a;
            }
            aqygVar = atncVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aozx aozxVar3 = addToToastActionOuterClass$AddToToastAction.b;
            if (aozxVar3 == null) {
                aozxVar3 = aozx.a;
            }
            atnz atnzVar = aozxVar3.c;
            if (atnzVar == null) {
                atnzVar = atnz.a;
            }
            aqygVar = atnzVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        }
        otf otfVar = this.a;
        otfVar.a.s(ajcq.b(aqygVar).toString());
    }
}
