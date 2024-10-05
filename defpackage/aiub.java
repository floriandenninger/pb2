package defpackage;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiub implements afts {
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;
    public ArrayList e;
    public aiuc f;
    public aiud g;
    private final HashMap h;

    public aiub() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        HashMap hashMap3 = new HashMap();
        this.c = hashMap3;
        this.d = new HashMap();
        this.h = new HashMap();
        this.e = new ArrayList();
        new aiud().b = 0;
        new aiug().b = 0;
        new aiuf().b = 0;
        hashMap.put(0, new aiud());
        hashMap2.put(0, new aiug());
        hashMap3.put(0, new aiuf());
    }

    @Override // defpackage.afts
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aiua a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            arrayList.add(((aiuk) it.next()).a());
        }
        return new aiua(arrayList);
    }

    public final aiud c(int i) {
        return (aiud) yjj.r(this.a, Integer.valueOf(i), aiud.a);
    }

    public final aiue d(int i) {
        return (aiue) this.d.get(Integer.valueOf(i));
    }

    public final aiuf e(int i) {
        return (aiuf) yjj.r(this.c, Integer.valueOf(i), aiuf.a);
    }

    public final aiug f(int i) {
        return (aiug) yjj.r(this.b, Integer.valueOf(i), aiug.a);
    }

    public final void g(aiuc aiucVar) {
        int i = aiucVar.f.b;
        HashMap hashMap = this.h;
        Integer valueOf = Integer.valueOf(i);
        aiuk aiukVar = (aiuk) hashMap.get(valueOf);
        if (aiukVar == null) {
            aiukVar = new aiuk(i);
            this.h.put(valueOf, aiukVar);
        }
        if (aiucVar.d) {
            String str = aiucVar.k;
            int i2 = (int) aiucVar.a;
            aiukVar.c(str, i2, ((int) aiucVar.b) + i2);
        } else {
            String str2 = aiucVar.k;
            int i3 = (int) aiucVar.a;
            aiukVar.d(str2, i3, ((int) aiucVar.b) + i3);
        }
        int i4 = (int) aiucVar.a;
        aiuf aiufVar = aiucVar.f;
        int i5 = 0;
        aiukVar.e(i4, new SubtitleWindowSettings(aiufVar.c, aiufVar.e, aiufVar.d, true, aiucVar.g.c == 2));
        if (aiucVar.j.isEmpty()) {
            return;
        }
        ArrayList arrayList = aiucVar.j;
        int size = arrayList.size();
        axoe axoeVar = null;
        while (i5 < size) {
            axoe axoeVar2 = (axoe) arrayList.get(i5);
            if (axoeVar != null) {
                String str3 = axoeVar.b;
                long j = aiucVar.a;
                aiukVar.c(str3, (int) (axoeVar.a + j), (int) (j + aiucVar.b));
            }
            i5++;
            axoeVar = axoeVar2;
        }
        if (axoeVar != null) {
            String str4 = axoeVar.b;
            long j2 = aiucVar.a;
            aiukVar.c(str4, (int) (axoeVar.a + j2), (int) (j2 + aiucVar.b));
        }
    }
}
