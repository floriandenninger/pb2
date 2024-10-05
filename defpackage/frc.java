package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class frc implements ajom {
    private final ajjz a;
    public final View b;
    protected final TextView c;
    protected final TextView d;
    protected final TextView e;
    private final ImageView f;
    private final ajjv g;

    public frc(Context context, ajjz ajjzVar, int i) {
        ajjzVar.getClass();
        this.a = ajjzVar;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.channel_name);
        this.d = (TextView) inflate.findViewById(R.id.video_count);
        this.e = (TextView) inflate.findViewById(R.id.subscriber_count);
        this.f = (ImageView) inflate.findViewById(R.id.channel_avatar);
        ajju b = ajjzVar.c().b();
        b.b(R.drawable.missing_avatar);
        this.g = b.a();
    }

    public final void d(avgg avggVar) {
        this.a.k(this.f, avggVar, this.g);
    }

    public final void e(CharSequence charSequence) {
        whu.G(this.e, charSequence);
    }

    public final void f(CharSequence charSequence) {
        this.c.setText(charSequence);
    }
}
