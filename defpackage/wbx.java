package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wbx implements ajom {
    public final wic a;
    public final acra b;
    public final View c;
    public aata d;
    private final ajut e;
    private final Context f;
    private final ajjz g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private final View k;
    private final View l;
    private final ImageView m;
    private final ImageView n;
    private final akpq o;

    public wbx(Context context, ajjz ajjzVar, acra acraVar, final wia wiaVar, wic wicVar, ajut ajutVar, akpq akpqVar, byte[] bArr) {
        wiaVar.getClass();
        this.f = context;
        this.g = ajjzVar;
        this.b = acraVar;
        this.e = ajutVar;
        this.o = akpqVar;
        this.a = wicVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.fusion_account_item_layout, (ViewGroup) null);
        this.c = inflate;
        this.h = (TextView) inflate.findViewById(R.id.name);
        this.i = (TextView) inflate.findViewById(R.id.byline);
        this.k = inflate.findViewById(R.id.selection_checkmark);
        this.l = inflate.findViewById(R.id.selection_highlight);
        this.m = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.n = (ImageView) inflate.findViewById(R.id.icon);
        this.j = (TextView) inflate.findViewById(R.id.edit_channel);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: wbu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wiaVar.a(wbx.this.d);
            }
        });
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.aata r10) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wbx.d(aata):void");
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        d((aata) obj);
    }
}
