package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class glw {
    public final FrameLayout c;
    public final RelativeLayout d;
    public final ImageView e;
    public final TextView f;
    public gou g;
    final /* synthetic */ glx h;

    public glw(glx glxVar, View view) {
        this.h = glxVar;
        this.c = (FrameLayout) view.findViewById(R.id.item_container);
        this.d = (RelativeLayout) view.findViewById(R.id.inner_item_container);
        this.e = (ImageView) view.findViewById(R.id.icon);
        this.f = (TextView) view.findViewById(R.id.label);
    }

    public void a(int i) {
        gou gouVar = (gou) this.h.a.get(i);
        gouVar.getClass();
        this.g = gouVar;
        if (this.e != null) {
            int ordinal = gouVar.ordinal();
            if (ordinal == 0) {
                this.e.setImageResource(R.drawable.yt_outline_earth_white_24);
            } else if (ordinal == 1) {
                this.e.setImageResource(R.drawable.yt_outline_link_white_24);
            } else if (ordinal == 2) {
                this.e.setImageResource(R.drawable.yt_outline_lock_white_24);
            }
        }
        TextView textView = this.f;
        if (textView != null) {
            textView.setText(this.h.b.getContext().getResources().getText(gouVar.d));
        }
    }
}
