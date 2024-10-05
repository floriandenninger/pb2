package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class igk extends iin {
    public final View t;
    public final boolean u;
    public final TextView v;

    public igk(ViewGroup viewGroup, boolean z, boolean z2) {
        super((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(true != z ? R.layout.reel_player_end_page : R.layout.reel_player_end_page_vert, viewGroup, false));
        this.t = this.a.findViewById(R.id.reel_end_page_spinner_vertical);
        TextView textView = (TextView) this.a.findViewById(R.id.reel_end_page_label_vertical);
        this.v = textView;
        this.u = z2;
        if (textView == null || !z2) {
            return;
        }
        textView.setText("");
    }

    @Override // defpackage.iin
    public final ihm E() {
        return null;
    }

    @Override // defpackage.iin
    public final void F() {
    }
}
