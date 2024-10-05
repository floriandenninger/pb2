package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zln extends RelativeLayout implements View.OnClickListener {
    public final ImageView a;
    public final TextView b;
    public final ajkj c;
    public final zlm d;
    public apgq e;

    public zln(Context context, ajjs ajjsVar) {
        super(context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.audio_swap_category, (ViewGroup) this, true);
        inflate.setWillNotDraw(false);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.audio_swap_category_cover);
        this.a = imageView;
        this.b = (TextView) inflate.findViewById(R.id.audio_swap_category_name);
        imageView.setOnClickListener(this);
        this.c = new ajkj(ajjsVar, imageView);
        this.d = new zlm(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ((zll) getContext()).f(this.e);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
