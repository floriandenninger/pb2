package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mon implements ajom {
    public final View a;
    public final TextView b;
    public mom c;
    private final View d;

    public mon(Context context) {
        View inflate = View.inflate(context, R.layout.expandable_message_item, null);
        this.d = inflate;
        this.b = (TextView) inflate.findViewById(R.id.message_text);
        View findViewById = inflate.findViewById(R.id.more);
        this.a = findViewById;
        findViewById.setOnClickListener(new mol(this));
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        CharSequence charSequence;
        mom momVar = (mom) obj;
        this.c = momVar;
        this.a.setVisibility(true != momVar.c ? 0 : 8);
        TextView textView = this.b;
        if (!momVar.c) {
            charSequence = momVar.a;
        } else {
            charSequence = momVar.b;
        }
        whu.G(textView, charSequence);
    }
}
