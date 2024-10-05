package com.google.android.apps.youtube.app.player.overlay;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.ahef;
import defpackage.ahus;
import defpackage.ahux;
import defpackage.aioa;
import defpackage.aioc;
import defpackage.any;
import defpackage.aok;
import defpackage.aypg;
import defpackage.aypn;
import defpackage.aypp;
import defpackage.ayqw;
import defpackage.ayqx;
import defpackage.fye;
import defpackage.kfe;
import defpackage.kmj;
import defpackage.ypd;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NoSoundMemoOverlay extends ahus implements aioa, any, ypd {
    private static final long a = TimeUnit.SECONDS.toMillis(1);
    private final Context b;
    private final ayqw c;
    private AnimatorSet d;
    private Spanned e;
    private TextView f;

    public NoSoundMemoOverlay(Context context) {
        super(context);
        this.c = new ayqw();
        this.b = context;
    }

    private static ObjectAnimator m(TextView textView, float f) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, "alpha", f);
        ofFloat.setInterpolator(new fye());
        ofFloat.setDuration(300L);
        return ofFloat;
    }

    private final void n(Spanned spanned) {
        if (!TextUtils.equals(this.e, spanned)) {
            this.e = spanned;
            Y();
        }
        if (o(this.e)) {
            kX();
        } else {
            kV();
        }
    }

    private static boolean o(Spanned spanned) {
        return !TextUtils.isEmpty(spanned);
    }

    @Override // defpackage.ahuy
    public final View a(Context context) {
        FrameLayout frameLayout = (FrameLayout) View.inflate(context, R.layout.no_sound_overlay, null);
        TextView textView = (TextView) frameLayout.findViewById(R.id.message_view);
        this.f = textView;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(m(textView, 0.0f)).after(a).after(m(textView, 1.0f));
        this.d = animatorSet;
        return frameLayout;
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahuy
    public final void d(Context context, View view) {
        this.f.setText(this.e);
        k();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.ahef r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L6c
            aign r1 = r3.c()
            if (r1 == 0) goto L6c
            aign r1 = r3.c()
            boolean r1 = r1.h()
            if (r1 == 0) goto L14
            goto L6c
        L14:
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r3 = r3.b()
            if (r3 == 0) goto L1d
            aryr r3 = r3.a
            goto L1e
        L1d:
            r3 = r0
        L1e:
            if (r3 == 0) goto L39
            aryl r1 = r3.C
            if (r1 != 0) goto L26
            aryl r1 = defpackage.aryl.a
        L26:
            int r1 = r1.b
            r1 = r1 & 1
            if (r1 == 0) goto L39
            aryl r3 = r3.C
            if (r3 != 0) goto L32
            aryl r3 = defpackage.aryl.a
        L32:
            atyk r3 = r3.c
            if (r3 != 0) goto L3a
            atyk r3 = defpackage.atyk.a
            goto L3a
        L39:
            r3 = r0
        L3a:
            if (r3 == 0) goto L55
            atym r1 = r3.e
            if (r1 != 0) goto L42
            atym r1 = defpackage.atym.a
        L42:
            int r1 = r1.b
            r1 = r1 & 1
            if (r1 == 0) goto L55
            atym r3 = r3.e
            if (r3 != 0) goto L4e
            atym r3 = defpackage.atym.a
        L4e:
            atyl r3 = r3.c
            if (r3 != 0) goto L56
            atyl r3 = defpackage.atyl.a
            goto L56
        L55:
            r3 = r0
        L56:
            if (r3 == 0) goto L68
            int r1 = r3.b
            r1 = r1 & 1
            if (r1 == 0) goto L64
            aqyg r0 = r3.c
            if (r0 != 0) goto L64
            aqyg r0 = defpackage.aqyg.a
        L64:
            android.text.Spanned r0 = defpackage.ajcq.b(r0)
        L68:
            r2.n(r0)
            return
        L6c:
            r2.n(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.player.overlay.NoSoundMemoOverlay.g(ahef):void");
    }

    public final void k() {
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null || animatorSet.isRunning() || !nt()) {
            return;
        }
        this.d.start();
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return new ayqx[]{aiocVar.G().b.Y(new kmj(this, 1), kfe.k)};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ahus
    public final ahux kU(Context context) {
        ahux kU = super.kU(context);
        kU.a = 0;
        kU.b = 0;
        return kU;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahef.class};
        }
        if (i == 0) {
            g((ahef) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.ahuy
    public final boolean nt() {
        return o(this.e);
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        this.c.c();
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.c.c();
        ayqw ayqwVar = this.c;
        final Context context = this.b;
        ayqwVar.d(aypn.k(new aypp() { // from class: kmk
            @Override // defpackage.aypp
            public final void a(aypo aypoVar) {
                Context context2 = context;
                final ContentResolver contentResolver = context2.getContentResolver();
                final kmm kmmVar = new kmm(context2, aypoVar);
                contentResolver.registerContentObserver(kmm.a, true, kmmVar);
                aypoVar.b(new ayrr() { // from class: kml
                    @Override // defpackage.ayrr
                    public final void a() {
                        contentResolver.unregisterContentObserver(kmmVar);
                    }
                });
            }
        }, aypg.LATEST).X(new kmj(this, 0)));
    }
}
