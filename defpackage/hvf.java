package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.AutoValue_ReelEditModel;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelEditModel;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hvf {
    public ReelEditModel.DeletedItem a;
    private amru b;
    private Integer c;

    public hvf() {
    }

    public hvf(ReelEditModel reelEditModel) {
        AutoValue_ReelEditModel autoValue_ReelEditModel = (AutoValue_ReelEditModel) reelEditModel;
        this.b = autoValue_ReelEditModel.a;
        this.c = Integer.valueOf(autoValue_ReelEditModel.b);
        this.a = autoValue_ReelEditModel.c;
    }

    public final ReelEditModel a() {
        Integer num;
        amru amruVar = this.b;
        if (amruVar == null || (num = this.c) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" reelItems");
            }
            if (this.c == null) {
                sb.append(" currentIndex");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        AutoValue_ReelEditModel autoValue_ReelEditModel = new AutoValue_ReelEditModel(amruVar, num.intValue(), this.a);
        amkq.V(autoValue_ReelEditModel.b, autoValue_ReelEditModel.a.size());
        return autoValue_ReelEditModel;
    }

    public final void b(int i) {
        this.c = Integer.valueOf(i);
    }

    public final void c(List list) {
        this.b = amru.o(list);
    }
}
