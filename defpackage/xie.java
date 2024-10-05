package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xie extends aivc implements View.OnClickListener, View.OnTouchListener, xja {
    public xiz a;
    private ViewGroup b;
    private ViewGroup c;
    private TextView[] d;
    private View e;
    private View f;
    private TextView g;
    private TextView h;
    private Drawable i;
    private Drawable j;
    private xke k;
    private boolean l;
    private int m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;

    public xie(Context context) {
        super(context);
        if (this.b == null) {
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.survey_overlay, this);
            this.b = viewGroup;
            TextView textView = (TextView) viewGroup.findViewById(R.id.minimize_survey);
            ViewGroup viewGroup2 = (ViewGroup) this.b.findViewById(R.id.normal_survey);
            this.c = viewGroup2;
            this.g = (TextView) viewGroup2.findViewById(R.id.survey_question);
            this.i = aii.a(context, R.drawable.survey_checked);
            this.j = aii.a(context, R.drawable.survey_unchecked);
            this.h = (TextView) this.c.findViewById(R.id.survey_attribution);
            this.k = new xke(this.h);
            this.d = new TextView[]{(TextView) this.c.findViewById(R.id.survey_answer_1), (TextView) this.c.findViewById(R.id.survey_answer_2), (TextView) this.c.findViewById(R.id.survey_answer_3), (TextView) this.c.findViewById(R.id.survey_answer_4), (TextView) this.c.findViewById(R.id.survey_answer_5)};
            View findViewById = this.c.findViewById(R.id.skip_button);
            this.e = findViewById;
            findViewById.setOnClickListener(this);
            this.e.setOnTouchListener(this);
            View findViewById2 = this.c.findViewById(R.id.submit_button);
            this.f = findViewById2;
            findViewById2.setOnClickListener(this);
            int i = 0;
            while (true) {
                TextView[] textViewArr = this.d;
                int length = textViewArr.length;
                if (i >= 5) {
                    break;
                }
                textViewArr[i].setOnClickListener(this);
                i++;
            }
            textView.setVisibility(8);
            this.c.setVisibility(0);
            this.h.setOnClickListener(new xid(this));
        }
        h();
    }

    private final void f() {
        if (this.a == null) {
            return;
        }
        int[] iArr = new int[this.m];
        int i = 0;
        for (int i2 = 0; i2 < this.m; i2++) {
            if (j(i2)) {
                iArr[i] = i2;
                i++;
            }
        }
        this.a.b(Arrays.copyOf(iArr, i));
    }

    private final void g() {
        int i;
        boolean z;
        this.n = false;
        int i2 = 0;
        while (true) {
            i = this.m;
            z = true;
            if (i2 >= i) {
                break;
            }
            if (!this.n && !j(i2)) {
                z = false;
            }
            this.n = z;
            i2++;
        }
        if (!this.n && (!this.l || !j(i))) {
            z = false;
        }
        this.n = z;
        if (this.b != null) {
            this.f.setVisibility((z && this.l) ? 0 : 8);
            this.e.setVisibility((!this.o || this.n) ? 8 : 0);
        }
    }

    private final boolean j(int i) {
        if (this.b == null) {
            return false;
        }
        TextView[] textViewArr = this.d;
        int length = textViewArr.length;
        return i < 5 && textViewArr[i].isSelected();
    }

    protected final void a(int i, boolean z) {
        if (this.b != null) {
            TextView[] textViewArr = this.d;
            int length = textViewArr.length;
            if (i >= 5) {
                return;
            }
            textViewArr[i].setSelected(z);
            if (this.l) {
                jm.u(this.d[i], null, null, z ? this.i : this.j);
            } else {
                this.d[i].setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.xja
    public final xiy d() {
        return null;
    }

    @Override // defpackage.xja
    public final void e() {
        this.o = true;
        g();
    }

    @Override // defpackage.xja
    public final void h() {
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            this.k.a();
            this.e.setVisibility(8);
            this.f.setVisibility(8);
        }
        this.n = false;
        this.o = false;
        this.p = 0;
        this.q = 0;
        setVisibility(8);
    }

    @Override // defpackage.xja
    public final void i(xiz xizVar) {
        this.a = xizVar;
    }

    @Override // defpackage.xja
    public final void k(boolean z) {
        setVisibility(true != z ? 8 : 0);
    }

    @Override // defpackage.xja
    public final void l() {
        this.k.b(true, false);
    }

    @Override // defpackage.xja
    public final void m(int i) {
        if (this.b == null) {
            return;
        }
        this.h.setText(this.b.getResources().getString(R.string.survey_attribution, zhq.i((int) Math.ceil(i / 1000.0f))));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.e) {
            xiz xizVar = this.a;
            if (xizVar != null) {
                xizVar.c(this.p, this.q);
                return;
            }
            return;
        }
        if (view == this.f) {
            f();
            return;
        }
        int i = 0;
        while (true) {
            TextView[] textViewArr = this.d;
            int length = textViewArr.length;
            if (i >= 5) {
                return;
            }
            if (view == textViewArr[i]) {
                boolean z = !view.isSelected();
                a(i, z);
                if (this.l) {
                    if (z) {
                        int i2 = this.m;
                        if (i < i2) {
                            a(i2, false);
                        } else {
                            for (int i3 = 0; i3 < this.m; i3++) {
                                a(i3, false);
                            }
                        }
                    }
                    g();
                } else {
                    f();
                }
            }
            i++;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        this.p = (int) motionEvent.getRawX();
        this.q = (int) motionEvent.getRawY();
        return false;
    }

    @Override // defpackage.xja
    public final void p(String str, List list, boolean z, int i) {
        h();
        this.l = z;
        this.m = list.size();
        this.g.setText(str);
        int size = list.size();
        int i2 = 0;
        while (true) {
            int length = this.d.length;
            if (i2 < 5) {
                if (i2 < list.size()) {
                    this.d[i2].setText((CharSequence) list.get(i2));
                    this.d[i2].setVisibility(0);
                } else if (i2 != size || !z) {
                    this.d[i2].setVisibility(4);
                } else {
                    this.d[i2].setText(R.string.survey_none_of_the_above);
                    this.d[i2].setVisibility(0);
                }
                a(i2, false);
                i2++;
            } else {
                this.b.setVisibility(0);
                return;
            }
        }
    }
}
