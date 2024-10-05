package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pmx {
    public Uri a;
    public String b;
    public Object c;
    private String d;
    private pmz e;
    private List f;
    private List g;
    private pnf h;
    private final muf i;

    public pmx() {
        this.e = new pmz();
        this.f = Collections.emptyList();
        this.g = Collections.emptyList();
        this.i = new muf();
    }

    public final pnd a() {
        pnc pncVar;
        Uri uri = this.e.b;
        pse.g(true);
        Uri uri2 = this.a;
        if (uri2 != null) {
            String str = this.b;
            pmz pmzVar = this.e;
            pncVar = new pnc(uri2, str, pmzVar.a != null ? new pna(pmzVar) : null, this.f, this.g, this.c);
        } else {
            pncVar = null;
        }
        String str2 = this.d;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        pmy pmyVar = new pmy();
        pnb pnbVar = new pnb();
        pnf pnfVar = this.h;
        if (pnfVar == null) {
            pnfVar = pnf.a;
        }
        return new pnd(str3, pmyVar, pncVar, pnbVar, pnfVar);
    }

    public final void b(String str) {
        pse.c(str);
        this.d = str;
    }

    public pmx(pnd pndVar) {
        this();
        pmz pmzVar;
        this.d = pndVar.a;
        this.h = pndVar.d;
        this.i = new muf(null);
        pnc pncVar = pndVar.b;
        if (pncVar != null) {
            this.b = pncVar.b;
            this.a = pncVar.a;
            this.f = pncVar.e;
            this.g = pncVar.g;
            this.c = pncVar.h;
            pna pnaVar = pncVar.c;
            if (pnaVar != null) {
                pmzVar = new pmz(pnaVar);
            } else {
                pmzVar = new pmz();
            }
            this.e = pmzVar;
        }
    }
}
