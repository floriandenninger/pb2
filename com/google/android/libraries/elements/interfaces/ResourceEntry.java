package com.google.android.libraries.elements.interfaces;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ResourceEntry {
    final byte[] resourceBytes;
    final ResourceMetadata resourceMetadata;

    public ResourceEntry(ResourceMetadata resourceMetadata, byte[] bArr) {
        this.resourceMetadata = resourceMetadata;
        this.resourceBytes = bArr;
    }

    public byte[] getResourceBytes() {
        return this.resourceBytes;
    }

    public ResourceMetadata getResourceMetadata() {
        return this.resourceMetadata;
    }

    public String toString() {
        String valueOf = String.valueOf(this.resourceMetadata);
        String valueOf2 = String.valueOf(this.resourceBytes);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47 + String.valueOf(valueOf2).length());
        sb.append("ResourceEntry{resourceMetadata=");
        sb.append(valueOf);
        sb.append(",resourceBytes=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
