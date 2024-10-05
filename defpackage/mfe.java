package defpackage;

import android.view.View;
import android.widget.RatingBar;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mfe {
    private final RatingBar a;
    private final RatingBar b;

    public mfe(View view) {
        this.a = (RatingBar) view.findViewById(R.id.rating_gray);
        this.b = (RatingBar) view.findViewById(R.id.rating_white);
    }

    public final void a() {
        this.a.setVisibility(8);
        this.b.setVisibility(8);
    }

    public final void b(float f, int i) {
        a();
        if (Float.compare(f, 0.0f) <= 0) {
            return;
        }
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0 || i2 == 1) {
            this.a.setRating(f);
            this.a.setVisibility(0);
        } else {
            if (i2 != 2) {
                return;
            }
            this.b.setRating(f);
            this.b.setVisibility(0);
        }
    }
}
