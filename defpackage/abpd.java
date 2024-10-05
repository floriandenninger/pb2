package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abpd {
    public final abjt a;
    public boolean b;
    public final View c;
    public final TextView d;
    public final TextView e;

    public abpd(abjt abjtVar, View view) {
        this.a = abjtVar;
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.empty_state_message_stub);
        viewStub.setLayoutResource(abjtVar.a(5));
        viewStub.inflate();
        View findViewById = view.findViewById(R.id.empty_state_message);
        this.c = findViewById;
        this.d = (TextView) findViewById.findViewById(R.id.message);
        this.e = (TextView) findViewById.findViewById(R.id.sub_message);
    }

    public final void a(boolean z) {
        View view = this.c;
        int i = 8;
        if (this.b && z) {
            i = 0;
        }
        view.setVisibility(i);
    }
}
