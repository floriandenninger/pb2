package defpackage;

import com.google.android.libraries.youtube.innertube.model.ads.AdBreakResponseModel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wov implements wnx {
    private final List a;
    private final ypa b;
    private final aatv c;

    public wov(aatv aatvVar, List list, ypa ypaVar) {
        aatvVar.getClass();
        this.c = aatvVar;
        this.a = list;
        ypaVar.getClass();
        this.b = ypaVar;
    }

    @Override // defpackage.wnx
    public final AdBreakResponseModel a(String str, byte[] bArr, String str2, String str3, long j, long j2, int i, long j3, zht zhtVar) {
        try {
            this.b.d(new xao());
            str2.getClass();
            str.getClass();
            aatv aatvVar = this.c;
            aats aatsVar = new aats(aatvVar.f, aatvVar.a.c(), null, null, null);
            aatsVar.b = str;
            aatsVar.m(bArr);
            aatsVar.a = str2;
            aatsVar.c = aats.i(str3);
            aatsVar.d = j2;
            aatsVar.s = j;
            aatsVar.t = i;
            aatsVar.u = j3;
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((aatr) it.next()).a(aatsVar);
            }
            afww afwwVar = new afww();
            this.c.b.i(aatsVar, afwwVar);
            long d = zhtVar.b - zhtVar.a.d();
            if (d < 0) {
                d = 0;
            }
            AdBreakResponseModel adBreakResponseModel = (AdBreakResponseModel) afwwVar.get(d, TimeUnit.MILLISECONDS);
            this.b.d(new xan(adBreakResponseModel));
            return adBreakResponseModel;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e.getMessage());
            zga.b(valueOf.length() != 0 ? "Exception when trying to request AdBreakResponseModel: ".concat(valueOf) : new String("Exception when trying to request AdBreakResponseModel: "));
            return null;
        }
    }
}
