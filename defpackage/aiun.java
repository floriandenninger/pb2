package defpackage;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSettings;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiun {
    final List a;
    private final List b;

    public aiun(List list, List list2) {
        amkq.O(list.size() == list2.size(), "startTimes and settings differ in size");
        this.a = Collections.unmodifiableList(list);
        this.b = Collections.unmodifiableList(list2);
    }

    public final synchronized SubtitleWindowSettings a(long j) {
        int binarySearch = Collections.binarySearch(this.a, Long.valueOf(j));
        if (binarySearch >= 0) {
            return (SubtitleWindowSettings) this.b.get(binarySearch);
        }
        int i = (-binarySearch) - 2;
        if (i >= 0) {
            return (SubtitleWindowSettings) this.b.get(i);
        }
        return SubtitleWindowSettings.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.a.size(); i++) {
            sb.append("[");
            sb.append(this.a.get(i));
            sb.append(": ");
            sb.append(this.b.get(i));
            sb.append("]");
        }
        return sb.toString();
    }
}
