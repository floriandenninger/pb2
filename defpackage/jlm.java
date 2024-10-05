package defpackage;

import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jlm implements ykl {
    final /* synthetic */ atsb a;
    final /* synthetic */ amru b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ acra e;
    final /* synthetic */ amru f;
    final /* synthetic */ jln g;

    public jlm(jln jlnVar, atsb atsbVar, amru amruVar, String str, String str2, acra acraVar, amru amruVar2) {
        this.g = jlnVar;
        this.a = atsbVar;
        this.b = amruVar;
        this.c = str;
        this.d = str2;
        this.e = acraVar;
        this.f = amruVar2;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        if (exc instanceof agzc) {
            agzc agzcVar = (agzc) exc;
            if (agzcVar.b) {
                ArrayList arrayList = new ArrayList(this.f);
                Collections.sort(arrayList, ahab.f);
                this.g.c(this.a, amru.o(amru.o(arrayList)), this.b, this.c, this.d);
                return;
            }
            atqo atqoVar = agzcVar.c;
            if (atqoVar != null) {
                this.g.b.d(atqoVar, this.e);
                return;
            }
            String str = agzcVar.a;
            if (str != null) {
                whu.L(this.g.a, str, 1);
            } else {
                whu.K(this.g.a, R.string.offline_stream_selection_error, 1);
            }
        }
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        agze agzeVar = (agze) obj2;
        ArrayList arrayList = new ArrayList(agzeVar.a);
        Collections.sort(arrayList, ahab.f);
        this.g.c(this.a, amru.o(amru.o(arrayList)), this.b, this.c, this.d);
        byte[] bArr = agzeVar.b;
        if (bArr != null) {
            this.e.D(new acqx(bArr));
        }
        jln.a(this.a, this.e);
    }
}
