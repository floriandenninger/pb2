package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fww extends ajpc {
    private final ajjz a;
    private final CardView b;
    private final ImageView c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final ajyf g;
    private final gag h;
    private final ajoi i;

    public fww(Activity activity, ajjz ajjzVar, aahd aahdVar, ajyg ajygVar, ViewGroup viewGroup) {
        ajjzVar.getClass();
        this.a = ajjzVar;
        CardView cardView = (CardView) LayoutInflater.from(activity).inflate(R.layout.movie_card, viewGroup, false);
        this.b = cardView;
        TextView textView = (TextView) cardView.findViewById(R.id.title);
        textView.getClass();
        this.e = textView;
        TextView textView2 = (TextView) cardView.findViewById(R.id.subtitle);
        textView2.getClass();
        this.f = textView2;
        this.g = ajygVar.a((TextView) cardView.findViewById(R.id.offer_button));
        ImageView imageView = (ImageView) cardView.findViewById(R.id.thumbnail);
        imageView.getClass();
        this.c = imageView;
        this.d = (TextView) cardView.findViewById(R.id.duration);
        this.i = new ajoi(aahdVar, cardView);
        ViewStub viewStub = (ViewStub) cardView.findViewById(R.id.standalone_ypc_badge);
        this.h = viewStub == null ? null : new gag(viewStub, 1);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.i.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x007f  */
    @Override // defpackage.ajpc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void d(defpackage.ajok r6, java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fww.d(ajok, java.lang.Object):void");
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((atgz) obj).j.I();
    }
}
