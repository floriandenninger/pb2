package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ablb implements ajom {
    protected final View a;
    private final TextView c = g();
    private final TextView d = f();
    protected final ImageView b = e();

    public ablb(Context context) {
        this.a = View.inflate(context, d(), null);
        i(context);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public void b(ajos ajosVar) {
    }

    protected abstract int d();

    protected abstract ImageView e();

    protected abstract TextView f();

    protected abstract TextView g();

    protected abstract void h(avgg avggVar);

    protected void i(Context context) {
        Resources resources = context.getResources();
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_paid_message_margin);
        yny.A(this.a, new abld(marginLayoutParams, 1), yny.h(yny.y(-1, -2), yny.r(dimensionPixelOffset), yny.q(dimensionPixelOffset)), ViewGroup.MarginLayoutParams.class);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aspm aspmVar = (aspm) obj;
        TextView textView = this.c;
        aqyg aqygVar2 = null;
        if ((aspmVar.b & 16) != 0) {
            aqygVar = aspmVar.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.b(aqygVar));
        TextView textView2 = this.d;
        if ((aspmVar.b & 32) != 0 && (aqygVar2 = aspmVar.f) == null) {
            aqygVar2 = aqyg.a;
        }
        whu.G(textView2, ajcq.b(aqygVar2));
        if (this.b != null) {
            avgg avggVar = aspmVar.g;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            h(avggVar);
        }
    }
}
