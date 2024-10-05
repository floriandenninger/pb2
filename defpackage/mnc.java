package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mnc extends ajpc {
    private final Context a;
    private final View b;
    private final ajjz c;
    private final ajuw d;
    private final ImageView e;
    private final ajoi f;
    private final ajop g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private final TextView k;
    private final TextView l;
    private final TextView m;
    private final TextView n;
    private final ViewGroup o;
    private final ViewGroup p;
    private final View q;
    private final View r;

    public mnc(Context context, ajjz ajjzVar, ajut ajutVar, ajoy ajoyVar, ajuw ajuwVar, gma gmaVar, byte[] bArr) {
        this.a = context;
        ajjzVar.getClass();
        this.c = ajjzVar;
        ajutVar.getClass();
        this.d = ajuwVar;
        this.g = gmaVar;
        this.f = ajoyVar.c(gmaVar);
        View inflate = LayoutInflater.from(context).inflate(R.layout.compact_premium_show_item, (ViewGroup) null);
        this.r = inflate;
        this.b = inflate.findViewById(R.id.thumbnail_layout);
        this.e = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.j = (TextView) inflate.findViewById(R.id.thumbnail_overlay_bottom_panel);
        this.k = (TextView) inflate.findViewById(R.id.thumbnail_bottom_panel);
        this.q = inflate.findViewById(R.id.contextual_menu_anchor);
        this.m = (TextView) inflate.findViewById(R.id.title);
        this.p = (ViewGroup) inflate.findViewById(R.id.top_standalone_badges_container);
        this.l = (TextView) inflate.findViewById(R.id.subtitle);
        this.n = (TextView) inflate.findViewById(R.id.top_metadata);
        this.i = (TextView) inflate.findViewById(R.id.description);
        this.h = (TextView) inflate.findViewById(R.id.bottom_metadata);
        this.o = (ViewGroup) inflate.findViewById(R.id.bottom_standalone_badges_container);
        gmaVar.c(inflate);
    }

    private static CharSequence f(List list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ajcq.b((aqyg) it.next()));
        }
        return TextUtils.join(System.getProperty("line.separator"), arrayList);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.g).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.f.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x008d  */
    @Override // defpackage.ajpc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* synthetic */ void d(defpackage.ajok r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mnc.d(ajok, java.lang.Object):void");
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqck) obj).o.I();
    }
}
