package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adar extends wv {
    public final TextView t;
    public final View u;

    public adar(View view, View.OnClickListener onClickListener) {
        super(view);
        this.t = (TextView) view.findViewById(R.id.name);
        View findViewById = view.findViewById(R.id.delete);
        this.u = findViewById;
        findViewById.setOnClickListener(onClickListener);
    }
}
