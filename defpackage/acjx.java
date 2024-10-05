package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acjx implements AdapterView.OnItemSelectedListener, ajom {
    public final Spinner a;
    public final Spinner b;
    public final View c;
    public acjw d;
    private final ajyg e;
    private final Activity f;
    private final ajut g;
    private final acra h;
    private final aahd i;
    private final TextView j;
    private final TextView k;
    private final TextView l;
    private final YouTubeTextView m;
    private final YouTubeTextView n;
    private final TextView o;
    private final TextView p;

    public acjx(Activity activity, ajut ajutVar, aahd aahdVar, acra acraVar, ajyg ajygVar) {
        this.f = activity;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.lc_pre_stream_audience_settings, (ViewGroup) null);
        this.c = inflate;
        ajutVar.getClass();
        this.g = ajutVar;
        acraVar.getClass();
        this.h = acraVar;
        aahdVar.getClass();
        this.i = aahdVar;
        ajygVar.getClass();
        this.e = ajygVar;
        this.j = (TextView) inflate.findViewById(R.id.pre_stream_audience_info_title);
        this.k = (TextView) inflate.findViewById(R.id.pre_stream_kids_info_title);
        this.l = (TextView) inflate.findViewById(R.id.pre_stream_kids_info_description);
        this.a = (Spinner) inflate.findViewById(R.id.pre_stream_kids_content_option_list);
        this.b = (Spinner) inflate.findViewById(R.id.pre_stream_adult_content_option_list);
        this.o = (TextView) inflate.findViewById(R.id.pre_stream_adult_content_title);
        this.p = (TextView) inflate.findViewById(R.id.pre_stream_adult_section_info_description);
        this.m = (YouTubeTextView) inflate.findViewById(R.id.learn_more_button);
        this.n = (YouTubeTextView) inflate.findViewById(R.id.learn_more_adult_section_button);
    }

    private final void h() {
        this.o.setTextColor(this.f.getResources().getColor(R.color.yt_grey3));
        this.b.setAlpha(0.45f);
        this.o.setAlpha(0.45f);
        this.p.setAlpha(0.45f);
        this.b.setEnabled(false);
    }

    private final void i() {
        this.o.setTextColor(this.f.getResources().getColor(R.color.yt_white1));
        this.b.setAlpha(1.0f);
        this.o.setAlpha(1.0f);
        this.p.setAlpha(1.0f);
        this.b.setEnabled(true);
    }

    private final void j() {
        this.k.setTextColor(this.f.getResources().getColor(R.color.yt_white1));
        this.l.setTextColor(this.f.getResources().getColor(R.color.yt_grey1));
        this.a.setAlpha(1.0f);
        this.a.setEnabled(true);
    }

    private final void k() {
        acka ackaVar = (acka) this.b.getAdapter();
        int count = ackaVar.getCount();
        for (int i = 0; i < count; i++) {
            asgh item = ackaVar.getItem(i);
            if (item != null && item.c == 3 && ((Integer) item.d).intValue() == adyu.co(2)) {
                ackaVar.e = i;
                this.b.setSelection(i);
                return;
            }
        }
    }

    private final void l(acka ackaVar, Spinner spinner) {
        int count = ackaVar.getCount();
        for (int i = 0; i < count; i++) {
            asgh item = ackaVar.getItem(i);
            if (item.h) {
                spinner.setSelection(i);
                ackaVar.e = i;
                if ((item.c == 3 ? ((Integer) item.d).intValue() : 0) != adyu.co(3)) {
                    if ((item.c == 3 ? ((Integer) item.d).intValue() : 0) == adyu.co(4)) {
                        i();
                        return;
                    } else {
                        i();
                        j();
                        return;
                    }
                }
                k();
                h();
                j();
                return;
            }
        }
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.aveo r12) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acjx.d(aveo):void");
    }

    public final void e(aveo aveoVar) {
        aveoVar.getClass();
        d(aveoVar);
    }

    public final int f() {
        asgh asghVar = (asgh) this.a.getSelectedItem();
        asgh asghVar2 = (asgh) this.b.getSelectedItem();
        if ((asghVar.c == 3 ? ((Integer) asghVar.d).intValue() : 0) != adyu.co(1)) {
            if ((asghVar.c == 3 ? ((Integer) asghVar.d).intValue() : 0) != adyu.co(3)) {
                if ((asghVar.c == 3 ? ((Integer) asghVar.d).intValue() : 0) == adyu.co(1)) {
                    return amkq.dm(asghVar.c == 3 ? ((Integer) asghVar.d).intValue() : 0);
                }
                if ((asghVar2.c == 3 ? ((Integer) asghVar2.d).intValue() : 0) == adyu.co(4)) {
                    return amkq.dm(asghVar2.c == 3 ? ((Integer) asghVar2.d).intValue() : 0);
                }
                return 2;
            }
        }
        return amkq.dm(asghVar.c == 3 ? ((Integer) asghVar.d).intValue() : 0);
    }

    public final void g(acka ackaVar, int i, Spinner spinner) {
        int i2;
        if (ackaVar != null) {
            int count = ackaVar.getCount();
            for (int i3 = 0; i3 < count; i3++) {
                asgh item = ackaVar.getItem(i3);
                if (item != null && item.c == 3 && ((Integer) item.d).intValue() == i - 1) {
                    spinner.setSelection(i3);
                    ackaVar.e = i3;
                    if (i2 == adyu.co(3)) {
                        k();
                        h();
                        j();
                        return;
                    } else if (i2 == adyu.co(4)) {
                        i();
                        return;
                    } else {
                        j();
                        i();
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        e((aveo) obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
    
        if (r6 != 1) goto L28;
     */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onItemSelected(android.widget.AdapterView r2, android.view.View r3, int r4, long r5) {
        /*
            r1 = this;
            int r3 = r1.f()
            android.widget.Adapter r2 = r2.getAdapter()
            acka r2 = (defpackage.acka) r2
            r2.e = r4
            int r2 = r3 + (-1)
            r4 = 0
            if (r3 == 0) goto L8d
            r3 = 4
            int r3 = defpackage.adyu.co(r3)
            r5 = 1
            if (r2 != r3) goto L1d
            r1.i()
            goto L4a
        L1d:
            r3 = 3
            int r6 = defpackage.adyu.co(r3)
            if (r2 != r6) goto L44
            android.widget.Spinner r2 = r1.b
            java.lang.Object r2 = r2.getSelectedItem()
            asgh r2 = (defpackage.asgh) r2
            int r6 = r2.c
            if (r6 != r3) goto L3a
            java.lang.Object r2 = r2.d
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 == r5) goto L3d
        L3a:
            r1.k()
        L3d:
            r1.h()
            r1.j()
            goto L4a
        L44:
            r1.j()
            r1.i()
        L4a:
            acjw r2 = r1.d
            if (r2 == 0) goto L8c
            acjl r2 = (defpackage.acjl) r2
            acjx r3 = r2.af
            if (r3 == 0) goto L8c
            android.widget.Button r3 = r2.ak
            com.google.android.libraries.youtube.livecreation.ui.view.EditTextTitle r6 = r2.ag
            android.text.Editable r6 = r6.getText()
            java.lang.String r6 = r6.toString()
            boolean r6 = defpackage.acjl.aO(r6)
            r0 = 0
            if (r6 == 0) goto L73
            acjx r6 = r2.af
            int r6 = r6.f()
            if (r6 == 0) goto L72
            if (r6 == r5) goto L73
            goto L74
        L72:
            throw r4
        L73:
            r5 = 0
        L74:
            r3.setEnabled(r5)
            acjv r3 = r2.ae
            if (r3 == 0) goto L8c
            boolean r3 = r2.aL()
            if (r3 == 0) goto L87
            acjv r2 = r2.ae
            r2.a()
            return
        L87:
            acjv r2 = r2.ae
            r2.b()
        L8c:
            return
        L8d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acjx.onItemSelected(android.widget.AdapterView, android.view.View, int, long):void");
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
