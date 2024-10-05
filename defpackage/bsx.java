package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bsx extends wv {
    public final Drawable t;
    public ColorStateList u;
    public boolean v;
    public boolean w;
    private final SparseArray x;

    public bsx(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.x = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        sparseArray.put(com.google.android.youtube.R.id.icon_frame, view.findViewById(com.google.android.youtube.R.id.icon_frame));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        this.t = view.getBackground();
        if (textView != null) {
            this.u = textView.getTextColors();
        }
    }

    public final View E(int i) {
        View view = (View) this.x.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = this.a.findViewById(i);
        if (findViewById != null) {
            this.x.put(i, findViewById);
        }
        return findViewById;
    }
}
