package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class frg extends ajpc {
    public final gno a;
    public final TextView b;
    private final Map c;

    public frg(Context context, akht akhtVar, ajyc ajycVar, Map map, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this(context, akhtVar, ajycVar, map, R.layout.button, null, null, null, null);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.a.a(null, null, null);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        apmg apmgVar = (apmg) obj;
        HashMap hashMap = new HashMap();
        Map map = this.c;
        if (map == null) {
            map = Collections.emptyMap();
        }
        hashMap.putAll(map);
        hashMap.putAll(ajokVar.e());
        this.a.a(apmgVar, ajokVar.a, hashMap);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((apmg) obj).t.I();
    }

    public frg(Context context, akht akhtVar, ajyc ajycVar, Map map, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        TextView textView = (TextView) LayoutInflater.from(context).inflate(i, (ViewGroup) null, false);
        this.b = textView;
        gno h = akhtVar.h(textView);
        this.a = h;
        h.e(R.dimen.text_button_icon_padding);
        if (ajycVar != null) {
            h.c = ajycVar;
        }
        this.c = map;
    }
}
