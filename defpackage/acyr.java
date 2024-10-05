package defpackage;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acyr implements Runnable {
    private final MulticastSocket a;

    public acyr(MulticastSocket multicastSocket) {
        this.a = multicastSocket;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (acys.d == null) {
                InetAddress byName = InetAddress.getByName("239.255.255.250");
                String hostAddress = byName.getHostAddress();
                StringBuilder sb = new StringBuilder(String.valueOf(hostAddress).length() + 117);
                sb.append("M-SEARCH * HTTP/1.1\r\nHOST: ");
                sb.append(hostAddress);
                sb.append(":1900\r\nMAN: \"ssdp:discover\"\r\nMX: 1\r\nST: urn:dial-multiscreen-org:service:dial:1\r\n\r\n");
                byte[] bytes = sb.toString().getBytes();
                acys.d = new DatagramPacket(bytes, bytes.length, byName, 1900);
            }
            this.a.send(acys.d);
        } catch (IOException e) {
            zga.f(acys.a, "Error sending M-search:", e);
        }
    }
}
