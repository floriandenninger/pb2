package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aaam extends wv {
    final TextView A;
    final ImageView t;
    final TextView u;
    final View v;
    final TextView w;
    final TextView x;
    final TextView y;
    final TextView z;

    public aaam(View view) {
        super(view);
        this.t = (ImageView) view.findViewById(R.id.image);
        this.u = (TextView) view.findViewById(R.id.custom_message);
        this.v = view.findViewById(R.id.custom_message_divider);
        this.w = (TextView) view.findViewById(R.id.duration);
        this.x = (TextView) view.findViewById(R.id.badge);
        this.y = (TextView) view.findViewById(R.id.title);
        this.z = (TextView) view.findViewById(R.id.author);
        this.A = (TextView) view.findViewById(R.id.details);
    }
}
