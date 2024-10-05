package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xne implements aawb {
    public final aahd a;
    public xoz b;
    public bv c;
    public aawe d;
    private final WeakReference e;
    private final akbz f;
    private final xzz g;
    private final Activity h;

    public xne(xng xngVar, Activity activity, aahd aahdVar, akbz akbzVar, xzz xzzVar) {
        this.e = new WeakReference(xngVar);
        this.h = activity;
        this.a = aahdVar;
        this.f = akbzVar;
        this.g = xzzVar;
    }

    private final acra g() {
        ComponentCallbacks2 componentCallbacks2 = this.h;
        if (componentCallbacks2 instanceof acqz) {
            return ((acqz) componentCallbacks2).mM();
        }
        return null;
    }

    @Override // defpackage.aawb
    public final aawe a() {
        return this.d;
    }

    @Override // defpackage.aawb
    public final Long b() {
        return null;
    }

    @Override // defpackage.aawb
    public final String c() {
        aawe aaweVar = this.d;
        if (aaweVar == null) {
            return null;
        }
        return aaweVar.a;
    }

    @Override // defpackage.aawb
    public final void d() {
        this.c.kv();
    }

    @Override // defpackage.aawb
    public final void e(cnq cnqVar) {
        xng xngVar = (xng) this.e.get();
        if (xngVar == null) {
            return;
        }
        whu.K(xngVar.a, R.string.error_post_failed, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d7, code lost:
    
        if (r4.k != false) goto L86;
     */
    @Override // defpackage.aawb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.armb r8) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xne.f(armb):void");
    }
}
