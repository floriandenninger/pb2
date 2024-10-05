package defpackage;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.net.Uri;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.google.protos.youtube.api.innertube.EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akhs implements zke, zjz, aklk {
    public final zkd a;
    public final akmf b;
    public final Uri c = akmr.a;
    public aqem d;
    public aqel e;
    public zkj f;
    public Uri g;
    public Object h;
    private final Context i;
    private final aahd j;
    private final zki k;
    private final ajpd l;
    private final akli m;
    private final ajut n;
    private final int o;
    private atdc p;
    private List q;
    private akmq r;

    public akhs(Context context, aahd aahdVar, zki zkiVar, zkd zkdVar, akmh akmhVar, akmf akmfVar, ajpd ajpdVar, akli akliVar, int i) {
        this.i = context;
        this.j = aahdVar;
        this.k = zkiVar;
        this.a = zkdVar;
        this.b = akmfVar;
        this.l = ajpdVar;
        this.m = akliVar;
        this.n = akmhVar;
        this.o = i;
    }

    private static aqel i(Object obj) {
        if (!(obj instanceof aqik)) {
            return null;
        }
        aqik aqikVar = (aqik) obj;
        if (aqikVar.pY(aqel.b)) {
            return (aqel) aqikVar.pX(aqel.b);
        }
        return null;
    }

    private static aqem j(Object obj) {
        if (!(obj instanceof aqik)) {
            return null;
        }
        aqik aqikVar = (aqik) obj;
        if (aqikVar.pY(aqem.b)) {
            return (aqem) aqikVar.pX(aqem.b);
        }
        return null;
    }

    private final void k(aqel aqelVar, boolean z, akhr... akhrVarArr) {
        atct a;
        aqyg aqygVar;
        String obj;
        aqyj aqyjVar;
        aqyg aqygVar2;
        akhr[] akhrVarArr2 = akhrVarArr;
        this.q = new ArrayList();
        int length = akhrVarArr2.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            akhr akhrVar = akhrVarArr2[i2];
            if ((z || akhrVar != akhr.CHANNEL_ITEM) && (a = akhrVar.a(aqelVar)) != null) {
                int i3 = a.c;
                if (i3 != 4) {
                    if (i3 == 1) {
                        aqygVar = (aqyg) a.d;
                    } else {
                        aqygVar = aqyg.a;
                    }
                    obj = ajcq.b(aqygVar).toString();
                } else {
                    HashMap hashMap = new HashMap();
                    aqyg aqygVar3 = this.d.d;
                    if (aqygVar3 == null) {
                        aqygVar3 = aqyg.a;
                    }
                    hashMap.put("user_name", ajcq.b(aqygVar3).toString());
                    if (a.c == 4) {
                        aqyjVar = (aqyj) a.d;
                    } else {
                        aqyjVar = aqyj.a;
                    }
                    ajrw ajrwVar = new ajrw(aqyjVar);
                    if (ajrwVar.a != null && !ajrwVar.b.isEmpty() && ajrwVar.a.d.size() != 0 && ajrwVar.b.size() == ajrwVar.a.d.size() && (aqygVar2 = ajrwVar.c) != null && aqygVar2.c.size() != 0) {
                        aqyi[] aqyiVarArr = (aqyi[]) ajrwVar.c.c.toArray(new aqyi[i]);
                        for (int i4 = 0; i4 < ajrwVar.b.size(); i4++) {
                            int d = ajrwVar.a.d.d(i4);
                            if (d >= 0 && d < aqyiVarArr.length) {
                                String str = (String) ajrwVar.b.get(i4);
                                aong aongVar = (aong) aqyiVarArr[d].toBuilder();
                                if (hashMap.containsKey(str)) {
                                    String str2 = (String) hashMap.get(str);
                                    aongVar.copyOnWrite();
                                    aqyi aqyiVar = (aqyi) aongVar.instance;
                                    str2.getClass();
                                    aqyiVar.b |= 1;
                                    aqyiVar.c = str2;
                                }
                                aqyiVarArr[d] = (aqyi) aongVar.build();
                            }
                        }
                        aong aongVar2 = (aong) ajrwVar.c.toBuilder();
                        aongVar2.copyOnWrite();
                        ((aqyg) aongVar2.instance).c = aqyg.emptyProtobufList();
                        List asList = Arrays.asList(aqyiVarArr);
                        aongVar2.copyOnWrite();
                        aqyg aqygVar4 = (aqyg) aongVar2.instance;
                        aqygVar4.a();
                        aolo.addAll((Iterable) asList, (List) aqygVar4.c);
                        ajrwVar.c = (aqyg) aongVar2.build();
                    }
                    obj = ajcq.b(ajrwVar.c).toString();
                }
                uyw uywVar = new uyw(obj);
                uywVar.f(this.o);
                if ((a.b & 4) != 0) {
                    ajut ajutVar = this.n;
                    arfs arfsVar = a.e;
                    if (arfsVar == null) {
                        arfsVar = arfs.a;
                    }
                    arfr b = arfr.b(arfsVar.c);
                    if (b == null) {
                        b = arfr.UNKNOWN;
                    }
                    int a2 = ajutVar.a(b);
                    if (a2 != 0) {
                        uywVar.e = this.i.getResources().getDrawable(a2);
                    }
                }
                this.q.add(akhrVar);
                this.l.add(uywVar);
            }
            i2++;
            akhrVarArr2 = akhrVarArr;
            i = 0;
        }
        this.l.l();
    }

    private final void l() {
        this.l.clear();
        for (atda atdaVar : this.p.c) {
            uyw uywVar = new uyw(adyu.m0do(atdaVar).toString());
            uywVar.f(this.o);
            if (adyu.dm(atdaVar) != null) {
                ajut ajutVar = this.n;
                arfr b = arfr.b(adyu.dm(atdaVar).c);
                if (b == null) {
                    b = arfr.UNKNOWN;
                }
                int a = ajutVar.a(b);
                if (a != 0) {
                    try {
                        uywVar.e = this.i.getResources().getDrawable(a);
                    } catch (Resources.NotFoundException unused) {
                    }
                }
            }
            this.l.add(uywVar);
        }
    }

    @Override // defpackage.zjz
    public final void a() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zke
    public final void b(List list) {
        amxe it = ((amru) list).iterator();
        while (it.hasNext()) {
            zkb zkbVar = (zkb) it.next();
            Uri uri = zkbVar.a;
            if (uri.equals(this.g)) {
                aqem j = j(zkbVar.b);
                this.d = j;
                if (j == null) {
                    zga.l(String.format("Path %s is not a contact.", this.g));
                }
            } else if (uri.equals(this.c)) {
                aqel i = i(zkbVar.b);
                this.e = i;
                if (i == null) {
                    zga.l(String.format("Path %s is not a config.", this.c));
                }
            }
        }
        d();
    }

    public final void c(String str) {
        aone createBuilder = EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.a.createBuilder();
        createBuilder.copyOnWrite();
        EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint = (EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint) createBuilder.instance;
        str.getClass();
        editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.b |= 1;
        editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.c = str;
        EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint2 = (EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint) createBuilder.build();
        aong aongVar = (aong) apxf.a.createBuilder();
        aongVar.e(EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.editConnectionStateEndpoint, editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint2);
        apxf apxfVar = (apxf) aongVar.build();
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.h);
        this.j.c(apxfVar, hashMap);
    }

    public final void d() {
        aqem aqemVar = this.d;
        if (aqemVar == null || this.e == null) {
            return;
        }
        akli akliVar = this.m;
        aqyg aqygVar = aqemVar.d;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        Spanned b = ajcq.b(aqygVar);
        avgg avggVar = this.d.e;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        akliVar.a(b, null, avggVar);
        boolean z = (this.d.c & 4096) != 0;
        this.l.clear();
        akhr akhrVar = akhr.CHANNEL_ITEM;
        int at = aobq.at(this.d.f);
        if (at == 0) {
            at = 1;
        }
        int i = at - 1;
        if (i == 2) {
            k(this.e, z, akhr.CHANNEL_ITEM, akhr.BLOCK_ITEM);
        } else if (i == 5) {
            k(this.e, z, akhr.CHANNEL_ITEM, akhr.UNBLOCK_ITEM);
        } else if (i == 7) {
            k(this.e, z, akhr.CHANNEL_ITEM);
        } else {
            zga.l("Unknown contact state");
        }
        this.b.aF();
    }

    public final void e() {
        aqyg aqygVar;
        atdc atdcVar = this.p;
        if (atdcVar != null) {
            atdi atdiVar = atdcVar.d;
            if (atdiVar == null) {
                atdiVar = atdi.a;
            }
            avgg avggVar = null;
            if (atdiVar.b == 82258301) {
                this.m.a.setVisibility(0);
                akli akliVar = this.m;
                atdi atdiVar2 = this.p.d;
                if (atdiVar2 == null) {
                    atdiVar2 = atdi.a;
                }
                if (((atdiVar2.b == 82258301 ? (atdh) atdiVar2.c : atdh.a).b & 1) != 0) {
                    atdi atdiVar3 = this.p.d;
                    if (atdiVar3 == null) {
                        atdiVar3 = atdi.a;
                    }
                    aqygVar = (atdiVar3.b == 82258301 ? (atdh) atdiVar3.c : atdh.a).c;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                } else {
                    aqygVar = null;
                }
                akliVar.a(ajcq.b(aqygVar), null, null);
            } else {
                atdi atdiVar4 = this.p.d;
                if (atdiVar4 == null) {
                    atdiVar4 = atdi.a;
                }
                if (atdiVar4.b == 94310230) {
                    this.m.a.setVisibility(0);
                    akli akliVar2 = this.m;
                    atdi atdiVar5 = this.p.d;
                    if (atdiVar5 == null) {
                        atdiVar5 = atdi.a;
                    }
                    aqyg aqygVar2 = (atdiVar5.b == 94310230 ? (aqdv) atdiVar5.c : aqdv.a).c;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                    Spanned b = ajcq.b(aqygVar2);
                    atdi atdiVar6 = this.p.d;
                    if (atdiVar6 == null) {
                        atdiVar6 = atdi.a;
                    }
                    aqyg aqygVar3 = (atdiVar6.b == 94310230 ? (aqdv) atdiVar6.c : aqdv.a).d;
                    if (aqygVar3 == null) {
                        aqygVar3 = aqyg.a;
                    }
                    Spanned b2 = ajcq.b(aqygVar3);
                    atdi atdiVar7 = this.p.d;
                    if (atdiVar7 == null) {
                        atdiVar7 = atdi.a;
                    }
                    if (((atdiVar7.b == 94310230 ? (aqdv) atdiVar7.c : aqdv.a).b & 4) != 0) {
                        atdi atdiVar8 = this.p.d;
                        if (atdiVar8 == null) {
                            atdiVar8 = atdi.a;
                        }
                        avggVar = (atdiVar8.b == 94310230 ? (aqdv) atdiVar8.c : aqdv.a).e;
                        if (avggVar == null) {
                            avggVar = avgg.a;
                        }
                    }
                    akliVar2.a(b, b2, avggVar);
                } else {
                    this.m.a.setVisibility(8);
                }
            }
            l();
            this.b.aF();
        }
    }

    @Override // defpackage.aklk
    public final void f(int i) {
        final String str;
        aqyg aqygVar;
        try {
            atdc atdcVar = this.p;
            if (atdcVar != null) {
                if (i >= 0 && i < atdcVar.c.size()) {
                    atda atdaVar = (atda) this.p.c.get(i);
                    apxf dl = adyu.dl(atdaVar);
                    if (dl != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.h);
                        this.j.c(dl, hashMap);
                    } else {
                        apxf dk = adyu.dk(atdaVar);
                        if (dk != null) {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.h);
                            this.j.c(dk, hashMap2);
                        }
                    }
                }
            } else if (this.d != null && this.e != null) {
                akhr akhrVar = (akhr) this.q.get(i);
                aqyg aqygVar2 = null;
                if (akhrVar == akhr.CHANNEL_ITEM) {
                    aahd aahdVar = this.j;
                    apxf apxfVar = this.d.n;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.c(apxfVar, null);
                } else {
                    atct a = akhrVar.a(this.e);
                    aqem aqemVar = this.d;
                    switch (akhrVar.ordinal()) {
                        case 1:
                            str = aqemVar.k;
                            break;
                        case 2:
                            str = aqemVar.l;
                            break;
                        case 3:
                            str = aqemVar.m;
                            break;
                        case 4:
                            str = aqemVar.g;
                            break;
                        case 5:
                            str = aqemVar.i;
                            break;
                        case 6:
                            str = aqemVar.h;
                            break;
                        case 7:
                            str = aqemVar.j;
                            break;
                        case 8:
                            str = aqemVar.o;
                            break;
                        default:
                            throw new IllegalArgumentException(akhrVar.name());
                    }
                    if ((a.b & 8) != 0) {
                        if (this.r == null) {
                            this.r = new akmq();
                        }
                        AlertDialog.Builder builder = new AlertDialog.Builder(this.i);
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: akhq
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                akhs akhsVar = akhs.this;
                                String str2 = str;
                                if (i2 == -1) {
                                    akhsVar.c(str2);
                                }
                            }
                        };
                        aqdr aqdrVar = a.f;
                        if (aqdrVar == null) {
                            aqdrVar = aqdr.a;
                        }
                        aahd aahdVar2 = this.j;
                        if ((aqdrVar.b & 1) != 0) {
                            aqygVar = aqdrVar.c;
                            if (aqygVar == null) {
                                aqygVar = aqyg.a;
                            }
                        } else {
                            aqygVar = null;
                        }
                        builder.setTitle(ajcq.b(aqygVar));
                        if ((aqdrVar.b & 2) != 0 && (aqygVar2 = aqdrVar.d) == null) {
                            aqygVar2 = aqyg.a;
                        }
                        builder.setMessage(aahk.a(aqygVar2, aahdVar2, false));
                        if ((aqdrVar.b & 4) != 0) {
                            aqyg aqygVar3 = aqdrVar.e;
                            if (aqygVar3 == null) {
                                aqygVar3 = aqyg.a;
                            }
                            builder.setNegativeButton(ajcq.b(aqygVar3), onClickListener);
                        }
                        if ((aqdrVar.b & 8) != 0) {
                            aqyg aqygVar4 = aqdrVar.f;
                            if (aqygVar4 == null) {
                                aqygVar4 = aqyg.a;
                            }
                            builder.setPositiveButton(ajcq.b(aqygVar4), onClickListener);
                        }
                        AlertDialog create = builder.create();
                        create.show();
                        View findViewById = create.findViewById(R.id.message);
                        if (findViewById instanceof TextView) {
                            ((TextView) findViewById).setMovementMethod(LinkMovementMethod.getInstance());
                        }
                    } else {
                        c(str);
                    }
                }
            }
        } finally {
            ((akjv) this.b).kv();
        }
    }

    public final void g(atdc atdcVar, Object obj) {
        atdcVar.getClass();
        this.p = atdcVar;
        this.h = obj;
        e();
    }

    public final void h() {
        this.d = j(this.k.b(this.g));
        this.e = i(this.k.b(this.c));
    }
}
