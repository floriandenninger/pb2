package com.google.android.libraries.youtube.media.player.scripted.fetch.generated;

import defpackage.affo;
import defpackage.amkq;
import defpackage.aoob;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ScriptedCacheScriptedHandler {
    private final affo a;

    public ScriptedCacheScriptedHandler(Object obj) {
        amkq.E(obj instanceof affo);
        this.a = (affo) obj;
    }

    public byte[] cancelRead(byte[] bArr) {
        try {
            affo affoVar = this.a;
            return affoVar.a().toByteArray();
        } catch (aoob e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    public byte[] endSubscription(byte[] bArr) {
        try {
            affo affoVar = this.a;
            return affoVar.b().toByteArray();
        } catch (aoob e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    public byte[] readTimeRange(byte[] bArr) {
        try {
            affo affoVar = this.a;
            return affoVar.c().toByteArray();
        } catch (aoob e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    public byte[] subscribe(byte[] bArr) {
        try {
            affo affoVar = this.a;
            return affoVar.d().toByteArray();
        } catch (aoob e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    public byte[] summarize(byte[] bArr) {
        try {
            affo affoVar = this.a;
            return affoVar.e().toByteArray();
        } catch (aoob e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    public byte[] writeSegmentData(byte[] bArr) {
        try {
            affo affoVar = this.a;
            return affoVar.f().toByteArray();
        } catch (aoob e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }
}
