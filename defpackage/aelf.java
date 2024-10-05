package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import j$.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aelf {
    private final String c;
    private final String d;
    private final afjf e;
    private final aeez f;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private ber l;
    private afjd m;
    private afjc n;
    private final HashMap b = new HashMap();
    public final HashMap a = new HashMap();
    private final Set g = new HashSet();
    private volatile boolean o = true;
    private boolean p = false;

    public aelf(String str, String str2, afjf afjfVar, aeez aeezVar) {
        this.c = str;
        this.d = str2;
        this.e = afjfVar;
        this.f = aeezVar;
    }

    private final synchronized aeeu k(String str, VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, boolean z, boolean z2, aeru aeruVar) {
        int i;
        if (!TextUtils.equals(this.c, str)) {
            String str2 = this.c;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 16 + String.valueOf(str).length());
            sb.append("c.cpn_mismatch.");
            sb.append(str2);
            sb.append(".");
            sb.append(str);
            l(aeruVar, sb.toString());
            return null;
        }
        if (!TextUtils.equals(this.d, videoStreamingData.c)) {
            l(aeruVar, "c.content_id_mismatch");
            return null;
        }
        if (this.p) {
            l(aeruVar, "c.streaming_data_already_added");
            return null;
        }
        ber berVar = this.l;
        if (berVar == null) {
            l(aeruVar, "c.late_track_selection");
            return null;
        }
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        for (FormatStreamModel formatStreamModel : videoStreamingData.p) {
            if (formatStreamModel.e() != -1) {
                hashSet.add(formatStreamModel);
                hashMap.put(formatStreamModel.e, formatStreamModel);
            } else {
                String valueOf = String.valueOf(formatStreamModel.e);
                l(aeruVar, valueOf.length() != 0 ? "c.unknown_itag.".concat(valueOf) : new String("c.unknown_itag."));
                return null;
            }
        }
        afjd afjdVar = this.m;
        if (afjdVar == null) {
            l(aeruVar, "c.null_track_selector_candidate_video_itags");
            return null;
        }
        if (this.n == null) {
            l(aeruVar, "c.null_track_selector_candidate_audio_itags");
            return null;
        }
        if (!z) {
            afjdVar = afje.e;
        }
        int i2 = this.m.c;
        int i3 = afjdVar.c;
        if (i2 != i3) {
            String K = adyu.K(i2);
            String K2 = adyu.K(afjdVar.c);
            StringBuilder sb2 = new StringBuilder(K.length() + 55 + K2.length());
            sb2.append("c.non_matching_video_track_renderer_types;trt_1.");
            sb2.append(K);
            sb2.append(";trt_2.");
            sb2.append(K2);
            l(aeruVar, sb2.toString());
            return null;
        }
        try {
            aeeu c = this.f.c(playerConfigModel, hashSet, null, afjdVar.a, this.n.a, adyu.bK(i3 == 3, 16) | 4, aear.q(videoStreamingData, z2), this.c, aesa.a, (amsx) Collection.EL.stream(this.b.values()).map(acxx.k).collect(ampm.b));
            HashSet<String> hashSet2 = new HashSet();
            for (FormatStreamModel formatStreamModel2 : c.a) {
                hashSet2.add(formatStreamModel2.e);
            }
            for (FormatStreamModel formatStreamModel3 : c.b) {
                hashSet2.add(formatStreamModel3.e);
            }
            for (String str3 : hashSet2) {
                FormatStreamModel formatStreamModel4 = (FormatStreamModel) hashMap.get(str3);
                if (formatStreamModel4 != null) {
                    this.a.put(str3, formatStreamModel4);
                } else {
                    String valueOf2 = String.valueOf(str3);
                    l(aeruVar, valueOf2.length() != 0 ? "c.null_selected_format_stream;id.".concat(valueOf2) : new String("c.null_selected_format_stream;id."));
                    return null;
                }
            }
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                int a = ozv.a((String) it.next());
                if (!this.g.contains(Integer.valueOf(a))) {
                    StringBuilder sb3 = new StringBuilder(55);
                    sb3.append("c.selector_result_does_not_contain_fmt;itag.");
                    sb3.append(a);
                    l(aeruVar, sb3.toString());
                    return null;
                }
            }
            for (FormatStreamModel formatStreamModel5 : this.b.values()) {
                FormatStreamModel formatStreamModel6 = (FormatStreamModel) this.a.get(formatStreamModel5.e);
                if (formatStreamModel6 == null) {
                    String str4 = "";
                    for (String str5 : this.a.keySet()) {
                        String valueOf3 = String.valueOf(str4);
                        if (str4.length() > 0) {
                            String valueOf4 = String.valueOf(str5);
                            str5 = valueOf4.length() != 0 ? ".".concat(valueOf4) : new String(".");
                        }
                        String valueOf5 = String.valueOf(str5);
                        str4 = valueOf5.length() != 0 ? valueOf3.concat(valueOf5) : new String(valueOf3);
                    }
                    int e = formatStreamModel5.e();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(str4).length() + 58);
                    sb4.append("c.incompatible_null_fmt;itag.");
                    sb4.append(e);
                    sb4.append(";fmt_stream_itags.");
                    sb4.append(str4);
                    l(aeruVar, sb4.toString());
                    return null;
                }
                if (formatStreamModel5.k() != formatStreamModel6.k()) {
                    long k = formatStreamModel5.k();
                    long k2 = formatStreamModel6.k();
                    StringBuilder sb5 = new StringBuilder(66);
                    sb5.append("c.lmt_mismatch;lmt1.");
                    sb5.append(k);
                    sb5.append(";lmt2.");
                    sb5.append(k2);
                    l(aeruVar, sb5.toString());
                    return null;
                }
            }
            int i4 = 0;
            while (true) {
                bel[] belVarArr = berVar.c;
                if (i4 >= belVarArr.length) {
                    this.p = true;
                    return c;
                }
                bel belVar = belVarArr[i4];
                if (belVar != null) {
                    while (i < belVar.d()) {
                        i = this.a.containsKey(belVar.f(i).c) ? 0 : i + 1;
                    }
                    l(aeruVar, "selection_does_not_contain_streaming_data_fmt");
                    return null;
                }
                i4++;
            }
        } catch (aeew e2) {
            String valueOf6 = String.valueOf(e2.getMessage());
            l(aeruVar, valueOf6.length() != 0 ? "c.missing_stream_exception;".concat(valueOf6) : new String("c.missing_stream_exception;"));
            return null;
        }
    }

    private static final void l(aeru aeruVar, String str) {
        aeruVar.g(new afih("onesie.mismatch", 0L, str));
    }

    public final synchronized axl a(String str) {
        int a = ozv.a(str);
        Set b = aaoq.b();
        Integer valueOf = Integer.valueOf(a);
        if (b.contains(valueOf)) {
            if (!this.h) {
                this.e.v();
                this.h = true;
            }
        } else if (!aaoq.c().contains(valueOf)) {
            StringBuilder sb = new StringBuilder(29);
            sb.append("Invalid EMP itag: ");
            sb.append(a);
            aelz.g(sb.toString());
        } else if (!this.j) {
            this.e.z();
            this.j = true;
        }
        while (this.o && !this.p && !this.a.containsKey(str)) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                aelz.j("Interrupted while waiting for streaming data representation.", e);
                this.o = false;
                notifyAll();
            }
        }
        int a2 = ozv.a(str);
        Set b2 = aaoq.b();
        Integer valueOf2 = Integer.valueOf(a2);
        if (b2.contains(valueOf2)) {
            if (!this.i) {
                this.e.u();
                this.i = true;
            }
        } else if (!aaoq.c().contains(valueOf2)) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Invalid EMP itag: ");
            sb2.append(a2);
            aelz.g(sb2.toString());
        } else if (!this.k) {
            this.e.y();
            this.k = true;
        }
        FormatStreamModel formatStreamModel = (FormatStreamModel) this.a.get(str);
        if (this.o && formatStreamModel != null) {
            return formatStreamModel.R(this.c);
        }
        return null;
    }

    public final synchronized axl b(String str) {
        if (str == null) {
            return null;
        }
        if (this.a.containsKey(str)) {
            return ((FormatStreamModel) this.a.get(str)).R(this.c);
        }
        if (!this.b.containsKey(str)) {
            return null;
        }
        return ((FormatStreamModel) this.b.get(str)).R(this.c);
    }

    public final synchronized aeeu c(String str, VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, boolean z, boolean z2, aeru aeruVar) {
        aeeu k;
        try {
            k = k(str, videoStreamingData, playerConfigModel, z, z2, aeruVar);
            if (k == null || !this.o) {
                this.o = false;
                throw new aele();
            }
        } finally {
            notifyAll();
        }
        return k;
    }

    public final synchronized void d() {
        this.o = false;
        notifyAll();
    }

    public final synchronized void e(ber berVar, afjd afjdVar, afjc afjcVar) {
        this.l = berVar;
        this.m = afjdVar;
        this.n = afjcVar;
        if (berVar == null) {
            return;
        }
        int i = 0;
        while (true) {
            bel[] belVarArr = berVar.c;
            if (i >= belVarArr.length) {
                return;
            }
            bel belVar = belVarArr[i];
            if (belVar != null) {
                for (int i2 = 0; i2 < belVar.d(); i2++) {
                    this.g.add(Integer.valueOf(ozv.a(belVar.f(i2).c)));
                }
            }
            i++;
        }
    }

    public final synchronized boolean f(String str) {
        boolean z;
        if (!this.b.containsKey(str)) {
            z = this.a.containsKey(str);
        }
        return z;
    }

    public final synchronized boolean g(Set set) {
        boolean z;
        Iterator it = this.b.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (set.contains((String) it.next())) {
                z = true;
                break;
            }
        }
        return z;
    }

    public final synchronized boolean h() {
        return this.p;
    }

    public final synchronized boolean i() {
        return this.o;
    }

    public final synchronized void j(String str, int i, String str2, long j, int i2) {
        String concat;
        String b = ozv.b(i, str2);
        aong aongVar = (aong) aqxz.b.createBuilder();
        if (TextUtils.isEmpty(str2)) {
            concat = "";
        } else {
            String valueOf = String.valueOf(str2);
            concat = valueOf.length() != 0 ? "&xtags=".concat(valueOf) : new String("&xtags=");
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 70 + String.valueOf(concat).length());
        sb.append("http://oda/videoplayback?id=");
        sb.append(str);
        sb.append("&itag=");
        sb.append(i);
        sb.append("&lmt=");
        sb.append(j);
        sb.append(concat);
        String sb2 = sb.toString();
        aongVar.copyOnWrite();
        aqxz aqxzVar = (aqxz) aongVar.instance;
        sb2.getClass();
        aqxzVar.c |= 2;
        aqxzVar.e = sb2;
        aongVar.copyOnWrite();
        aqxz aqxzVar2 = (aqxz) aongVar.instance;
        aqxzVar2.c |= 1;
        aqxzVar2.d = i;
        aongVar.copyOnWrite();
        aqxz aqxzVar3 = (aqxz) aongVar.instance;
        str2.getClass();
        aqxzVar3.c |= 8192;
        aqxzVar3.q = str2;
        aone createBuilder = aqya.a.createBuilder();
        createBuilder.copyOnWrite();
        aqya aqyaVar = (aqya) createBuilder.instance;
        aqyaVar.b |= 4;
        aqyaVar.c = 0L;
        createBuilder.copyOnWrite();
        aqya aqyaVar2 = (aqya) createBuilder.instance;
        aqyaVar2.b |= 8;
        aqyaVar2.d = 1L;
        aongVar.copyOnWrite();
        aqxz aqxzVar4 = (aqxz) aongVar.instance;
        aqya aqyaVar3 = (aqya) createBuilder.build();
        aqyaVar3.getClass();
        aqxzVar4.m = aqyaVar3;
        aqxzVar4.c |= 256;
        aone createBuilder2 = aqya.a.createBuilder();
        createBuilder2.copyOnWrite();
        aqya aqyaVar4 = (aqya) createBuilder2.instance;
        aqyaVar4.b |= 4;
        aqyaVar4.c = 2L;
        createBuilder2.copyOnWrite();
        aqya aqyaVar5 = (aqya) createBuilder2.instance;
        aqyaVar5.b |= 8;
        aqyaVar5.d = i2;
        aongVar.copyOnWrite();
        aqxz aqxzVar5 = (aqxz) aongVar.instance;
        aqya aqyaVar6 = (aqya) createBuilder2.build();
        aqyaVar6.getClass();
        aqxzVar5.n = aqyaVar6;
        aqxzVar5.c |= 512;
        aongVar.copyOnWrite();
        aqxz aqxzVar6 = (aqxz) aongVar.instance;
        aqxzVar6.c |= 1024;
        aqxzVar6.o = j;
        aongVar.copyOnWrite();
        aqxz aqxzVar7 = (aqxz) aongVar.instance;
        aqxzVar7.c |= 2048;
        aqxzVar7.p = -1L;
        this.b.put(b, new FormatStreamModel((aqxz) aongVar.build(), str, -1L));
        notifyAll();
    }
}
