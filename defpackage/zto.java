package defpackage;

import android.content.Context;
import android.database.DataSetObservable;
import android.os.Build;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zto implements zty, zou, zot {
    public final ztz a;
    public byte[] c;
    public DataSetObservable d;
    public zsi g;
    public zss h;
    private boolean l;
    private final agcm m;
    public final ArrayList b = new ArrayList();
    private final ArrayList i = new ArrayList();
    private final Map j = new HashMap();
    private final Set k = EnumSet.noneOf(avwy.class);
    public final Object e = new Object();
    public final Object f = new Object();

    public zto(Context context, ysl yslVar, agcm agcmVar, zuf zufVar, byte[] bArr) {
        this.m = agcmVar;
        this.a = new ztz(context, yslVar, this, false, zufVar);
    }

    private final zor j(avwx avwxVar) {
        zor zorVar = new zor(avwxVar);
        zorVar.b(FilterMapTable$FilterDescriptor.a(this.b, "NORMAL"));
        zorVar.c = "NORMAL";
        zorVar.b = "NORMAL";
        return zorVar;
    }

    @Override // defpackage.zou
    public final boolean a(avwy avwyVar) {
        return avwyVar != null && this.k.contains(avwyVar);
    }

    public final avwv b() {
        aone createBuilder = avwv.a.createBuilder();
        List asList = Arrays.asList(this.a.i());
        createBuilder.copyOnWrite();
        avwv avwvVar = (avwv) createBuilder.instance;
        aony aonyVar = avwvVar.c;
        if (!aonyVar.c()) {
            avwvVar.c = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll((Iterable) asList, (List) avwvVar.c);
        zpg zpgVar = new zpg();
        zpgVar.a();
        String str = zpgVar.e;
        zpgVar.a();
        String str2 = zpgVar.f;
        aone createBuilder2 = avwt.a.createBuilder();
        if (str != null) {
            createBuilder2.copyOnWrite();
            avwt avwtVar = (avwt) createBuilder2.instance;
            avwtVar.b |= 1;
            avwtVar.c = str;
        }
        if (str2 != null) {
            createBuilder2.copyOnWrite();
            avwt avwtVar2 = (avwt) createBuilder2.instance;
            avwtVar2.b |= 2;
            avwtVar2.d = str2;
        }
        aone createBuilder3 = avwu.a.createBuilder();
        try {
            String str3 = Build.DEVICE;
            createBuilder3.copyOnWrite();
            avwu avwuVar = (avwu) createBuilder3.instance;
            str3.getClass();
            avwuVar.b |= 2;
            avwuVar.d = str3;
        } catch (RuntimeException e) {
            zga.n("Failed to set VideoEffectsContext.Device.device: ", e);
        }
        createBuilder3.copyOnWrite();
        avwu avwuVar2 = (avwu) createBuilder3.instance;
        avwt avwtVar3 = (avwt) createBuilder2.build();
        avwtVar3.getClass();
        avwuVar2.c = avwtVar3;
        avwuVar2.b |= 1;
        createBuilder.copyOnWrite();
        avwv avwvVar2 = (avwv) createBuilder.instance;
        avwu avwuVar3 = (avwu) createBuilder3.build();
        avwuVar3.getClass();
        avwvVar2.d = avwuVar3;
        avwvVar2.b |= 1;
        return (avwv) createBuilder.build();
    }

    public final void c() {
        zss zssVar = this.h;
        if (zssVar == null || !this.l) {
            return;
        }
        byte[] bArr = this.c;
        Set set = this.k;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = this.i;
        String d = this.a.d();
        agcm agcmVar = this.m;
        ztd ztdVar = zssVar.a;
        zto ztoVar = zssVar.b;
        synchronized (ztdVar.e) {
            if (ztdVar.c) {
                zga.b("EffectsSettings already set, not setting KazooEffectsLoader Settings.");
            } else {
                ztdVar.c = true;
                ztdVar.h.f(ztoVar.a);
                synchronized (ztoVar.f) {
                    ztoVar.g = ztdVar;
                }
                ztdVar.l(set);
                synchronized (ztdVar.k) {
                    ztdVar.g = new ztp(bArr, d);
                    wcy.z(ztdVar.k, ztdVar.g);
                    ztdVar.k.clear();
                }
                ztdVar.r(arrayList, arrayList2, agcmVar);
            }
        }
        this.h = null;
    }

    @Override // defpackage.zty
    public final void d(String str, String str2) {
        boolean z = false;
        for (String str3 : this.j.keySet()) {
            Set set = (Set) this.j.get(str3);
            if (set.contains(str)) {
                set.remove(str);
                if (set.isEmpty()) {
                    ArrayList arrayList = this.b;
                    int size = arrayList.size();
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor = (FilterMapTable$FilterDescriptor) arrayList.get(i);
                            i++;
                            if (filterMapTable$FilterDescriptor.a.equals(str3)) {
                                filterMapTable$FilterDescriptor.d();
                                String valueOf = String.valueOf(str3);
                                if (valueOf.length() != 0) {
                                    "A new effect is ready: ".concat(valueOf);
                                }
                                z = true;
                            }
                        }
                    }
                }
            }
        }
        DataSetObservable dataSetObservable = this.d;
        if (dataSetObservable != null && z) {
            dataSetObservable.notifyChanged();
        }
        synchronized (this.f) {
            zsi zsiVar = this.g;
            if (zsiVar != null) {
                zsiVar.a(str2);
                if (z) {
                    this.g.b();
                }
            }
        }
    }

    public final void e(avxs avxsVar) {
        f(avxsVar, true);
    }

    public final void f(avxs avxsVar, boolean z) {
        g(avxsVar, z, "android_builtin_effects_settings.binarypb");
    }

    public final void g(avxs avxsVar, boolean z, String str) {
        boolean z2 = false;
        boolean z3 = true;
        if (avxsVar != null) {
            z2 = h(avxsVar, false);
            if (!z2) {
                String str2 = true != z ? "Built-in fallback not allowed." : "Using built-in effects.";
                zga.b(str2.length() != 0 ? "VideoEffectsSettings from InnerTube is invalid. ".concat(str2) : new String("VideoEffectsSettings from InnerTube is invalid. "));
            }
        } else {
            String str3 = true != z ? "Built-in fallback not allowed." : "Using built-in effects.";
            zga.g(str3.length() != 0 ? "No VideoEffectsSettings provided. ".concat(str3) : new String("No VideoEffectsSettings provided. "));
        }
        if (!z || z2) {
            z3 = z2;
        } else {
            this.b.clear();
            this.j.clear();
            this.k.clear();
            try {
                InputStream open = this.a.c.getAssets().open(str);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ztz.e(open, byteArrayOutputStream);
                avxs avxsVar2 = (avxs) aonm.parseFrom(avxs.a, byteArrayOutputStream.toByteArray(), aomw.b());
                open.close();
                byteArrayOutputStream.close();
                amkq.N(h(avxsVar2, true));
            } catch (IOException e) {
                throw new RuntimeException(str.length() != 0 ? "Failed to load or parse: ".concat(str) : new String("Failed to load or parse: "), e);
            }
        }
        synchronized (this.e) {
            this.l = z3;
            c();
        }
    }

    final boolean h(avxs avxsVar, boolean z) {
        amkq.E(this.b.isEmpty());
        amkq.E(this.j.isEmpty());
        amkq.E(this.k.isEmpty());
        avxsVar.getClass();
        this.c = avxsVar.d.I();
        HashSet hashSet = new HashSet();
        Iterator it = avxsVar.c.iterator();
        boolean z2 = false;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            avxq avxqVar = (avxq) it.next();
            aqyg aqygVar = avxqVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            Spanned b = ajcq.b(aqygVar);
            String obj = b == null ? null : b.toString();
            String str = avxqVar.b;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(obj)) {
                String valueOf = String.valueOf(avxqVar.toString().replace('\"', '`'));
                afsi.c(2, 9, valueOf.length() != 0 ? "Invalid effect from server: ".concat(valueOf) : new String("Invalid effect from server: "), new Exception());
                String valueOf2 = String.valueOf(avxqVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 28);
                sb.append("Invalid effect from server: ");
                sb.append(valueOf2);
                zga.b(sb.toString());
            } else {
                boolean z3 = avxqVar.e.size() != 0;
                FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor = new FilterMapTable$FilterDescriptor(str, obj, z3, z);
                filterMapTable$FilterDescriptor.c = avxqVar.c;
                this.b.add(filterMapTable$FilterDescriptor);
                if (z3) {
                    this.j.put(str, new HashSet(avxqVar.e));
                    hashSet.addAll(avxqVar.e);
                }
                z2 |= FilterMapTable$FilterDescriptor.h(str);
            }
        }
        if (!avxsVar.h.isEmpty()) {
            for (avxp avxpVar : avxsVar.h) {
                avwx b2 = avwx.b(avxpVar.b);
                if (b2 == null) {
                    b2 = avwx.EFFECT_SUBPACKAGE_ID_UNSPECIFIED;
                }
                zor j = j(b2);
                for (String str2 : avxpVar.c) {
                    if (FilterMapTable$FilterDescriptor.h(str2)) {
                        avwx b3 = avwx.b(avxpVar.b);
                        if (b3 == null) {
                            b3 = avwx.EFFECT_SUBPACKAGE_ID_UNSPECIFIED;
                        }
                        String valueOf3 = String.valueOf(b3);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 36);
                        sb2.append(valueOf3);
                        sb2.append(": Skipping NORMAL (implicitly added)");
                        zga.g(sb2.toString());
                    } else {
                        FilterMapTable$FilterDescriptor a = FilterMapTable$FilterDescriptor.a(this.b, str2);
                        if (a == null) {
                            avwx b4 = avwx.b(avxpVar.b);
                            if (b4 == null) {
                                b4 = avwx.EFFECT_SUBPACKAGE_ID_UNSPECIFIED;
                            }
                            int i = b4.d;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 44);
                            sb3.append("Invalid Effect ID ");
                            sb3.append(str2);
                            sb3.append(" in subpackage ");
                            sb3.append(i);
                            zga.b(sb3.toString());
                        } else {
                            j.b(a);
                        }
                    }
                }
                this.i.add(j);
            }
        } else {
            zor j2 = j(avwx.EFFECT_SUBPACKAGE_ID_UNSPECIFIED);
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor2 = (FilterMapTable$FilterDescriptor) arrayList.get(i2);
                if (!FilterMapTable$FilterDescriptor.h(filterMapTable$FilterDescriptor2.a)) {
                    j2.b(filterMapTable$FilterDescriptor2);
                }
            }
            this.i.add(j2);
        }
        hashSet.addAll(avxsVar.e);
        if ((avxsVar.b & 2) != 0) {
            Set set = this.k;
            avxr avxrVar = avxsVar.g;
            if (avxrVar == null) {
                avxrVar = avxr.b;
            }
            set.addAll(new aonw(avxrVar.c, avxr.a));
        }
        new ztm(this.a, avxsVar, hashSet).execute(new Void[0]);
        byte[] bArr = this.c;
        return bArr != null && bArr.length > 0 && z2;
    }

    public final ztl i() {
        if (this.c == null || this.b.isEmpty()) {
            return null;
        }
        return new ztl(this);
    }
}
