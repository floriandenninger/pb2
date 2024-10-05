package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ResourceLoaderDelegate {
    public abstract void onAttemptedToCacheResource(String str, ValidationResult validationResult, Status status);

    public abstract void onMissingCacheDependency(String str);

    public abstract void onResourceCachePrepared(String str, Status status);

    public abstract void onResourceProcessed(String str, ValidationResult validationResult, Status status);

    public abstract void onServingContextUpdated(byte[] bArr);
}
