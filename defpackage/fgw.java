package defpackage;

import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fgw extends fgx {
    final /* synthetic */ SpecificNetworkErrorViewLoadingFrameLayout a;
    public ivg b;
    private ImageView d;
    private View e;
    private View f;
    private boolean g;
    private int h;
    private boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgw(SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout, int i) {
        super(specificNetworkErrorViewLoadingFrameLayout, 3, i, R.id.error_message_text);
        this.a = specificNetworkErrorViewLoadingFrameLayout;
    }

    @Override // defpackage.fgx
    protected final View a() {
        View a = super.a();
        this.d = (ImageView) a.findViewById(R.id.error_icon);
        this.e = a.findViewById(R.id.error_retry_button);
        this.f = a.findViewById(R.id.account_instructions_button);
        View view = this.e;
        if (view != null) {
            final int i = 1;
            view.setOnClickListener(new View.OnClickListener(this) { // from class: fgv
                public final /* synthetic */ fgw a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    if (i == 0) {
                        fav.F(this.a.a.a, Uri.parse("https://support.google.com/nexus/answer/2840815"));
                        return;
                    }
                    ivg ivgVar = this.a.b;
                    if (ivgVar != null) {
                        ivgVar.a();
                    }
                }
            });
        }
        View view2 = this.f;
        if (view2 != null) {
            final int i2 = 0;
            view2.setOnClickListener(new View.OnClickListener(this) { // from class: fgv
                public final /* synthetic */ fgw a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view22) {
                    if (i2 == 0) {
                        fav.F(this.a.a.a, Uri.parse("https://support.google.com/nexus/answer/2840815"));
                        return;
                    }
                    ivg ivgVar = this.a.b;
                    if (ivgVar != null) {
                        ivgVar.a();
                    }
                }
            });
        }
        d(this.g);
        b(this.i);
        c(this.h);
        return a;
    }

    public final void b(boolean z) {
        View view = this.f;
        if (view != null) {
            view.setVisibility(true != z ? 8 : 0);
        } else {
            this.i = z;
        }
    }

    public final void c(int i) {
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setImageResource(i);
        } else {
            this.h = i;
        }
    }

    public final void d(boolean z) {
        View view = this.e;
        if (view != null) {
            view.setVisibility(true != z ? 8 : 0);
        } else {
            this.g = z;
        }
    }
}
