package com.google.android.libraries.youtube.media.player.scripted.fetch.generated;

import defpackage.aegf;
import defpackage.aehk;
import defpackage.affn;
import defpackage.amkq;
import defpackage.aomw;
import defpackage.aonm;
import defpackage.aoob;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class NetworkClientScriptedHandler {
    private final affn a;

    public NetworkClientScriptedHandler(Object obj) {
        amkq.E(obj instanceof affn);
        this.a = (affn) obj;
    }

    public byte[] cancelFetch(byte[] bArr) {
        try {
            return this.a.a((aegf) aonm.parseFrom(aegf.a, bArr, aomw.b())).toByteArray();
        } catch (aoob e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    public byte[] startFetch(byte[] bArr) {
        try {
            return this.a.b((aehk) aonm.parseFrom(aehk.a, bArr, aomw.b())).toByteArray();
        } catch (aoob e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }
}
