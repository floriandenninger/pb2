package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class leg extends ajpc {
    public final aahd a;
    private final Context b;
    private final ajop c;
    private final Resources d;
    private final ViewGroup e;
    private final TextView f;
    private final View.OnClickListener g;
    private final ViewGroup h;
    private final ViewGroup i;
    private ViewGroup j;

    public leg(Context context, gma gmaVar, aahd aahdVar) {
        this.b = context;
        this.c = gmaVar;
        this.a = aahdVar;
        ViewGroup viewGroup = (ViewGroup) View.inflate(context, R.layout.query_refinements_item, null);
        this.e = viewGroup;
        this.d = context.getResources();
        this.f = (TextView) viewGroup.findViewById(R.id.title);
        this.h = (ViewGroup) viewGroup.findViewById(R.id.refinements_columns);
        this.i = f(0);
        this.g = new lef(this);
        gmaVar.c(viewGroup);
    }

    private final ViewGroup f(int i) {
        if (i >= this.h.getChildCount()) {
            View.inflate(this.b, R.layout.query_refinements_column, this.h);
        }
        return (ViewGroup) this.h.getChildAt(i);
    }

    private final void g(ViewGroup viewGroup, Iterator it, int i) {
        aqyg aqygVar;
        int childCount = viewGroup.getChildCount();
        while (childCount < i) {
            View.inflate(this.b, R.layout.query_refinements_link, viewGroup);
            childCount++;
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            TextView textView = (TextView) viewGroup.getChildAt(i2);
            if (i2 >= i || !it.hasNext()) {
                textView.setVisibility(8);
            } else {
                auil auilVar = (auil) it.next();
                if ((auilVar.b & 1) != 0) {
                    aqygVar = auilVar.c;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                } else {
                    aqygVar = null;
                }
                textView.setText(ajcq.b(aqygVar));
                apxf apxfVar = auilVar.d;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                textView.setTag(R.id.tag_endpoint, apxfVar);
                textView.setOnClickListener(this.g);
                textView.setVisibility(0);
            }
        }
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.c).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    public final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        List arrayList;
        aqyg aqygVar;
        auim auimVar = (auim) obj;
        boolean z = this.d.getBoolean(R.bool.query_refinements_two_columns);
        if (auimVar.d.size() == 0) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList();
            Iterator it = auimVar.d.iterator();
            while (it.hasNext()) {
                auil auilVar = ((auin) it.next()).b;
                if (auilVar == null) {
                    auilVar = auil.a;
                }
                int i = auilVar.b;
                if ((i & 1) != 0 && (i & 2) != 0) {
                    arrayList.add(auilVar);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        TextView textView = this.f;
        if ((auimVar.b & 1) != 0) {
            aqygVar = auimVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        int size = arrayList.size();
        if (z) {
            double d = size;
            Double.isNaN(d);
            size = (int) Math.ceil(d / 2.0d);
        }
        g(this.i, it2, size);
        if (z) {
            if (this.j == null) {
                this.j = f(1);
            }
            g(this.j, it2, size);
            this.j.setVisibility(0);
        } else {
            ViewGroup viewGroup = this.j;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
        }
        this.c.e(ajokVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((auim) obj).e.I();
    }
}
