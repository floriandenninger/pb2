package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class JSCommandResolver {
    public abstract Status resolve(byte[] bArr);

    public abstract void resolveAsync(byte[] bArr, JSPromiseResolver jSPromiseResolver);
}
