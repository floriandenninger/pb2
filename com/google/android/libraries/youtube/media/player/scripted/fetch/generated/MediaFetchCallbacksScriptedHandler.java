package com.google.android.libraries.youtube.media.player.scripted.fetch.generated;

import defpackage.advh;
import defpackage.adwo;
import defpackage.adwp;
import defpackage.adww;
import defpackage.aeyc;
import defpackage.aeyk;
import defpackage.aeyl;
import defpackage.aeyv;
import defpackage.afih;
import defpackage.amkq;
import defpackage.aomw;
import defpackage.aone;
import defpackage.aonm;
import defpackage.aoob;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class MediaFetchCallbacksScriptedHandler {
    private final aeyv a;

    public MediaFetchCallbacksScriptedHandler(Object obj) {
        amkq.E(obj instanceof aeyv);
        this.a = (aeyv) obj;
    }

    public byte[] getCurrentPlaybackPositionSeconds(byte[] bArr) {
        advh advhVar;
        try {
            aeyv aeyvVar = this.a;
            aeyk aeykVar = aeyvVar.a.l;
            long j = aeykVar != null ? aeykVar.i.f : -9223372036854775807L;
            if (j >= 0) {
                aone createBuilder = advh.a.createBuilder();
                double b = aeyc.b(j);
                createBuilder.copyOnWrite();
                advh advhVar2 = (advh) createBuilder.instance;
                advhVar2.b |= 1;
                advhVar2.c = b;
                advhVar = (advh) createBuilder.build();
            } else {
                advhVar = advh.a;
            }
            return advhVar.toByteArray();
        } catch (aoob e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    public byte[] onError(byte[] bArr) {
        try {
            aeyv aeyvVar = this.a;
            adwo adwoVar = (adwo) aonm.parseFrom(adwo.a, bArr, aomw.b());
            aeyl aeylVar = aeyvVar.b;
            adww adwwVar = adwoVar.b;
            if (adwwVar == null) {
                adwwVar = adww.a;
            }
            aeylVar.a(afih.e(adwwVar), null);
            return adwp.a.toByteArray();
        } catch (aoob e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }
}
