package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayDeque;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ksk extends ahus implements View.OnClickListener, ahvy {
    private boolean A;
    private boolean B;
    private CharSequence C;
    private CharSequence D;
    private CharSequence E;
    private Bitmap F;
    private final Runnable a;
    private final Context b;
    private final Handler c;
    private View d;
    private View e;
    private View f;
    private TextView g;
    private TextView h;
    private TextView i;
    private View j;
    private ImageView k;
    private View l;
    private TextView m;
    private View n;
    private ImageView o;
    private ahvx p;
    private final ahwi q;
    private final ahvz r;
    private Animator s;
    private Animator t;
    private long u;
    private int v;
    private int w;
    private CharSequence x;
    private CharSequence y;
    private boolean z;

    public ksk(Context context, ahwi ahwiVar, ahvz ahvzVar, Handler handler) {
        super(context);
        this.q = ahwiVar;
        this.r = ahvzVar;
        this.b = context;
        this.c = handler;
        this.a = new ksj(this);
    }

    private final void x() {
        View view = this.e;
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        this.c.removeCallbacks(this.a);
        this.c.postDelayed(this.a, this.u);
    }

    @Override // defpackage.ahuy
    public final View a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.livestream_offline_slate, (ViewGroup) new FrameLayout(context), true);
        this.d = inflate;
        View findViewById = inflate.findViewById(R.id.livestream_offline_slate);
        this.e = findViewById;
        this.g = (TextView) findViewById.findViewById(R.id.livestream_line1);
        this.h = (TextView) this.e.findViewById(R.id.livestream_line2);
        this.j = this.e.findViewById(R.id.livestream_notification_button);
        ImageView imageView = (ImageView) this.e.findViewById(R.id.livestream_notification_icon);
        this.k = imageView;
        imageView.setImageAlpha(PrivateKeyType.INVALID);
        this.i = (TextView) this.e.findViewById(R.id.livestream_notification_text);
        this.j.setOnClickListener(this);
        this.l = this.e.findViewById(R.id.livestream_replay_button);
        this.m = (TextView) this.e.findViewById(R.id.livestream_replay_text);
        this.l.setOnClickListener(this);
        View findViewById2 = this.d.findViewById(R.id.livestream_offline_slate_collapsed);
        this.f = findViewById2;
        View findViewById3 = findViewById2.findViewById(R.id.livestream_offline_slate_expand_button);
        this.n = findViewById3;
        findViewById3.setOnClickListener(this);
        TextView textView = (TextView) this.f.findViewById(R.id.livestream_trailer_text);
        Animator loadAnimator = AnimatorInflater.loadAnimator(context, R.animator.livestream_offline_slate_background_fade);
        this.s = loadAnimator;
        loadAnimator.setTarget(this.n);
        Animator loadAnimator2 = AnimatorInflater.loadAnimator(context, R.animator.livestream_offline_slate_background_fade);
        this.t = loadAnimator2;
        loadAnimator2.setTarget(textView);
        this.o = (ImageView) this.d.findViewById(R.id.livestream_channel_image);
        this.d.setClickable(false);
        this.d.setBackgroundColor(0);
        return this.d;
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahuy
    public final void d(Context context, View view) {
        int i;
        if (ab(1)) {
            if (!this.B) {
                this.g.setText(this.C);
                this.g.setContentDescription(this.C);
                this.h.setText(this.D);
                this.h.setContentDescription(this.D);
                ArrayDeque arrayDeque = new ArrayDeque();
                if (!TextUtils.isEmpty(this.D) || TextUtils.isEmpty(this.C)) {
                    arrayDeque.add(yny.j(2, R.id.livestream_text_anchor));
                    arrayDeque.add(yny.t(15));
                } else {
                    arrayDeque.add(yny.t(2));
                    arrayDeque.add(yny.i(15));
                }
                yny.z(this.g, yny.E(arrayDeque), RelativeLayout.LayoutParams.class);
                this.l.setVisibility(8);
                this.j.setVisibility(this.w > 0 ? 0 : 8);
            } else {
                this.g.setText(this.C);
                this.g.setContentDescription(this.C);
                this.h.setText(this.D);
                this.h.setContentDescription(this.D);
                this.m.setText(this.E);
                this.j.setVisibility(8);
                this.l.setVisibility(0);
            }
        }
        if (ab(2)) {
            this.j.setSelected(this.z);
            int i2 = this.v;
            if (i2 != 0 && (i = this.w) != 0) {
                ImageView imageView = this.k;
                if (true != this.z) {
                    i2 = i;
                }
                imageView.setImageResource(i2);
            }
            this.i.setText(this.z ? this.x : this.y);
        }
        if (ab(4)) {
            ImageView imageView2 = this.o;
            if (imageView2 != null) {
                imageView2.setImageBitmap(this.F);
                boolean z = this.F != null;
                this.A = z;
                this.d.setClickable(z);
            }
            this.F = null;
        }
    }

    @Override // defpackage.ahvy
    public final int getHeight() {
        View view = this.d;
        if (view != null) {
            return view.getHeight();
        }
        return 0;
    }

    @Override // defpackage.ahvy
    public final int getWidth() {
        View view = this.d;
        if (view != null) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // defpackage.ahvy
    public final void k(boolean z) {
        View view = this.f;
        if (view == null || this.e == null) {
            return;
        }
        view.setVisibility(8);
        this.f.setAlpha(1.0f);
        this.e.setVisibility(0);
        this.g.requestFocus();
        this.g.sendAccessibilityEvent(8);
        ahvz ahvzVar = this.r;
        if (ahvzVar != null) {
            ahvzVar.k(1, this.e.getHeight());
        }
        if (z) {
            x();
        }
    }

    @Override // defpackage.ahus
    public final void kV() {
        X();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ahus
    public final void kW(int i) {
        if (i == 3 || i == 1) {
            return;
        }
        ahwi ahwiVar = this.q;
        if (ahwiVar != null) {
            ahwiVar.H(i == 2);
        }
        ahvz ahvzVar = this.r;
        if (ahvzVar != null) {
            if (i == 0) {
                ahvzVar.k(0, 0);
                return;
            }
            View view = this.e;
            if (view == null || this.f == null) {
                return;
            }
            if (view.getVisibility() == 0) {
                this.r.k(1, this.e.getHeight());
            }
            if (this.f.getVisibility() == 0) {
                this.r.k(2, this.f.getHeight());
            }
        }
    }

    @Override // defpackage.ahvy
    public final void m() {
        View view;
        if (this.u == 0 || this.f == null || (view = this.e) == null) {
            return;
        }
        view.setVisibility(8);
        this.f.setVisibility(8);
    }

    @Override // defpackage.ahvy
    public final void n() {
        this.c.removeCallbacks(this.a);
    }

    @Override // defpackage.ahuy
    public final boolean nt() {
        return true;
    }

    @Override // defpackage.ahvy
    public final void o(long j) {
        this.u = j;
        x();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.j) {
            this.z = !this.z;
            Z(2);
            this.p.rN();
        }
        if (view == this.l) {
            this.p.rM();
        }
        if (view == this.n) {
            k(true);
        }
    }

    @Override // defpackage.ahvy
    public final void p(Bitmap bitmap) {
        if (bitmap != null || this.A) {
            this.F = bitmap;
            Z(4);
        }
    }

    @Override // defpackage.ahvy
    public final void q(ahvx ahvxVar) {
        this.p = ahvxVar;
    }

    @Override // defpackage.ahvy
    public final void r(boolean z) {
        ahwi ahwiVar = this.q;
        if (ahwiVar != null) {
            ahwiVar.I(z);
        }
    }

    public final void s() {
        View view;
        if (this.u == 0 || this.f == null || (view = this.e) == null) {
            return;
        }
        view.setVisibility(8);
        this.f.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(400L);
        animatorSet.playTogether(this.s, this.t);
        animatorSet.start();
        ahvz ahvzVar = this.r;
        if (ahvzVar != null) {
            ahvzVar.k(2, this.f.getHeight());
        }
    }

    @Override // defpackage.ahvy
    public final void t(CharSequence charSequence, CharSequence charSequence2, boolean z, CharSequence charSequence3, int i, CharSequence charSequence4, int i2) {
        this.C = charSequence;
        this.D = charSequence2;
        this.z = z;
        this.v = i2;
        this.w = i;
        this.x = charSequence4;
        this.y = charSequence3;
        this.B = false;
        aa();
        Z(3);
    }

    @Override // defpackage.ahvy
    public final void u(boolean z) {
        View view;
        if (this.f == null || (view = this.e) == null) {
            return;
        }
        if (z) {
            s();
        } else {
            view.setVisibility(0);
            this.f.setVisibility(8);
        }
    }

    @Override // defpackage.ahvy
    public final void v(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.C = charSequence;
        this.D = charSequence2;
        this.E = charSequence3;
        this.B = true;
        aa();
        Z(1);
    }

    @Override // defpackage.ahvy
    public final void w(boolean z) {
        if (this.e == null) {
            return;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        if (z) {
            arrayDeque.add(yny.x(this.b.getResources().getDimensionPixelSize(R.dimen.livestream_offline_slate_width)));
            arrayDeque.add(yny.m(83));
        } else {
            arrayDeque.add(yny.x(-1));
            arrayDeque.add(yny.m(81));
        }
        yny.z(this.e, yny.E(arrayDeque), FrameLayout.LayoutParams.class);
    }
}
