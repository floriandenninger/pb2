package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class md {
    public final Context a;
    public final LayoutInflater b;
    public Drawable c;
    public CharSequence d;
    public View e;
    public CharSequence f;
    public CharSequence g;
    public DialogInterface.OnClickListener h;
    public CharSequence i;
    public DialogInterface.OnClickListener j;
    public DialogInterface.OnCancelListener l;
    public DialogInterface.OnDismissListener m;
    public DialogInterface.OnKeyListener n;
    public CharSequence[] o;
    public ListAdapter p;
    public DialogInterface.OnClickListener q;
    public View r;
    public boolean[] s;
    public boolean t;
    public boolean u;
    public DialogInterface.OnMultiChoiceClickListener w;
    public int v = -1;
    public boolean k = true;

    public md(Context context) {
        this.a = context;
        this.b = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
