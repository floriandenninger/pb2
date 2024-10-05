package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nai {
    public View A;
    public Drawable B;
    public final int a;
    public final int b;
    public final int c;
    public final ViewStub d;
    public final Context e;
    public final ajjz f;
    public final aahd g;
    public final ajuw h;
    public final wyz i;
    public final tdv j;
    public final wzq k;
    public final euv l;
    public final View m;
    public final Resources n;
    public ngv o;
    public View p;
    public View q;
    public View r;
    public TextView s;
    public TextView t;
    public TextView u;
    public RatingBar v;
    public TextView w;
    public TextView x;
    public TextView y;
    public ImageView z;

    /* JADX INFO: Access modifiers changed from: protected */
    public nai(Context context, ajjz ajjzVar, aahd aahdVar, ajuw ajuwVar, wyz wyzVar, tdv tdvVar, wzq wzqVar, euv euvVar, View view, int i) {
        this.e = context;
        this.f = ajjzVar;
        this.g = aahdVar;
        this.h = ajuwVar;
        this.i = wyzVar;
        this.j = tdvVar;
        this.k = wzqVar;
        this.l = euvVar;
        view.getClass();
        this.m = view;
        this.n = context.getResources();
        this.a = wbs.W(context, R.attr.adBlue).orElse(0);
        this.b = wbs.W(context, R.attr.adText1).orElse(0);
        this.c = wbs.W(context, R.attr.adBackground1).orElse(0);
        this.d = (ViewStub) view.findViewById(i);
    }
}
