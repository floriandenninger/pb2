package defpackage;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dmx {
    private static final Rect d = new Rect();
    public final djk a;
    public List c;
    public final Rect b = new Rect();
    private final Map e = new HashMap();

    public dmx(djk djkVar) {
        this.a = djkVar;
    }

    private static int c(Rect rect) {
        if (rect.isEmpty()) {
            return 0;
        }
        return rect.width() * rect.height();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.e.keySet()) {
            dmv dmvVar = (dmv) this.e.get(str);
            if (dmvVar.d) {
                dmvVar.d = false;
            } else {
                arrayList.add(str);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str2 = (String) arrayList.get(i);
            dmv dmvVar2 = (dmv) this.e.get(str2);
            diy diyVar = dmvVar2.a;
            diy diyVar2 = dmvVar2.b;
            diy diyVar3 = dmvVar2.c;
            if (diyVar != null) {
                did.e(diyVar, this.a);
            }
            if (dmvVar2.c()) {
                dmvVar2.a(false);
                if (diyVar2 != null) {
                    did.f(diyVar2);
                }
            }
            if (diyVar3 != null) {
                did.g(diyVar3, 0, 0, 0.0f, 0.0f);
            }
            dmvVar2.e = false;
            this.e.remove(str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f5, code lost:
    
        if (r9.equals(r0) != false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0118 A[Catch: all -> 0x016e, TryCatch #0 {, blocks: (B:9:0x000a, B:11:0x0019, B:14:0x002f, B:17:0x0042, B:19:0x0050, B:20:0x0052, B:22:0x0064, B:24:0x006a, B:26:0x006e, B:28:0x007a, B:29:0x0081, B:31:0x0087, B:33:0x008e, B:34:0x0091, B:37:0x00a3, B:39:0x00b5, B:46:0x0118, B:48:0x011e, B:50:0x0129, B:52:0x012e, B:54:0x0154, B:56:0x00ca, B:59:0x0107, B:61:0x010d, B:63:0x0113, B:64:0x00d8, B:68:0x00f7, B:70:0x00fd, B:72:0x0103, B:73:0x00f1, B:79:0x0098, B:82:0x0037, B:86:0x0029, B:89:0x0161), top: B:8:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0129 A[Catch: all -> 0x016e, TryCatch #0 {, blocks: (B:9:0x000a, B:11:0x0019, B:14:0x002f, B:17:0x0042, B:19:0x0050, B:20:0x0052, B:22:0x0064, B:24:0x006a, B:26:0x006e, B:28:0x007a, B:29:0x0081, B:31:0x0087, B:33:0x008e, B:34:0x0091, B:37:0x00a3, B:39:0x00b5, B:46:0x0118, B:48:0x011e, B:50:0x0129, B:52:0x012e, B:54:0x0154, B:56:0x00ca, B:59:0x0107, B:61:0x010d, B:63:0x0113, B:64:0x00d8, B:68:0x00f7, B:70:0x00fd, B:72:0x0103, B:73:0x00f1, B:79:0x0098, B:82:0x0037, B:86:0x0029, B:89:0x0161), top: B:8:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012e A[Catch: all -> 0x016e, TryCatch #0 {, blocks: (B:9:0x000a, B:11:0x0019, B:14:0x002f, B:17:0x0042, B:19:0x0050, B:20:0x0052, B:22:0x0064, B:24:0x006a, B:26:0x006e, B:28:0x007a, B:29:0x0081, B:31:0x0087, B:33:0x008e, B:34:0x0091, B:37:0x00a3, B:39:0x00b5, B:46:0x0118, B:48:0x011e, B:50:0x0129, B:52:0x012e, B:54:0x0154, B:56:0x00ca, B:59:0x0107, B:61:0x010d, B:63:0x0113, B:64:0x00d8, B:68:0x00f7, B:70:0x00fd, B:72:0x0103, B:73:0x00f1, B:79:0x0098, B:82:0x0037, B:86:0x0029, B:89:0x0161), top: B:8:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0154 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.graphics.Rect r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmx.b(android.graphics.Rect, boolean):void");
    }
}
