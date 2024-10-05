package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alac extends akzz {
    public alac(Uri uri, ContentResolver contentResolver, axze axzeVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(uri, contentResolver, axzeVar, null, null, null);
    }

    @Override // defpackage.alaf
    public final alad f(File file) {
        AssetFileDescriptor openAssetFileDescriptor = this.d.openAssetFileDescriptor(this.c, "r");
        if (openAssetFileDescriptor == null) {
            String valueOf = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55);
            sb.append("Input stream failed, cannot open asset file descriptor ");
            sb.append(valueOf);
            throw new FileNotFoundException(sb.toString());
        }
        try {
            InputStream openInputStream = this.d.openInputStream(this.c);
            if (openInputStream == null) {
                String valueOf2 = String.valueOf(this.c);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 46);
                sb2.append("Input stream failed, cannot open input stream ");
                sb2.append(valueOf2);
                throw new FileNotFoundException(sb2.toString());
            }
            long length = openAssetFileDescriptor.getLength();
            if (length == -1) {
                alad aladVar = new alad(openInputStream);
                try {
                    openAssetFileDescriptor.close();
                } catch (IOException unused) {
                }
                return aladVar;
            }
            return new alad(openInputStream, length);
        } finally {
            try {
                openAssetFileDescriptor.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override // defpackage.alaf
    public final void j() {
    }

    @Override // defpackage.alaf
    public final boolean l() {
        return false;
    }
}
