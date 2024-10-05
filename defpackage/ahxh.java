package defpackage;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahxh implements ahxi {
    private final List a;

    public ahxh(ahxi... ahxiVarArr) {
        List asList = Arrays.asList(ahxiVarArr);
        asList.getClass();
        this.a = asList;
    }

    @Override // defpackage.ahxi
    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahxi) it.next()).a();
        }
    }

    @Override // defpackage.ahxi
    public final void f() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahxi) it.next()).f();
        }
    }

    @Override // defpackage.ahxi
    public final void g(float f) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahxi) it.next()).g(f);
        }
    }

    @Override // defpackage.ahxi
    public final void h(int i, int i2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahxi) it.next()).h(i, 0);
        }
    }

    @Override // defpackage.ahxi
    public final void i(SubtitlesStyle subtitlesStyle) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahxi) it.next()).i(subtitlesStyle);
        }
    }

    @Override // defpackage.ahxi
    public final void j(List list) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahxi) it.next()).j(list);
        }
    }
}
