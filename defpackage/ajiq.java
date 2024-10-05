package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajiq implements swv {
    public final aahd a;

    public ajiq(aahd aahdVar, ajgq ajgqVar) {
        int i;
        this.a = aahdVar;
        ajhe a = ajgqVar.a();
        awur awurVar = awur.a;
        doa.b = awurVar.c;
        doa.c = awurVar.d;
        doa.d = awurVar.e;
        int i2 = a.t;
        if (dob.a != -2) {
            i = dob.a;
        } else {
            i = -1;
            try {
                int a2 = dob.a("/sys/devices/system/cpu/possible");
                a2 = a2 == -1 ? dob.a("/sys/devices/system/cpu/present") : a2;
                i = a2 == -1 ? new File("/sys/devices/system/cpu/").listFiles(dob.b).length : a2;
            } catch (NullPointerException | SecurityException unused) {
            }
            dob.a = i;
        }
        int min = Math.min((int) Math.ceil((i <= 0 ? 1 : i) * a.e), i2);
        int i3 = min > 0 ? min : 1;
        doa.r = new dkb(i3, i3, -2);
        if (a.f) {
            doa.s = doa.r;
        }
        doa.j = a.q;
        doa.l = a.r;
        dpy.a = a.z;
        doa.q = a.C;
        boolean z = a.y;
        doa.o = z;
        doa.n = z;
    }

    private static View e(View view) {
        if (view.getTag(R.id.elements_image) instanceof awpf) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View e = e(viewGroup.getChildAt(i));
            if (e != null) {
                return e;
            }
        }
        return null;
    }

    @Override // defpackage.swv
    public final aomu a() {
        return arli.a;
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.swv
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ayph b(apxf apxfVar, swu swuVar) {
        awpj c;
        int c2;
        aone builder;
        int abs;
        View e;
        avgg avggVar;
        View view = swuVar.a;
        final HashMap hashMap = new HashMap();
        Object obj = swuVar.d;
        if (obj instanceof ajgc) {
            ajgc ajgcVar = (ajgc) obj;
            Object obj2 = ajgcVar.a;
            if (obj2 != null) {
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj2);
            }
            List list = ajgcVar.e;
            if (list != null) {
                hashMap.put("MacrosConverters.CustomConvertersKey", list.toArray());
            }
        }
        if (view != null) {
            hashMap.put("com.google.android.libraries.youtube.rendering.elements.sender_view", view);
        }
        try {
            final aong aongVar = (aong) ((aong) apxf.a.createBuilder()).mergeFrom(apxfVar.toByteArray(), aomw.b());
            apxf apxfVar2 = (apxf) aongVar.build();
            if (view != null && apxfVar2.pY(WatchEndpointOuterClass.watchEndpoint) && (e = e(view)) != null) {
                hashMap.put("VideoPresenterConstants.VIDEO_THUMBNAIL_VIEW_KEY", e);
                Object tag = e.getTag(R.id.elements_image);
                if (tag instanceof awpf) {
                    aong aongVar2 = (aong) avgg.a.createBuilder();
                    for (awph awphVar : ((awpf) tag).c) {
                        aone createBuilder = avgf.a.createBuilder();
                        String str = true != (awphVar.c == 1 ? (String) awphVar.d : "").startsWith("//") ? "" : "https:";
                        String valueOf = String.valueOf(awphVar.c == 1 ? (String) awphVar.d : "");
                        String concat = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
                        createBuilder.copyOnWrite();
                        avgf avgfVar = (avgf) createBuilder.instance;
                        concat.getClass();
                        avgfVar.b |= 1;
                        avgfVar.c = concat;
                        int i = awphVar.e;
                        createBuilder.copyOnWrite();
                        avgf avgfVar2 = (avgf) createBuilder.instance;
                        avgfVar2.b |= 2;
                        avgfVar2.d = i;
                        int i2 = awphVar.f;
                        createBuilder.copyOnWrite();
                        avgf avgfVar3 = (avgf) createBuilder.instance;
                        avgfVar3.b |= 4;
                        avgfVar3.e = i2;
                        aongVar2.cB(createBuilder);
                    }
                    avggVar = (avgg) aongVar2.build();
                } else {
                    avggVar = null;
                }
                if (avggVar != null) {
                    hashMap.put("VideoPresenterConstants.VIDEO_THUMBNAIL_DETAILS_KEY", avggVar);
                }
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                while (true) {
                    if (!(parent instanceof View)) {
                        break;
                    }
                    Map map = (Map) ((View) parent).getTag(R.id.elements_navigation_args);
                    if (map == null) {
                        parent = parent.getParent();
                    } else {
                        hashMap.putAll(map);
                        break;
                    }
                }
            }
            sxs sxsVar = swuVar.f;
            if (sxsVar instanceof ajgg) {
                String k = ((ajgg) sxsVar).a.k();
                aone createBuilder2 = aupf.a.createBuilder();
                createBuilder2.copyOnWrite();
                aupf aupfVar = (aupf) createBuilder2.instance;
                k.getClass();
                aupfVar.b = 1 | aupfVar.b;
                aupfVar.c = k;
                aongVar.e(aupg.b, (aupf) createBuilder2.build());
            }
            sxc sxcVar = swuVar.i;
            if (sxcVar != null) {
                syg b = sxcVar.b();
                if ((b instanceof acsd) && (c = sxcVar.c()) != null && (c2 = acsd.c(c)) != -1) {
                    if (!((apxf) aongVar.build()).pY(atmb.b)) {
                        builder = atmc.a.createBuilder();
                    } else {
                        builder = ((atmc) ((apxf) aongVar.build()).pX(atmb.b)).toBuilder();
                    }
                    if (!((acsd) b).i() || !acsd.h(c) || !acsd.g(c)) {
                        abs = Math.abs(c.d);
                    } else {
                        asuh asuhVar = acsd.f(c).e;
                        if (asuhVar == null) {
                            asuhVar = asuh.b;
                        }
                        apvd apvdVar = asuhVar.h;
                        if (apvdVar == null) {
                            apvdVar = apvd.a;
                        }
                        abs = apvdVar.d;
                    }
                    builder.copyOnWrite();
                    atmc atmcVar = (atmc) builder.instance;
                    atmcVar.b |= 2;
                    atmcVar.d = c2;
                    builder.copyOnWrite();
                    atmc atmcVar2 = (atmc) builder.instance;
                    atmcVar2.b |= 4;
                    atmcVar2.e = abs;
                    aongVar.e(atmb.b, (atmc) builder.build());
                }
            }
            ahbn.i(aongVar, swuVar, view);
            ahbn.h(hashMap, swuVar);
            return ayph.j(new aypj() { // from class: ajio
                @Override // defpackage.aypj
                public final void a(ayue ayueVar) {
                    ajiq ajiqVar = ajiq.this;
                    Map map2 = hashMap;
                    aong aongVar3 = aongVar;
                    ajip ajipVar = new ajip(ayueVar);
                    HashMap hashMap2 = new HashMap(map2);
                    hashMap2.put("command_status_callback", ajipVar);
                    ajiqVar.a.c((apxf) aongVar3.build(), hashMap2);
                    if (ajipVar.a()) {
                        return;
                    }
                    ajipVar.b().a();
                }
            });
        } catch (aoob e2) {
            return ayph.s(e2);
        }
    }
}
