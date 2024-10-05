package defpackage;

import com.google.cardboard.sdk.R;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.CharacterCodingException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class axro {
    public OutputStream a;
    public final axrj b;
    private final InputStream d;
    private axrr e = null;
    private final List f = new LinkedList();
    public int c = 1;

    public axro(axrf axrfVar) {
        axrn axrnVar = new axrn(this, axri.SWITCH_PROTOCOL);
        this.b = axrnVar;
        this.d = ((axre) axrfVar).a;
        axrnVar.b("upgrade", "websocket");
        axrnVar.b("connection", "Upgrade");
    }

    private final void h(String str, boolean z) {
        if (this.c == 5) {
            return;
        }
        InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                axrt.m.log(Level.FINE, "close failed", (Throwable) e);
            }
        }
        OutputStream outputStream = this.a;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e2) {
                axrt.m.log(Level.FINE, "close failed", (Throwable) e2);
            }
        }
        this.c = 5;
        d(str, z);
    }

    protected abstract void a(IOException iOException);

    protected abstract void b(axrs axrsVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void c();

    protected abstract void d(String str, boolean z);

    public final void e() {
        String str;
        int i;
        while (true) {
            try {
                if (this.c != 3) {
                    return;
                }
                axrs a = axrs.a(this.d);
                if (a.d == axrr.Close) {
                    if (a instanceof axrq) {
                        axrq axrqVar = (axrq) a;
                        i = axrqVar.b;
                        str = axrqVar.a;
                    } else {
                        str = "";
                        i = 1000;
                    }
                    if (this.c == 4) {
                        h(str, false);
                    } else {
                        g(i, str, true);
                    }
                } else if (a.d == axrr.Ping) {
                    f(new axrs(axrr.Pong, a.g));
                } else if (a.d == axrr.Pong) {
                    continue;
                } else {
                    if (a.e && a.d != axrr.Continuation) {
                        if (this.e != null) {
                            throw new axrp(1002, "Continuous frame sequence not completed.");
                        }
                        if (a.d != axrr.Text && a.d != axrr.Binary) {
                            throw new axrp(1002, "Non control or continuous frame expected.");
                        }
                        b(a);
                    }
                    if (a.d != axrr.Continuation) {
                        if (this.e != null) {
                            throw new axrp(1002, "Previous continuous frame sequence not completed.");
                        }
                        this.e = a.d;
                        this.f.clear();
                        this.f.add(a);
                    } else if (a.e) {
                        axrr axrrVar = this.e;
                        if (axrrVar == null) {
                            throw new axrp(1002, "Continuous frame sequence was not started.");
                        }
                        b(new axrs(axrrVar, this.f));
                        this.e = null;
                        this.f.clear();
                    } else {
                        if (this.e == null) {
                            throw new axrp(1002, "Continuous frame sequence was not started.");
                        }
                        this.f.add(a);
                    }
                }
            } catch (CharacterCodingException e) {
                a(e);
                h(e.toString(), false);
                return;
            } catch (IOException e2) {
                a(e2);
                if (e2 instanceof axrp) {
                    h(((axrp) e2).a, false);
                }
                return;
            } finally {
                h("Handler terminated without closing the connection.", false);
            }
        }
    }

    public final synchronized void f(axrs axrsVar) {
        OutputStream outputStream = this.a;
        outputStream.write((true != axrsVar.e ? (byte) 0 : Byte.MIN_VALUE) | axrsVar.d.g);
        int length = axrsVar.g.length;
        axrsVar.h = length;
        if (length <= 125) {
            outputStream.write(axrsVar.f() ? ((byte) axrsVar.h) | 128 : (byte) axrsVar.h);
        } else if (length <= 65535) {
            outputStream.write(true != axrsVar.f() ? R.styleable.AppCompatTheme_windowNoTitle : 254);
            outputStream.write(axrsVar.h >>> 8);
            outputStream.write(axrsVar.h);
        } else {
            outputStream.write(true != axrsVar.f() ? 127 : PrivateKeyType.INVALID);
            outputStream.write(0);
            outputStream.write(0);
            outputStream.write(0);
            outputStream.write(0);
            outputStream.write(axrsVar.h >>> 24);
            outputStream.write(axrsVar.h >>> 16);
            outputStream.write(axrsVar.h >>> 8);
            outputStream.write(axrsVar.h);
        }
        if (!axrsVar.f()) {
            outputStream.write(axrsVar.g);
        } else {
            outputStream.write(axrsVar.f);
            for (int i = 0; i < axrsVar.h; i++) {
                outputStream.write(axrsVar.g[i] ^ axrsVar.f[i % 4]);
            }
        }
        outputStream.flush();
    }

    public final void g(int i, String str, boolean z) {
        int i2 = this.c;
        this.c = 4;
        if (i2 == 3) {
            f(new axrq(i, str));
        } else {
            h(str, z);
        }
    }
}
