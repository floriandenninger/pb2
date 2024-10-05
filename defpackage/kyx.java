package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class kyx extends ajpc {
    public final aahd a;
    private final View b;
    private final TextView c;
    private final TextView d;
    private final TextView e;
    private final kzg f;
    private final gma g;

    public kyx(Context context, aahd aahdVar, gma gmaVar, ajyw ajywVar, int i, we weVar, we weVar2, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = aahdVar;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.title);
        this.d = (TextView) inflate.findViewById(R.id.labels);
        this.e = (TextView) inflate.findViewById(R.id.subtitle);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.collage);
        recyclerView.setNestedScrollingEnabled(false);
        Resources resources = context.getResources();
        kzg o = ajywVar.o(weVar, weVar2, i2);
        this.f = o;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        recyclerView.af(gridLayoutManager);
        recyclerView.ac(o);
        gridLayoutManager.g = new kzc(o);
        recyclerView.aB(new kzb(o, resources.getDimensionPixelSize(R.dimen.bundle_item_image_padding)));
        this.g = gmaVar;
        gmaVar.c(inflate);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.g.b;
    }

    @Override // defpackage.ajom
    public void b(ajos ajosVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajpc
    public void d(ajok ajokVar, Object obj) {
        final kyr R = mcy.R(obj);
        whu.G(this.c, ajcq.b(R.c()));
        whu.G(this.e, ajcq.b(R.b()));
        TextView textView = this.d;
        List e = R.e();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (e != null && e.size() > 0) {
            spannableStringBuilder.append((CharSequence) aahk.a((aqyg) e.get(0), this.a, false));
            for (int i = 1; i < e.size(); i++) {
                spannableStringBuilder.append((CharSequence) " · ").append((CharSequence) aahk.a((aqyg) e.get(i), this.a, false));
            }
        }
        whu.G(textView, spannableStringBuilder);
        this.f.y(R.h(), R.d(), R.f());
        this.f.mw();
        this.b.setOnClickListener(new View.OnClickListener() { // from class: kyw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kyx.this.a.c(R.a(), null);
            }
        });
        etx.n(ajokVar, 2);
        this.g.e(ajokVar);
    }

    @Override // defpackage.ajpc
    public final byte[] e(Object obj) {
        return mcy.R(obj).g();
    }
}
