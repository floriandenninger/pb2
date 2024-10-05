package defpackage;

import android.os.Handler;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lgs {
    public final Executor a;
    public final Handler b;
    public byte[] c;
    public String d;
    public final aarr e;

    public lgs(aarr aarrVar, Executor executor, Handler handler) {
        this.e = aarrVar;
        this.a = executor;
        this.b = handler;
    }

    public static final boolean a(apxf apxfVar) {
        auns aunsVar;
        auno aunoVar = ((aunn) apxfVar.pX(SearchEndpointOuterClass.searchEndpoint)).g;
        if (aunoVar == null) {
            aunoVar = auno.a;
        }
        if (aunoVar.b == 163011016) {
            aunsVar = (auns) aunoVar.c;
        } else {
            aunsVar = auns.a;
        }
        return (aunsVar.b & 2) != 0;
    }
}
