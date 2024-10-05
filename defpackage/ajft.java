package defpackage;

import android.content.Context;
import com.google.android.libraries.elements.interfaces.ResourceLoader;
import com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajft implements syq {
    private final syd a;
    private volatile ResourceLoader b;
    private final axpg c;
    private final ault d;
    private final boolean e;
    private final boolean f;
    private final AtomicBoolean g = new AtomicBoolean(false);
    private final Context h;
    private final ResourceLoaderDelegate i;
    private final axpg j;

    public ajft(syd sydVar, aaea aaeaVar, aadw aadwVar, axpg axpgVar, Context context, ResourceLoaderDelegate resourceLoaderDelegate, axpg axpgVar2, ammv ammvVar) {
        boolean z;
        this.a = sydVar;
        this.c = axpgVar;
        aulu auluVar = aadwVar.b().l;
        ault aultVar = (auluVar == null ? aulu.a : auluVar).k;
        aultVar = aultVar == null ? ault.a : aultVar;
        this.d = aultVar;
        this.h = context;
        if (aultVar.d) {
            aulw aulwVar = aaeaVar.a().k;
            if (!(aulwVar == null ? aulw.a : aulwVar).c) {
                z = true;
                this.f = z;
                this.i = resourceLoaderDelegate;
                this.j = axpgVar2;
                this.e = ((Boolean) ammvVar.e(false)).booleanValue();
            }
        }
        z = false;
        this.f = z;
        this.i = resourceLoaderDelegate;
        this.j = axpgVar2;
        this.e = ((Boolean) ammvVar.e(false)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0154 A[Catch: all -> 0x01e8, TryCatch #0 {, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x0019, B:11:0x001f, B:13:0x002e, B:15:0x0036, B:16:0x003e, B:18:0x0042, B:19:0x0048, B:21:0x004c, B:22:0x0052, B:24:0x0056, B:25:0x005b, B:27:0x005f, B:28:0x0064, B:30:0x0068, B:32:0x0075, B:34:0x0079, B:36:0x011b, B:37:0x014c, B:39:0x0154, B:41:0x017f, B:42:0x0185, B:44:0x01be, B:46:0x01c4, B:47:0x01c7, B:48:0x0127, B:50:0x013b, B:51:0x0145, B:53:0x0140, B:55:0x006f, B:61:0x01ce, B:62:0x01d5, B:64:0x01d6, B:65:0x01dd, B:66:0x01de, B:67:0x01e5, B:68:0x01e6), top: B:4:0x0007 }] */
    @Override // defpackage.syq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.libraries.elements.interfaces.ResourceLoader a() {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajft.a():com.google.android.libraries.elements.interfaces.ResourceLoader");
    }

    @Override // defpackage.syq
    public final boolean b() {
        return this.f;
    }

    @Override // defpackage.syq
    public final boolean c() {
        return this.g.get();
    }
}
