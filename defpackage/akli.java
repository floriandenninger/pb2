package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akli {
    public final View a;
    private final TextView b;
    private final TextView c;
    private final akmg d;

    public akli(Context context, ajjz ajjzVar) {
        ajjzVar.getClass();
        View inflate = View.inflate(context, R.layout.conversation_bottom_sheet_header, null);
        this.a = inflate;
        this.b = (TextView) inflate.findViewById(R.id.bottom_sheet_header_large_text);
        this.c = (TextView) inflate.findViewById(R.id.bottom_sheet_header_medium_text);
        this.d = new akmg(ajjzVar, (ImageView) inflate.findViewById(R.id.bottom_sheet_user_thumbnail));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, avgg avggVar) {
        this.a.setVisibility(0);
        this.b.setVisibility(0);
        this.b.setText(charSequence);
        whu.G(this.c, charSequence2);
        this.d.a(avggVar);
    }
}
