package com.google.android.libraries.youtube.edit.common;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AutoValue_DeviceLocalFile extends DeviceLocalFile {
    public final long a;
    public final Uri b;
    public final long c;
    public final long d;
    public final int e;
    private final String f;
    private final String g;
    private final long h;

    public AutoValue_DeviceLocalFile(long j, Uri uri, String str, String str2, long j2, long j3, long j4, int i) {
        this.a = j;
        this.b = uri;
        this.f = str;
        this.g = str2;
        this.c = j2;
        this.h = j3;
        this.d = j4;
        this.e = i;
    }

    @Override // com.google.android.libraries.youtube.edit.common.DeviceLocalFile
    public final int a() {
        return this.e;
    }

    @Override // com.google.android.libraries.youtube.edit.common.DeviceLocalFile
    public final long b() {
        return this.h;
    }

    @Override // com.google.android.libraries.youtube.edit.common.DeviceLocalFile
    public final long c() {
        return this.a;
    }

    @Override // com.google.android.libraries.youtube.edit.common.DeviceLocalFile
    public final long d() {
        return this.d;
    }

    @Override // com.google.android.libraries.youtube.edit.common.DeviceLocalFile
    public final long e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof DeviceLocalFile) {
            DeviceLocalFile deviceLocalFile = (DeviceLocalFile) obj;
            if (this.a == deviceLocalFile.c() && this.b.equals(deviceLocalFile.f()) && this.f.equals(deviceLocalFile.h()) && ((str = this.g) != null ? str.equals(deviceLocalFile.g()) : deviceLocalFile.g() == null) && this.c == deviceLocalFile.e() && this.h == deviceLocalFile.b() && this.d == deviceLocalFile.d() && this.e == deviceLocalFile.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.youtube.edit.common.DeviceLocalFile
    public final Uri f() {
        return this.b;
    }

    @Override // com.google.android.libraries.youtube.edit.common.DeviceLocalFile
    public final String g() {
        return this.g;
    }

    @Override // com.google.android.libraries.youtube.edit.common.DeviceLocalFile
    public final String h() {
        return this.f;
    }

    public final int hashCode() {
        long j = this.a;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003;
        String str = this.g;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j2 = this.c;
        long j3 = this.h;
        long j4 = this.d;
        return this.e ^ ((((((((hashCode ^ hashCode2) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        String valueOf = String.valueOf(this.b);
        String str = this.f;
        String str2 = this.g;
        long j2 = this.c;
        long j3 = this.h;
        long j4 = this.d;
        int i = this.e;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 191 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append("DeviceLocalFile{id=");
        sb.append(j);
        sb.append(", uri=");
        sb.append(valueOf);
        sb.append(", displayName=");
        sb.append(str);
        sb.append(", directory=");
        sb.append(str2);
        sb.append(", size=");
        sb.append(j2);
        sb.append(", duration=");
        sb.append(j3);
        sb.append(", lastModifiedTime=");
        sb.append(j4);
        sb.append(", fileType=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
