package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jey extends jex {
    private static final String h = zga.a("MDX.MinibarController");

    public jey(Context context, azrw azrwVar) {
        super(context, azrwVar);
    }

    private final Spanned d(String str) {
        String string = this.a.getString(R.string.mdx_minibar_next_video_text, str);
        if (Build.VERSION.SDK_INT >= 24) {
            return Html.fromHtml(string, 0);
        }
        return Html.fromHtml(string);
    }

    private final void e() {
        aubs aubsVar;
        aubw aubwVar;
        if (this.f) {
            TextView textView = this.d;
            TextView textView2 = this.e;
            ViewGroup viewGroup = this.c;
            if (textView == null || textView2 == null || viewGroup == null) {
                return;
            }
            adub adubVar = this.g;
            if (adubVar.e == adubVar.d - 1) {
                adtz adtzVar = adubVar.k;
                if (adtzVar.b == 2) {
                    PlayerResponseModel playerResponseModel = adtzVar.a;
                    if (playerResponseModel == null || ammx.e(playerResponseModel.x())) {
                        zga.m(h, "MdxWatchState's watchNext video is either null or does not have a valid title.");
                    } else {
                        textView.setText(d(playerResponseModel.x()));
                        textView2.setText(b(this.g));
                        viewGroup.setContentDescription(this.a.getString(R.string.mdx_minibar_accessibility_queue_status_next_video, playerResponseModel.x(), this.g.c));
                    }
                } else {
                    textView.setText(this.a.getString(R.string.mdx_minibar_last_video_text));
                    textView2.setText("");
                    viewGroup.setContentDescription(this.a.getString(R.string.mdx_minibar_accessibility_queue_status_last_video, this.g.c));
                }
            } else {
                WatchNextResponseModel watchNextResponseModel = adubVar.g;
                if (watchNextResponseModel == null || (aubsVar = watchNextResponseModel.g) == null || !adtt.a(aubsVar.k)) {
                    return;
                }
                aony aonyVar = aubsVar.i;
                String string = this.a.getString(R.string.mdx_minibar_last_video_text);
                int i = this.g.e + 1;
                while (true) {
                    if (i >= aonyVar.size()) {
                        break;
                    }
                    aubr aubrVar = (aubr) aonyVar.get(i);
                    if ((aubrVar.b & 1) != 0) {
                        aubwVar = aubrVar.c;
                        if (aubwVar == null) {
                            aubwVar = aubw.a;
                        }
                    } else {
                        aubwVar = null;
                    }
                    if (aubwVar == null || (aubwVar.b & 1) == 0) {
                        i++;
                    } else {
                        aqyg aqygVar = aubwVar.c;
                        if (aqygVar == null) {
                            aqygVar = aqyg.a;
                        }
                        string = ajcq.b(aqygVar).toString();
                    }
                }
                textView.setText(d(string));
                textView2.setText(b(this.g));
                viewGroup.setContentDescription(this.a.getString(R.string.mdx_minibar_accessibility_queue_status_next_video, string, this.g.c));
            }
            if (textView.getText().toString().isEmpty()) {
                return;
            }
            viewGroup.setVisibility(0);
        }
    }

    @Override // defpackage.jex
    public final void c(ViewGroup viewGroup) {
        if (this.f) {
            return;
        }
        if (!this.f) {
            this.c = viewGroup;
            TextView textView = (TextView) viewGroup.findViewById(R.id.minibar_title);
            textView.getClass();
            this.d = textView;
            TextView textView2 = (TextView) viewGroup.findViewById(R.id.minibar_subtitle);
            textView2.getClass();
            this.e = textView2;
            adul adulVar = (adul) this.b.get();
            adulVar.a(this);
            this.g = adulVar.i;
            this.f = true;
        }
        int i = this.g.j;
        if (i != 0) {
            if (i == 1) {
                e();
                return;
            } else if (i != 2) {
                return;
            }
        }
        ViewGroup viewGroup2 = this.c;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
    }

    @Override // defpackage.adue
    public final void oZ(int i, adub adubVar) {
        this.g = adubVar;
        int i2 = adubVar.j;
        if (i2 != 0) {
            if (i2 == 1) {
                e();
                return;
            } else if (i2 != 2) {
                return;
            }
        }
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }
}
