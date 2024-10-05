package defpackage;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSettings;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiuk implements afts {
    private final int a;
    private final aiuo b = new aiuo();
    private final aium c = new aium();

    public aiuk(int i) {
        this.a = i;
    }

    @Override // defpackage.afts
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aiul a() {
        return new aiul(this.a, this.b.a(), this.c.a());
    }

    public final void c(String str, int i, int i2) {
        aiuo aiuoVar = this.b;
        long j = i;
        long j2 = i2;
        if (!aiuoVar.b.isEmpty()) {
            String valueOf = String.valueOf((String) amkq.bj(aiuoVar.b));
            String valueOf2 = String.valueOf(str);
            str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        aiuoVar.c(str, j, (j2 != j || aiuoVar.a.isEmpty()) ? j2 : ((Long) amkq.bj(aiuoVar.a)).longValue());
    }

    public final void d(String str, int i, int i2) {
        this.b.c(str, i, i2);
    }

    public final void e(int i, SubtitleWindowSettings subtitleWindowSettings) {
        aium aiumVar = this.c;
        long j = i;
        if (!aiumVar.a.isEmpty() && j < ((Long) amkq.bj(aiumVar.a)).longValue()) {
            zga.l("subtitle settings are not given in non-decreasing start time order");
        }
        aiumVar.a.add(Long.valueOf(j));
        aiumVar.b.add(subtitleWindowSettings);
    }
}
