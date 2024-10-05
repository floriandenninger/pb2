package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsContainer;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsHorizontalSurvey;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsSurvey;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gbp {
    public YouTubeTextView a;
    public HatsSurvey b;
    private HatsContainer c;
    private HatsHorizontalSurvey d;

    private gbp() {
    }

    public gbp(HatsContainer hatsContainer) {
        this.c = hatsContainer;
    }

    public final View a(int i) {
        return LayoutInflater.from(this.c.getContext()).inflate(i, this.c.f, false);
    }

    public final HatsHorizontalSurvey b() {
        if (this.d == null) {
            this.d = (HatsHorizontalSurvey) a(R.layout.hats_horizontal_survey);
        }
        return this.d;
    }
}
