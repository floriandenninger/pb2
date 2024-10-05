package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abph {
    public final View a;
    public final TextView b;
    public final ClipDrawable c;
    public final GradientDrawable d;
    public final ImageView e;
    public final ProgressBar f;
    public final Context g;
    public apxf h;
    public boolean i;
    public final abpj j;
    private final TextView k;
    private final GradientDrawable l;

    public abph(final Context context, abpj abpjVar, byte[] bArr) {
        context.getClass();
        this.g = context;
        this.j = abpjVar;
        View inflate = View.inflate(context, R.layout.live_chat_poll_choice_item, null);
        this.a = inflate;
        this.k = (TextView) inflate.findViewById(R.id.choice_label);
        this.b = (TextView) inflate.findViewById(R.id.vote_percentage);
        this.e = (ImageView) inflate.findViewById(R.id.selected_icon);
        this.f = (ProgressBar) inflate.findViewById(R.id.progress_bar);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = context.getResources().getDimensionPixelOffset(R.dimen.live_chat_polls_choice_item_margin_top);
        inflate.setLayoutParams(marginLayoutParams);
        GradientDrawable gradientDrawable = (GradientDrawable) aii.a(context, R.drawable.live_chat_poll_choice_item_background);
        this.d = gradientDrawable;
        gradientDrawable.mutate();
        RippleDrawable rippleDrawable = (RippleDrawable) aii.a(context, R.drawable.live_chat_poll_choice_item_ripple);
        GradientDrawable gradientDrawable2 = (GradientDrawable) aii.a(context, R.drawable.live_chat_poll_choice_item_background);
        this.l = gradientDrawable2;
        gradientDrawable2.mutate();
        gradientDrawable2.setStroke(0, 0);
        ClipDrawable clipDrawable = new ClipDrawable(gradientDrawable2, 8388611, 1);
        this.c = clipDrawable;
        inflate.setBackground(new LayerDrawable(new Drawable[]{gradientDrawable, rippleDrawable, clipDrawable}));
        inflate.setOnClickListener(new View.OnClickListener() { // from class: abpg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                abph abphVar = abph.this;
                Context context2 = context;
                apxf apxfVar = abphVar.h;
                if (apxfVar == null) {
                    return;
                }
                abphVar.i = true;
                abpo abpoVar = abphVar.j.a;
                abpoVar.h.removeCallbacks(abpoVar.g);
                abpoVar.h.postDelayed(abpoVar.g, 2000L);
                Iterator it = abpoVar.f.iterator();
                while (it.hasNext()) {
                    ((abph) it.next()).a.setClickable(false);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", abpoVar.c);
                hashMap.put("live_chat_poll_error_listener_key", abpoVar);
                abpoVar.b.c(apxfVar, hashMap);
                abpoVar.q = true;
                abphVar.e.setVisibility(0);
                abphVar.d.setStroke(context2.getResources().getDimensionPixelOffset(R.dimen.live_chat_polls_selected_choice_stroke_width), aih.f(context2, R.color.yt_white1));
            }
        });
    }

    public final void a(audo audoVar, Boolean bool) {
        if ((audoVar.b & 1) != 0) {
            TextView textView = this.k;
            aqyg aqygVar = audoVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            textView.setText(ajcq.b(aqygVar));
        }
        if (this.h == null && (audoVar.b & 128) != 0) {
            apxf apxfVar = audoVar.i;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            this.h = apxfVar;
        }
        this.i = this.i || audoVar.d;
        this.f.setVisibility(8);
        this.e.setVisibility(8);
        if (bool.booleanValue()) {
            this.a.setClickable(false);
            if ((audoVar.b & 16) != 0) {
                ClipDrawable clipDrawable = this.c;
                ObjectAnimator.ofInt(clipDrawable, "level", clipDrawable.getLevel(), (int) (audoVar.f * 10000.0d)).setDuration(500L).start();
            }
            if ((audoVar.b & 32) == 0) {
                this.b.setVisibility(8);
            } else {
                TextView textView2 = this.b;
                aqyg aqygVar2 = audoVar.g;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
                textView2.setText(ajcq.b(aqygVar2));
                this.b.setVisibility(0);
            }
            if (this.i) {
                this.d.setStroke(this.g.getResources().getDimensionPixelOffset(R.dimen.live_chat_polls_selected_choice_stroke_width), aih.f(this.g, R.color.yt_white1));
            }
            this.l.setColor(aih.d(this.g, R.color.yt_white1_opacity10));
            int d = aih.d(this.g, R.color.yt_white1);
            this.k.setTextColor(d);
            this.b.setTextColor(d);
        }
    }
}
