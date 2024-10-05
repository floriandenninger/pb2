package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fyp implements View.OnClickListener {
    public final ObjectAnimator a;
    public final TextView b;
    public final int c;
    public boolean d = false;
    public int e;
    private final int f;

    public fyp(TextView textView, int i, int i2) {
        this.b = textView;
        this.c = i;
        this.f = i2;
        this.e = textView.getLineCount();
        ObjectAnimator ofInt = ObjectAnimator.ofInt(textView, "maxLines", i, a());
        this.a = ofInt;
        ofInt.setDuration(150L);
        ofInt.addListener(new fyo(this));
        textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: fyn
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                fyp fypVar = fyp.this;
                if (fypVar.b.getLineCount() == fypVar.e) {
                    return;
                }
                fypVar.e = fypVar.b.getLineCount();
                if (fypVar.a.isRunning()) {
                    return;
                }
                fypVar.a.setIntValues(fypVar.c, fypVar.a());
            }
        });
        c();
    }

    public final int a() {
        int i = this.e;
        return i <= this.c ? this.f : Math.min(i, this.f);
    }

    public final void b() {
        this.d = false;
        this.b.setMaxLines(this.c);
    }

    public final void c() {
        int i = this.d ? this.f : this.c;
        if (this.b.getMaxLines() != i) {
            this.b.setMaxLines(i);
        }
    }

    public final boolean d() {
        int min = Math.min(this.b.getLineCount(), this.c) - 1;
        if (this.b.getVisibility() == 0) {
            if (this.b.getLineCount() > this.c) {
                return true;
            }
            if (this.b.getLayout() != null && this.b.getLayout().getEllipsisCount(min) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.d = !this.d;
        if (!d()) {
            c();
        } else if (this.a.isRunning() || !this.d) {
            this.a.reverse();
        } else {
            this.a.start();
        }
    }
}
