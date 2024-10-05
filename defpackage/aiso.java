package defpackage;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSettings;
import java.util.Deque;
import org.xml.sax.Attributes;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiso extends wbs {
    @Override // defpackage.wbs
    public final void F(Deque deque, Attributes attributes, String str) {
        aitz aitzVar = (aitz) deque.peekFirst();
        if (aitzVar == null) {
            return;
        }
        int p = ahbx.p(attributes, 0, "w", "win", "id");
        String s = ahbx.s(attributes, "t", "start");
        if (s == null) {
            return;
        }
        int parseInt = Integer.parseInt(s);
        String value = attributes.getValue("op");
        if (value == null || !value.equals("define")) {
            return;
        }
        String s2 = ahbx.s(attributes, "ap");
        int o = s2 != null ? ahbx.o(Integer.parseInt(s2)) : 34;
        String s3 = ahbx.s(attributes, "ah");
        int max = s3 != null ? Math.max(0, Math.min(Integer.parseInt(s3), 100)) : 50;
        String s4 = ahbx.s(attributes, "av");
        int max2 = s4 != null ? Math.max(0, Math.min(Integer.parseInt(s4), 100)) : 95;
        String s5 = ahbx.s(attributes, "vs");
        aitzVar.b(p).e(parseInt, new SubtitleWindowSettings(o, max, max2, s5 != null ? Boolean.parseBoolean(s5) : true, ahbx.s(attributes, "sd") != null));
    }
}
