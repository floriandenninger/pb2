package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adbh {
    public final View a;
    public final TextView b;
    public final View c;
    final TextView d;
    public final View e;

    public adbh(View view, View.OnClickListener onClickListener) {
        this.a = view;
        this.b = (TextView) view.findViewById(R.id.title);
        this.c = view.findViewById(R.id.subtitle);
        TextView textView = (TextView) view.findViewById(R.id.action);
        this.d = textView;
        textView.setOnClickListener(onClickListener);
        this.e = view.findViewById(R.id.progress);
    }
}
