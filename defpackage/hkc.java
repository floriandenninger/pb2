package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hkc implements View.OnClickListener {
    public final hgo a;
    public final ImageView b;
    public final String c;
    public final String d;
    private final hjs e;
    private final View f;
    private final hrv g;

    public hkc(hjs hjsVar, hgo hgoVar, yqw yqwVar, hrv hrvVar, View view) {
        this.e = hjsVar;
        this.a = hgoVar;
        this.g = hrvVar;
        this.c = view.getResources().getString(R.string.reel_accessibility_play_video);
        this.d = view.getResources().getString(R.string.reel_accessibility_pause_video);
        ImageView imageView = (ImageView) view.findViewById(R.id.play_pause_button);
        this.b = imageView;
        jw.M(imageView, new hkb(this));
        imageView.setOnClickListener(this);
        View findViewById = view.findViewById(R.id.done_button);
        this.f = findViewById;
        findViewById.setOnClickListener(this);
        hrvVar.q();
        a();
        hgoVar.c().p(wbs.K(yqwVar.a())).ax(new ayrs() { // from class: hka
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                hkc.this.a();
            }
        });
    }

    public final void a() {
        this.b.setSelected(this.a.i());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.f) {
            this.e.e(acsb.c(116664));
            this.g.q();
            this.e.c();
            this.a.g(0L);
            this.a.f();
            return;
        }
        if (view == this.b) {
            this.g.q();
            if (this.a.i()) {
                this.a.e();
            } else {
                this.a.f();
            }
        }
    }
}
