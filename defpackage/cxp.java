package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxp implements cpz {
    static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    private static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX WARN: Code restructure failed: missing block: B:44:0x006c, code lost:
    
        r2 = (java.nio.ByteBuffer) java.nio.ByteBuffer.wrap(r1).order(java.nio.ByteOrder.BIG_ENDIAN).limit(r2);
        r6 = defpackage.did.av(6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        if (r6 == 18761) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0083, code lost:
    
        if (r6 == 19789) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0085, code lost:
    
        r4 = java.nio.ByteOrder.BIG_ENDIAN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008d, code lost:
    
        r2.order(r4);
        r4 = defpackage.did.au(10, r2) + 6;
        r3 = defpackage.did.av(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009b, code lost:
    
        if (r9 >= r3) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009d, code lost:
    
        r5 = (r4 + 2) + (r9 * 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a8, code lost:
    
        if (defpackage.did.av(r5, r2) == 274) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00df, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ab, code lost:
    
        r6 = defpackage.did.av(r5 + 2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b1, code lost:
    
        if (r6 <= 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b5, code lost:
    
        if (r6 > 12) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b7, code lost:
    
        r7 = defpackage.did.au(r5 + 4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00bd, code lost:
    
        if (r7 < 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00bf, code lost:
    
        r7 = r7 + defpackage.cxp.b[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c5, code lost:
    
        if (r7 > 4) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c7, code lost:
    
        r5 = r5 + 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c9, code lost:
    
        if (r5 < 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00cf, code lost:
    
        if (r5 > r2.remaining()) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d1, code lost:
    
        if (r7 < 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d8, code lost:
    
        if ((r7 + r5) > r2.remaining()) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00da, code lost:
    
        r9 = defpackage.did.av(r5, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0088, code lost:
    
        r4 = java.nio.ByteOrder.BIG_ENDIAN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x008b, code lost:
    
        r4 = java.nio.ByteOrder.LITTLE_ENDIAN;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final int e(defpackage.cxn r9, defpackage.ctk r10) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxp.e(cxn, ctk):int");
    }

    private static final ImageHeaderParser$ImageType f(cxn cxnVar) {
        try {
            int a2 = cxnVar.a();
            if (a2 == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int d = (a2 << 8) | cxnVar.d();
            if (d == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int d2 = (d << 8) | cxnVar.d();
            if (d2 == -1991225785) {
                cxnVar.c(21L);
                try {
                    return cxnVar.d() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (cxm unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (d2 != 1380533830) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            cxnVar.c(4L);
            if (((cxnVar.a() << 16) | cxnVar.a()) != 1464156752) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int a3 = (cxnVar.a() << 16) | cxnVar.a();
            if ((a3 & (-256)) != 1448097792) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int i = a3 & PrivateKeyType.INVALID;
            if (i == 88) {
                cxnVar.c(4L);
                return (cxnVar.d() & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (i == 76) {
                cxnVar.c(4L);
                return (cxnVar.d() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            return ImageHeaderParser$ImageType.WEBP;
        } catch (cxm unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    @Override // defpackage.cpz
    public final int a(InputStream inputStream, ctk ctkVar) {
        did.ap(inputStream);
        cxo cxoVar = new cxo(inputStream);
        did.ap(ctkVar);
        return e(cxoVar, ctkVar);
    }

    @Override // defpackage.cpz
    public final int b(ByteBuffer byteBuffer, ctk ctkVar) {
        did.ap(byteBuffer);
        cxl cxlVar = new cxl(byteBuffer);
        did.ap(ctkVar);
        return e(cxlVar, ctkVar);
    }

    @Override // defpackage.cpz
    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        did.ap(inputStream);
        return f(new cxo(inputStream));
    }

    @Override // defpackage.cpz
    public final ImageHeaderParser$ImageType d(ByteBuffer byteBuffer) {
        did.ap(byteBuffer);
        return f(new cxl(byteBuffer));
    }
}
