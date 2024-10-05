package com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.remoteloaded;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.d;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.youtube.R;
import defpackage.aomf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SubscribeButton extends YouTubeButton {
    public int a;
    public String b;
    public String c;
    public aomf d;
    public int e;
    public d f;

    public SubscribeButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = aomf.b;
        this.e = 0;
        this.a = 0;
    }

    public final void a() {
        setText(this.b);
        setContentDescription(this.c);
        int i = this.e;
        if (i == 0 || i == 1) {
            setBackground(null);
            return;
        }
        if (i != 2) {
            if (i == 3) {
                setBackground(getResources().getDrawable(R.drawable.subscribe_button_subscribed_background));
                setTextColor(getResources().getColor(R.color.subscribe_button_subscribed_text));
                return;
            }
            throw new AssertionError("Subscribe button in invalid state.");
        }
        int i2 = this.a;
        if (i2 == 0) {
            setBackground(getResources().getDrawable(R.drawable.subscribe_button_unsubscribed_background));
        } else {
            setBackgroundColor(i2);
        }
        setTextColor(getResources().getColor(R.color.subscribe_button_unsubscribed_text));
    }
}
