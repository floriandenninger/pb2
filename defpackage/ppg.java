package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ppg extends ppc {
    private static final Pattern a = Pattern.compile("(.+?)='(.*?)';", 32);
    private final CharsetDecoder b = amme.c.newDecoder();
    private final CharsetDecoder c = amme.b.newDecoder();

    private final String c(ByteBuffer byteBuffer) {
        try {
            return this.b.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = this.c.decode(byteBuffer).toString();
                this.c.reset();
                return charBuffer;
            } catch (CharacterCodingException unused2) {
                this.c.reset();
                return null;
            } catch (Throwable th) {
                this.c.reset();
                throw th;
            }
        } finally {
            this.b.reset();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    @Override // defpackage.ppc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final com.google.android.exoplayer2.metadata.Metadata b(defpackage.ppz r9, java.nio.ByteBuffer r10) {
        /*
            r8 = this;
            java.lang.String r9 = r8.c(r10)
            int r0 = r10.limit()
            byte[] r0 = new byte[r0]
            r10.get(r0)
            r10 = 0
            r1 = 0
            r2 = 1
            if (r9 != 0) goto L21
            com.google.android.exoplayer2.metadata.Metadata r9 = new com.google.android.exoplayer2.metadata.Metadata
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r2 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r2]
            com.google.android.exoplayer2.metadata.icy.IcyInfo r3 = new com.google.android.exoplayer2.metadata.icy.IcyInfo
            r3.<init>(r0, r1, r1)
            r2[r10] = r3
            r9.<init>(r2)
            return r9
        L21:
            java.util.regex.Pattern r3 = defpackage.ppg.a
            java.util.regex.Matcher r9 = r3.matcher(r9)
            r3 = r1
            r4 = 0
        L29:
            boolean r4 = r9.find(r4)
            if (r4 == 0) goto L6f
            java.lang.String r4 = r9.group(r2)
            r5 = 2
            java.lang.String r5 = r9.group(r5)
            if (r4 == 0) goto L6a
            java.lang.String r4 = defpackage.amkq.c(r4)
            int r6 = r4.hashCode()
            r7 = -315603473(0xffffffffed3045ef, float:-3.409619E27)
            if (r6 == r7) goto L57
            r7 = 1646559960(0x622482d8, float:7.586736E20)
            if (r6 == r7) goto L4d
            goto L61
        L4d:
            java.lang.String r6 = "streamtitle"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L61
            r4 = 0
            goto L62
        L57:
            java.lang.String r6 = "streamurl"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L61
            r4 = 1
            goto L62
        L61:
            r4 = -1
        L62:
            if (r4 == 0) goto L69
            if (r4 == r2) goto L67
            goto L6a
        L67:
            r3 = r5
            goto L6a
        L69:
            r1 = r5
        L6a:
            int r4 = r9.end()
            goto L29
        L6f:
            com.google.android.exoplayer2.metadata.Metadata r9 = new com.google.android.exoplayer2.metadata.Metadata
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r2 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r2]
            com.google.android.exoplayer2.metadata.icy.IcyInfo r4 = new com.google.android.exoplayer2.metadata.icy.IcyInfo
            r4.<init>(r0, r1, r3)
            r2[r10] = r4
            r9.<init>(r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ppg.b(ppz, java.nio.ByteBuffer):com.google.android.exoplayer2.metadata.Metadata");
    }
}
