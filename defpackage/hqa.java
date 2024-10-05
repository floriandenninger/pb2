package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hqa extends ajpc {
    public View a;
    public final ci b;
    public final hpy c;
    private final Context d;

    public hqa(Context context, ci ciVar, hpy hpyVar) {
        this.d = context;
        this.b = ciVar;
        this.c = hpyVar;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        Drawable drawable;
        final aujw aujwVar = (aujw) obj;
        View inflate = LayoutInflater.from(this.d).inflate(R.layout.pivot_header, (ViewGroup) null);
        this.a = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.pivot_header_title_text);
        aqyg aqygVar = aujwVar.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        textView.setText(ajcq.b(aqygVar));
        ImageView imageView = (ImageView) this.a.findViewById(R.id.pivot_back);
        if (imageView != null && (drawable = imageView.getDrawable()) != null) {
            drawable.setAutoMirrored(true);
        }
        if ((aujwVar.b & 2) == 0) {
            f().setVisibility(8);
            return;
        }
        View f = f();
        f.setVisibility(0);
        f.setOnClickListener(new View.OnClickListener() { // from class: hpz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hqa hqaVar = hqa.this;
                aujw aujwVar2 = aujwVar;
                hpy hpyVar = hqaVar.c;
                ci ciVar = hqaVar.b;
                atdf atdfVar = aujwVar2.d;
                if (atdfVar == null) {
                    atdfVar = atdf.a;
                }
                atdc atdcVar = atdfVar.c;
                if (atdcVar == null) {
                    atdcVar = atdc.a;
                }
                hpyVar.a(ciVar, atdcVar);
            }
        });
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aujw) obj).e.I();
    }

    public final View f() {
        return this.a.findViewById(R.id.pivot_more);
    }
}
