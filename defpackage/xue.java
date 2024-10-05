package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xue extends FrameLayout {
    static final int a = Color.argb(100, 0, 0, 0);
    public final ImageView b;
    public final LinearLayout c;
    public final LinearLayout d;
    public int e;
    public final TextView f;

    public xue(Context context) {
        super(context, null);
        this.e = 0;
        LayoutInflater.from(context).inflate(R.layout.selectable_square_image_view, (ViewGroup) this, true);
        this.b = (ImageView) findViewById(R.id.selectable_image);
        this.c = (LinearLayout) findViewById(R.id.selectable_number);
        this.d = (LinearLayout) findViewById(R.id.selectable_image_border);
        this.f = (TextView) findViewById(R.id.selectable_number_text);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth() + this.e);
        super.onMeasure(i, this.e + i);
    }
}
