package defpackage;

import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jks implements ykl {
    final /* synthetic */ int a;
    final /* synthetic */ atsb b;
    final /* synthetic */ acra c;
    final /* synthetic */ List d;
    final /* synthetic */ jkv e;

    public jks(jkv jkvVar, int i, atsb atsbVar, acra acraVar, List list) {
        this.e = jkvVar;
        this.a = i;
        this.b = atsbVar;
        this.c = acraVar;
        this.d = list;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        if (exc instanceof agzc) {
            agzc agzcVar = (agzc) exc;
            if (agzcVar.b) {
                ArrayList arrayList = new ArrayList(this.d);
                Collections.sort(arrayList, this.e.b.f());
                this.e.c(this.a, arrayList);
                this.e.f(this.b);
                return;
            }
            atqo atqoVar = agzcVar.c;
            if (atqoVar != null) {
                this.e.d(atqoVar, this.c);
                return;
            }
            String str = agzcVar.a;
            if (str != null) {
                whu.L(this.e.a, str, 1);
            } else {
                whu.K(this.e.a, R.string.offline_stream_selection_error, 1);
            }
        }
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        agze agzeVar = (agze) obj2;
        ArrayList arrayList = new ArrayList(agzeVar.a);
        Collections.sort(arrayList, this.e.b.f());
        this.e.c(this.a, arrayList);
        this.e.f(this.b);
        byte[] bArr = agzeVar.b;
        if (bArr != null) {
            this.c.D(new acqx(bArr));
        }
        jkv.t(this.b, this.c);
    }
}
