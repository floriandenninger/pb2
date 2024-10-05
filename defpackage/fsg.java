package defpackage;

import com.google.android.apps.youtube.app.common.rendering.presenter.donationshelf.PrefixedEditText;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fsg {
    public final YouTubeTextView a;
    public final TextInputLayout b;
    public final PrefixedEditText c;
    public final fsf d = new fsf(this);
    public aqlc e;
    public npt f;

    public fsg(YouTubeTextView youTubeTextView, TextInputLayout textInputLayout) {
        this.a = youTubeTextView;
        this.b = textInputLayout;
        this.c = (PrefixedEditText) textInputLayout.findViewById(R.id.custom_amount_edit);
    }
}
