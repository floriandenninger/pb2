package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abyq implements afwx {
    final /* synthetic */ boolean a;
    final /* synthetic */ abzl b;
    final /* synthetic */ abwl c;

    public abyq(abzl abzlVar, boolean z, abwl abwlVar, byte[] bArr) {
        this.b = abzlVar;
        this.a = z;
        this.c = abwlVar;
    }

    final void d() {
        Handler handler = this.b.b;
        final abwl abwlVar = this.c;
        final byte[] bArr = null;
        handler.post(new Runnable(bArr) { // from class: abyo
            @Override // java.lang.Runnable
            public final void run() {
                abwl abwlVar2 = abwl.this;
                if (abwlVar2.a.d.d()) {
                    zga.b("Create ingestion error: 1");
                    abwlVar2.a.i.m();
                }
            }
        });
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        String valueOf = String.valueOf(abzl.n(cnqVar));
        zga.b(valueOf.length() != 0 ? "Error creating ingestion: ".concat(valueOf) : new String("Error creating ingestion: "));
        abvt.b().n(5, 1, cnqVar);
        d();
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        String str;
        aqyg aqygVar;
        arny arnyVar = (arny) obj;
        if (arnyVar != null) {
            this.b.a.D(new acqx(arnyVar.g.I()));
        }
        if (arnyVar == null) {
            zga.b("Create ingestion: missing response");
            abvt.b().n(5, 1, null);
            d();
            return;
        }
        if (arnyVar.c.size() > 0) {
            for (arnw arnwVar : arnyVar.c) {
                apby apbyVar = arnwVar.b == 58057493 ? (apby) arnwVar.c : null;
                int bR = amkq.bR(apbyVar.c);
                if (bR == 0) {
                    bR = 1;
                }
                int i = bR - 1;
                int i2 = apbyVar.b & 2;
                if (i2 != 0) {
                    if (i2 != 0) {
                        aqygVar = apbyVar.d;
                        if (aqygVar == null) {
                            aqygVar = aqyg.a;
                        }
                    } else {
                        aqygVar = null;
                    }
                    str = ajcq.b(aqygVar).toString();
                } else {
                    str = null;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 67);
                sb.append("Create ingestion: got an error response: type=");
                sb.append(i);
                sb.append(", message=");
                sb.append(str);
                zga.b(sb.toString());
            }
            abvt.b().n(5, 1, null);
            d();
            return;
        }
        aroa aroaVar = arnyVar.d;
        if (aroaVar == null) {
            aroaVar = aroa.a;
        }
        arob arobVar = arnyVar.e;
        if (arobVar == null) {
            arobVar = arob.a;
        }
        final arob arobVar2 = arobVar;
        final aony aonyVar = arnyVar.f;
        if (aroaVar.b == 85479539) {
            assv assvVar = (assv) aroaVar.c;
            final String str2 = assvVar.b;
            final String str3 = assvVar.c;
            if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                zga.b("Create ingestion: empty ingestion settings");
                abvt.b().n(5, 1, null);
                d();
                return;
            }
            String.valueOf(str2).length();
            String.valueOf(str3).length();
            abvt b = abvt.b();
            b.k = true == this.a ? 4 : 2;
            b.m(8);
            Handler handler = this.b.b;
            final abwl abwlVar = this.c;
            final byte[] bArr = null;
            handler.post(new Runnable(abwlVar, str2, str3, aonyVar, bArr) { // from class: abyp
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ List d;
                public final /* synthetic */ abwl e;

                @Override // java.lang.Runnable
                public final void run() {
                    arob arobVar3 = arob.this;
                    abwl abwlVar2 = this.e;
                    String str4 = this.b;
                    String str5 = this.c;
                    List list = this.d;
                    atgf atgfVar = arobVar3.b == 141258672 ? (atgf) arobVar3.c : null;
                    if (abwlVar2.a.d.d()) {
                        String.valueOf(str4).length();
                        String.valueOf(str5).length();
                        abwy abwyVar = abwlVar2.a;
                        abwyVar.D = str4;
                        abwyVar.E = str5;
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                apxf apxfVar = (apxf) it.next();
                                if (apxfVar.pY(RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand.recordStreamEventsCommand)) {
                                    abwlVar2.a.j.d((RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand) apxfVar.pX(RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand.recordStreamEventsCommand));
                                    break;
                                }
                            }
                        }
                        abwy abwyVar2 = abwlVar2.a;
                        abwyVar2.c.s(abwyVar2.K, abwyVar2.D, abwyVar2.E, atgfVar);
                        if (TextUtils.isEmpty(abwlVar2.a.D) || TextUtils.isEmpty(abwlVar2.a.E)) {
                            zga.b("Ingestion stream information was returned invalid");
                            abwlVar2.a.i.m();
                        } else {
                            abwlVar2.a.i.f(2);
                        }
                    }
                }
            });
            return;
        }
        zga.b("Create ingestion: missing ingestion/renderer settings");
        abvt.b().n(5, 1, null);
        d();
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
