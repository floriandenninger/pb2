package com.google.android.libraries.parenttools.youtube;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AutoValue_ParentToolsResult extends ParentToolsResult {
    public final byte[] a;
    public final int b;

    public AutoValue_ParentToolsResult(byte[] bArr, int i) {
        this.a = bArr;
        this.b = i;
    }

    @Override // com.google.android.libraries.parenttools.youtube.ParentToolsResult
    public final byte[] a() {
        return this.a;
    }

    @Override // com.google.android.libraries.parenttools.youtube.ParentToolsResult
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ParentToolsResult) {
            ParentToolsResult parentToolsResult = (ParentToolsResult) obj;
            if (Arrays.equals(this.a, parentToolsResult instanceof AutoValue_ParentToolsResult ? ((AutoValue_ParentToolsResult) parentToolsResult).a : parentToolsResult.a()) && this.b == parentToolsResult.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.a) ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        String num = Integer.toString(this.b - 1);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 47 + num.length());
        sb.append("ParentToolsResult{hostClientData=");
        sb.append(arrays);
        sb.append(", exitStatus=");
        sb.append(num);
        sb.append("}");
        return sb.toString();
    }
}
