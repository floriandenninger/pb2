package com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.k;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a extends Dialog {
    public final ViewGroup a;
    private final View b;
    private ViewGroup c;
    private final k d;

    public a(Context context, k kVar, View view, byte[] bArr) {
        super(context, R.style.Theme.Black.NoTitleBar.Fullscreen);
        this.d = kVar;
        this.b = view;
        this.a = new FrameLayout(context);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((com.google.android.apps.youtube.embeddedplayer.service.jar.b) this.d.a.F).a.onBackPressed();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.d.a.aw(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.d.a.ax(i, keyEvent) || super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Dialog
    protected final void onStart() {
        super.onStart();
        ViewGroup viewGroup = (ViewGroup) this.b.getParent();
        this.c = viewGroup;
        viewGroup.removeView(this.b);
        this.a.addView(this.b, -1, -1);
        this.d.c();
    }

    @Override // android.app.Dialog
    protected final void onStop() {
        this.a.removeView(this.b);
        this.c.addView(this.b);
        this.d.c();
        super.onStop();
    }
}
