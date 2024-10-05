package com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.youtube.R;
import defpackage.aomf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WatchLaterButton extends YouTubeButton {
    public aomf a;
    public b b;
    private final Context c;
    private String d;
    private String e;
    private int f;

    public WatchLaterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = aomf.b;
        this.c = context;
        this.f = 0;
    }

    public final void a(WatchLaterButtonData watchLaterButtonData) {
        this.f = watchLaterButtonData.a();
        this.d = watchLaterButtonData.d();
        this.e = watchLaterButtonData.c();
        this.a = watchLaterButtonData.b();
        setText(this.d);
        setContentDescription(this.e);
        int i = this.f;
        if (i == 0 || i == 1) {
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (i == 2) {
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, getResources().getDrawable(R.drawable.watch_later_button), (Drawable) null, (Drawable) null);
            setTextAppearance(this.c, R.style.WatchLaterButtonLabel);
        } else {
            throw new AssertionError("Watch later button in invalid state.");
        }
        b bVar = this.b;
        if (bVar != null) {
            bVar.L(this.f);
        }
    }
}
