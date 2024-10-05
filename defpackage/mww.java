package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mww implements ajom {
    private final ajjz a;
    private final mwt b;
    private final View c;
    private final TextView d;
    private final ImageView e;
    private final View f;
    private final Context g;
    private final float h;

    public mww(Context context, ajjz ajjzVar, mwt mwtVar, ViewGroup viewGroup) {
        this.a = ajjzVar;
        this.b = mwtVar;
        this.g = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.topic_picker_item, viewGroup, false);
        this.c = inflate;
        View findViewById = inflate.findViewById(R.id.content_view);
        this.f = findViewById;
        this.d = (TextView) findViewById.findViewById(R.id.title);
        this.e = (ImageView) findViewById.findViewById(R.id.image);
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(R.dimen.topic_picker_item_selected_alpha, typedValue, true);
        this.h = typedValue.getFloat();
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    public final void d(mwu mwuVar) {
        mwu mwuVar2;
        atsd atsdVar;
        mwt mwtVar = this.b;
        String a = mwuVar.a();
        if (mwuVar.g) {
            mwtVar.h.add(a);
        } else {
            mwtVar.h.remove(a);
        }
        mwtVar.i();
        if (mwuVar.g && (mwuVar == null || !mwuVar.c)) {
            int i = mwuVar != null ? mwuVar.f : 0;
            int i2 = mwtVar.c;
            if (i2 == -1 || i < i2) {
                if (mwtVar.j.containsKey(a)) {
                    mwtVar.c(a, (List) mwtVar.j.get(a));
                } else {
                    ajce ajceVar = null;
                    if (mwuVar == null) {
                        mwuVar2 = null;
                    } else if (!mwuVar.d) {
                        mwuVar2 = mwuVar;
                    }
                    mwn mwnVar = mwtVar.k;
                    if (mwnVar != null) {
                        if (mwuVar.a.g.size() != 0) {
                            aony aonyVar = mwuVar.a.g;
                            if (aonyVar.size() > 1) {
                                zga.b("Only one continuation expected. First will be processed, others will be ignored.");
                            }
                            if (((avie) aonyVar.get(0)).b == 91229939) {
                                avie avieVar = (avie) aonyVar.get(0);
                                if (avieVar.b == 91229939) {
                                    atsdVar = (atsd) avieVar.c;
                                } else {
                                    atsdVar = atsd.a;
                                }
                                ajceVar = ahbj.o(atsdVar);
                            }
                        }
                        if (ajceVar != null) {
                            mwnVar.b.b(mwnVar.b.a(ajceVar), mwnVar.d, new mwl(mwnVar));
                            mwuVar.d = true;
                        }
                    }
                    mwuVar = mwuVar2;
                }
            }
        }
        this.c.setSelected(mwuVar.g);
        this.e.setAlpha(mwuVar.g ? this.h : 1.0f);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(final ajok ajokVar, Object obj) {
        aqyg aqygVar;
        avgg avggVar;
        final mwu mwuVar = (mwu) obj;
        int dimensionPixelSize = this.g.getResources().getDimensionPixelSize(R.dimen.topic_picker_item_top_bottom_padding);
        int dimensionPixelSize2 = this.g.getResources().getDimensionPixelSize(R.dimen.topic_picker_item_start_end_padding);
        this.f.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        this.c.setOnClickListener(new View.OnClickListener() { // from class: mwv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mww mwwVar = mww.this;
                mwu mwuVar2 = mwuVar;
                ajok ajokVar2 = ajokVar;
                mwuVar2.g = !mwuVar2.g;
                mwwVar.d(mwuVar2);
                acra acraVar = ajokVar2.a;
                byte[] b = mwuVar2.b();
                boolean z = mwuVar2.g;
                aone createBuilder = asht.a.createBuilder();
                aone createBuilder2 = ashk.a.createBuilder();
                int i = true != z ? 3 : 2;
                createBuilder2.copyOnWrite();
                ashk ashkVar = (ashk) createBuilder2.instance;
                ashkVar.c = i - 1;
                ashkVar.b |= 1;
                createBuilder.copyOnWrite();
                asht ashtVar = (asht) createBuilder.instance;
                ashk ashkVar2 = (ashk) createBuilder2.build();
                ashkVar2.getClass();
                ashtVar.m = ashkVar2;
                ashtVar.b |= 32768;
                asht ashtVar2 = (asht) createBuilder.build();
                if (b != null) {
                    acraVar.I(3, new acqx(b), ashtVar2);
                }
            }
        });
        d(mwuVar);
        TextView textView = this.d;
        avih avihVar = mwuVar.a;
        if ((avihVar.b & 1) != 0) {
            aqygVar = avihVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        ajjz ajjzVar = this.a;
        ImageView imageView = this.e;
        avih avihVar2 = mwuVar.a;
        if ((avihVar2.b & 2) != 0) {
            avggVar = avihVar2.d;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
        } else {
            avggVar = null;
        }
        ajjzVar.h(imageView, avggVar);
        if (mwuVar.b() != null) {
            ajokVar.a.u(new acqx(mwuVar.b()), null);
        }
        mwt mwtVar = this.b;
        String a = mwuVar.a();
        if (mwtVar.i.containsKey(a)) {
            ((mwu) mwtVar.i.get(a)).b = true;
        }
    }
}
