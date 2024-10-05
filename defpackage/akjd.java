package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akjd implements aaha {
    public final zaw a;
    public final aahd b;
    public final ajmu c;
    private final aavj d;
    private final Context e;
    private final afyt f;

    public akjd(aavj aavjVar, zaw zawVar, aahd aahdVar, ajmu ajmuVar, Context context, afyt afytVar) {
        aavjVar.getClass();
        this.d = aavjVar;
        zawVar.getClass();
        this.a = zawVar;
        aahdVar.getClass();
        this.b = aahdVar;
        ajmuVar.getClass();
        this.c = ajmuVar;
        this.e = context;
        afytVar.getClass();
        this.f = afytVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        Object s = yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        akjc akjcVar = s instanceof akjc ? (akjc) s : null;
        if (akjcVar != null) {
            s = akjcVar.a();
            if (s == null) {
                s = akjcVar;
            }
            akjcVar.b();
        }
        EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint = (EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint) apxfVar.pX(EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.editConnectionStateEndpoint);
        this.b.e(editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.d, new akjb(true, s));
        akjb akjbVar = new akjb(false, s);
        aavj aavjVar = this.d;
        String str = editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.c;
        Boolean valueOf = Boolean.valueOf(this.f.d(this.e));
        aavjVar.c(armp.a, aavjVar.b, aatt.p, aavd.f).e(new aavk(aavjVar.f, aavjVar.a.c(), str, valueOf, null, null, null), new akja(this, akjbVar, akjcVar));
    }
}
