package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fsq {
    public final View a;
    public final TextView b;
    public final TextView c;
    public final ImageView d;
    public final ImageView e;
    public final ImageView f;
    public final Button g;
    final /* synthetic */ fsr h;

    public fsq(fsr fsrVar, View view) {
        this.h = fsrVar;
        this.a = view;
        this.b = (TextView) view.findViewById(R.id.title);
        this.c = (TextView) view.findViewById(R.id.body_text);
        araz arazVar = fsrVar.c;
        arazVar.getClass();
        ImageView imageView = (ImageView) view.findViewById(R.id.dismiss_button);
        this.d = imageView;
        imageView.setOnClickListener(new fsp(this, arazVar, 1));
        this.e = (ImageView) view.findViewById(R.id.background_image);
        this.f = (ImageView) view.findViewById(R.id.foreground_image);
        Button button = (Button) view.findViewById(R.id.action_button);
        this.g = button;
        button.setOnClickListener(new fsp(this, arazVar, 0));
    }
}
