package com.google.android.libraries.youtube.livechat.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.youtube.R;
import defpackage.abnv;
import defpackage.zay;
import defpackage.zev;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class LiveChatBannerContainerLayout extends RelativeLayout {
    public boolean a;
    public abnv b;
    private final zay c;
    private boolean d;
    private boolean e;
    private float f;
    private float g;

    public LiveChatBannerContainerLayout(Context context) {
        this(context, null);
    }

    private final void a(MotionEvent motionEvent) {
        this.c.d(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.c.g(motionEvent);
            this.f = motionEvent.getRawY();
            this.g = motionEvent.getRawY();
            this.d = false;
            this.e = false;
            return;
        }
        if (actionMasked == 1) {
            if (this.b != null) {
                int height = getHeight();
                float rawY = this.f - motionEvent.getRawY();
                if ((this.d && this.c.i(motionEvent, 1) == 2) || rawY >= height * 0.5f) {
                    Context context = getContext();
                    zev.c(context, this, context.getString(R.string.live_chat_banner_dismissed));
                    this.b.a.f();
                    this.c.f();
                    return;
                }
            }
            animate().translationY(0.0f).setDuration(100L);
            this.c.f();
            return;
        }
        if (actionMasked != 2) {
            if (actionMasked != 3) {
                return;
            }
            this.d = false;
            this.c.f();
            return;
        }
        float rawY2 = motionEvent.getRawY() - this.g;
        if (!this.d && Math.abs(rawY2) >= 6.0f) {
            this.d = true;
        }
        if (rawY2 < 0.0f) {
            animate().translationY(getTranslationY() + rawY2).setDuration(0L);
            this.g = motionEvent.getRawY();
        }
        int height2 = getHeight();
        float rawY3 = this.f - motionEvent.getRawY();
        if (!this.d || rawY3 < height2 * 0.2f) {
            return;
        }
        this.e = true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.a) {
            return false;
        }
        a(motionEvent);
        return this.e;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.a) {
            return true;
        }
        a(motionEvent);
        return true;
    }

    public LiveChatBannerContainerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveChatBannerContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = true;
        this.f = 0.0f;
        this.g = 0.0f;
        this.c = new zay(context);
    }
}
