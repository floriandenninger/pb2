package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akdc extends akde {
    public akdd a;
    private ImageView d;
    private View e;
    private boolean f;
    private int g;

    public akdc(LoadingFrameLayout loadingFrameLayout, int i) {
        super(loadingFrameLayout, 3, i, R.id.error_message_text);
    }

    @Override // defpackage.akde
    protected final View a() {
        View a = super.a();
        this.d = (ImageView) a.findViewById(R.id.error_icon);
        View findViewById = a.findViewById(R.id.error_retry_button);
        this.e = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: akdb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    akdd akddVar = akdc.this.a;
                    if (akddVar != null) {
                        akddVar.qJ();
                    }
                }
            });
        }
        c(this.f);
        b(this.g);
        return a;
    }

    public final void b(int i) {
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setImageResource(i);
        } else {
            this.g = i;
        }
    }

    public final void c(boolean z) {
        View view = this.e;
        if (view != null) {
            view.setVisibility(true != z ? 8 : 0);
        } else {
            this.f = z;
        }
    }
}
