package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.PlayerOverlayVideoInteractionsOuterClass;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class imk {
    final int a;
    public final int b;
    public final Context c;
    public final aahd d;
    public final aaea e;
    public ime f;
    public auac g;
    public ViewTreeObserver.OnGlobalLayoutListener h;
    public Dialog i;
    int j;
    int k;
    private final acqz l;
    private final ajut m;

    public imk(Context context, aahd aahdVar, acqz acqzVar, aaea aaeaVar, ajut ajutVar) {
        this.c = context;
        this.d = aahdVar;
        this.l = acqzVar;
        this.e = aaeaVar;
        this.m = ajutVar;
        this.a = context.getResources().getDimensionPixelSize(R.dimen.video_interaction_dialog_y_offset);
        this.b = context.getResources().getDimensionPixelSize(R.dimen.video_interaction_dialog_top_limit);
    }

    public static amru c(auab auabVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = auabVar.d.iterator();
        while (it.hasNext()) {
            auad d = d((aulq) it.next());
            if (d != null) {
                arrayList.add(d);
            }
        }
        if (arrayList.isEmpty()) {
            aulq aulqVar = auabVar.c;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            auad d2 = d(aulqVar);
            if (d2 != null) {
                arrayList.add(d2);
            }
        }
        return amru.o(arrayList);
    }

    public static auad d(aulq aulqVar) {
        auad auadVar = (auad) ahbj.n(aulqVar, PlayerOverlayVideoInteractionsOuterClass.videoInteractionPopUpRenderer);
        if (auadVar == null || (auadVar.b & 8) == 0) {
            return null;
        }
        return auadVar;
    }

    public static boolean h(auad auadVar, auad auadVar2) {
        if (auadVar == null || (auadVar.b & 1) == 0) {
            return false;
        }
        if (auadVar2 == null || (auadVar2.b & 1) == 0) {
            return true;
        }
        aqyg aqygVar = auadVar.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        int length = ajcq.b(aqygVar).length();
        aqyg aqygVar2 = auadVar2.c;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        return length > ajcq.b(aqygVar2).length();
    }

    private final void i(ImageView imageView, arfr arfrVar) {
        Drawable drawable = this.c.getResources().getDrawable(this.m.a(arfrVar));
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
            imageView.setScaleX(imageView.getParent().getLayoutDirection() == 1 ? -1.0f : 1.0f);
        }
    }

    public final Point a(View view) {
        if (view == null || !zev.e(this.c)) {
            ime imeVar = this.f;
            return new Point(imeVar.a, imeVar.b);
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return new Point(rect.centerX(), rect.centerY());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final View b(View view, amru amruVar) {
        View inflate = ((LayoutInflater) this.c.getSystemService("layout_inflater")).inflate(R.layout.video_interaction_dialog_list, (ViewGroup) this.f, false);
        View findViewById = inflate.findViewById(R.id.top_arrow);
        View findViewById2 = inflate.findViewById(R.id.bottom_arrow);
        if (a(view).y < this.b) {
            findViewById.setVisibility(0);
            findViewById2.setVisibility(8);
        } else {
            findViewById.setVisibility(8);
            findViewById2.setVisibility(0);
        }
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.video_interaction_dialog_list);
        int i = 0;
        while (i < amruVar.size()) {
            final auad auadVar = (auad) amruVar.get(i);
            int size = amruVar.size();
            View inflate2 = ((LayoutInflater) this.c.getSystemService("layout_inflater")).inflate(R.layout.video_interaction_dialog_item, (ViewGroup) linearLayout, false);
            inflate2.setOnClickListener(new View.OnClickListener() { // from class: imi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    imk imkVar = imk.this;
                    auad auadVar2 = auadVar;
                    imkVar.f(auadVar2.g);
                    imkVar.i.dismiss();
                    imkVar.i = null;
                    aahd aahdVar = imkVar.d;
                    apxf apxfVar = auadVar2.f;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.a(apxfVar);
                }
            });
            Drawable background = inflate2.getBackground();
            if (size > 1) {
                background = this.c.getDrawable(i == 0 ? R.drawable.video_interaction_dialog_item_top_bg : R.drawable.video_interaction_dialog_item_bottom_bg);
            }
            whu.E(inflate2, background);
            if (auadVar != null && (auadVar.b & 2) != 0) {
                ImageView imageView = (ImageView) inflate2.findViewById(R.id.video_interaction_start_icon);
                arfs arfsVar = auadVar.d;
                if (arfsVar == null) {
                    arfsVar = arfs.a;
                }
                arfr b = arfr.b(arfsVar.c);
                if (b == null) {
                    b = arfr.UNKNOWN;
                }
                i(imageView, b);
                inflate2.findViewById(R.id.dialog_end_padding).setVisibility(0);
            }
            if (auadVar != null && (auadVar.b & 4) != 0) {
                ImageView imageView2 = (ImageView) inflate2.findViewById(R.id.video_interaction_end_icon);
                arfs arfsVar2 = auadVar.e;
                if (arfsVar2 == null) {
                    arfsVar2 = arfs.a;
                }
                arfr b2 = arfr.b(arfsVar2.c);
                if (b2 == null) {
                    b2 = arfr.UNKNOWN;
                }
                i(imageView2, b2);
                inflate2.findViewById(R.id.dialog_end_padding).setVisibility(8);
            }
            if (auadVar != null) {
                int i2 = auadVar.b;
                if ((i2 & 4) == 0 && (i2 & 2) == 0) {
                    View findViewById3 = inflate2.findViewById(R.id.video_interaction_end_icon);
                    findViewById3.setScaleX(jw.e(inflate2) == 1 ? -1.0f : 1.0f);
                    findViewById3.setVisibility(0);
                }
            }
            if (auadVar != null && (auadVar.b & 1) != 0) {
                TextView textView = (TextView) inflate2.findViewById(R.id.dialog_text);
                aqyg aqygVar = auadVar.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
                textView.setText(ajcq.b(aqygVar));
            }
            linearLayout.addView(inflate2);
            i++;
        }
        return inflate;
    }

    public final void e(aomf aomfVar) {
        if (aomfVar == null) {
            return;
        }
        this.l.mM().n(new acqx(aomfVar));
    }

    public final void f(aomf aomfVar) {
        if (aomfVar == null) {
            return;
        }
        this.l.mM().I(3, new acqx(aomfVar), null);
    }

    public final void g() {
        Dialog dialog = this.i;
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
