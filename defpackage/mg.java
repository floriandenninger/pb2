package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mg {
    public final int A;
    final int B;
    final int C;
    final int D;
    final int E;
    public final boolean F;
    final Handler G;
    public final Context a;
    final ng b;
    public final Window c;
    public CharSequence d;
    public CharSequence e;
    public ListView f;
    public View g;
    Button i;
    public CharSequence j;
    Message k;
    Button l;
    public CharSequence m;
    Message n;
    Button o;
    public CharSequence p;
    NestedScrollView q;
    public Drawable s;
    public ImageView t;
    public TextView u;
    public TextView v;
    public View w;
    ListAdapter x;
    public final int z;
    public boolean h = false;
    public int r = 0;
    int y = -1;
    public final View.OnClickListener H = new lw(this);

    public mg(Context context, ng ngVar, Window window) {
        this.a = context;
        this.b = ngVar;
        this.c = window;
        this.G = new me(ngVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, nx.e, R.attr.alertDialogStyle, 0);
        this.z = obtainStyledAttributes.getResourceId(0, 0);
        this.A = obtainStyledAttributes.getResourceId(2, 0);
        this.B = obtainStyledAttributes.getResourceId(4, 0);
        this.C = obtainStyledAttributes.getResourceId(5, 0);
        this.D = obtainStyledAttributes.getResourceId(7, 0);
        this.E = obtainStyledAttributes.getResourceId(3, 0);
        this.F = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        ngVar.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(true != view.canScrollVertically(-1) ? 4 : 0);
        }
        if (view3 != null) {
            view3.setVisibility(true == view.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (d(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static final void e(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public static final ViewGroup f(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void b(CharSequence charSequence) {
        this.d = charSequence;
        TextView textView = this.u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void c(View view) {
        this.g = view;
        this.h = false;
    }

    public final void g(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.G.obtainMessage(i, onClickListener) : null;
        if (i != -2) {
            this.j = charSequence;
            this.k = obtainMessage;
        } else {
            this.m = charSequence;
            this.n = obtainMessage;
        }
    }
}
