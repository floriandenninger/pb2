package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.red.presenter.NavigationDropdownView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kzp implements ajom, kzv {
    public final aahd a;
    public final gje b;
    public final NavigationDropdownView c;
    public ajwx d;
    private final Context e;
    private final Resources f;
    private final View g;
    private final View h;
    private final View i;
    private final View j;
    private boolean k;

    public kzp(Context context, aahd aahdVar, gje gjeVar) {
        this.e = context;
        this.a = aahdVar;
        this.b = gjeVar;
        this.f = context.getResources();
        View inflate = LayoutInflater.from(context).inflate(R.layout.episodes_section_header_layout, (ViewGroup) null);
        this.g = inflate;
        NavigationDropdownView navigationDropdownView = (NavigationDropdownView) inflate.findViewById(R.id.season_picker);
        this.c = navigationDropdownView;
        navigationDropdownView.g = this;
        this.h = navigationDropdownView.findViewById(R.id.dropdown_header);
        this.i = navigationDropdownView.findViewById(R.id.dropdown_items);
        this.j = navigationDropdownView.findViewById(R.id.bottom_divider);
        this.k = false;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.g;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.c.b(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ajom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void oB(defpackage.ajok r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kzp.oB(ajok, java.lang.Object):void");
    }
}
