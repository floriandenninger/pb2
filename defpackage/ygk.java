package defpackage;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ygk extends ajpc {
    final TextView a;
    final TextView b;
    final TextView c;
    final View d;
    final ImageView e;
    final View f;
    public final HashMap g;
    public atdc h;
    private final ViewGroup i;
    private final CardView j;
    private final TextView k;
    private final TextView l;
    private final ajyf m;
    private final ajyf n;
    private final aahd o;
    private final ajut p;
    private final ajjz q;

    public ygk(final ci ciVar, ajyg ajygVar, final aahd aahdVar, final ajut ajutVar, ajjz ajjzVar, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(ciVar).inflate(R.layout.subscription_product_card, viewGroup, false);
        this.i = viewGroup2;
        CardView cardView = (CardView) viewGroup2.findViewById(R.id.card_view);
        this.j = cardView;
        View findViewById = cardView.findViewById(R.id.contextual_menu_anchor);
        this.f = findViewById;
        this.e = (ImageView) cardView.findViewById(R.id.logo);
        this.a = (TextView) cardView.findViewById(R.id.metadata);
        this.b = (TextView) cardView.findViewById(R.id.additional_info);
        this.c = (TextView) cardView.findViewById(R.id.description);
        this.d = cardView.findViewById(R.id.red_bar);
        TextView textView = (TextView) cardView.findViewById(R.id.primary_button);
        this.k = textView;
        this.m = ajygVar.a(textView);
        TextView textView2 = (TextView) cardView.findViewById(R.id.secondary_button);
        this.l = textView2;
        this.n = ajygVar.a(textView2);
        new ajuz(cardView, findViewById);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: ygj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ygk ygkVar = ygk.this;
                ci ciVar2 = ciVar;
                aahd aahdVar2 = aahdVar;
                ajut ajutVar2 = ajutVar;
                atdc atdcVar = ygkVar.h;
                if (atdcVar != null) {
                    ajxw.b(ciVar2, atdcVar, aahdVar2, ajutVar2, null, null, null, null);
                }
            }
        });
        this.o = aahdVar;
        this.p = ajutVar;
        this.q = ajjzVar;
        HashMap hashMap = new HashMap();
        this.g = hashMap;
        Bundle bundle = new Bundle();
        bundle.putBoolean("menu_as_bottom_sheet", true);
        hashMap.put("com.google.android.libraries.youtube.innertube.bundle", bundle);
    }

    private final SpannableString f(List list) {
        if (list.isEmpty()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            aqyg aqygVar = (aqyg) it.next();
            if (i > 0) {
                spannableStringBuilder.append((CharSequence) System.getProperty("line.separator"));
            }
            spannableStringBuilder.append((CharSequence) aahk.a(aqygVar, this.o, false));
            i++;
        }
        return SpannableString.valueOf(spannableStringBuilder);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.i;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    @Override // defpackage.ajpc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void d(defpackage.ajok r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ygk.d(ajok, java.lang.Object):void");
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aval) obj).k.I();
    }
}
