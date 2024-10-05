package com.google.android.apps.youtube.app.common.tvfilm;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import defpackage.aivc;
import defpackage.any;
import defpackage.aok;
import defpackage.fav;
import defpackage.fgp;
import defpackage.fgq;
import defpackage.fhg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RentalActivationOverlay extends aivc implements fgp, any {
    public YouTubeTextView a;
    private final fgq b;

    public RentalActivationOverlay(Context context, fgq fgqVar) {
        super(context);
        this.b = fgqVar;
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public final void g() {
        YouTubeTextView youTubeTextView = this.a;
        if (youTubeTextView == null) {
            return;
        }
        youTubeTextView.setText((CharSequence) null);
        h();
    }

    public final void h() {
        YouTubeTextView youTubeTextView;
        if (this.b.g() == fhg.WATCH_WHILE_MINIMIZED || (youTubeTextView = this.a) == null || youTubeTextView.getText() == null) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
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

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        this.b.j(this);
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        h();
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.b.i(this);
    }
}
