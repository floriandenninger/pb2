package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abhc implements abjl, abgf, zfk {
    public final Set a = new HashSet();
    public asqx b;
    private final aahd c;
    private final zaw d;
    private final abge e;
    private final ajsa f;
    private final abht g;
    private apxf h;
    private final Context i;

    public abhc(abge abgeVar, aahd aahdVar, zaw zawVar, ajsa ajsaVar, abht abhtVar, Context context) {
        this.e = abgeVar;
        this.c = aahdVar;
        this.d = zawVar;
        this.f = ajsaVar;
        abhtVar.getClass();
        this.g = abhtVar;
        abhtVar.y(this);
        this.i = context;
    }

    private static final String i(apxf apxfVar) {
        SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint = (SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint) apxfVar.pX(SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.sendLiveChatMessageEndpoint);
        if (sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.d.isEmpty()) {
            return null;
        }
        return TextUtils.concat(sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.d, String.valueOf(System.currentTimeMillis())).toString();
    }

    @Override // defpackage.abgf
    public final void a(asqx asqxVar) {
        apmg apmgVar;
        apxf apxfVar;
        asqf asqfVar;
        apmg apmgVar2;
        this.b = asqxVar;
        asqc asqcVar = (asqxVar.b == 121323709 ? (asqf) asqxVar.c : asqf.a).g;
        if (asqcVar == null) {
            asqcVar = asqc.a;
        }
        if (asqcVar.b == 65153809) {
            apmgVar = (apmg) asqcVar.c;
        } else {
            apmgVar = apmg.a;
        }
        if ((apmgVar.b & 8192) != 0) {
            if (asqxVar.b == 121323709) {
                asqfVar = (asqf) asqxVar.c;
            } else {
                asqfVar = asqf.a;
            }
            asqc asqcVar2 = asqfVar.g;
            if (asqcVar2 == null) {
                asqcVar2 = asqc.a;
            }
            if (asqcVar2.b == 65153809) {
                apmgVar2 = (apmg) asqcVar2.c;
            } else {
                apmgVar2 = apmg.a;
            }
            apxfVar = apmgVar2.n;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        this.h = apxfVar;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((abjn) it.next()).d(asqxVar);
        }
    }

    @Override // defpackage.abgf
    public final void b() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((abjn) it.next()).f();
        }
    }

    public final void c(abjn abjnVar) {
        if (this.a.contains(abjnVar)) {
            return;
        }
        abjnVar.e();
        ((abns) abjnVar).k = this;
        abow abowVar = ((aboy) abjnVar).y;
        abowVar.g = this;
        abol abolVar = abowVar.a;
        if (abolVar != null) {
            abolVar.k = abowVar;
        }
        asqx asqxVar = this.b;
        if (asqxVar != null) {
            abjnVar.d(asqxVar);
        }
        this.a.add(abjnVar);
    }

    @Override // defpackage.abjl
    public final void d() {
    }

    @Override // defpackage.abjl
    public final void f(asrh asrhVar) {
        if (this.h != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", new abiu(this.g, this.e, this.d, this.f, asrhVar, i(this.h), null, null, null));
            this.c.c(this.h, hashMap);
        }
    }

    @Override // defpackage.abjl
    public final void g(CharSequence charSequence) {
        if (this.h != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", new abiu(this.g, this.e, this.d, charSequence.toString().trim(), i(this.h)));
            this.c.c(this.h, hashMap);
        }
    }

    @Override // defpackage.abjl
    public final void h(apxf apxfVar) {
        this.e.a(amru.r(apxfVar), this.g, true);
    }

    @Override // defpackage.zfk
    public final void j() {
    }

    @Override // defpackage.abjl
    public final void e(apmg apmgVar) {
        int i = apmgVar.b;
        if ((32768 & i) == 0) {
            if ((i & 512) != 0) {
                whu.L(this.i, apmgVar.j, 0);
            }
        } else {
            aahd aahdVar = this.c;
            apxf apxfVar = apmgVar.p;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.a(apxfVar);
        }
    }
}
