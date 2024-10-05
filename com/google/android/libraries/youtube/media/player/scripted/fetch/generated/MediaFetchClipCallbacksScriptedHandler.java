package com.google.android.libraries.youtube.media.player.scripted.fetch.generated;

import defpackage.adyq;
import defpackage.adys;
import defpackage.affh;
import defpackage.amkq;
import defpackage.aomw;
import defpackage.aonm;
import defpackage.aoob;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class MediaFetchClipCallbacksScriptedHandler {
    private final affh a;

    public MediaFetchClipCallbacksScriptedHandler(Object obj) {
        amkq.E(obj instanceof affh);
        this.a = (affh) obj;
    }

    public byte[] getAbrState(byte[] bArr) {
        try {
            affh affhVar = this.a;
            return affhVar.c().toByteArray();
        } catch (aoob e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    public byte[] onBufferedToEof(byte[] bArr) {
        try {
            return this.a.a((adyq) aonm.parseFrom(adyq.a, bArr, aomw.b())).toByteArray();
        } catch (aoob e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    public byte[] onError(byte[] bArr) {
        try {
            return this.a.b((adys) aonm.parseFrom(adys.a, bArr, aomw.b())).toByteArray();
        } catch (aoob e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }
}
