package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lfi implements ajom {
    public final Resources a;
    public final ypa b;
    public final TextView c;
    public final Spinner d;
    private final View e;
    private final Context f;

    public lfi(Context context, ypa ypaVar, ViewGroup viewGroup) {
        this.f = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.watch_card_dropdown, viewGroup, false);
        this.e = inflate;
        this.b = ypaVar;
        this.d = (Spinner) inflate.findViewById(R.id.dropdown_spinner);
        this.c = (TextView) inflate.findViewById(R.id.subtitles);
        this.a = context.getResources();
        inflate.getViewTreeObserver().addOnGlobalLayoutListener(new lfh(this, inflate));
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.e;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        awcx awcxVar = (awcx) obj;
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.f, R.layout.uwc_spinner_title, ajcq.o((aqyg[]) awcxVar.d.toArray(new aqyg[0])));
        arrayAdapter.setDropDownViewResource(R.layout.uwc_spinner_item);
        this.d.setAdapter((SpinnerAdapter) arrayAdapter);
        this.d.setOnTouchListener(new lff(awcxVar, ajokVar));
        this.d.setOnItemSelectedListener(new lfg(this, awcxVar));
        this.d.setSelection(awcxVar.pY(awbs.b) ? ((Integer) awcxVar.pX(awbs.b)).intValue() : 0);
    }
}
