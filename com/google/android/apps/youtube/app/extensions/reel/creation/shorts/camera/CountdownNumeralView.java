package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextSwitcher;
import android.widget.ViewSwitcher;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import defpackage.ajct;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CountdownNumeralView extends TextSwitcher {
    public int a;
    public boolean b;

    public CountdownNumeralView(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        final ajct d = ajct.d(0);
        setInAnimation(getContext(), R.anim.countdown_numeral_in);
        setFactory(new ViewSwitcher.ViewFactory() { // from class: hdb
            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                Context context2 = context;
                ajct ajctVar = d;
                YouTubeTextView youTubeTextView = new YouTubeTextView(context2);
                youTubeTextView.setGravity(17);
                youTubeTextView.setTextSize(context2.getResources().getDimensionPixelSize(R.dimen.shorts_countdown_numeral_text_size));
                youTubeTextView.setTextColor(wbs.W(context2, R.attr.ytStaticWhite).orElse(context2.getResources().getColor(R.color.yt_white1)));
                youTubeTextView.setTypeface(ajctVar.a(context2));
                return youTubeTextView;
            }
        });
        this.b = false;
    }

    public final void a() {
        setText("");
        setVisibility(4);
        this.b = false;
    }
}
