package defpackage;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mfl {
    public final ViewGroup a;
    public final TextView b;
    public final ImageView c;
    public final fqw d;
    public final aahd e;
    public apmg f;
    public aowm g;
    private final xbw h;

    public mfl(aahd aahdVar, xbw xbwVar, ViewGroup viewGroup, ajyw ajywVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = viewGroup;
        this.e = aahdVar;
        this.h = xbwVar;
        this.b = (TextView) viewGroup.findViewById(R.id.ad_cta_button_text);
        this.c = (ImageView) viewGroup.findViewById(R.id.ad_cta_button_icon);
        this.d = ajywVar.r(null, viewGroup);
        viewGroup.setVisibility(8);
    }

    public final Map a(Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
        hashMap.put("MacrosConverters.CustomConvertersKey", new afxe[]{this.h});
        return hashMap;
    }
}
