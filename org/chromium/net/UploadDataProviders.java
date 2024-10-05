package org.chromium.net;

import android.os.ParcelFileDescriptor;
import defpackage.bafk;
import defpackage.bafl;
import defpackage.bafm;
import defpackage.bafo;
import java.io.File;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new bafo(new bafl(parcelFileDescriptor));
    }

    public static UploadDataProvider create(File file) {
        return new bafo(new bafk(file));
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new bafm(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return new bafm(ByteBuffer.wrap(bArr, i, i2).slice());
    }
}
