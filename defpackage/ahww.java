package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahww extends aivd implements View.OnClickListener, ahwl {
    public static final float[] a = {0.0f, 1.31072E8f};
    public static final int[] b = {-1, -1};
    public static final float[] c = {0.0f, 15.0f, 30.0f, 60.0f, 90.0f, 120.0f};
    public static final int[] d = {-16777216, -151967, -1641064, -10042715, -13465411, -1};
    public TextView A;
    public TextView B;
    public View C;
    public TextView D;
    public ahwk E;
    public View F;
    public TextView G;
    public View e;
    public View f;
    public View g;
    public TextView h;
    public TextView i;
    public TextView j;
    public TextView k;
    public TextView l;
    public TextView m;
    public TextView n;
    public View o;
    public TextView p;
    public TextView q;
    public TextView r;
    public TextView s;
    public zbc t;
    public ImageView u;
    public TextView v;
    public zbc w;
    public ImageView x;
    public TextView y;
    public TextView z;

    public ahww(Context context) {
        super(context);
    }

    public static String e(String str) {
        if (ammx.e(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3);
        sb.append(" [");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.ahwl
    public final void a(FormatStreamModel formatStreamModel) {
        TextView textView = this.q;
        if (textView != null) {
            textView.setText(ahbj.c(formatStreamModel));
        }
    }

    @Override // defpackage.ahwl
    public final void b(FormatStreamModel formatStreamModel) {
        TextView textView = this.n;
        if (textView != null) {
            textView.setText(ahbj.c(formatStreamModel));
        }
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahwl
    public final void d(afkm afkmVar) {
        this.y.setText(afkmVar.toString());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.f) {
            this.E.d();
            this.t.b();
            this.w.b();
        } else if (view == this.g) {
            this.E.rO();
        }
    }
}
