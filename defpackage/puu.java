package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class puu extends ecq implements puv {
    private final ead a;
    private final eaf b;
    private final eal c;
    private boolean d;

    public puu(Context context, Executor executor, dve dveVar) {
        this();
        this.d = false;
        eai eaiVar = new eai(context, executor, dveVar);
        this.a = eaiVar;
        this.c = new eal(eaiVar);
        this.b = dveVar.f ? null : eaf.p(context);
    }

    @Deprecated
    private final qvf b(qvf qvfVar, qvf qvfVar2, boolean z) {
        Uri b;
        try {
            Uri uri = (Uri) qve.b(qvfVar);
            Context context = (Context) qve.b(qvfVar2);
            if (z) {
                eal ealVar = this.c;
                b = ealVar.a(uri, ealVar.d.e(context));
            } else {
                b = this.c.b(uri, context);
            }
            return qve.a(b);
        } catch (eam unused) {
            return null;
        }
    }

    @Override // defpackage.puv
    @Deprecated
    public final String a(qvf qvfVar, String str) {
        return this.a.c((Context) qve.b(qvfVar), str);
    }

    @Override // defpackage.puv
    @Deprecated
    public final String f(qvf qvfVar, byte[] bArr) {
        String num;
        Context context = (Context) qve.b(qvfVar);
        String f = this.a.f(context, bArr);
        eaf eafVar = this.b;
        if (eafVar == null || !this.d) {
            return f;
        }
        byte[] d = dzi.d(f, eafVar.f(context, bArr));
        if (d != null) {
            num = esv.l(d, true);
        } else {
            num = Integer.toString(7);
        }
        this.d = false;
        return num;
    }

    @Override // defpackage.puv
    public final String g() {
        return "ms";
    }

    @Override // defpackage.puv
    public final void h(qvf qvfVar) {
        this.c.d.h((MotionEvent) qve.b(qvfVar));
    }

    @Override // defpackage.puv
    @Deprecated
    public final void i(String str, String str2) {
        eal ealVar = this.c;
        ealVar.a = str;
        ealVar.b = str2;
    }

    @Deprecated
    public puu(String str, Context context, boolean z) {
        this();
        this.d = false;
        eak p = eak.p(str, context, z);
        this.a = p;
        this.c = new eal(p);
        this.b = z ? null : eaf.p(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if ((r7 instanceof defpackage.eaa) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        if ((r7 instanceof defpackage.eaa) != false) goto L20;
     */
    @Override // defpackage.ecq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean dispatchTransaction(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) {
        /*
            Method dump skipped, instructions count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.puu.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public puu() {
        super("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
    }
}
