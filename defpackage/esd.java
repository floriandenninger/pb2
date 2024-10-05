package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class esd implements View.OnClickListener {
    final /* synthetic */ esi a;

    public esd(esi esiVar) {
        this.a = esiVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int integer = this.a.c.getInteger(R.integer.channel_header_description_collapsed_lines);
        esi esiVar = this.a;
        TextView textView = esiVar.e;
        if (true != esiVar.m) {
            integer = Integer.MAX_VALUE;
        }
        textView.setMaxLines(integer);
        this.a.m = !r4.m;
    }
}
