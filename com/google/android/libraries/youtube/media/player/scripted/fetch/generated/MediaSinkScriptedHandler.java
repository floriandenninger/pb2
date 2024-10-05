package com.google.android.libraries.youtube.media.player.scripted.fetch.generated;

import defpackage.aefj;
import defpackage.aefl;
import defpackage.aefo;
import defpackage.affk;
import defpackage.amkq;
import defpackage.aomw;
import defpackage.aonm;
import defpackage.aoob;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class MediaSinkScriptedHandler {
    private final affk a;

    public MediaSinkScriptedHandler(Object obj) {
        amkq.E(obj instanceof affk);
        this.a = (affk) obj;
    }

    public byte[] discardBuffer(byte[] bArr) {
        try {
            return this.a.a((aefj) aonm.parseFrom(aefj.a, bArr, aomw.b())).toByteArray();
        } catch (aoob e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    public byte[] discardRange(byte[] bArr) {
        try {
            return this.a.b((aefl) aonm.parseFrom(aefl.a, bArr, aomw.b())).toByteArray();
        } catch (aoob e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    public byte[] seek(byte[] bArr) {
        try {
            return this.a.c((aefo) aonm.parseFrom(aefo.a, bArr, aomw.b())).toByteArray();
        } catch (aoob e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }
}
