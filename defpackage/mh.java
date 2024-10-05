package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertController$RecycleListView;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class mh {
    public final md a;
    private final int b;

    public mh(Context context) {
        this(context, mi.a(context, 0));
    }

    public final Context a() {
        return this.a.a;
    }

    public mi b() {
        int i;
        ListAdapter listAdapter;
        mi miVar = new mi(this.a.a, this.b);
        md mdVar = this.a;
        mg mgVar = miVar.a;
        View view = mdVar.e;
        if (view != null) {
            mgVar.w = view;
        } else {
            CharSequence charSequence = mdVar.d;
            if (charSequence != null) {
                mgVar.b(charSequence);
            }
            Drawable drawable = mdVar.c;
            if (drawable != null) {
                mgVar.s = drawable;
                mgVar.r = 0;
                ImageView imageView = mgVar.t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    mgVar.t.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = mdVar.f;
        if (charSequence2 != null) {
            mgVar.e = charSequence2;
            TextView textView = mgVar.v;
            if (textView != null) {
                textView.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = mdVar.g;
        if (charSequence3 != null) {
            mgVar.g(-1, charSequence3, mdVar.h);
        }
        CharSequence charSequence4 = mdVar.i;
        if (charSequence4 != null) {
            mgVar.g(-2, charSequence4, mdVar.j);
        }
        if (mdVar.o != null || mdVar.p != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) mdVar.b.inflate(mgVar.B, (ViewGroup) null);
            if (mdVar.t) {
                listAdapter = new ma(mdVar, mdVar.a, mgVar.C, mdVar.o, alertController$RecycleListView);
            } else {
                if (mdVar.u) {
                    i = mgVar.D;
                } else {
                    i = mgVar.E;
                }
                listAdapter = mdVar.p;
                if (listAdapter == null) {
                    listAdapter = new mf(mdVar.a, i, mdVar.o);
                }
            }
            mgVar.x = listAdapter;
            mgVar.y = mdVar.v;
            if (mdVar.q != null) {
                alertController$RecycleListView.setOnItemClickListener(new mb(mdVar, mgVar));
            } else if (mdVar.w != null) {
                alertController$RecycleListView.setOnItemClickListener(new mc(mdVar, alertController$RecycleListView, mgVar));
            }
            if (mdVar.u) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (mdVar.t) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            mgVar.f = alertController$RecycleListView;
        }
        View view2 = mdVar.r;
        if (view2 != null) {
            mgVar.c(view2);
        }
        miVar.setCancelable(this.a.k);
        if (this.a.k) {
            miVar.setCanceledOnTouchOutside(true);
        }
        miVar.setOnCancelListener(this.a.l);
        miVar.setOnDismissListener(this.a.m);
        DialogInterface.OnKeyListener onKeyListener = this.a.n;
        if (onKeyListener != null) {
            miVar.setOnKeyListener(onKeyListener);
        }
        return miVar;
    }

    public final void c(boolean z) {
        this.a.k = z;
    }

    public final void d(View view) {
        this.a.e = view;
    }

    public final void e(Drawable drawable) {
        this.a.c = drawable;
    }

    public final void f(int i) {
        md mdVar = this.a;
        mdVar.f = mdVar.a.getText(i);
    }

    public final void g(CharSequence charSequence) {
        this.a.f = charSequence;
    }

    public final void h(int i, DialogInterface.OnClickListener onClickListener) {
        md mdVar = this.a;
        mdVar.i = mdVar.a.getText(i);
        this.a.j = onClickListener;
    }

    public final void i(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        md mdVar = this.a;
        mdVar.i = charSequence;
        mdVar.j = onClickListener;
    }

    public final void j(DialogInterface.OnCancelListener onCancelListener) {
        this.a.l = onCancelListener;
    }

    public final void k(int i, DialogInterface.OnClickListener onClickListener) {
        md mdVar = this.a;
        mdVar.g = mdVar.a.getText(i);
        this.a.h = onClickListener;
    }

    public final void l(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        md mdVar = this.a;
        mdVar.g = charSequence;
        mdVar.h = onClickListener;
    }

    public final void m(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
        md mdVar = this.a;
        mdVar.p = listAdapter;
        mdVar.q = onClickListener;
        mdVar.v = i;
        mdVar.u = true;
    }

    public final void n(int i) {
        md mdVar = this.a;
        mdVar.d = mdVar.a.getText(i);
    }

    public final void o(CharSequence charSequence) {
        this.a.d = charSequence;
    }

    public final void p(View view) {
        this.a.r = view;
    }

    public final void q() {
        b().show();
    }

    public mh(Context context, int i) {
        this.a = new md(new ContextThemeWrapper(context, mi.a(context, i)));
        this.b = i;
    }
}
