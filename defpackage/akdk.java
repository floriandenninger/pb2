package defpackage;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akdk implements akeb {
    public acsx a;
    private final Map b;
    private byte[] c;
    private String d;
    private final String e;
    private aksl f;

    public akdk() {
        this.d = null;
        this.b = new HashMap();
        this.e = null;
    }

    public akdk(byte[] bArr, Map map, String str) {
        this.c = bArr;
        this.b = map;
        this.e = str;
    }

    @Override // defpackage.akdg
    public final void a(aksl akslVar) {
        this.f = akslVar;
    }

    @Override // defpackage.akeb
    public final int b() {
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x012c A[Catch: IndexOutOfBoundsException -> 0x01b2, JSONException -> 0x01dc, TryCatch #4 {IndexOutOfBoundsException -> 0x01b2, JSONException -> 0x01dc, blocks: (B:19:0x0058, B:21:0x0073, B:23:0x007d, B:26:0x0086, B:86:0x008c, B:87:0x0094, B:89:0x009a, B:28:0x00c0, B:29:0x00c6, B:31:0x00cc, B:33:0x00da, B:34:0x00e5, B:36:0x00f8, B:43:0x0126, B:45:0x012c, B:47:0x0132, B:48:0x0145, B:50:0x014d, B:52:0x0153, B:53:0x015d, B:55:0x0164, B:57:0x016a, B:59:0x0170, B:60:0x0179, B:62:0x017f, B:66:0x018f, B:71:0x0105, B:73:0x010b, B:74:0x0112, B:76:0x0118, B:78:0x00e1, B:81:0x01a7, B:82:0x01aa, B:94:0x00b1), top: B:18:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014d A[Catch: IndexOutOfBoundsException -> 0x01b2, JSONException -> 0x01dc, TryCatch #4 {IndexOutOfBoundsException -> 0x01b2, JSONException -> 0x01dc, blocks: (B:19:0x0058, B:21:0x0073, B:23:0x007d, B:26:0x0086, B:86:0x008c, B:87:0x0094, B:89:0x009a, B:28:0x00c0, B:29:0x00c6, B:31:0x00cc, B:33:0x00da, B:34:0x00e5, B:36:0x00f8, B:43:0x0126, B:45:0x012c, B:47:0x0132, B:48:0x0145, B:50:0x014d, B:52:0x0153, B:53:0x015d, B:55:0x0164, B:57:0x016a, B:59:0x0170, B:60:0x0179, B:62:0x017f, B:66:0x018f, B:71:0x0105, B:73:0x010b, B:74:0x0112, B:76:0x0118, B:78:0x00e1, B:81:0x01a7, B:82:0x01aa, B:94:0x00b1), top: B:18:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0164 A[Catch: IndexOutOfBoundsException -> 0x01b2, JSONException -> 0x01dc, TryCatch #4 {IndexOutOfBoundsException -> 0x01b2, JSONException -> 0x01dc, blocks: (B:19:0x0058, B:21:0x0073, B:23:0x007d, B:26:0x0086, B:86:0x008c, B:87:0x0094, B:89:0x009a, B:28:0x00c0, B:29:0x00c6, B:31:0x00cc, B:33:0x00da, B:34:0x00e5, B:36:0x00f8, B:43:0x0126, B:45:0x012c, B:47:0x0132, B:48:0x0145, B:50:0x014d, B:52:0x0153, B:53:0x015d, B:55:0x0164, B:57:0x016a, B:59:0x0170, B:60:0x0179, B:62:0x017f, B:66:0x018f, B:71:0x0105, B:73:0x010b, B:74:0x0112, B:76:0x0118, B:78:0x00e1, B:81:0x01a7, B:82:0x01aa, B:94:0x00b1), top: B:18:0x0058 }] */
    @Override // defpackage.akeb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.akdy d() {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akdk.d():akdy");
    }

    @Override // defpackage.akeb
    public final String e() {
        return this.e;
    }

    @Override // defpackage.akeb
    public final byte[] f() {
        byte[] bArr = this.c;
        if (bArr != null) {
            return bArr;
        }
        String str = this.d;
        if (str != null) {
            return str.getBytes(Charset.forName("UTF-8"));
        }
        return null;
    }

    @Override // defpackage.akdl
    public final void j(acsx acsxVar) {
        this.a = acsxVar;
    }

    @Override // defpackage.akdl
    public final acsx ob() {
        return this.a;
    }

    public akdk(byte[] bArr, String str) {
        this.c = bArr;
        this.b = new HashMap();
        this.e = str;
    }
}
