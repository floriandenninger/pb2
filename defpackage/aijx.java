package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aijx implements ayrv {
    private final aaqz a;
    private final afsy b;
    private final aapw c;

    public aijx(aaqz aaqzVar, afsy afsyVar, aapw aapwVar) {
        this.a = aaqzVar;
        this.b = afsyVar;
        this.c = aapwVar;
    }

    @Override // defpackage.ayrv
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        asfc asfcVar;
        asbm asbmVar = (asbm) obj;
        int i = asbmVar.d;
        if (i != 5) {
            if (i == 3) {
                asfcVar = (asfc) asbmVar.e;
            } else {
                asfcVar = asfc.a;
            }
            if ((asfcVar.b & 33554432) != 0) {
                aaqz aaqzVar = this.a;
                afsx c = this.b.c();
                aqzg aqzgVar = asfcVar.x;
                if (aqzgVar == null) {
                    aqzgVar = aqzg.a;
                }
                arnd arndVar = asfcVar.c;
                if (arndVar == null) {
                    arndVar = arnd.a;
                }
                aaqzVar.a(c, aqzgVar, arndVar);
            }
            this.c.a(asfcVar);
            return new WatchNextResponseModel(asfcVar);
        }
        throw new ExecutionException((String) asbmVar.e, null);
    }
}
