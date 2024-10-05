package defpackage;

import java.io.IOException;
import java.net.MulticastSocket;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aczc implements aczd {
    private static final String a = zga.a("MDX.SocketFactory");

    public final MulticastSocket a(ysu ysuVar, Integer num) {
        try {
            MulticastSocket multicastSocket = new MulticastSocket();
            multicastSocket.setNetworkInterface(ysuVar.a);
            if (num != null) {
                multicastSocket.setReceiveBufferSize(num.intValue());
            }
            multicastSocket.setBroadcast(true);
            return multicastSocket;
        } catch (IOException e) {
            zga.f(a, String.format(Locale.US, "Error creating socket on interface %s", ysuVar.a()), e);
            return null;
        }
    }
}
