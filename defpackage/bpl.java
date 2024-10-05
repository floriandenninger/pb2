package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bpl extends Handler {
    final /* synthetic */ bpp a;
    private final ArrayList b = new ArrayList();
    private final List c = new ArrayList();

    public bpl(bpp bppVar) {
        this.a = bppVar;
    }

    public final void a(int i, Object obj) {
        obtainMessage(i, obj).sendToTarget();
    }

    public final void b(int i, Object obj, int i2) {
        Message obtainMessage = obtainMessage(i, obj);
        obtainMessage.arg1 = i2;
        obtainMessage.sendToTarget();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x018a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0141 A[Catch: all -> 0x0194, TryCatch #0 {all -> 0x0194, blocks: (B:15:0x00a7, B:16:0x00af, B:18:0x00b3, B:25:0x00c5, B:21:0x00cd, B:28:0x00d5, B:30:0x00de, B:43:0x0102, B:45:0x010a, B:46:0x010d, B:49:0x0112, B:51:0x0117, B:53:0x011c, B:58:0x0126, B:64:0x0141, B:66:0x0148, B:69:0x0151, B:71:0x0157, B:76:0x0163, B:79:0x016b, B:82:0x016f, B:84:0x0173, B:86:0x0177, B:88:0x017b, B:90:0x017f, B:92:0x0183, B:94:0x0187, B:104:0x0138, B:105:0x012a), top: B:14:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016f A[Catch: all -> 0x0194, TryCatch #0 {all -> 0x0194, blocks: (B:15:0x00a7, B:16:0x00af, B:18:0x00b3, B:25:0x00c5, B:21:0x00cd, B:28:0x00d5, B:30:0x00de, B:43:0x0102, B:45:0x010a, B:46:0x010d, B:49:0x0112, B:51:0x0117, B:53:0x011c, B:58:0x0126, B:64:0x0141, B:66:0x0148, B:69:0x0151, B:71:0x0157, B:76:0x0163, B:79:0x016b, B:82:0x016f, B:84:0x0173, B:86:0x0177, B:88:0x017b, B:90:0x017f, B:92:0x0183, B:94:0x0187, B:104:0x0138, B:105:0x012a), top: B:14:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0173 A[Catch: all -> 0x0194, TryCatch #0 {all -> 0x0194, blocks: (B:15:0x00a7, B:16:0x00af, B:18:0x00b3, B:25:0x00c5, B:21:0x00cd, B:28:0x00d5, B:30:0x00de, B:43:0x0102, B:45:0x010a, B:46:0x010d, B:49:0x0112, B:51:0x0117, B:53:0x011c, B:58:0x0126, B:64:0x0141, B:66:0x0148, B:69:0x0151, B:71:0x0157, B:76:0x0163, B:79:0x016b, B:82:0x016f, B:84:0x0173, B:86:0x0177, B:88:0x017b, B:90:0x017f, B:92:0x0183, B:94:0x0187, B:104:0x0138, B:105:0x012a), top: B:14:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0177 A[Catch: all -> 0x0194, TryCatch #0 {all -> 0x0194, blocks: (B:15:0x00a7, B:16:0x00af, B:18:0x00b3, B:25:0x00c5, B:21:0x00cd, B:28:0x00d5, B:30:0x00de, B:43:0x0102, B:45:0x010a, B:46:0x010d, B:49:0x0112, B:51:0x0117, B:53:0x011c, B:58:0x0126, B:64:0x0141, B:66:0x0148, B:69:0x0151, B:71:0x0157, B:76:0x0163, B:79:0x016b, B:82:0x016f, B:84:0x0173, B:86:0x0177, B:88:0x017b, B:90:0x017f, B:92:0x0183, B:94:0x0187, B:104:0x0138, B:105:0x012a), top: B:14:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017b A[Catch: all -> 0x0194, TryCatch #0 {all -> 0x0194, blocks: (B:15:0x00a7, B:16:0x00af, B:18:0x00b3, B:25:0x00c5, B:21:0x00cd, B:28:0x00d5, B:30:0x00de, B:43:0x0102, B:45:0x010a, B:46:0x010d, B:49:0x0112, B:51:0x0117, B:53:0x011c, B:58:0x0126, B:64:0x0141, B:66:0x0148, B:69:0x0151, B:71:0x0157, B:76:0x0163, B:79:0x016b, B:82:0x016f, B:84:0x0173, B:86:0x0177, B:88:0x017b, B:90:0x017f, B:92:0x0183, B:94:0x0187, B:104:0x0138, B:105:0x012a), top: B:14:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017f A[Catch: all -> 0x0194, TryCatch #0 {all -> 0x0194, blocks: (B:15:0x00a7, B:16:0x00af, B:18:0x00b3, B:25:0x00c5, B:21:0x00cd, B:28:0x00d5, B:30:0x00de, B:43:0x0102, B:45:0x010a, B:46:0x010d, B:49:0x0112, B:51:0x0117, B:53:0x011c, B:58:0x0126, B:64:0x0141, B:66:0x0148, B:69:0x0151, B:71:0x0157, B:76:0x0163, B:79:0x016b, B:82:0x016f, B:84:0x0173, B:86:0x0177, B:88:0x017b, B:90:0x017f, B:92:0x0183, B:94:0x0187, B:104:0x0138, B:105:0x012a), top: B:14:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0183 A[Catch: all -> 0x0194, TryCatch #0 {all -> 0x0194, blocks: (B:15:0x00a7, B:16:0x00af, B:18:0x00b3, B:25:0x00c5, B:21:0x00cd, B:28:0x00d5, B:30:0x00de, B:43:0x0102, B:45:0x010a, B:46:0x010d, B:49:0x0112, B:51:0x0117, B:53:0x011c, B:58:0x0126, B:64:0x0141, B:66:0x0148, B:69:0x0151, B:71:0x0157, B:76:0x0163, B:79:0x016b, B:82:0x016f, B:84:0x0173, B:86:0x0177, B:88:0x017b, B:90:0x017f, B:92:0x0183, B:94:0x0187, B:104:0x0138, B:105:0x012a), top: B:14:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0187 A[Catch: all -> 0x0194, TRY_LEAVE, TryCatch #0 {all -> 0x0194, blocks: (B:15:0x00a7, B:16:0x00af, B:18:0x00b3, B:25:0x00c5, B:21:0x00cd, B:28:0x00d5, B:30:0x00de, B:43:0x0102, B:45:0x010a, B:46:0x010d, B:49:0x0112, B:51:0x0117, B:53:0x011c, B:58:0x0126, B:64:0x0141, B:66:0x0148, B:69:0x0151, B:71:0x0157, B:76:0x0163, B:79:0x016b, B:82:0x016f, B:84:0x0173, B:86:0x0177, B:88:0x017b, B:90:0x017f, B:92:0x0183, B:94:0x0187, B:104:0x0138, B:105:0x012a), top: B:14:0x00a7 }] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r13) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpl.handleMessage(android.os.Message):void");
    }
}
