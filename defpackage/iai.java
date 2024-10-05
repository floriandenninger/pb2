package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.StickerCatalogRendererOuterClass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iai extends vw implements iag {
    public static final Object d = new Object();
    private final HandlerThread A;
    private final acqz B;
    public final Handler e;
    public final hzu h;
    public final ibe i;
    public final hyh j;
    public final ibq k;
    public final ibw l;
    public final ico m;
    public final icg n;
    public final ick o;
    public final ica p;
    public final icn q;
    public ce r;
    public ian s;
    public boolean u;
    public hyq v;
    public final ico w;
    public final agcm x;
    private final Context y;
    private final int z;
    public final List f = new ArrayList();
    public final Set g = Collections.synchronizedSet(new HashSet());
    public int t = 4;

    public iai(Context context, hzu hzuVar, ibe ibeVar, hyh hyhVar, ibw ibwVar, ico icoVar, ico icoVar2, icg icgVar, ick ickVar, acqz acqzVar, ica icaVar, agcm agcmVar, final icn icnVar, ibq ibqVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.y = context;
        this.h = hzuVar;
        this.i = ibeVar;
        this.j = hyhVar;
        this.k = ibqVar;
        this.l = ibwVar;
        this.m = icoVar;
        this.w = icoVar2;
        this.n = icgVar;
        this.o = ickVar;
        this.B = acqzVar;
        this.x = agcmVar;
        this.p = icaVar;
        this.q = icnVar;
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.z = point.x;
        this.e = new Handler(context.getMainLooper());
        HandlerThread handlerThread = new HandlerThread("iai");
        this.A = handlerThread;
        handlerThread.start();
        new Handler(handlerThread.getLooper());
        icnVar.c.execute(new Runnable() { // from class: icl
            @Override // java.lang.Runnable
            public final void run() {
                icn icnVar2 = icn.this;
                yjk.e();
                icnVar2.a = ammv.j(new zom(icnVar2.b, 1, zoz.c, zoz.g, icnVar2.d));
            }
        });
    }

    @Override // defpackage.iag
    public final acra a() {
        return this.B.mM();
    }

    @Override // defpackage.vw
    public final int b() {
        return this.f.size();
    }

    @Override // defpackage.vw
    public final int c(int i) {
        if (!((aulq) this.f.get(i)).pY(StickerCatalogRendererOuterClass.dynamicStickerRenderer)) {
            return CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        }
        int ai = aobq.ai(((auya) ((aulq) this.f.get(i)).pX(StickerCatalogRendererOuterClass.dynamicStickerRenderer)).c);
        if (ai == 0) {
            ai = 1;
        }
        return ai - 1;
    }

    @Override // defpackage.iag
    public final void d(Runnable runnable) {
        this.e.postAtTime(runnable, d, SystemClock.uptimeMillis());
    }

    @Override // defpackage.iag
    public final void e(Uri uri) {
        ian ianVar;
        this.g.remove(uri);
        if (!this.g.isEmpty() || (ianVar = this.s) == null) {
            return;
        }
        ianVar.aL(false);
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ wv f(ViewGroup viewGroup, int i) {
        View inflate;
        wv hyoVar;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        int i2 = this.z / this.t;
        if (i == Integer.MIN_VALUE) {
            inflate = from.inflate(R.layout.sticker_cell, viewGroup, false);
            inflate.getLayoutParams().height = i2;
            inflate.getLayoutParams().width = i2;
            hyoVar = new hyo(inflate, this, this.p, this.r);
        } else if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 7 || i == 8 || i == 9) {
            inflate = from.inflate(R.layout.sticker_catalog_dynamic_sticker_container, viewGroup, false);
            inflate.getLayoutParams().height = i2;
            inflate.getLayoutParams().width = i2;
            hyoVar = new hzg(inflate, this, this.p, this.r);
        } else {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Unexpected view type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i == 3 && Build.VERSION.SDK_INT == 28) {
            inflate.setLayerType(1, null);
        }
        return hyoVar;
    }

    @Override // defpackage.iag
    public final void g(aulq aulqVar) {
        ammv G = etx.G(aulqVar);
        if (G.h()) {
            e((Uri) G.c());
        }
        int indexOf = this.f.indexOf(aulqVar);
        this.f.remove(aulqVar);
        n(indexOf);
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ void o(wv wvVar, int i) {
        iah iahVar = (iah) wvVar;
        iahVar.x = (aulq) this.f.get(i);
        iahVar.E();
    }

    @Override // defpackage.vw
    public final /* synthetic */ void p(wv wvVar) {
        ((iah) wvVar).F();
    }
}
