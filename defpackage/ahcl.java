package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahcl {
    private final int a;
    private final long b;
    private final long c;
    private ahcj d;
    private ahck e;
    private final boolean f;
    private final boolean g;

    public ahcl(aesh aeshVar, aesh aeshVar2, FormatStreamModel formatStreamModel, long j, long j2) {
        this.a = formatStreamModel.e();
        this.f = formatStreamModel.C();
        this.g = formatStreamModel.P();
        this.c = j2;
        this.b = j;
        if (aeshVar != null) {
            this.d = new ahcj(this, aeshVar);
        }
        if (aeshVar2 != null) {
            this.e = new ahck(this, aeshVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List i(aesh aeshVar, String str) {
        List arrayList = new ArrayList();
        String d = aeshVar.d(str);
        if (d != null) {
            arrayList = amnm.d(",").h(d);
        }
        return arrayList.subList(0, arrayList.size() - 1);
    }

    private static boolean j(aesh aeshVar) {
        return aeshVar.a.equals("http://youtube.com/streaming/metadata/segment/102015");
    }

    private static boolean k(aesh aeshVar) {
        return aeshVar.a.equals("http://youtube.com/streaming/metadata/streamer/092019");
    }

    public long b() {
        return this.b;
    }

    public long c() {
        return this.c;
    }

    public ahcj d() {
        return this.d;
    }

    public ahck e() {
        return this.e;
    }

    public boolean g() {
        return this.f;
    }

    public boolean h() {
        return this.g;
    }

    public ahcl(aesh[] aeshVarArr, FormatStreamModel formatStreamModel, long j, long j2) {
        this.a = formatStreamModel.e();
        this.f = formatStreamModel.C();
        this.g = formatStreamModel.P();
        this.b = j;
        this.c = j2;
        for (aesh aeshVar : aeshVarArr) {
            if (j(aeshVar)) {
                this.d = new ahcj(this, aeshVar);
            } else if (k(aeshVar)) {
                this.e = new ahck(this, aeshVar);
            }
        }
    }
}
