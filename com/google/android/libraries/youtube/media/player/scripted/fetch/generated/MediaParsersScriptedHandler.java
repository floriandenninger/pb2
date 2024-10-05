package com.google.android.libraries.youtube.media.player.scripted.fetch.generated;

import defpackage.aefb;
import defpackage.aefh;
import defpackage.affi;
import defpackage.amkq;
import defpackage.aomw;
import defpackage.aonm;
import defpackage.aoob;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class MediaParsersScriptedHandler {
    private final affi a;

    public MediaParsersScriptedHandler(Object obj) {
        amkq.E(obj instanceof affi);
        this.a = (affi) obj;
    }

    public byte[] initialize(byte[] bArr) {
        try {
            return this.a.a((aefb) aonm.parseFrom(aefb.a, bArr, aomw.b())).toByteArray();
        } catch (aoob e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    public byte[] onPushComplete(byte[] bArr) {
        try {
            affi affiVar = this.a;
            return affiVar.c().toByteArray();
        } catch (aoob e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    public byte[] pushMedia(byte[] bArr) {
        try {
            return this.a.b((aefh) aonm.parseFrom(aefh.a, bArr, aomw.b())).toByteArray();
        } catch (aoob e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }
}
