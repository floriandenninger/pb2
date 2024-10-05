package defpackage;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajoy {
    public final azrw a;

    public ajoy(azrw azrwVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, byte[] bArr, byte[] bArr2, byte[] bArr3, char[] cArr) {
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, byte[] bArr, byte[] bArr2, char[] cArr, char[] cArr2) {
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, char[] cArr, byte[] bArr) {
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, char[] cArr, short[] sArr) {
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, int[] iArr, byte[] bArr) {
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, short[] sArr) {
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, short[] sArr, byte[] bArr, byte[] bArr2) {
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, short[] sArr, byte[] bArr, char[] cArr) {
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, short[] sArr, char[] cArr, byte[] bArr) {
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, boolean[] zArr) {
        this.a = azrwVar;
    }

    public final vlw A(int i) {
        return new vlw(this.a, i);
    }

    public final vlt B() {
        return new vlt((amnp) this.a.get(), null);
    }

    public final vlv C(awzd awzdVar, awze awzeVar) {
        return new vlt((amnp) this.a.get(), null).b(awzdVar, awzeVar);
    }

    public final utz D(float f) {
        Random random = (Random) this.a.get();
        random.getClass();
        return new utz(random, f);
    }

    public final jpp E(String str) {
        aais aaisVar = (aais) this.a.get();
        aaisVar.getClass();
        str.getClass();
        return new jpp(aaisVar, str);
    }

    public final jpo F() {
        fjm fjmVar = (fjm) this.a.get();
        fjmVar.getClass();
        return new jpo(fjmVar);
    }

    public final jpj G(String str) {
        aahv aahvVar = (aahv) this.a.get();
        aahvVar.getClass();
        str.getClass();
        return new jpj(aahvVar, str);
    }

    public final ini H() {
        aoae aoaeVar = (aoae) this.a.get();
        aoaeVar.getClass();
        return new ini(aoaeVar, null, null, null, null);
    }

    public final gaf I(Context context, View view) {
        ajut ajutVar = (ajut) this.a.get();
        ajutVar.getClass();
        context.getClass();
        view.getClass();
        return new gaf(ajutVar, context, view);
    }

    public final gaf J(Context context, ViewStub viewStub) {
        ajut ajutVar = (ajut) this.a.get();
        ajutVar.getClass();
        context.getClass();
        viewStub.getClass();
        return new gaf(ajutVar, context, viewStub);
    }

    public final Cfor K(SwipeRefreshLayout swipeRefreshLayout) {
        rxm rxmVar = (rxm) this.a.get();
        rxmVar.getClass();
        swipeRefreshLayout.getClass();
        return new Cfor(rxmVar, swipeRefreshLayout, null);
    }

    public final ajox a(ajos ajosVar) {
        aoae aoaeVar = (aoae) this.a.get();
        aoaeVar.getClass();
        ajosVar.getClass();
        return new ajox(aoaeVar, ajosVar, null);
    }

    public final ajox b(ajos ajosVar, ViewGroup.LayoutParams layoutParams) {
        aoae aoaeVar = (aoae) this.a.get();
        aoaeVar.getClass();
        ajosVar.getClass();
        return new ajox(aoaeVar, ajosVar, layoutParams, (byte[]) null);
    }

    public final ajoi c(ajop ajopVar) {
        aahd aahdVar = (aahd) this.a.get();
        aahdVar.getClass();
        return new ajoi(aahdVar, ajopVar);
    }

    public final ajoi d(ajop ajopVar, ajof ajofVar) {
        aahd aahdVar = (aahd) this.a.get();
        aahdVar.getClass();
        return new ajoi(aahdVar, ajopVar, ajofVar);
    }

    public final ajoa e(ajos ajosVar) {
        aoae aoaeVar = (aoae) this.a.get();
        aoaeVar.getClass();
        ajosVar.getClass();
        return new ajoa(aoaeVar, ajosVar, null);
    }

    public final agmy f(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, int i, int i2, int i3, boolean z, String str) {
        aeer aeerVar = new aeer();
        aeerVar.a = new aeex(i, i);
        aeerVar.b = g(i3);
        aeerVar.d = i2;
        aeerVar.e = true != z ? 0 : 32;
        if (!TextUtils.isEmpty(str)) {
            aeerVar.c = str;
        }
        try {
            aeeu a = ((aeeq) this.a.get()).a(videoStreamingData.m(), playerConfigModel, new aees(aeerVar.a, aeerVar.b, false, aeerVar.c, -1, -2, -1L, aeerVar.d, aeerVar.e));
            FormatStreamModel[] g = a.g();
            FormatStreamModel[] formatStreamModelArr = a.b;
            FormatStreamModel formatStreamModel = g.length > 0 ? g[0] : null;
            FormatStreamModel formatStreamModel2 = formatStreamModelArr.length > 0 ? formatStreamModelArr[0] : null;
            if (z && formatStreamModel2 != null) {
                formatStreamModel = null;
            }
            if (formatStreamModel == null && formatStreamModel2 == null) {
                return null;
            }
            return new agmy(formatStreamModel, formatStreamModel2);
        } catch (aeew unused) {
            return null;
        }
    }

    public final void h(agnb agnbVar) {
        yjk.e();
        agil agilVar = (agil) this.a.get();
        if (agilVar.b(agnbVar.a) == null) {
            agilVar.O(agnbVar);
        } else {
            agilVar.S(agnbVar);
        }
    }

    public final void i(agnp agnpVar) {
        agnb agnbVar = agnpVar.a;
        if (agnbVar != null) {
            h(agnbVar);
        }
    }

    public final void j(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i((agnp) it.next());
        }
    }

    public final agsh k() {
        return l().g();
    }

    public final agsn l() {
        return ((agof) this.a.get()).a();
    }

    public final afjm m(acsx acsxVar) {
        shf shfVar = (shf) this.a.get();
        shfVar.getClass();
        return new afjm(acsxVar, shfVar);
    }

    public final aeix n(aejn aejnVar, ate ateVar, afhi afhiVar, aelf aelfVar, String str) {
        axzg axzgVar = (axzg) this.a.get();
        axzgVar.getClass();
        aejnVar.getClass();
        ateVar.getClass();
        afhiVar.getClass();
        return new aeix(axzgVar, aejnVar, ateVar, afhiVar, aelfVar, str, null, null);
    }

    public final void o(int i) {
        adul adulVar = (adul) this.a.get();
        adub adubVar = adulVar.i;
        if (adubVar.a == 2) {
            adtw b = adubVar.f.b();
            b.c(i);
            adulVar.i(b);
            adulVar.b(0);
        }
    }

    public final anhy p() {
        return anfq.h(((vgz) this.a.get()).a(), aczu.f, angq.a);
    }

    public final anhy q() {
        return anfq.h(((vgz) this.a.get()).a(), aczu.g, angq.a);
    }

    public final anhy r() {
        return ((vgz) this.a.get()).b(aczu.i, angq.a);
    }

    public final acsk s(InteractionLoggingScreen interactionLoggingScreen) {
        acre acreVar = (acre) this.a.get();
        acreVar.getClass();
        return new acsk(acreVar, interactionLoggingScreen);
    }

    public final aone t() {
        yjk.e();
        aone createBuilder = arnb.a.createBuilder();
        Set set = (Set) this.a.get();
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((aarz) it.next()).a(createBuilder);
            }
        }
        return createBuilder;
    }

    public final void u(String str) {
        yjk.e();
        NetworkInfo a = ((yvu) this.a.get()).a();
        if (a == null || !a.isConnected()) {
            return;
        }
        try {
            InetAddress.getByName(str);
        } catch (UnknownHostException unused) {
            String.valueOf(str).length();
        }
    }

    public final int v(String str, Bundle bundle) {
        zhq.m(str);
        ylb a = ((yla) this.a.get()).a(str);
        if (a != null) {
            return a.a(bundle);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
        sb.append("Unknown task tag ");
        sb.append(str);
        sb.append("; aborting...");
        zga.l(sb.toString());
        return 1;
    }

    public final void w(int i, xeo xeoVar, wwc wwcVar) {
        ((wwd) this.a.get()).u(i, xeoVar);
        ((wwd) this.a.get()).t(i, xeoVar, wwcVar.a());
    }

    public final String x() {
        return ((zgj) this.a.get()).a();
    }

    public final wfd y(wed wedVar, ViewGroup viewGroup) {
        Context context = (Context) this.a.get();
        context.getClass();
        wedVar.getClass();
        return new wfd(context, wedVar, viewGroup);
    }

    public final vmg z(awzb awzbVar) {
        awzbVar.getClass();
        amnp amnpVar = (amnp) this.a.get();
        amnpVar.getClass();
        return new vmg(awzbVar, amnpVar);
    }

    public ajoy(azrw azrwVar, char[] cArr, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, byte[] bArr, char[] cArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, short[] sArr, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, byte[] bArr, byte[] bArr2, char[] cArr, byte[] bArr3, byte[] bArr4) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public static final aeex g(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            return new aeex(2, 2);
        }
        if (i2 == 2) {
            return new aeex(3, 3);
        }
        if (i2 == 3) {
            return new aeex(4, 4);
        }
        return aees.a;
    }

    public ajoy(azrw azrwVar, char[] cArr, char[] cArr2, byte[] bArr, byte[] bArr2) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, byte[] bArr, short[] sArr, byte[] bArr2, byte[] bArr3) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, int[] iArr, byte[] bArr, byte[] bArr2) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, byte[] bArr, byte[] bArr2, byte[] bArr3, char[] cArr, byte[] bArr4) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, char[] cArr, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, byte[] bArr, char[] cArr, char[] cArr2, byte[] bArr2) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, byte[] bArr, byte[] bArr2, short[] sArr, byte[] bArr3) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, char[] cArr, short[] sArr, byte[] bArr) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, byte[] bArr, short[] sArr, byte[] bArr2) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, int[] iArr, char[] cArr) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, byte[] bArr, char[] cArr, byte[] bArr2, char[] cArr2) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, char[] cArr, char[] cArr2, byte[] bArr) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, byte[] bArr, char[] cArr, char[] cArr2) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, short[] sArr, char[] cArr) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, byte[] bArr, byte[] bArr2, byte[] bArr3, short[] sArr) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, char[] cArr, byte[] bArr, short[] sArr) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, byte[] bArr, byte[] bArr2, int[] iArr) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, char[] cArr, int[] iArr) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, byte[] bArr, boolean[] zArr) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, byte[] bArr, char[] cArr, byte[] bArr2, byte[] bArr3) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, byte[] bArr, byte[] bArr2, char[] cArr, byte[] bArr3) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, byte[] bArr, char[] cArr, byte[] bArr2) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, char[] cArr, byte[] bArr, char[] cArr2) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, byte[] bArr, byte[] bArr2, short[] sArr) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, short[] sArr, byte[] bArr) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, byte[] bArr, int[] iArr) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, int[] iArr) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, char[] cArr, byte[] bArr, byte[] bArr2) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, byte[] bArr, byte[] bArr2, char[] cArr) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, char[] cArr, char[] cArr2) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, byte[] bArr, short[] sArr) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, byte[] bArr, char[] cArr) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, char[] cArr) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, byte[] bArr, byte[] bArr2) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar, byte[] bArr) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ajoy(azrw azrwVar) {
        azrwVar.getClass();
        this.a = azrwVar;
    }
}
