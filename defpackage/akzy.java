package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class akzy extends akzz {
    protected final boolean a;
    protected FileInputStream b;
    private final Context f;
    private long g;
    private AssetFileDescriptor h;

    public akzy(Uri uri, Context context, axze axzeVar, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(uri, context.getContentResolver(), axzeVar, null, null, null);
        this.a = z;
        this.f = context;
    }

    private final boolean c(File[] fileArr, final String str) {
        if (fileArr == null) {
            return false;
        }
        return amkq.bm(Arrays.asList(fileArr), new ammy() { // from class: akzx
            @Override // defpackage.ammy
            public final boolean a(Object obj) {
                akzy akzyVar = akzy.this;
                String str2 = str;
                File file = (File) obj;
                if (file == null) {
                    return false;
                }
                try {
                    return str2.startsWith(file.getCanonicalPath());
                } catch (IOException e) {
                    axze axzeVar = akzyVar.e;
                    String valueOf = String.valueOf(str2);
                    axzeVar.e(valueOf.length() != 0 ? "Cannot check source file path ".concat(valueOf) : new String("Cannot check source file path "), e);
                    return false;
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0070, code lost:
    
        if (c(r7.f.getExternalCacheDirs(), r0) != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0084 A[Catch: all -> 0x00ed, TryCatch #2 {, blocks: (B:4:0x0003, B:61:0x0009, B:26:0x00b2, B:28:0x00b6, B:30:0x00be, B:31:0x00c3, B:33:0x00c5, B:34:0x00ca, B:36:0x00cc, B:37:0x00d3, B:7:0x001d, B:9:0x0021, B:12:0x007c, B:14:0x0084, B:15:0x0089, B:16:0x009c, B:18:0x00a0, B:25:0x00aa, B:21:0x00dd, B:22:0x00e4, B:40:0x00d5, B:41:0x00dc, B:42:0x00e5, B:43:0x00ec, B:44:0x0087, B:45:0x0033, B:48:0x003e, B:51:0x0058, B:54:0x0066, B:58:0x0074, B:59:0x0090, B:64:0x0013), top: B:3:0x0003, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6 A[Catch: all -> 0x00ed, TryCatch #2 {, blocks: (B:4:0x0003, B:61:0x0009, B:26:0x00b2, B:28:0x00b6, B:30:0x00be, B:31:0x00c3, B:33:0x00c5, B:34:0x00ca, B:36:0x00cc, B:37:0x00d3, B:7:0x001d, B:9:0x0021, B:12:0x007c, B:14:0x0084, B:15:0x0089, B:16:0x009c, B:18:0x00a0, B:25:0x00aa, B:21:0x00dd, B:22:0x00e4, B:40:0x00d5, B:41:0x00dc, B:42:0x00e5, B:43:0x00ec, B:44:0x0087, B:45:0x0033, B:48:0x003e, B:51:0x0058, B:54:0x0066, B:58:0x0074, B:59:0x0090, B:64:0x0013), top: B:3:0x0003, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc A[Catch: all -> 0x00ed, TryCatch #2 {, blocks: (B:4:0x0003, B:61:0x0009, B:26:0x00b2, B:28:0x00b6, B:30:0x00be, B:31:0x00c3, B:33:0x00c5, B:34:0x00ca, B:36:0x00cc, B:37:0x00d3, B:7:0x001d, B:9:0x0021, B:12:0x007c, B:14:0x0084, B:15:0x0089, B:16:0x009c, B:18:0x00a0, B:25:0x00aa, B:21:0x00dd, B:22:0x00e4, B:40:0x00d5, B:41:0x00dc, B:42:0x00e5, B:43:0x00ec, B:44:0x0087, B:45:0x0033, B:48:0x003e, B:51:0x0058, B:54:0x0066, B:58:0x0074, B:59:0x0090, B:64:0x0013), top: B:3:0x0003, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0087 A[Catch: all -> 0x00ed, TryCatch #2 {, blocks: (B:4:0x0003, B:61:0x0009, B:26:0x00b2, B:28:0x00b6, B:30:0x00be, B:31:0x00c3, B:33:0x00c5, B:34:0x00ca, B:36:0x00cc, B:37:0x00d3, B:7:0x001d, B:9:0x0021, B:12:0x007c, B:14:0x0084, B:15:0x0089, B:16:0x009c, B:18:0x00a0, B:25:0x00aa, B:21:0x00dd, B:22:0x00e4, B:40:0x00d5, B:41:0x00dc, B:42:0x00e5, B:43:0x00ec, B:44:0x0087, B:45:0x0033, B:48:0x003e, B:51:0x0058, B:54:0x0066, B:58:0x0074, B:59:0x0090, B:64:0x0013), top: B:3:0x0003, inners: #0, #1, #3 }] */
    @Override // defpackage.alaf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.alad f(java.io.File r8) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akzy.f(java.io.File):alad");
    }

    @Override // defpackage.alaf
    public final void j() {
        synchronized (this.d) {
            try {
                FileInputStream fileInputStream = this.b;
                if (fileInputStream != null) {
                    fileInputStream.close();
                    this.b = null;
                }
                AssetFileDescriptor assetFileDescriptor = this.h;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                    this.h = null;
                }
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.alaf
    public final boolean l() {
        return true;
    }
}
