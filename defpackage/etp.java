package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class etp implements ajom {
    public final LinearLayout a;
    private final Context b;
    private final aahd c;
    private final ajut d;
    private final YouTubeTextView e;
    private final ImageView f;

    public etp(Context context, aahd aahdVar, ajut ajutVar) {
        this.b = context;
        this.c = aahdVar;
        this.d = ajutVar;
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, (int) context.getResources().getDimension(R.dimen.channel_edit_info_top_margin), 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        YouTubeTextView youTubeTextView = new YouTubeTextView(context);
        this.e = youTubeTextView;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(context.getResources().getDimensionPixelSize(R.dimen.channel_edit_info_msg_margin), 0, 0, 0);
        youTubeTextView.setLayoutParams(layoutParams2);
        youTubeTextView.setTypeface(ajct.ROBOTO_REGULAR.a(context));
        youTubeTextView.setTextSize(0, context.getResources().getDimension(R.dimen.extra_small_font_size));
        youTubeTextView.d(true);
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.channel_edit_info_icon_margin_top);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.channel_edit_info_icon_margin_left);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(context.getResources().getDimensionPixelSize(R.dimen.channel_edit_info_icon_size), context.getResources().getDimensionPixelSize(R.dimen.channel_edit_info_icon_size));
        layoutParams3.setMargins(dimensionPixelSize2, dimensionPixelSize, 0, 0);
        imageView.setLayoutParams(layoutParams3);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        linearLayout.addView(imageView);
        linearLayout.addView(youTubeTextView);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    public final void d(aprx aprxVar) {
        YouTubeTextView youTubeTextView = this.e;
        aqyg aqygVar = aprxVar.d;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        youTubeTextView.setText(aahk.a(aqygVar, this.c, false));
        Resources resources = this.b.getResources();
        ajut ajutVar = this.d;
        arfs arfsVar = aprxVar.c;
        if (arfsVar == null) {
            arfsVar = arfs.a;
        }
        arfr b = arfr.b(arfsVar.c);
        if (b == null) {
            b = arfr.UNKNOWN;
        }
        Drawable drawable = resources.getDrawable(ajutVar.a(b));
        ImageView imageView = this.f;
        zau.e(drawable, this.e.getCurrentTextColor(), PorterDuff.Mode.SRC_IN);
        imageView.setImageDrawable(drawable);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        d((aprx) obj);
    }
}
