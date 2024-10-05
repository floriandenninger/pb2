package j$.net;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;

/* loaded from: classes5.dex */
public class URLDecoder {
    static String dfltEncName = URLEncoder.dfltEncName;

    private static boolean isValidHexChar(char c) {
        return ('0' <= c && c <= '9') || ('a' <= c && c <= 'f') || ('A' <= c && c <= 'F');
    }

    public static String decode(String str, String str2) {
        if (str2.isEmpty()) {
            throw new UnsupportedEncodingException("URLDecoder: empty string enc parameter");
        }
        try {
            return decode(str, Charset.forName(str2));
        } catch (IllegalCharsetNameException | UnsupportedCharsetException unused) {
            throw new UnsupportedEncodingException(str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00bd, code lost:
    
        if (r5 >= r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00bf, code lost:
    
        if (r7 == '%') goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c9, code lost:
    
        throw new java.lang.IllegalArgumentException("URLDecoder: Incomplete trailing escape (%) pattern");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ca, code lost:
    
        r1.append(new java.lang.String(r2, 0, r6, r13));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String decode(java.lang.String r12, java.nio.charset.Charset r13) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.net.URLDecoder.decode(java.lang.String, java.nio.charset.Charset):java.lang.String");
    }
}
