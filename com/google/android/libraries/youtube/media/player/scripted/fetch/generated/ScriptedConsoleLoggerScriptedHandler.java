package com.google.android.libraries.youtube.media.player.scripted.fetch.generated;

import defpackage.adus;
import defpackage.adut;
import defpackage.aeyy;
import defpackage.afid;
import defpackage.amkq;
import defpackage.aomw;
import defpackage.aonm;
import defpackage.aoob;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ScriptedConsoleLoggerScriptedHandler {
    public ScriptedConsoleLoggerScriptedHandler(Object obj) {
        amkq.E(obj instanceof aeyy);
    }

    public byte[] d(byte[] bArr) {
        try {
            adus adusVar = (adus) aonm.parseFrom(adus.a, bArr, aomw.b());
            if ((adusVar.b & 2) != 0) {
                int i = adusVar.c;
                afid.f();
                String str = adusVar.d;
            }
            return adut.a.toByteArray();
        } catch (aoob e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    public byte[] e(byte[] bArr) {
        try {
            adus adusVar = (adus) aonm.parseFrom(adus.a, bArr, aomw.b());
            if ((adusVar.b & 2) != 0) {
                int i = adusVar.c;
                afid.a(afid.f(), adusVar.d);
            }
            return adut.a.toByteArray();
        } catch (aoob e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    public byte[] w(byte[] bArr) {
        try {
            adus adusVar = (adus) aonm.parseFrom(adus.a, bArr, aomw.b());
            if ((adusVar.b & 2) != 0) {
                int i = adusVar.c;
                afid.d(afid.f(), adusVar.d);
            }
            return adut.a.toByteArray();
        } catch (aoob e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }
}
