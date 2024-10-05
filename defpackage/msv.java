package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.extensions.reel.common.ReelToReelList;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class msv extends ajpc {
    protected final Context a;
    protected final ajuw b;
    protected final ajjz c;
    protected final aahd d;
    protected final hbb e;
    protected final View f;
    protected final ajjv g;
    private final View h;

    public msv(Context context, ajuw ajuwVar, ajjz ajjzVar, aahd aahdVar, hbb hbbVar, int i, int i2) {
        this.a = context;
        this.b = ajuwVar;
        this.c = ajjzVar;
        this.d = aahdVar;
        this.e = hbbVar;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        this.f = inflate;
        ajju a = ajjv.a();
        a.b(R.drawable.missing_avatar);
        this.g = a.a();
        this.h = i2 != 0 ? inflate.findViewById(i2) : null;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.f;
    }

    @Override // defpackage.ajom
    public void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((ReelItemRendererOuterClass$ReelItemRenderer) obj).p.I();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajpc
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(ajok ajokVar, final ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer) {
        apxf apxfVar;
        int bc;
        final Map e = ajokVar.e();
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 4096) != 0) {
            hbb hbbVar = this.e;
            apxf apxfVar2 = reelItemRendererOuterClass$ReelItemRenderer.m;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            int bl = anaf.bl(reelItemRendererOuterClass$ReelItemRenderer.o);
            boolean z = false;
            if (bl != 0 && bl == 2) {
                z = true;
            }
            hbbVar.c(1, apxfVar2, z);
            hbb hbbVar2 = this.e;
            apxf apxfVar3 = reelItemRendererOuterClass$ReelItemRenderer.m;
            if (apxfVar3 == null) {
                apxfVar3 = apxf.a;
            }
            apxfVar = hbbVar2.a(apxfVar3);
            avgg N = fhe.N(apxfVar, this.c);
            if (N != null) {
                if (e == null) {
                    e = new HashMap();
                } else {
                    e = new HashMap(e);
                }
                e.put("com.google.android.libraries.youtube.innertube.bundle", fhe.M(N));
            }
        } else {
            apxfVar = null;
        }
        ReelToReelList reelToReelList = (ReelToReelList) ajokVar.c("ReelToReelListDecorator");
        if (reelToReelList != null && (apxfVar == null || !apxfVar.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint) || (bc = anaf.bc(((ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).m)) == 0 || bc != 3)) {
            if (e == null) {
                e = new HashMap();
            } else if (!(e instanceof HashMap)) {
                e = new HashMap(e);
            }
            Bundle bundle = (Bundle) yjj.u(e, "com.google.android.libraries.youtube.innertube.bundle", Bundle.class);
            if (bundle == null) {
                bundle = new Bundle();
                e.put("com.google.android.libraries.youtube.innertube.bundle", bundle);
            }
            bundle.putParcelable("ReelToReelListBundleKey", reelToReelList);
        }
        this.e.b(this.f, new Runnable() { // from class: msu
            @Override // java.lang.Runnable
            public final void run() {
                msv msvVar = msv.this;
                ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer2 = reelItemRendererOuterClass$ReelItemRenderer;
                View view = msvVar.f;
                if (view == null || !view.isAttachedToWindow()) {
                    return;
                }
                msvVar.g(reelItemRendererOuterClass$ReelItemRenderer2);
            }
        });
        g(reelItemRendererOuterClass$ReelItemRenderer);
        this.f.setOnClickListener(new View.OnClickListener() { // from class: mst
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                apxf apxfVar4;
                msv msvVar = msv.this;
                ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer2 = reelItemRendererOuterClass$ReelItemRenderer;
                Map map = e;
                aahd aahdVar = msvVar.d;
                if ((reelItemRendererOuterClass$ReelItemRenderer2.b & 4096) != 0) {
                    apxfVar4 = reelItemRendererOuterClass$ReelItemRenderer2.m;
                    if (apxfVar4 == null) {
                        apxfVar4 = apxf.a;
                    }
                } else {
                    apxfVar4 = null;
                }
                aahdVar.c(apxfVar4, map);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        if (r0.f(r5) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.h
            r1 = 0
            if (r0 == 0) goto L34
            if (r5 == 0) goto L34
            int r0 = r5.o
            int r0 = defpackage.anaf.bl(r0)
            r2 = 1
            if (r0 != 0) goto L11
            goto L16
        L11:
            r3 = 2
            if (r0 != r3) goto L16
        L14:
            r1 = 1
            goto L2d
        L16:
            hbb r0 = r4.e
            int r3 = r5.b
            r3 = r3 & 4096(0x1000, float:5.74E-42)
            if (r3 == 0) goto L25
            apxf r5 = r5.m
            if (r5 != 0) goto L26
            apxf r5 = defpackage.apxf.a
            goto L26
        L25:
            r5 = 0
        L26:
            boolean r5 = r0.f(r5)
            if (r5 == 0) goto L2d
            goto L14
        L2d:
            android.view.View r5 = r4.h
            r0 = r1 ^ 1
            r5.setEnabled(r0)
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.msv.g(com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer):boolean");
    }
}
