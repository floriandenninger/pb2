package com.youtube.android.libraries.elements.templates;

import defpackage.axoc;
import defpackage.sgf;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class EkoProcessor {
    static {
        sgf.D();
    }

    private EkoProcessor() {
    }

    public static axoc a(byte[] bArr, byte[] bArr2, boolean z) {
        byte[][] bArr3 = {null, null};
        Status nativeProcess = nativeProcess(bArr, bArr2, z, bArr3);
        if (nativeProcess.f()) {
            return new axoc(nativeProcess, bArr3[0]);
        }
        return new axoc(nativeProcess, null);
    }

    private static native Status nativeProcess(byte[] bArr, byte[] bArr2, boolean z, byte[][] bArr3);
}
