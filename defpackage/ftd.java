package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ftd implements ajom {
    public final aahd a;
    public final ftg b;
    public final ViewGroup c;
    final Spinner d;
    public ajok e;
    private final fhz f;
    private final ajut g;
    private final ftb h;

    public ftd(Context context, aahd aahdVar, fhz fhzVar, ajut ajutVar, akbd akbdVar, ViewGroup viewGroup, int i, int i2) {
        this.a = aahdVar;
        this.f = fhzVar;
        this.g = ajutVar;
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.sort_filter, viewGroup, false);
        this.c = viewGroup2;
        Spinner spinner = (Spinner) viewGroup2.findViewById(R.id.spinner);
        this.d = spinner;
        akbdVar.b(spinner, akbdVar.a(spinner, null));
        ftg i3 = fav.i(viewGroup2, spinner, i2, i, context.getResources().getDimensionPixelOffset(R.dimen.sort_filter_top_bottom_padding));
        this.b = i3;
        i3.a.add(new fta(this));
        spinner.setAdapter((SpinnerAdapter) i3);
        this.h = new ftb(this);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        ajok ajokVar = this.e;
        if (ajokVar == null || ldg.b(ajokVar)) {
            return;
        }
        this.f.d(this);
    }

    @Override // defpackage.ajom
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void oB(ajok ajokVar, final auwh auwhVar) {
        int i;
        this.e = ajokVar;
        this.b.b = auwhVar.d;
        this.d.setOnItemSelectedListener(null);
        ftg ftgVar = this.b;
        aony aonyVar = auwhVar.c;
        ArrayList arrayList = new ArrayList();
        Iterator it = aonyVar.iterator();
        while (it.hasNext()) {
            arrayList.add(new ftc((auwg) it.next()));
        }
        ftgVar.a(arrayList);
        int i2 = 0;
        while (true) {
            if (i2 >= auwhVar.c.size()) {
                i2 = 0;
                break;
            } else if (((auwg) auwhVar.c.get(i2)).g) {
                break;
            } else {
                i2++;
            }
        }
        this.h.a = i2;
        this.d.setSelection(i2, false);
        this.d.setOnItemSelectedListener(this.h);
        this.d.setOnTouchListener(new View.OnTouchListener() { // from class: fsz
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ajok ajokVar2;
                ftd ftdVar = ftd.this;
                auwh auwhVar2 = auwhVar;
                if (motionEvent.getAction() != 1 || (ajokVar2 = ftdVar.e) == null) {
                    return false;
                }
                fav.L(ajokVar2, auwhVar2);
                view.performClick();
                return false;
            }
        });
        if (!ldg.b(ajokVar)) {
            this.f.b(this);
        }
        if ((auwhVar.b & 2) != 0) {
            ajut ajutVar = this.g;
            arfs arfsVar = auwhVar.e;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            arfr b = arfr.b(arfsVar.c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            i = ajutVar.a(b);
        } else {
            i = 0;
        }
        View findViewById = this.d.findViewById(R.id.icon);
        if (findViewById instanceof ImageView) {
            if (i != 0) {
                ((ImageView) findViewById).setImageResource(i);
            }
            whu.I(findViewById, i != 0);
        }
        this.b.c = i;
        fav.M(ajokVar, auwhVar);
    }
}
