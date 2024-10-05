package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yjr {
    public final View a;
    public final TextView b;
    public final EditText c;
    public aong d;
    private final View e;

    public yjr(View view) {
        this.e = view;
        View findViewById = view.findViewById(R.id.comment_area);
        this.a = findViewById;
        this.c = (EditText) view.findViewById(R.id.comment_input);
        this.b = (TextView) findViewById.findViewById(R.id.comment_privacy_text);
    }
}
