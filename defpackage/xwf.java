package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xwf implements ajom {
    private final View a;
    private final View b;
    private final TextView c;
    private final TextView d;
    private final ProgressBar e;
    private final Resources f;
    private final Resources.Theme g;
    private final int h;

    public xwf(Context context) {
        View inflate = View.inflate(context, R.layout.comment_poll_choice, null);
        this.a = inflate;
        this.b = inflate.findViewById(R.id.comment_poll_choice_icon);
        this.c = (TextView) inflate.findViewById(R.id.comment_poll_choice_text);
        this.d = (TextView) inflate.findViewById(R.id.comment_poll_choice_vote_percent);
        this.e = (ProgressBar) inflate.findViewById(R.id.comment_poll_choice_vote_ratio);
        this.f = context.getResources();
        this.g = context.getTheme();
        this.h = inflate.getPaddingBottom();
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        audo audoVar = (audo) obj;
        this.b.setSelected(audoVar.d);
        boolean j = ajokVar.j("has_voted", false);
        boolean j2 = ajokVar.j("is_last_item", false);
        View view = this.a;
        jw.Y(view, jw.i(view), this.a.getPaddingTop(), jw.h(this.a), j2 ? 0 : this.h);
        int i = true != j ? 8 : 0;
        int i2 = audoVar.b;
        if (((i2 & 128) == 0 || (i2 & 256) == 0) && (i2 & 8) == 0 && (i2 & 64) == 0) {
            this.d.setVisibility(0);
            this.e.setVisibility(0);
            this.b.setVisibility(8);
        } else {
            this.d.setVisibility(i);
            this.e.setVisibility(i);
            this.b.setVisibility(0);
        }
        TextView textView = this.c;
        aqyg aqygVar2 = null;
        if ((1 & audoVar.b) != 0) {
            aqygVar = audoVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        TextView textView2 = this.d;
        if ((audoVar.b & 32) != 0 && (aqygVar2 = audoVar.g) == null) {
            aqygVar2 = aqyg.a;
        }
        textView2.setText(ajcq.b(aqygVar2));
        this.e.setProgress((int) (audoVar.f * 100.0d));
        if (Build.VERSION.SDK_INT >= 23) {
            if (audoVar.d) {
                this.d.setTextColor(this.f.getColor(R.color.yt_dark_blue, this.g));
                this.e.setProgressTintList(this.f.getColorStateList(R.color.yt_dark_blue, this.g));
                return;
            } else {
                this.e.setProgressTintList(this.f.getColorStateList(R.color.comment_poll_progress_unselected_color, this.g));
                this.d.setTextColor(this.f.getColor(R.color.comment_poll_choice_unselected_color, this.g));
                return;
            }
        }
        if (audoVar.d) {
            this.d.setTextColor(this.f.getColor(R.color.yt_dark_blue));
            this.e.setProgressTintList(this.f.getColorStateList(R.color.yt_dark_blue));
        } else {
            this.d.setTextColor(this.f.getColor(R.color.comment_poll_choice_unselected_color));
            this.e.setProgressTintList(this.f.getColorStateList(R.color.comment_poll_progress_unselected_color));
        }
    }
}
