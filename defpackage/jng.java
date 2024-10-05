package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class jng {
    public final Context a;
    public final aaea b;
    public final anib c;
    public final jni d;
    public final axzf e;
    public final axzf f;

    public jng(Context context, aaea aaeaVar, anib anibVar, axzf axzfVar, axzf axzfVar2, jni jniVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = context;
        this.b = aaeaVar;
        this.c = anibVar;
        this.e = axzfVar;
        this.f = axzfVar2;
        this.d = jniVar;
    }

    public final aqlp a(amru amruVar, amru amruVar2, amru amruVar3, int i, String str, boolean z) {
        aone createBuilder = aqlp.a.createBuilder();
        String string = this.a.getString(R.string.offline_quality_selection_upsell_description);
        createBuilder.copyOnWrite();
        aqlp aqlpVar = (aqlp) createBuilder.instance;
        string.getClass();
        aqlpVar.b |= 1;
        aqlpVar.c = string;
        String string2 = this.a.getString(R.string.offline_remember_stream_setting);
        createBuilder.copyOnWrite();
        aqlp aqlpVar2 = (aqlp) createBuilder.instance;
        string2.getClass();
        aqlpVar2.b |= 2;
        aqlpVar2.f = string2;
        String quantityString = this.a.getResources().getQuantityString(R.plurals.offline_remember_setting_for_days, i, Integer.valueOf(i));
        createBuilder.copyOnWrite();
        aqlp aqlpVar3 = (aqlp) createBuilder.instance;
        quantityString.getClass();
        aqlpVar3.b |= 4;
        aqlpVar3.g = quantityString;
        createBuilder.copyOnWrite();
        aqlp aqlpVar4 = (aqlp) createBuilder.instance;
        aqlpVar4.b |= 8;
        aqlpVar4.h = z;
        aone createBuilder2 = aqlm.a.createBuilder();
        String string3 = this.a.getString(R.string.accessibility_selected);
        createBuilder2.copyOnWrite();
        aqlm aqlmVar = (aqlm) createBuilder2.instance;
        string3.getClass();
        aqlmVar.b |= 1;
        aqlmVar.c = string3;
        aqlm aqlmVar2 = (aqlm) createBuilder2.build();
        createBuilder.copyOnWrite();
        aqlp aqlpVar5 = (aqlp) createBuilder.instance;
        aqlmVar2.getClass();
        aqlpVar5.i = aqlmVar2;
        aqlpVar5.b |= 32;
        if (!amruVar.isEmpty()) {
            aone createBuilder3 = aqlo.a.createBuilder();
            String string4 = this.a.getString(R.string.download_quality_picker_title);
            createBuilder3.copyOnWrite();
            aqlo aqloVar = (aqlo) createBuilder3.instance;
            string4.getClass();
            aqloVar.b |= 1;
            aqloVar.c = string4;
            createBuilder.copyOnWrite();
            aqlp aqlpVar6 = (aqlp) createBuilder.instance;
            aqlo aqloVar2 = (aqlo) createBuilder3.build();
            aqloVar2.getClass();
            aqlpVar6.l = aqloVar2;
            aqlpVar6.b |= 512;
            createBuilder.copyOnWrite();
            aqlp aqlpVar7 = (aqlp) createBuilder.instance;
            aony aonyVar = aqlpVar7.d;
            if (!aonyVar.c()) {
                aqlpVar7.d = aonm.mutableCopy(aonyVar);
            }
            aolo.addAll((Iterable) amruVar, (List) aqlpVar7.d);
            createBuilder.copyOnWrite();
            aqlp aqlpVar8 = (aqlp) createBuilder.instance;
            aony aonyVar2 = aqlpVar8.k;
            if (!aonyVar2.c()) {
                aqlpVar8.k = aonm.mutableCopy(aonyVar2);
            }
            aolo.addAll((Iterable) amruVar3, (List) aqlpVar8.k);
        }
        if (!amruVar2.isEmpty()) {
            createBuilder.copyOnWrite();
            aqlp aqlpVar9 = (aqlp) createBuilder.instance;
            aony aonyVar3 = aqlpVar9.e;
            if (!aonyVar3.c()) {
                aqlpVar9.e = aonm.mutableCopy(aonyVar3);
            }
            aolo.addAll((Iterable) amruVar2, (List) aqlpVar9.e);
            aone createBuilder4 = aqlo.a.createBuilder();
            String string5 = this.a.getString(R.string.download_audio_track_picker_title);
            createBuilder4.copyOnWrite();
            aqlo aqloVar3 = (aqlo) createBuilder4.instance;
            string5.getClass();
            aqloVar3.b |= 1;
            aqloVar3.c = string5;
            String string6 = this.a.getString(R.string.download_audio_track_picker_subtitle);
            createBuilder4.copyOnWrite();
            aqlo aqloVar4 = (aqlo) createBuilder4.instance;
            string6.getClass();
            aqloVar4.b |= 2;
            aqloVar4.d = string6;
            aqlo aqloVar5 = (aqlo) createBuilder4.build();
            createBuilder.copyOnWrite();
            aqlp aqlpVar10 = (aqlp) createBuilder.instance;
            aqloVar5.getClass();
            aqlpVar10.m = aqloVar5;
            aqlpVar10.b |= 1024;
        }
        if (str != null) {
            createBuilder.copyOnWrite();
            aqlp aqlpVar11 = (aqlp) createBuilder.instance;
            aqlpVar11.b |= 64;
            aqlpVar11.j = str;
        }
        return (aqlp) createBuilder.build();
    }

    public final aqls b(amru amruVar, String str, String str2, int i, ammv ammvVar, String str3, boolean z) {
        aone createBuilder = aqls.a.createBuilder();
        String d = amkq.d(this.a.getString(R.string.cancel));
        createBuilder.copyOnWrite();
        aqls aqlsVar = (aqls) createBuilder.instance;
        d.getClass();
        aqlsVar.b |= 2;
        aqlsVar.h = d;
        createBuilder.copyOnWrite();
        aqls aqlsVar2 = (aqls) createBuilder.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        aqlsVar2.g = i2;
        aqlsVar2.b |= 1;
        String d2 = amkq.d(this.a.getString(R.string.offline_quality_selection_get_premium));
        createBuilder.copyOnWrite();
        aqls aqlsVar3 = (aqls) createBuilder.instance;
        d2.getClass();
        aqlsVar3.b |= 4;
        aqlsVar3.i = d2;
        String d3 = amkq.d(this.a.getString(R.string.download));
        createBuilder.copyOnWrite();
        aqls aqlsVar4 = (aqls) createBuilder.instance;
        d3.getClass();
        aqlsVar4.b |= 8;
        aqlsVar4.j = d3;
        createBuilder.copyOnWrite();
        aqls aqlsVar5 = (aqls) createBuilder.instance;
        aqlsVar5.b |= 512;
        aqlsVar5.m = z;
        if (str != null) {
            createBuilder.copyOnWrite();
            aqls aqlsVar6 = (aqls) createBuilder.instance;
            aqlsVar6.c = 6;
            aqlsVar6.d = str;
        } else if (str2 != null) {
            createBuilder.copyOnWrite();
            aqls aqlsVar7 = (aqls) createBuilder.instance;
            aqlsVar7.c = 7;
            aqlsVar7.d = str2;
        }
        if (ammvVar.h()) {
            aomf aomfVar = (aomf) ammvVar.c();
            createBuilder.copyOnWrite();
            aqls aqlsVar8 = (aqls) createBuilder.instance;
            aqlsVar8.e = 8;
            aqlsVar8.f = aomfVar;
        }
        if (i == 2) {
            aong aongVar = (aong) awnw.a.createBuilder();
            aongVar.e(aqko.b, aqko.a);
            awnw awnwVar = (awnw) aongVar.build();
            createBuilder.copyOnWrite();
            aqls aqlsVar9 = (aqls) createBuilder.instance;
            awnwVar.getClass();
            aqlsVar9.k = awnwVar;
            aqlsVar9.b |= 16;
        } else if (i == 3) {
            aong aongVar2 = (aong) awnw.a.createBuilder();
            aongVar2.e(awtq.b, awtq.a);
            awnw awnwVar2 = (awnw) aongVar2.build();
            createBuilder.copyOnWrite();
            aqls aqlsVar10 = (aqls) createBuilder.instance;
            awnwVar2.getClass();
            aqlsVar10.k = awnwVar2;
            aqlsVar10.b |= 16;
        }
        if (!amruVar.isEmpty()) {
            createBuilder.copyOnWrite();
            aqls aqlsVar11 = (aqls) createBuilder.instance;
            aony aonyVar = aqlsVar11.l;
            if (!aonyVar.c()) {
                aqlsVar11.l = aonm.mutableCopy(aonyVar);
            }
            aolo.addAll((Iterable) amruVar, (List) aqlsVar11.l);
        }
        if (str3 != null) {
            createBuilder.copyOnWrite();
            aqls aqlsVar12 = (aqls) createBuilder.instance;
            aqlsVar12.b |= 1024;
            aqlsVar12.n = str3;
        }
        return (aqls) createBuilder.build();
    }
}
