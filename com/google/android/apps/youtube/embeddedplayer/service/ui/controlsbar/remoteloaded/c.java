package com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.youtube.R;
import defpackage.ahvb;
import defpackage.aii;
import defpackage.alvw;
import defpackage.hgs;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class c extends ViewGroup implements View.OnClickListener, Animation.AnimationListener {
    public ImageButton a;
    public ImageButton b;
    public TextView c;
    public AnimationSet d;
    public AnimationSet e;
    public VideoQuality[] f;
    public int g;
    public ahvb h;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.legacy.a i;
    private ImageButton j;
    private AlertDialog.Builder k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private c(Context context, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.legacy.a aVar, byte[] bArr) {
        super(context);
        context.getClass();
        this.i = aVar;
    }

    public static c a(Context context, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.legacy.a aVar) {
        String str;
        c cVar = new c(context, aVar, null);
        Context context2 = cVar.getContext();
        int i = (int) (cVar.getResources().getDisplayMetrics().density * 10.0f);
        cVar.a = new ImageButton(context2);
        cVar.b = new ImageButton(context2);
        cVar.j = new ImageButton(context2);
        cVar.c = new TextView(context2);
        cVar.k = new AlertDialog.Builder(context2).setTitle(context2.getString(R.string.quality_title)).setNegativeButton(R.string.cancel, new hgs(8));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(View.SELECTED_STATE_SET, aii.a(context2, R.drawable.api_btn_hq_on));
        stateListDrawable.addState(View.EMPTY_STATE_SET, aii.a(context2, R.drawable.api_btn_hq_off));
        StateListDrawable stateListDrawable2 = new StateListDrawable();
        stateListDrawable2.addState(View.SELECTED_STATE_SET, aii.a(context2, R.drawable.api_btn_hd_on));
        stateListDrawable2.addState(View.EMPTY_STATE_SET, aii.a(context2, R.drawable.api_btn_hd_off));
        cVar.a.setImageDrawable(stateListDrawable);
        cVar.a.setBackground(null);
        cVar.a.setPadding(i, i, 0, i);
        cVar.a.setContentDescription(context2.getText(R.string.accessibility_quality));
        cVar.a.setOnClickListener(cVar);
        cVar.a.setVisibility(8);
        StateListDrawable stateListDrawable3 = new StateListDrawable();
        stateListDrawable3.addState(View.SELECTED_STATE_SET, aii.a(context2, R.drawable.api_btn_cc_on));
        stateListDrawable3.addState(View.EMPTY_STATE_SET, aii.a(context2, R.drawable.api_btn_cc_off));
        cVar.b.setImageDrawable(stateListDrawable3);
        cVar.b.setBackground(null);
        cVar.b.setPadding(i, i, 0, i);
        cVar.b.setContentDescription(context2.getText(R.string.accessibility_closed_captions));
        cVar.b.setOnClickListener(cVar);
        cVar.b.setVisibility(8);
        cVar.j.setImageResource(R.drawable.api_play_on_you_tube);
        cVar.j.setBackground(null);
        cVar.j.setPadding(i, i, i, i);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/watch?v="));
        PackageManager packageManager = context2.getPackageManager();
        if (alvw.c(packageManager)) {
            str = "com.google.android.youtube.tv";
        } else {
            str = alvw.d(packageManager) ? "com.google.android.youtube.googletv" : "com.google.android.youtube";
        }
        List<ResolveInfo> queryIntentActivities = context2.getPackageManager().queryIntentActivities(intent.setPackage(str), 65536);
        if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
            cVar.j.setContentDescription(context2.getText(R.string.accessibility_play_in_youtube));
            cVar.j.setOnClickListener(cVar);
        }
        cVar.c.setSingleLine();
        cVar.c.setTextSize(1, 18.0f);
        cVar.c.setEllipsize(TextUtils.TruncateAt.END);
        cVar.c.setTextColor(-1);
        cVar.c.setGravity(17);
        cVar.c.setPadding(i + i, i, i, i);
        AnimationSet animationSet = new AnimationSet(true);
        cVar.d = animationSet;
        animationSet.setInterpolator(new DecelerateInterpolator());
        cVar.d.setDuration(200L);
        cVar.d.addAnimation(new AlphaAnimation(0.0f, 1.0f));
        cVar.d.addAnimation(new TranslateAnimation(1, 0.4f, 1, 0.0f, 1, 0.0f, 1, 0.0f));
        cVar.d.setAnimationListener(cVar);
        AnimationSet animationSet2 = new AnimationSet(true);
        cVar.e = animationSet2;
        animationSet2.setInterpolator(new AccelerateInterpolator());
        cVar.e.setDuration(200L);
        cVar.e.addAnimation(new AlphaAnimation(1.0f, 0.0f));
        cVar.e.addAnimation(new TranslateAnimation(1, 0.0f, 1, 0.4f, 1, 0.0f, 1, 0.0f));
        cVar.e.setAnimationListener(cVar);
        cVar.addView(cVar.a);
        cVar.addView(cVar.b);
        cVar.addView(cVar.c);
        cVar.addView(cVar.j);
        cVar.setBackgroundResource(R.drawable.api_player_menu_bar);
        super.setVisibility(4);
        return cVar;
    }

    private static final int b(View view, int i, int i2) {
        int measuredHeight = (i2 - view.getMeasuredHeight()) / 2;
        view.layout(i, measuredHeight, view.getMeasuredWidth() + i, view.getMeasuredHeight() + measuredHeight);
        return view.getMeasuredWidth();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (animation == this.e) {
            setVisibility(4);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i4 - i2;
        int i6 = i3 - i;
        int b = this.a.getVisibility() != 8 ? b(this.a, 0, i5) : 0;
        if (this.b.getVisibility() != 8) {
            b += b(this.b, b, i5);
        }
        if (this.c.getVisibility() != 8) {
            b(this.c, b, i5);
        }
        ImageButton imageButton = this.j;
        b(imageButton, i6 - imageButton.getMeasuredWidth(), i5);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(0, i);
        int defaultSize2 = getDefaultSize(0, i2);
        setMeasuredDimension(defaultSize, defaultSize2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(defaultSize2, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        this.j.measure(View.MeasureSpec.makeMeasureSpec(defaultSize, CellularSignalStrengthError.ERROR_NOT_SUPPORTED), makeMeasureSpec);
        int measuredWidth = defaultSize - this.j.getMeasuredWidth();
        if (this.a.getVisibility() != 8) {
            this.a.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, CellularSignalStrengthError.ERROR_NOT_SUPPORTED), makeMeasureSpec);
            measuredWidth -= this.a.getMeasuredWidth();
        }
        if (this.b.getVisibility() != 8) {
            this.b.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, CellularSignalStrengthError.ERROR_NOT_SUPPORTED), makeMeasureSpec);
            measuredWidth -= this.b.getMeasuredWidth();
        }
        if (this.c.getVisibility() != 8) {
            this.c.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), makeMeasureSpec);
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.legacy.a aVar = this.i;
        boolean z = i == 0;
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.legacy.b bVar = aVar.a;
        bVar.l = z;
        if (z) {
            bVar.pA();
            aVar.a.A();
        } else {
            bVar.B();
        }
        aVar.a.E();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VideoQuality[] videoQualityArr;
        int length;
        if (view != this.a || (videoQualityArr = this.f) == null || (length = videoQualityArr.length) <= 0) {
            if (view == this.b) {
                this.h.c();
                this.i.a();
                return;
            }
            return;
        }
        AlertDialog.Builder builder = this.k;
        String[] strArr = new String[length];
        for (int i = 0; i < videoQualityArr.length; i++) {
            strArr[i] = videoQualityArr[i].b;
        }
        builder.setSingleChoiceItems(strArr, this.g, new b(this, this.f)).create().show();
        this.i.a();
    }
}
