package defpackage;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axre implements axrf {
    public final BufferedInputStream a;
    public int b;
    public int c;
    public String d;
    public Map e;
    public Map f;
    public String g;
    final /* synthetic */ axrm h;
    public int i;
    public final axrd j;
    private final OutputStream k;
    private axra l;
    private final String m;
    private String n;

    public axre(axrm axrmVar, axrd axrdVar, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        this.h = axrmVar;
        this.j = axrdVar;
        this.a = new BufferedInputStream(inputStream, 8192);
        this.k = outputStream;
        this.m = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress().toString();
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            inetAddress.getHostName().toString();
        }
        this.f = new HashMap();
    }

    public final void a(String str, Map map) {
        if (str == null) {
            this.g = "";
            return;
        }
        this.g = str;
        StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf(61);
            if (indexOf >= 0) {
                map.put(axrm.j(nextToken.substring(0, indexOf)).trim(), axrm.j(nextToken.substring(indexOf + 1)));
            } else {
                map.put(axrm.j(nextToken).trim(), "");
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:140:0x030f A[Catch: all -> 0x0396, axrk -> 0x0399, IOException -> 0x03b4, SSLException -> 0x03e0, SocketTimeoutException -> 0x040d, SocketException -> 0x0410, TRY_ENTER, TryCatch #3 {axrk -> 0x0399, blocks: (B:4:0x0009, B:6:0x0015, B:11:0x0024, B:12:0x002a, B:14:0x002e, B:16:0x0032, B:18:0x0036, B:20:0x003a, B:22:0x0040, B:25:0x0044, B:26:0x0053, B:28:0x0058, B:230:0x0049, B:233:0x004d, B:31:0x0063, B:33:0x0069, B:34:0x0076, B:36:0x0081, B:37:0x008c, B:39:0x00a6, B:42:0x00b0, B:44:0x00bb, B:46:0x00c8, B:48:0x00d4, B:49:0x00ea, B:51:0x00f0, B:52:0x0104, B:54:0x010a, B:56:0x0114, B:58:0x011c, B:60:0x0137, B:63:0x013c, B:65:0x00f7, B:66:0x00e6, B:67:0x033d, B:68:0x0346, B:70:0x0347, B:71:0x0350, B:72:0x0141, B:74:0x0145, B:75:0x0155, B:79:0x0260, B:81:0x0264, B:84:0x028d, B:87:0x0298, B:140:0x030f, B:141:0x033c, B:143:0x0177, B:149:0x0232, B:150:0x025c, B:151:0x025f, B:217:0x0353, B:219:0x0365, B:220:0x036f, B:221:0x0372, B:222:0x036a, B:223:0x0089, B:239:0x0373, B:240:0x0382, B:245:0x0383, B:246:0x0392, B:244:0x0395), top: B:3:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0264 A[Catch: all -> 0x0396, axrk -> 0x0399, IOException -> 0x03b4, SSLException -> 0x03e0, SocketTimeoutException -> 0x040d, SocketException -> 0x0410, TryCatch #3 {axrk -> 0x0399, blocks: (B:4:0x0009, B:6:0x0015, B:11:0x0024, B:12:0x002a, B:14:0x002e, B:16:0x0032, B:18:0x0036, B:20:0x003a, B:22:0x0040, B:25:0x0044, B:26:0x0053, B:28:0x0058, B:230:0x0049, B:233:0x004d, B:31:0x0063, B:33:0x0069, B:34:0x0076, B:36:0x0081, B:37:0x008c, B:39:0x00a6, B:42:0x00b0, B:44:0x00bb, B:46:0x00c8, B:48:0x00d4, B:49:0x00ea, B:51:0x00f0, B:52:0x0104, B:54:0x010a, B:56:0x0114, B:58:0x011c, B:60:0x0137, B:63:0x013c, B:65:0x00f7, B:66:0x00e6, B:67:0x033d, B:68:0x0346, B:70:0x0347, B:71:0x0350, B:72:0x0141, B:74:0x0145, B:75:0x0155, B:79:0x0260, B:81:0x0264, B:84:0x028d, B:87:0x0298, B:140:0x030f, B:141:0x033c, B:143:0x0177, B:149:0x0232, B:150:0x025c, B:151:0x025f, B:217:0x0353, B:219:0x0365, B:220:0x036f, B:221:0x0372, B:222:0x036a, B:223:0x0089, B:239:0x0373, B:240:0x0382, B:245:0x0383, B:246:0x0392, B:244:0x0395), top: B:3:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 1158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axre.b():void");
    }

    public final String c(ByteBuffer byteBuffer, int i, int i2) {
        axrc b;
        ByteBuffer duplicate;
        FileOutputStream fileOutputStream;
        if (i2 <= 0) {
            return "";
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                b = this.j.b();
                duplicate = byteBuffer.duplicate();
                fileOutputStream = new FileOutputStream(b.a());
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            FileChannel channel = fileOutputStream.getChannel();
            duplicate.position(i).limit(i + i2);
            channel.write(duplicate.slice());
            String a = b.a();
            axrm.l(fileOutputStream);
            return a;
        } catch (Exception e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            throw new Error(e);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            axrm.l(fileOutputStream2);
            throw th;
        }
    }
}
