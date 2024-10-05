package com.google.android.libraries.youtube.media.player.scripted.fetch.generated;

import defpackage.aegh;
import defpackage.aehd;
import defpackage.affm;
import defpackage.amkq;
import defpackage.aomw;
import defpackage.aonm;
import defpackage.aoob;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class NetworkClientFactoryScriptedHandler {
    private final affm a;

    public NetworkClientFactoryScriptedHandler(Object obj) {
        amkq.E(obj instanceof affm);
        this.a = (affm) obj;
    }

    public byte[] createNetworkClient(byte[] bArr) {
        try {
            return this.a.a((aegh) aonm.parseFrom(aegh.a, bArr, aomw.b())).toByteArray();
        } catch (aoob e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    public byte[] releaseNetworkClient(byte[] bArr) {
        try {
            return this.a.b((aehd) aonm.parseFrom(aehd.a, bArr, aomw.b())).toByteArray();
        } catch (aoob e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }
}
