package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mru extends ajpc {
    private final Context a;
    private final int b;
    private final View c;
    private final TextView d;
    private final gno e;

    public mru(Context context, akht akhtVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = context;
        View inflate = View.inflate(context, R.layout.playlist_notification, null);
        this.c = inflate;
        this.d = (TextView) inflate.findViewById(R.id.notification_text);
        this.e = akhtVar.h((TextView) inflate.findViewById(R.id.action_button));
        this.b = yjk.K(context.getResources().getDisplayMetrics(), 15);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aubn aubnVar = (aubn) obj;
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
            marginLayoutParams.topMargin = this.b;
            this.c.setLayoutParams(marginLayoutParams);
        }
        TextView textView = this.d;
        apmg apmgVar = null;
        if ((aubnVar.b & 2) != 0) {
            aqygVar = aubnVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.b(aqygVar));
        Iterator it = aubnVar.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            aubm aubmVar = (aubm) it.next();
            if ((aubmVar.b & 1) != 0) {
                apmg apmgVar2 = aubmVar.c;
                if (apmgVar2 == null) {
                    apmgVar2 = apmg.a;
                }
                apmgVar = apmgVar2;
                this.c.setBackgroundColor(wbs.Q(this.a, R.attr.ytThemedBlue));
                this.d.setTextColor(this.a.getResources().getColor(android.R.color.white));
            }
        }
        this.e.b(apmgVar, ajokVar.a);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return null;
    }
}
