package defpackage;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSettings;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aium implements afts {
    public final List a = new ArrayList();
    public final List b = new ArrayList();

    @Override // defpackage.afts
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aiun a() {
        if (this.a.isEmpty() || ((Long) this.a.get(0)).longValue() != 0) {
            this.a.add(0, 0L);
            this.b.add(0, SubtitleWindowSettings.a);
        }
        return new aiun(this.a, this.b);
    }
}
