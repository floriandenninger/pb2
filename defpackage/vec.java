package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vec implements vcv {
    private final /* synthetic */ int a;

    public vec(int i) {
        this.a = i;
    }

    public static vec b() {
        return new vec(6);
    }

    private static void c(vcw vcwVar, Uri uri, List list) {
        try {
            if (vcwVar.i(uri)) {
                Iterator it = vcwVar.b(uri).iterator();
                while (it.hasNext()) {
                    c(vcwVar, (Uri) it.next(), list);
                }
                vcwVar.e(uri);
                return;
            }
            vcwVar.f(uri);
        } catch (IOException e) {
            list.add(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cd, code lost:
    
        if (r0 != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00cf, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e3, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e0, code lost:
    
        if (r0 != 0) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vcv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object a(defpackage.vcu r10) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vec.a(vcu):java.lang.Object");
    }
}
