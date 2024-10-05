package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bir {
    private static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    private final boolean c(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i = pts.a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.a = parseInt;
            this.b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean a() {
        return (this.a == -1 || this.b == -1) ? false : true;
    }

    public final void b(Metadata metadata) {
        for (int i = 0; i < metadata.a(); i++) {
            Metadata.Entry b = metadata.b(i);
            if (b instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) b;
                if ("iTunSMPB".equals(commentFrame.b) && c(commentFrame.c)) {
                    return;
                }
            } else if (b instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) b;
                if ("com.apple.iTunes".equals(internalFrame.a) && "iTunSMPB".equals(internalFrame.b) && c(internalFrame.c)) {
                    return;
                }
            } else {
                continue;
            }
        }
    }
}
