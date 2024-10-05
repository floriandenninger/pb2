package defpackage;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jfe extends adlz implements adlr {
    public final adlt a;
    public Optional b;
    public final ImageView c;
    public final ImageView d;

    public jfe(adlt adltVar, ViewGroup viewGroup) {
        this.a = adltVar;
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.mdx_loop);
        imageView.getClass();
        this.c = imageView;
        ImageView imageView2 = (ImageView) viewGroup.findViewById(R.id.mdx_shuffle);
        imageView2.getClass();
        this.d = imageView2;
        this.b = Optional.empty();
        jfd jfdVar = new jfd(this);
        imageView.setOnClickListener(jfdVar);
        imageView2.setOnClickListener(jfdVar);
    }

    @Override // defpackage.adlr
    public final void j(adlm adlmVar) {
    }

    @Override // defpackage.adlr
    public final void k(adlm adlmVar) {
        if (this.b.isPresent()) {
            ((adlm) this.b.get()).O(this);
            this.b = Optional.empty();
        }
    }

    @Override // defpackage.adlr
    public final void l(adlm adlmVar) {
        Optional of = Optional.of(adlmVar);
        this.b = of;
        ((adlm) of.get()).A(this);
        n();
    }

    @Override // defpackage.adlz, defpackage.adlq
    public final void m() {
        n();
    }

    public final void n() {
        if (this.b.isPresent()) {
            this.c.setSelected(((adlm) this.b.get()).ad());
            this.d.setSelected(((adlm) this.b.get()).af());
        }
    }
}
