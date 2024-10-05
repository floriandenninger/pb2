package com.google.android.libraries.youtube.media.player.scripted.fetch.generated;

import defpackage.advk;
import defpackage.advl;
import defpackage.advm;
import defpackage.advn;
import defpackage.advo;
import defpackage.advp;
import defpackage.adww;
import defpackage.aedo;
import defpackage.aedp;
import defpackage.aeyx;
import defpackage.afih;
import defpackage.amkq;
import defpackage.aomw;
import defpackage.aonm;
import defpackage.aoob;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ScriptedClientLoggerScriptedHandler {
    private final aeyx a;

    public ScriptedClientLoggerScriptedHandler(Object obj) {
        amkq.E(obj instanceof aeyx);
        this.a = (aeyx) obj;
    }

    public byte[] logError(byte[] bArr) {
        try {
            aeyx aeyxVar = this.a;
            advk advkVar = (advk) aonm.parseFrom(advk.a, bArr, aomw.b());
            if ((advkVar.b & 1) != 0) {
                adww adwwVar = advkVar.c;
                if (adwwVar == null) {
                    adwwVar = adww.a;
                }
                aeyxVar.a.a.e(afih.e(adwwVar));
            }
            return advl.a.toByteArray();
        } catch (aoob e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    public byte[] logKeyValue(byte[] bArr) {
        try {
            aeyx aeyxVar = this.a;
            advm advmVar = (advm) aonm.parseFrom(advm.a, bArr, aomw.b());
            if ((advmVar.b & 1) != 0) {
                aeyxVar.a.a.f(advmVar.c, advmVar.d);
            }
            return advn.a.toByteArray();
        } catch (aoob e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    public byte[] logLatencyTick(byte[] bArr) {
        aedo a;
        try {
            aeyx aeyxVar = this.a;
            advo advoVar = (advo) aonm.parseFrom(advo.a, bArr, aomw.b());
            if ((advoVar.b & 1) != 0 && (a = aedp.a(advoVar.c)) != null) {
                aeyxVar.a.c.aQ(a);
            }
            return advp.a.toByteArray();
        } catch (aoob e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }
}
